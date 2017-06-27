
public class MuseumAdmission {
	int visitors;
	int person;
	int income;
	String today;
	String[] nameList = new String[11];
	MuseumAdmission(String whatDay) {
		visitors = 0;
		person = 0;
		income = 0;
		this.today = whatDay;
	}
	public int getVisitors(){
		return visitors;
	}
	public int getPerson(){
		return person;
	}
	public int getIncome(){
		return income;
	}
	public String getName(int visitorNum){
		return nameList[visitorNum];
	}
	public boolean enter(Person p, String name) throws MoneyException, VisitorNumException{
		if (visitors < 10){
			if (today == "Sun" || today == "Sat") {
				if (p.isMember() == false) {
					if (p.getAge() > 7) {
						if (p.getAge() < 18) {
							if (p.pay(4000) == false){
								throw new MoneyException("Not enough money");
							}
							else{
								income = income + 4000;
								visitors++;
								//System.out.println(visitors);
								nameList[visitors] = name;
								//System.out.println(nameList[visitors]);
								person++;
								return true;
							}	
						}
						else {
							if (p.pay(7000) == false)
								throw new MoneyException("Not enough money");
							else
								income = income + 7000;
						}
					}
					else{
						if (p.pay(1000) == false)
							throw new MoneyException("Not enough money");
						else{
							income = income + 1000;
							visitors++;
							nameList[visitors] = name;
							person++;
							return true;
						}
					}
				}
				else{
					if (p.pay(1000) == false)
						throw new MoneyException("Not enough money");
					else{
						income = income + 1000;
						visitors++;
						nameList[visitors] = name;
						person++;
						return true;
					}
				}
			}
			else {
				if (p.isMember() == false) {
					if (p.getAge() > 7) {
						if (p.getAge() < 18) {
							if (p.pay(2000) == false)
								throw new MoneyException("Not enough money");
							else{
								income = income + 2000;
								visitors++;
								nameList[visitors] = name;
								person++;
								return true;
							}	
						}
						else {
							if (p.pay(5000) == false)
								throw new MoneyException("Not enough money");
							else
								income = income + 5000;
						}
					}
				}
			}
			visitors++;
			nameList[visitors] = name;
			person++;
			return true;
		}
		else {
			throw new VisitorNumException("Capacity of museum is full");
		}
	}
	public void quit(String visitorName) throws VisitorNameException{
		int n;
		for(n = 0 ; n < 11 ; n ++){
			if(nameList[n] == visitorName){
				System.out.println(visitorName + "Επΐε");
				person --;
				break;
			}
			else if(n==10){
				throw new VisitorNameException("Name doesn't match");
			}
		}
	}
}
