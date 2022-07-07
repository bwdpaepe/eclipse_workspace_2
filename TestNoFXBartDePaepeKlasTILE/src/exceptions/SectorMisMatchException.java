package exceptions;

public class SectorMisMatchException extends Exception {

	public SectorMisMatchException() {
		super("sector mismatch");
	}

	public SectorMisMatchException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public SectorMisMatchException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public SectorMisMatchException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public SectorMisMatchException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
