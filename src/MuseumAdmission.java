/*  박물관 출입 관련 처리 당담 MuseumAdmission class  */
public class MuseumAdmission {
	int visitors;//방문자 수를 저장할 변수 선언
	int person;//현재 박물관 입장객 수를 저장할 변수 선언
	int income;//박물관 수입을 저장할 변수 선언
	String today;//오늘 요일을 저정할 변수 선언
	String[] nameList = new String[11];//관람객의 이름을 저장할 변수 선언
	MuseumAdmission(String whatDay) {//요일을 인자로 사용해 당일의 박물관 관리 시작 메소드
		
		visitors = 0;//방문자 수 초기화
		person = 0;//현재 박물관 입장객 수 초기롸
		income = 0;//박물관 수입 초기화
		this.today = whatDay;//인자로 받은 요일을 변경
	}
	public int getVisitors(){//방문자 수 Get 메소드
		return visitors;
	}
	public int getPerson(){//현재 입장객 수 Get 메소드
		return person;
	}
	public int getIncome(){//수입 Get 메소드
		return income;
	}
	public String getName(int visitorNum){//방문객 번호를 통해 이름을 받는 Get 메소드
		return nameList[visitorNum];
	}
	//박물관 입장을 하려 하는 사람 객체와 이름을 받아 입장 여부를 파악하는 boolean 메소드. 소지금과 현재 입장객 수 관련 Exception 처리.
	public boolean enter(Person p, String name) throws MoneyException, VisitorNumException{
		if (visitors < 10) {//현재 입장객 수가 10명 미만인지 확인
			if (today == "Sun" || today == "Sat") {//오늘 요일이 주말(토,일)인지 확인
				if (p.isMember() == false) {//회원이 아닌지 확인
					if (p.getAge() > 7) {//7살보다 많은지 확인
						if (p.getAge() < 18) {//18살 미만인지 확인
							if (p.pay(4000) == false){//입장료 4000원을 지불 할 수 있는지 확인
								throw new MoneyException("Not enough money");//지불 불가시 소지금 Exception 
							}
							else {//입장료 지불 시 
								income = income + 4000;//박물관 수입 입장료 만큼 증가 
//								visitors++;//방문객 수 + 1
//								nameList[visitors] = name;//방문객 이름 저장
//								person++;//현재 입장객 수 + 1
//								return true;//입장 확인 return
							}	
						}
						else {//18살 이상 일 때
							if (p.pay(7000) == false)//입장료 7000원을 지불 할 수 있는지 확인
								throw new MoneyException("Not enough money");//지불 불가시 소지금 Exception
							else//입장료 지불 시
								income = income + 7000;//박물관 수입 입장료 만큼 증가
//								visitors++;//방문객 수 + 1
//								nameList[visitors] = name;//방문객 이름 저장
//								person++;//현재 입장객 수 + 1
//								return true;//입장 확인 return
						}
					}
					else{//7살 미만일 때
						if (p.pay(1000) == false)//입장료 1000원을 지불 할 수 있는지 확인 
							throw new MoneyException("Not enough money");//지불 불가시 소지금 Exception
						else{//입장료 지불시
							income = income + 1000;//박물관 수입 입장료 만큼 증가
//							visitors++;//방문객 수 + 1
//							nameList[visitors] = name;//방문객 이름 저장
//							person++;//현재 입장객 수 + 1
//							return true;//입장 확인 return
						}
					}
				}
				else{//회원 일 때
					if (p.pay(1000) == false)//입장료 1000원을 지불 할 수 있는지 확인
						throw new MoneyException("Not enough money");//지불 불가시 소지금 Exception
					else{//입장료 지불시
						income = income + 1000;//박물관 수입 입장료만큼 증가
//						visitors++;//방문객 수 + 1
//						nameList[visitors] = name;//방문객 이름 저장
//						person++;//현재 입장객 수 + 1
//						return true;//입장 확인 return
					}
				}
			}
			else {//평일 일 때
				if (p.isMember() == false) {//회원이 아닌지 확인
					if (p.getAge() > 7) {//7살이 넘었는지 확인
						if (p.getAge() < 18) {//18살 미만인지 확인
							if (p.pay(2000) == false)//입장료 2000원을 지불 할 수 있는지 확인
								throw new MoneyException("Not enough money");//지불 불가시 소지금 Exception
							else{//입장료 지불시
								income = income + 2000;//박물관 수입 입장료만큼 증가
//								visitors++;//방문객 수 + 1
//								nameList[visitors] = name;//방문객 이름 저장
//								person++;//현재 입장객 수 + 1
//								return true;//입장 확인 return
							}	
						}
						else {//18살 이상일 때
							if (p.pay(5000) == false)//입장료5000을 지불할 수 있는지 확인 
								throw new MoneyException("Not enough money");//지불 불가시 소지금 Exception
							else//입장료 지불시
								income = income + 5000;//박물관 수입 입장료만큼 증가
						}
					}
				}
			}
			visitors++;//방문객 수 + 1
			nameList[visitors] = name;//방문객 이름 저장
			person++;//현재 입장객 수 + 1
			return true;//입장 확인 return 
		}
		else {//현재 입장객 수가 10명 이상일 때
			throw new VisitorNumException("Capacity of museum is full");//입장객 수 Exception
		}
	}
	//관람객 이름을 받아 박물관 퇴장을 처리하는 메소드. 이름 관련 Exception 발생
	public void quit(String visitorName) throws VisitorNameException{
		int n;//배열에서 이름 찾기 위한 인덱스 번호 변수 선언
		for(n = 0 ; n < 11 ; n ++){//10번(이름 저장 배열 크기)을 반복
			if(nameList[n] == visitorName){//이름 저장 배열에 찾고자하는 이름이 있는지 확인
				System.out.println(visitorName + "퇴장");//방문객 이름이용하여 퇴장 출력
				person --;//현 입장객 수 - 1
				visitors --;//관람객 수 - 1
				break;//반복문 탈출
			}
			else if(n==10){//10번 다 돌았을 시 해당하는 이름을 못찾았을때
				throw new VisitorNameException("Name doesn't match");//방문객 이름 Exception
			}
		}
	}
}
