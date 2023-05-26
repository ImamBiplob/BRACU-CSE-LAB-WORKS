public class StringToInteger {
  // @author ImamBiplob
  public static void main(String[] args) {
    String s="123456789";
    int n=0,i=0;
    System.out.println(Integer.parseInt(String.valueOf(s.charAt(6)))+1);// To see conversion
    System.out.println(convert(s,n,i));
  }
  public static int convert(String s,int n,int i) {
    if(i==s.length()) return n;
    else{
    n=n*10;
    n=n+Character.getNumericValue(s.charAt(i));//Conversion from ASCII to INTEGER, Another type of conversion = s.charAt(i)-'0'
    return convert(s,n,i+1);
    }
  }
}