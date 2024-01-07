package TechnicalTest;

public class stringProgram {

	 public static boolean testPassword(String input) 
	 {
	        return "Horizon".equals(input);
	  }

	    public static void main(String[] args) 
	    {
	        
	        String userInput = "Horizon";
	        boolean result = testPassword(userInput);
	        System.out.println(result);
	    }
	}