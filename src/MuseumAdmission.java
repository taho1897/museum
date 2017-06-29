/*  �ڹ��� ���� ���� ó�� ��� MuseumAdmission class  */
public class MuseumAdmission {
	int visitors;//�湮�� ���� ������ ���� ����
	int person;// ���� �ڹ��� ���尴 ���� ������ ���� ����
	int income;// �ڹ��� ������ ������ ���� ����
	String day;// ���� ������ ������ ���� ����
	String[] nameList = new String[11];// �������� �̸��� ������ ���� ����
	public MuseumAdmission(String day) {// ������ ���ڷ� ����� ������ �ڹ��� ���� ���� �޼ҵ�
		visitors = 0;// �湮�� �� �ʱ�ȭ
		person = 0;// ���� �ڹ��� ���尴 �� �ʱ�ȭ
		income = 0;// �ڹ��� ���� �ʱ�ȭ
		this.day = day;// ���ڷ� ���� ������ ����
	}

	public int getVisitors() {//�湮�� �� Get �޼ҵ�
		return visitors;
	}

	public int getPerson() {// ���� ���尴 �� Get �޼ҵ�
		return person;
	}

	public int getIncome() {// ���� Get �޼ҵ�
		return income;
	}

	public String getName(int visitorNum) {// �湮�� ��ȣ�� ���� �̸��� �޴� Get �޼ҵ�
		return nameList[visitorNum];
	}
	// �ڹ��� ������ �Ϸ� �ϴ� ��� ��ü�� �̸��� �޾� ���� ���θ� �ľ��ϴ� boolean �޼ҵ�. �����ݰ� ���� ���尴 �� ����
	public boolean enter(Person p, String name) throws MoneyException, VisitorNumException {// Exception ó��.
		if(this.visitors < 10) {// ���� ���尴 ���� 10�� �̸����� Ȯ��
			if(this.day == "Sat" || this.day == "Sun") {// ���� ������ �ָ�(��,��)���� Ȯ��
				if(p.isMember != true) {// ȸ���� �ƴ��� Ȯ��
					if(p.age > 7) {// 7�캸�� ������ Ȯ��
						if(p.age < 18) {// 18�� �̸����� Ȯ��
							if(p.pay(4000) != true) {// ����� 4000���� ���� �� �� �ִ��� Ȯ��
								throw new MoneyException("Not Enough Money");// ���� �Ұ��� ������ Exception
							}
							else {// ����� ���� ��
								this.income += 4000;// �ڹ��� ���� ����� ��ŭ ����
							}
						}
						else {// 18�� �̻� �� ��
							if(p.pay(7000) != true) {// ����� 7000���� ���� �� �� �ִ��� Ȯ��
								throw new MoneyException("Not Enough Money");// ���� �Ұ��� ������ Exception
							}
							else {// ����� ���� ��
								this.income += 7000;// �ڹ��� ���� ����� ��ŭ ����
							}
						}
					}
					else {// 7�� �̸��� ��
						if(p.pay(1000) != true) {// ����� 1000���� ���� �� �� �ִ��� Ȯ��
							throw new MoneyException("Not Enough Money");// ���� �Ұ��� ������ Exception
						}
						else {// ����� ���ҽ�
							this.income += 1000;// �ڹ��� ���� ����� ��ŭ ����
						}
					}
				}
				else {// ȸ�� �� ��
					if(p.pay(1000) != true) {// ����� 1000���� ���� �� �� �ִ��� Ȯ��
						throw new MoneyException("Not Enough Money");// ���� �Ұ��� ������ Exception	
					}
					else {// ����� ���ҽ�
						this.income += 1000;// �ڹ��� ���� ����Ḹŭ ����
					}
				}
			}
			else {// ���� �� ��
				if(p.isMember != true) {// ȸ���� �ƴ��� Ȯ��
					if(p.age > 7) {// 7���� �Ѿ����� Ȯ��
						if(p.age < 18) {// 18�� �̸����� Ȯ��
							if(p.pay(2000) != true) {// ����� 2000���� ���� �� �� �ִ��� Ȯ��
								throw new MoneyException("Not Enough Money");// ���� �Ұ��� ������ Exception
							}
							else {// ����� ���ҽ�
								this.income += 2000;// �ڹ��� ���� ����Ḹŭ ����
							}
						}
						else {// 18�� �̻��� ��
							if(p.pay(5000) != true) {// �����5000�� ������ �� �ִ��� Ȯ��
								// ���� �Ұ��� ������ Exception
							}
							else {// ����� ���ҽ�
								this.income += 5000;// �ڹ��� ���� ����Ḹŭ ����
							}
						}
					}
				}
			}
			this.visitors++;// �湮�� �� + 1
			this.nameList[visitors] = p.name;// �湮�� �̸� ����
			this.person++;// ���� ���尴 �� + 1
			return true;// ���� Ȯ�� return
		}
		else {// ���� ���尴 ���� 10�� �̻��� ��
			throw new VisitorNumException("Museum is Full");// ���尴 �� Exception
		}
	}

	// ������ �̸��� �޾� �ڹ��� ������ ó���ϴ� �޼ҵ�. �̸� ���� Exception �߻�
	public void exit(String name) throws VisitorNameException{
		int n;// �迭���� �̸� ã�� ���� �ε��� ��ȣ ���� ����
		for( n = 0 ; n < 10 ; n++) {// 10��(�̸� ���� �迭 ũ��)�� �ݺ�
			if(this.nameList[n] == name) {// �̸� ���� �迭�� ã�����ϴ� �̸��� �ִ��� Ȯ��
				this.person -= 1;// �� ���尴 �� - 1
				// ������ �� - 1 (�̰� �� �ʿ�����????) 
				System.out.println(name + " ����");// �湮�� �̸��̿��Ͽ� ���� ���
				break;// �ݺ��� Ż��
			}
		}
		// 10�� �� ������ �� �ش��ϴ� �̸��� ��ã������
		throw new VisitorNameException("Perons Doesn't Exist");// �湮�� �̸� Exception
	}
}
	