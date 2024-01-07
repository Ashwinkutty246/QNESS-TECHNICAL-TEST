package TechnicalTest;
import java.sql.SQLException;


public class exceptionManager 
{

	public void beginAction() 
	{
        try {
            System.out.println("Begin action");
        } catch (Exception e) 
        {
            handleException("Exception during beginAction", e);
        }
    }

    public void action() 
    {
        try {
               System.out.println("Performing main action");
        	}  
        catch (Exception e) 
        {
            handleException("Exception during action", e);
        }
    }

    public void endAction(boolean actionOk) 
    {
        try 
        {
          if (actionOk) 
          {
        	  System.out.println("End action successfully");
          } 
          else 
          {
             System.out.println("End action with error");
           }
        }
        catch (Exception e) 
        {
            handleException("Exception during endAction", e);
        }
    }

    private void handleException(String message, Exception e) 
    {
        System.err.println(message);
        e.printStackTrace();
    }

    public static void main(String[] args)
    {
       	exceptionManager manager = new exceptionManager();
        manager.beginAction();
        manager.action();
        manager.endAction(true); 
    }
}