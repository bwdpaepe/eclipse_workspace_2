package ui;

public class StringExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "GOODBYE";
		String s3 = "  spaces  ";
		System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%n", s1, s2, s3);
		
		//replace
		System.out.printf("replace l by L in hello: %s%n", s1.replace('l', 'L'));
		
		//ucase, lcase
		
		//trim
		System.out.printf("with spaces: %s%n", s3);
		System.out.printf("without spaces: %s%n", s3.trim());
		System.out.printf("with spaces: %s%n", s3);
		
		//convert to charRay
		char[] charRay = s1.toCharArray();
		
		for(char kar: charRay) {
			System.out.printf("%c%n", kar);
		}

	}

}
