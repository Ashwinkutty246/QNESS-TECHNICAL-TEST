package TechnicalTest;

import java.sql.SQLException;
import org.apache.log4j.Logger;


public class exceptionTest2 
{
	private static Logger logger = Logger.getLogger3(exceptionTest2.class);
	public void test() 
	 	{
		exceptionManager man = new exceptionManager();
	        try 
	        {
	            man.beginAction();
	            man.action();
	            man.endAction(true);
	        } 
	        catch (Exception e) 
	        {
	            Logger.error("Error during test execution: " + e.getMessage());
	            man.endAction(false);
	        }
	    }
	}