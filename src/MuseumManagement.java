
public class MuseumManagement {
	
	public static void main(String[] args){
		String day;
		Person p1 = new Person("이규필", 9, 10000, false);
		Person p2 = new Person("김홍래", 19, 5000, false);
		Person p3 = new Person("민명기", 23, 0, true);
		Person p4 = new Person("박경찬", 7, 5000, false);
		Person p5 = new Person("이영권", 15, 2000, false);
		Person p6 = new Person("최환록", 30, 4000, true);
		Person p7 = new Person("우희만", 20, 5000, false);
		Person p8 = new Person("정병구", 15, 7000, false);
		Person p9 = new Person("박상윤", 17, 1000, true);
		Person p10 = new Person("류윤규", 15, 6000, false);
		Person p11 = new Person("김윤수", 20, 2000, false);
		day = "Sun";
		MuseumAdmission ma = new MuseumAdmission(day);
		System.out.println("ma 시작 :" + day + " 오늘 :" + ma.getVisitors() + "명, 현재 : " + ma.getPerson() + "명, 수입 : " + ma.getIncome() + "원");
		
		try{
			ma.enter(p1, p1.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " 입장, 오늘 :" + ma.getVisitors() + "명, 현재 : " + ma.getPerson() + "명, 수입 : " + ma.getIncome() + "원");
		try{
			ma.enter(p2, p2.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " 입장: 오늘 :" + ma.getVisitors() + "명, 현재 : " + ma.getPerson() + "명, 수입 : " + ma.getIncome() + "원");
		try{
			ma.enter(p3, p3.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " 입장: 오늘 :" + ma.getVisitors() + "명, 현재 : " + ma.getPerson() + "명, 수입 : " + ma.getIncome() + "원");
		try{
			ma.enter(p4, p4.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " 입장: 오늘 :" + ma.getVisitors() + "명, 현재 : " + ma.getPerson() + "명, 수입 : " + ma.getIncome() + "원");
		try{
			ma.enter(p5, p5.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " 입장: 오늘 :" + ma.getVisitors() + "명, 현재 : " + ma.getPerson() + "명, 수입 : " + ma.getIncome() + "원");
		try{
			ma.enter(p6, p6.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " 입장: 오늘 :" + ma.getVisitors() + "명, 현재 : " + ma.getPerson() + "명, 수입 : " + ma.getIncome() + "원");
		try{
			ma.enter(p7, p7.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " 입장: 오늘 :" + ma.getVisitors() + "명, 현재 : " + ma.getPerson() + "명, 수입 : " + ma.getIncome() + "원");
		try{
			ma.enter(p8, p8.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " 입장: 오늘 :" + ma.getVisitors() + "명, 현재 : " + ma.getPerson() + "명, 수입 : " + ma.getIncome() + "원");
		try{
			ma.enter(p9, p9.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " 입장: 오늘 :" + ma.getVisitors() + "명, 현재 : " + ma.getPerson() + "명, 수입 : " + ma.getIncome() + "원");
		try{
			ma.enter(p10, p10.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " 입장: 오늘 :" + ma.getVisitors() + "명, 현재 : " + ma.getPerson() + "명, 수입 : " + ma.getIncome() + "원");
		try{
			ma.enter(p11, p11.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " 입장: 오늘 :" + ma.getVisitors() + "명, 현재 : " + ma.getPerson() + "명, 수입 : " + ma.getIncome() + "원");
		try{
			ma.quit("야");
		}
		catch(VisitorNameException name){
			name.printStackTrace();
		}
		try{
			ma.quit("이규필");
		}
		catch(VisitorNameException name){
			name.printStackTrace();
		}
		day = "Mon";
		MuseumAdmission ma2 = new MuseumAdmission(day);
		System.out.println("ma 시작 :" + day + " 오늘 :" + ma2.getVisitors() + "명, 현재 : " + ma2.getPerson() + "명, 수입 : " + ma2.getIncome() + "원");
		try{
			ma2.enter(p1, p1.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		finally{
			System.out.println(ma2.getName(ma2.getVisitors()) + " 입장 오늘 :" + ma2.getVisitors() + "명, 현재 : " + ma2.getPerson() + "명, 수입 : " + ma2.getIncome() + "원");
		}
		try{
			ma2.enter(p2, p2.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " 입장: 오늘 :" + ma2.getVisitors() + "명, 현재 : " + ma2.getPerson() + "명, 수입 : " + ma2.getIncome() + "원");
		try{
			ma2.enter(p3, p3.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " 입장: 오늘 :" + ma2.getVisitors() + "명, 현재 : " + ma2.getPerson() + "명, 수입 : " + ma2.getIncome() + "원");
		try{
			ma2.enter(p4, p4.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " 입장: 오늘 :" + ma2.getVisitors() + "명, 현재 : " + ma2.getPerson() + "명, 수입 : " + ma2.getIncome() + "원");
		try{
			ma2.enter(p5, p5.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " 입장: 오늘 :" + ma2.getVisitors() + "명, 현재 : " + ma2.getPerson() + "명, 수입 : " + ma2.getIncome() + "원");
		try{
			ma2.enter(p6, p6.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " 입장: 오늘 :" + ma2.getVisitors() + "명, 현재 : " + ma2.getPerson() + "명, 수입 : " + ma2.getIncome() + "원");
		try{
			ma2.enter(p7, p7.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " 입장: 오늘 :" + ma2.getVisitors() + "명, 현재 : " + ma2.getPerson() + "명, 수입 : " + ma2.getIncome() + "원");
		try{
			ma2.enter(p8, p8.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " 입장: 오늘 :" + ma2.getVisitors() + "명, 현재 : " + ma2.getPerson() + "명, 수입 : " + ma2.getIncome() + "원");
		try{
			ma2.enter(p9, p9.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		try{
			ma2.quit("이규필");
		}
		catch(VisitorNameException name){
			name.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " 입장: 오늘 :" + ma2.getVisitors() + "명, 현재 : " + ma2.getPerson() + "명, 수입 : " + ma2.getIncome() + "원");
		try{
			ma2.enter(p10, p10.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " 입장: 오늘 :" + ma2.getVisitors() + "명, 현재 : " + ma2.getPerson() + "명, 수입 : " + ma2.getIncome() + "원");
		try{
			ma2.enter(p11, p11.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " 입장: 오늘 :" + ma2.getVisitors() + "명, 현재 : " + ma2.getPerson() + "명, 수입 : " + ma2.getIncome() + "원");
		try{
			ma2.quit("박경찬");
		}
		catch(VisitorNameException name){
			name.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " 입장: 오늘 :" + ma2.getVisitors() + "명, 현재 : " + ma2.getPerson() + "명, 수입 : " + ma2.getIncome() + "원");
	}
}
