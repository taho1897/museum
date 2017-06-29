/*  금액 관련 Exception 처리 */
public class MoneyException extends Exception {//MoneyException class 선언
	public MoneyException(String arg) {//MoneyException method 선언, 인자로 String 을 받음
		super(arg);//받은 인자를 통해 부모클래스의 생성자 초기화
	}
}
