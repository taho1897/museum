
public class MuseumManagement {
	
	public static void main(String[] args){
		String day;
		Person p1 = new Person("�̱���", 9, 10000, false);
		Person p2 = new Person("��ȫ��", 19, 5000, false);
		Person p3 = new Person("�θ��", 23, 0, true);
		Person p4 = new Person("�ڰ���", 7, 5000, false);
		Person p5 = new Person("�̿���", 15, 2000, false);
		Person p6 = new Person("��ȯ��", 30, 4000, true);
		Person p7 = new Person("����", 20, 5000, false);
		Person p8 = new Person("������", 15, 7000, false);
		Person p9 = new Person("�ڻ���", 17, 1000, true);
		Person p10 = new Person("������", 15, 6000, false);
		Person p11 = new Person("������", 20, 2000, false);
		day = "Sun";
		MuseumAdmission ma = new MuseumAdmission(day);
		System.out.println("ma ���� :" + day + " ���� :" + ma.getVisitors() + "��, ���� : " + ma.getPerson() + "��, ���� : " + ma.getIncome() + "��");
		
		try{
			ma.enter(p1, p1.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " ����, ���� :" + ma.getVisitors() + "��, ���� : " + ma.getPerson() + "��, ���� : " + ma.getIncome() + "��");
		try{
			ma.enter(p2, p2.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " ����: ���� :" + ma.getVisitors() + "��, ���� : " + ma.getPerson() + "��, ���� : " + ma.getIncome() + "��");
		try{
			ma.enter(p3, p3.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " ����: ���� :" + ma.getVisitors() + "��, ���� : " + ma.getPerson() + "��, ���� : " + ma.getIncome() + "��");
		try{
			ma.enter(p4, p4.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " ����: ���� :" + ma.getVisitors() + "��, ���� : " + ma.getPerson() + "��, ���� : " + ma.getIncome() + "��");
		try{
			ma.enter(p5, p5.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " ����: ���� :" + ma.getVisitors() + "��, ���� : " + ma.getPerson() + "��, ���� : " + ma.getIncome() + "��");
		try{
			ma.enter(p6, p6.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " ����: ���� :" + ma.getVisitors() + "��, ���� : " + ma.getPerson() + "��, ���� : " + ma.getIncome() + "��");
		try{
			ma.enter(p7, p7.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " ����: ���� :" + ma.getVisitors() + "��, ���� : " + ma.getPerson() + "��, ���� : " + ma.getIncome() + "��");
		try{
			ma.enter(p8, p8.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " ����: ���� :" + ma.getVisitors() + "��, ���� : " + ma.getPerson() + "��, ���� : " + ma.getIncome() + "��");
		try{
			ma.enter(p9, p9.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " ����: ���� :" + ma.getVisitors() + "��, ���� : " + ma.getPerson() + "��, ���� : " + ma.getIncome() + "��");
		try{
			ma.enter(p10, p10.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " ����: ���� :" + ma.getVisitors() + "��, ���� : " + ma.getPerson() + "��, ���� : " + ma.getIncome() + "��");
		try{
			ma.enter(p11, p11.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma.getName(ma.getVisitors()) + " ����: ���� :" + ma.getVisitors() + "��, ���� : " + ma.getPerson() + "��, ���� : " + ma.getIncome() + "��");
		try{
			ma.quit("��");
		}
		catch(VisitorNameException name){
			name.printStackTrace();
		}
		try{
			ma.quit("�̱���");
		}
		catch(VisitorNameException name){
			name.printStackTrace();
		}
		day = "Mon";
		MuseumAdmission ma2 = new MuseumAdmission(day);
		System.out.println("ma ���� :" + day + " ���� :" + ma2.getVisitors() + "��, ���� : " + ma2.getPerson() + "��, ���� : " + ma2.getIncome() + "��");
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
			System.out.println(ma2.getName(ma2.getVisitors()) + " ���� ���� :" + ma2.getVisitors() + "��, ���� : " + ma2.getPerson() + "��, ���� : " + ma2.getIncome() + "��");
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
		System.out.println(ma2.getName(ma2.getVisitors()) + " ����: ���� :" + ma2.getVisitors() + "��, ���� : " + ma2.getPerson() + "��, ���� : " + ma2.getIncome() + "��");
		try{
			ma2.enter(p3, p3.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " ����: ���� :" + ma2.getVisitors() + "��, ���� : " + ma2.getPerson() + "��, ���� : " + ma2.getIncome() + "��");
		try{
			ma2.enter(p4, p4.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " ����: ���� :" + ma2.getVisitors() + "��, ���� : " + ma2.getPerson() + "��, ���� : " + ma2.getIncome() + "��");
		try{
			ma2.enter(p5, p5.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " ����: ���� :" + ma2.getVisitors() + "��, ���� : " + ma2.getPerson() + "��, ���� : " + ma2.getIncome() + "��");
		try{
			ma2.enter(p6, p6.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " ����: ���� :" + ma2.getVisitors() + "��, ���� : " + ma2.getPerson() + "��, ���� : " + ma2.getIncome() + "��");
		try{
			ma2.enter(p7, p7.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " ����: ���� :" + ma2.getVisitors() + "��, ���� : " + ma2.getPerson() + "��, ���� : " + ma2.getIncome() + "��");
		try{
			ma2.enter(p8, p8.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " ����: ���� :" + ma2.getVisitors() + "��, ���� : " + ma2.getPerson() + "��, ���� : " + ma2.getIncome() + "��");
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
			ma2.quit("�̱���");
		}
		catch(VisitorNameException name){
			name.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " ����: ���� :" + ma2.getVisitors() + "��, ���� : " + ma2.getPerson() + "��, ���� : " + ma2.getIncome() + "��");
		try{
			ma2.enter(p10, p10.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " ����: ���� :" + ma2.getVisitors() + "��, ���� : " + ma2.getPerson() + "��, ���� : " + ma2.getIncome() + "��");
		try{
			ma2.enter(p11, p11.name);
		}
		catch(MoneyException m){
			m.printStackTrace();
		}
		catch(VisitorNumException n){
			n.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " ����: ���� :" + ma2.getVisitors() + "��, ���� : " + ma2.getPerson() + "��, ���� : " + ma2.getIncome() + "��");
		try{
			ma2.quit("�ڰ���");
		}
		catch(VisitorNameException name){
			name.printStackTrace();
		}
		System.out.println(ma2.getName(ma2.getVisitors()) + " ����: ���� :" + ma2.getVisitors() + "��, ���� : " + ma2.getPerson() + "��, ���� : " + ma2.getIncome() + "��");
	}
}
