package task.basiccontact.exceptions;

public class ContactAppException  extends RuntimeException{
	//file IO 때 제대로 다룰 예정. (예외 재던지기)
	//case => 예외 발생 원인을 전달해주는 것.
	public ContactAppException(String message,  Throwable cause) {
		super(message, cause);
	}
}
