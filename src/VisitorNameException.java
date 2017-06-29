/*   관람객 이름 관련 Exception 처리 VisitorNameException   */
public class VisitorNameException extends Exception{
	public VisitorNameException(String arg){//생성자
		super(arg);//부모에게 에러 전달
	}
}
