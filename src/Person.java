
public class Person {	
	String name;
	int age;
	boolean membership;
	int money;
	
	public Person(String name, int age, int money, boolean membership) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.membership = membership;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public boolean isMember() {
		return membership;
	}
	public boolean pay (int money) {
		if (this.money - money < 0)
			return false;
		else
			this.money = this.money - money;
		
		return true;
	}
}
