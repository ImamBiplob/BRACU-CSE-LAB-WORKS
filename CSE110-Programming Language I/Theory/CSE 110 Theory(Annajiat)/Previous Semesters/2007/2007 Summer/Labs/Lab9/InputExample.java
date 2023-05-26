public class InputExample
{  
  public static void main(String args[])
  {
    int x; 
    float y;
    String z;
    boolean p;
    char c;
    SimpleInput sInp = new SimpleInput();
    x = sInp.getInt("Please Enter an Integer");
    System.out.println(x);
    y = sInp.getFloat("Please Enter a Float");
    System.out.println(y);
    z = sInp.getString("Please Enter an String");
    System.out.println(z);
    p = sInp.getBoolean("Please Enter a Boolean");
    System.out.println(p);
    c = sInp.getChar("Please Enter an Char");
    System.out.println(c);        
  }
}

