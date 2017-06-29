/*   ������ ���� ���� ���� �� ó���ϴ�  Person class   */
public class Person {
	String name;// ������ �̸� ���� ���� ����
	int age;// ������ ���� ���� ���� ����
	int money;// ������ ���� ���� ����
	boolean isMember;// ȸ�� ���� ���� ���� ����
	
	public Person(String name, int age, int money, boolean isMember) {// ������ ��ü ������
		this.name = name;// ���ڷ� �޾ƿ� ���� ���� �̸� �ʱ�ȭ
		this.age = age;// ���ڷ� �޾ƿ� ���� ���� ���� �ʱ�ȭ
		this.money = money;// ���ڷ� �޾ƿ� ���� ���� ������ �ʱ�ȭ
		this.isMember = isMember;// ���ڷ� �޾ƿ� ���� ���� ȸ�� ���� �ʱ�ȭ
	}

	public String getName() {// �̸� get
		return name;
	}

	public int getAge() {// ���� get
		return age;
	}

	public boolean isMember() {// ȸ�� ���� get
		return isMember;
	}

	public boolean pay(int money) {// ����� ���� boolean �޼���
		if(this.money - money < 0) {// ����Ẹ�� �������� ������ Ȯ��
			return false;// false return	
		}
		else {// ����Ẹ�� �������� ���� ��
			this.money -= money;// �����ݿ��� ����� ��ŭ ����
			return true;// true return	
		}
	}
}
	

