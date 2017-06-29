/*  �ڹ��� ���� ���� ó�� ��� MuseumAdmission class  */
public class MuseumAdmission {
	int visitors;//�湮�� ���� ������ ���� ����
	int person;//���� �ڹ��� ���尴 ���� ������ ���� ����
	int income;//�ڹ��� ������ ������ ���� ����
	String today;//���� ������ ������ ���� ����
	String[] nameList = new String[11];//�������� �̸��� ������ ���� ����
	MuseumAdmission(String whatDay) {//������ ���ڷ� ����� ������ �ڹ��� ���� ���� �޼ҵ�
		
		visitors = 0;//�湮�� �� �ʱ�ȭ
		person = 0;//���� �ڹ��� ���尴 �� �ʱ��
		income = 0;//�ڹ��� ���� �ʱ�ȭ
		this.today = whatDay;//���ڷ� ���� ������ ����
	}
	public int getVisitors(){//�湮�� �� Get �޼ҵ�
		return visitors;
	}
	public int getPerson(){//���� ���尴 �� Get �޼ҵ�
		return person;
	}
	public int getIncome(){//���� Get �޼ҵ�
		return income;
	}
	public String getName(int visitorNum){//�湮�� ��ȣ�� ���� �̸��� �޴� Get �޼ҵ�
		return nameList[visitorNum];
	}
	//�ڹ��� ������ �Ϸ� �ϴ� ��� ��ü�� �̸��� �޾� ���� ���θ� �ľ��ϴ� boolean �޼ҵ�. �����ݰ� ���� ���尴 �� ���� Exception ó��.
	public boolean enter(Person p, String name) throws MoneyException, VisitorNumException{
		if (visitors < 10) {//���� ���尴 ���� 10�� �̸����� Ȯ��
			if (today == "Sun" || today == "Sat") {//���� ������ �ָ�(��,��)���� Ȯ��
				if (p.isMember() == false) {//ȸ���� �ƴ��� Ȯ��
					if (p.getAge() > 7) {//7�캸�� ������ Ȯ��
						if (p.getAge() < 18) {//18�� �̸����� Ȯ��
							if (p.pay(4000) == false){//����� 4000���� ���� �� �� �ִ��� Ȯ��
								throw new MoneyException("Not enough money");//���� �Ұ��� ������ Exception 
							}
							else {//����� ���� �� 
								income = income + 4000;//�ڹ��� ���� ����� ��ŭ ���� 
//								visitors++;//�湮�� �� + 1
//								nameList[visitors] = name;//�湮�� �̸� ����
//								person++;//���� ���尴 �� + 1
//								return true;//���� Ȯ�� return
							}	
						}
						else {//18�� �̻� �� ��
							if (p.pay(7000) == false)//����� 7000���� ���� �� �� �ִ��� Ȯ��
								throw new MoneyException("Not enough money");//���� �Ұ��� ������ Exception
							else//����� ���� ��
								income = income + 7000;//�ڹ��� ���� ����� ��ŭ ����
//								visitors++;//�湮�� �� + 1
//								nameList[visitors] = name;//�湮�� �̸� ����
//								person++;//���� ���尴 �� + 1
//								return true;//���� Ȯ�� return
						}
					}
					else{//7�� �̸��� ��
						if (p.pay(1000) == false)//����� 1000���� ���� �� �� �ִ��� Ȯ�� 
							throw new MoneyException("Not enough money");//���� �Ұ��� ������ Exception
						else{//����� ���ҽ�
							income = income + 1000;//�ڹ��� ���� ����� ��ŭ ����
//							visitors++;//�湮�� �� + 1
//							nameList[visitors] = name;//�湮�� �̸� ����
//							person++;//���� ���尴 �� + 1
//							return true;//���� Ȯ�� return
						}
					}
				}
				else{//ȸ�� �� ��
					if (p.pay(1000) == false)//����� 1000���� ���� �� �� �ִ��� Ȯ��
						throw new MoneyException("Not enough money");//���� �Ұ��� ������ Exception
					else{//����� ���ҽ�
						income = income + 1000;//�ڹ��� ���� ����Ḹŭ ����
//						visitors++;//�湮�� �� + 1
//						nameList[visitors] = name;//�湮�� �̸� ����
//						person++;//���� ���尴 �� + 1
//						return true;//���� Ȯ�� return
					}
				}
			}
			else {//���� �� ��
				if (p.isMember() == false) {//ȸ���� �ƴ��� Ȯ��
					if (p.getAge() > 7) {//7���� �Ѿ����� Ȯ��
						if (p.getAge() < 18) {//18�� �̸����� Ȯ��
							if (p.pay(2000) == false)//����� 2000���� ���� �� �� �ִ��� Ȯ��
								throw new MoneyException("Not enough money");//���� �Ұ��� ������ Exception
							else{//����� ���ҽ�
								income = income + 2000;//�ڹ��� ���� ����Ḹŭ ����
//								visitors++;//�湮�� �� + 1
//								nameList[visitors] = name;//�湮�� �̸� ����
//								person++;//���� ���尴 �� + 1
//								return true;//���� Ȯ�� return
							}	
						}
						else {//18�� �̻��� ��
							if (p.pay(5000) == false)//�����5000�� ������ �� �ִ��� Ȯ�� 
								throw new MoneyException("Not enough money");//���� �Ұ��� ������ Exception
							else//����� ���ҽ�
								income = income + 5000;//�ڹ��� ���� ����Ḹŭ ����
						}
					}
				}
			}
			visitors++;//�湮�� �� + 1
			nameList[visitors] = name;//�湮�� �̸� ����
			person++;//���� ���尴 �� + 1
			return true;//���� Ȯ�� return 
		}
		else {//���� ���尴 ���� 10�� �̻��� ��
			throw new VisitorNumException("Capacity of museum is full");//���尴 �� Exception
		}
	}
	//������ �̸��� �޾� �ڹ��� ������ ó���ϴ� �޼ҵ�. �̸� ���� Exception �߻�
	public void quit(String visitorName) throws VisitorNameException{
		int n;//�迭���� �̸� ã�� ���� �ε��� ��ȣ ���� ����
		for(n = 0 ; n < 11 ; n ++){//10��(�̸� ���� �迭 ũ��)�� �ݺ�
			if(nameList[n] == visitorName){//�̸� ���� �迭�� ã�����ϴ� �̸��� �ִ��� Ȯ��
				System.out.println(visitorName + "����");//�湮�� �̸��̿��Ͽ� ���� ���
				person --;//�� ���尴 �� - 1
				visitors --;//������ �� - 1
				break;//�ݺ��� Ż��
			}
			else if(n==10){//10�� �� ������ �� �ش��ϴ� �̸��� ��ã������
				throw new VisitorNameException("Name doesn't match");//�湮�� �̸� Exception
			}
		}
	}
}
