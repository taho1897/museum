/*   관람객 관련 정보 저장 및 처리하는  Person class   */
public class Person {	
	String name;//관람객 이름 저장 변수 선언
	int age;//관람객 나이 저장 변수 선언
	boolean membership;//회원 여부 저장 변수 선언
	int money;//소지금 저장 변수 선언
	
	public Person(String name, int age, int money, boolean membership) {//관람객 객체 생성자
		this.name = name;//이름 초기화
		this.age = age;//나이 초기화
		this.money = money;//소지금 초기화
		this.membership = membership;//회원 여부 초기화
	}
	public String getName() {//이름 get
		return name;
	}
	public int getAge() {//나이 get
		return age;
	}
	public boolean isMember() {//회원 여부 get
		return membership;
	}
	public boolean pay (int money) {//입장료 지불 boolean 메서드
		if (this.money - money < 0)//입장료보다 소지금이 적은지 확인
			return false;//false return
		else//입장료보다 소지금이 많을 때
			this.money = this.money - money;//소지금에서 입장료 만큼 차감
		return true;//true return
	}
}
