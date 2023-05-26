public class SampleException
{
  
  public void testException(String string) throws EitaIntNoiException
    
  {
    
    if(string == null)
      
      throw new EitaIntNoiException("The String value is null");
    
  }
  
  
  public static void main(String[] args)
  {
    int arr[] = new int[6];
    SampleException excep = new SampleException();
    try
    {
      excep.testException(null);
      
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Hello");
    }
    catch(EitaIntNoiException e)
    {
      System.out.println("Eita exception na ");
    }
    finally
    {
      System.out.println("Learning Finally");
    }
  }
  
  class EitaIntNoiException extends Exception
  {
    public EitaIntNoiException()
    {
    }
    public EitaIntNoiException(String message)
    {
      super(message);
    }
    public EitaIntNoiException(Throwable cause)
      
    {
      
      super(cause);
      
    }
    
  }
}