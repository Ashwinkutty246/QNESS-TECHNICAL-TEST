package TechnicalTest;

import org.apache.log4j.Logger;


public class question1321 
{

	private static Logger logger = Logger.getLogger(question1321.class);
	  
    public void test() {
    	exceptionManager man = new exceptionManager();

        boolean errorOccurred = false;

        try 
        {
        	man.beginAction();
        	man.action();
        }
        catch (Exception e)
        {
            logger.error("Error during test execution: " + e.getMessage());
            errorOccurred = true;
        }
        finally 
        {
          man.endAction(!errorOccurred); 
        }
    }
}
