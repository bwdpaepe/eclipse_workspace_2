package Exception;

public class EmailException extends RuntimeException {

	public EmailException() {
		// TODO Auto-generated constructor stub
		super("Er mis e");
	}

	public EmailException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public EmailException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public EmailException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public EmailException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
