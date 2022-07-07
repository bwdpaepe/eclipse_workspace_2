package cui;

public class UsingExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throwException();
			
		}
		catch(Exception e) {
			System.err.println("catch main");
		}
		doesNotThrowException();
	}
	
	public static void throwException() throws Exception {
		try {
			throw new Exception();
		}
		catch (Exception e) {
			System.err.println(e);
			throw e;
		}
		finally {
			System.out.println("fin");
		}
	}
	
	public static void doesNotThrowException() {
		try {
			System.out.println("toto");
		}
		catch (Exception e) {
			System.out.println("toto");
		}
		finally {
			System.out.println("toto");
		}
	}

}
