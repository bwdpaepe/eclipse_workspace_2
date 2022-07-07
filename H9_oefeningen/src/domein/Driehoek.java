package domein;

public class Driehoek extends Veelhoek {
	
	private int a;
	private int b;
	private int c;

	public Driehoek(int a, int b, int c) {
		super(3);
		// TODO Auto-generated constructor stub
		try {
			this.controleerZijde(a);
			this.controleerZijde(b);
			this.controleerZijde(c);
		}
		catch(IllegalArgumentException e) {
			System.err.println(e);
		}
		
		this.setA(a);
		this.setB(b);
		this.setC(c);
	}
	
	
	
	public int getA() {
		return a;
	}



	private void setA(int a) {
		this.a = a;
	}



	public int getB() {
		return b;
	}



	private void setB(int b) {
		this.b = b;
	}



	public int getC() {
		return c;
	}



	private void setC(int c) {
		this.c = c;
	}



	private void controleerZijde(int z) {
		if(z <= 0) {
			throw new IllegalArgumentException("zijde moet strikt positief zijn");
		}
	}
	
	public boolean isRechthoekigeDriehoek() {
		if(Math.pow(this.getA(),2) + Math.pow(this.getB(), 2) == Math.pow(this.getC(), 2) || Math.pow(this.getA(),2) + Math.pow(this.getC(), 2) == Math.pow(this.getB(), 2) || Math.pow(this.getB(),2) + Math.pow(this.getB(), 2) == Math.pow(this.getA(), 2)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("%sZijde 1 = %d%nZijde 2 = %d%nZijde 3 = %d%nRechthoekig: %b%n", super.toString(),this.getA(), this.getB(), this.getC(), this.isRechthoekigeDriehoek());
	}
	
	

}
