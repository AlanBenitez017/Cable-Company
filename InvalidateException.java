
public class InvalidateException extends Exception {

	private static final long serialVersionUID = 1L;

	InvalidateException(String message){
		super(message + "please try again");
	}
}
