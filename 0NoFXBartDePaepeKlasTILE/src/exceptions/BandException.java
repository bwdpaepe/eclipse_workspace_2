package exceptions;

public class BandException extends Exception {

	public BandException() {
		// TODO Auto-generated constructor stub
		super("De bandenmaat moet liggen tussen 12 en 29 (ondergrens inbegrepen en bovengrens niet inbegrepen)");
	}

	public BandException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BandException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public BandException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BandException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
