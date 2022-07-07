package domein;

public class ValidateInput {
	
	public static boolean validateFirstName(String firstName) {
		return firstName.matches("[A-Z][a-zA-Z]*");
	}
	
	public static boolean validateLastName(String lastName) {
		return lastName.matches("[a-zA-z]+(['-][a-zA-Z]+)*");
	}
	
	public static boolean validateAddress(String address) {
		return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}
	
	public static boolean validateCity(String city) {
		return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}
	
	public static boolean validateState(String state) {
		return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}
	
	public static boolean validateZip(String zip) {
		return zip.matches("\\d{5}");
	}
	
	public static boolean validatePhone(String phone) {
		return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
	}
	
	//Oefening 8
	public static boolean validatePostcode(String postcode) {
		return postcode.matches("[1-9]\\d{3}");
	}
	
	public static boolean validateHuisnummer(String huisnummer) {
		return huisnummer.matches("\\d+([a-zA-Z]\\d?)?");
	}
	public static boolean validateNaam(String naam) {
		return naam.matches("[a-zA-Z][a-zA-Zéèçà]+(\\s[a-zA-Zéèçà]+)*");
	}
	public static boolean validateEmail(String email) {
		return email.matches("[A-z]+(\\.[A-z]+)*@[A-z]+([.-][A-z]+)+");
	}
	

}
