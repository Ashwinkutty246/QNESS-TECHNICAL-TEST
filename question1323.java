package TechnicalTest;

import org.apache.log4j.Logger;

public class question1323 {

	 private static Logger logger = Logger.getLogger4(question1323.class);
	  
	    public void test() throws Exception {
	    	exceptionManager man = new exceptionManager();

	        try {
	            man.beginAction(); 
	            man.action();
	            // Perform other actions if needed
	        } catch (Exception e) {
	            // Log the exception or handle it as needed
	            logger.error("Error during test execution: " + e.getMessage());
	            throw e; // Propagate the exception to the caller
	        } finally {
	            man.endAction(false); // Assuming an error occurred in case of an exception
	        }

	        // If no exception occurred, set actionOk to true
	        man.endAction(true);
	    }
	}
