package domein;

public class Veelhoek {
	private final int aantalHoeken;
	private static int aantal;
	
	public Veelhoek(int aantalHoeken) {
		this.controleerAantalHoeken(aantalHoeken);
		this.aantalHoeken = aantalHoeken;
		Veelhoek.setAantal(Veelhoek.getAantal() + 1);
	}

	public int getAantalHoeken() {
		return aantalHoeken;
	}

	public static int getAantal() {
		return aantal;
	}

	private static void setAantal(int aantal) {
		Veelhoek.aantal = aantal;
	}
	
	@Override 
	public String toString() {
		return String.format("%s%nAantal hoeken = %d%n", this.getClass().getSimpleName(), this.getAantalHoeken());
	}
	
	private void controleerAantalHoeken(int aantalHoeken) {
		if(aantalHoeken <= 2) {
			throw new IllegalArgumentException("aantal hoeken moet groter zijn dan 2");
		}
	}
	
	
}
