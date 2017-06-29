/*   ������ ���� ���� ���� �� ó���ϴ�  Person class   */
public class Person {	
	String name;//������ �̸� ���� ���� ����
	int age;//������ ���� ���� ���� ����
	boolean membership;//ȸ�� ���� ���� ���� ����
	int money;//������ ���� ���� ����
	
	public Person(String name, int age, int money, boolean membership) {//������ ��ü ������
		this.name = name;//�̸� �ʱ�ȭ
		this.age = age;//���� �ʱ�ȭ
		this.money = money;//������ �ʱ�ȭ
		this.membership = membership;//ȸ�� ���� �ʱ�ȭ
	}
	public String getName() {//�̸� get
		return name;
	}
	public int getAge() {//���� get
		return age;
	}
	public boolean isMember() {//ȸ�� ���� get
		return membership;
	}
	public boolean pay (int money) {//����� ���� boolean �޼���
		if (this.money - money < 0)//����Ẹ�� �������� ������ Ȯ��
			return false;//false return
		else//����Ẹ�� �������� ���� ��
			this.money = this.money - money;//�����ݿ��� ����� ��ŭ ����
		return true;//true return
	}
}
