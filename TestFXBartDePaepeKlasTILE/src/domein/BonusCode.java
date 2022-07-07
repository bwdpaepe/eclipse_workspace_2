package domein;

import java.security.SecureRandom;

public class BonusCode 
{
    private String code;

    public BonusCode()
    {
        genereerBonusCode();
    }
    
    public BonusCode(String code)
    {
        controleerCode(code);
        this.code = code;
    }

    // controleerCode
    private void controleerCode(String code) {
    	if(!code.matches("A\\d{5}[A-Z]{3}")){
    		throw new IllegalArgumentException("code past niet");
    	}
    }
   

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

   
    // zijnOpeenvolgendeBonusCodes
    public boolean zijnOpeenvolgendeBonusCodes(BonusCode bc1, BonusCode bc2) {
    	String code1 = bc1.getCode();
    	String code2 = bc2.getCode();
    	
    	String letter1 = code1.substring(-3);
    	String letter2 = code2.substring(-3);
    	
    	if(letter1 == letter2) {
    		String cijfer1 = code1.substring(1,6);
    		String cijfer2 = code2.substring(1,6);
    		if(Math.abs(Integer.parseInt(cijfer1)-Integer.parseInt(cijfer2))<=150) {
    			return true;
    		}
    	}
    	return false;
    }

   // genereerBonusCode
    private BonusCode genereerBonusCode() {
    	StringBuilder buffer1 = new StringBuilder();
    	
    	buffer1.append("A");
    	for(int i = 0; i < 5;i++) {
    		SecureRandom rnd = new SecureRandom();
    		buffer1.append(rnd.nextInt(10));
    	}
    	char[] alfabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    	for(int i = 0; i < 3;i++) {
    		SecureRandom rnd = new SecureRandom();
    		buffer1.append(String.valueOf(alfabet[rnd.nextInt(26)]).toUpperCase());
    	}
    	return new BonusCode(buffer1.toString());
    	
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BonusCode other = (BonusCode) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}
    
    
    

}

