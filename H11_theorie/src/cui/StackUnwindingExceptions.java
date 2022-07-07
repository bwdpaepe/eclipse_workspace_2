package cui;

public class StackUnwindingExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		}
		catch(Exception e) {
			System.err.printf("%s%n%n", e.getMessage());
			e.printStackTrace();
		}

	}
	
	public static void method1() throws Exception {
		method2();
	}
	
	public static void method2() throws Exception {
		method3();
	}
	
	public static void method3() throws Exception {
		throw new Exception("Exception thrown in method3");
	}

}
