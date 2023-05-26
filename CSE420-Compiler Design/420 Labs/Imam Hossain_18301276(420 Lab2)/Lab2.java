import java.util.*;
public class Lab2 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n=sc.nextInt();
    String text;
    int i=1;
    for(;i<n+1;i++) {
      text=sc.next();
      if (isEmail(text)) {
        System.out.println("Email: "+i);
        continue;
      }
      if (isWeb(text)) {
        System.out.println("Web: "+i);
      }
    }
  }
  
  public static boolean isEmail(String text) {
    
    if (text.contains("@")==false)
      return false;
    
    String str[] = text.split("@",2);
   
    char startswith = str[0].charAt(0);
    
    if(Character.isLetter(startswith)==false)
      return false;
    
    startswith = str[1].charAt(0);
    if(Character.isLetter(startswith)==false)
      return false;
    
    int index = str[1].lastIndexOf('.');
    if(str[1].substring(index,index+1)=="")
      return false;
    
    return true;
  }
  
  public static boolean isWeb(String text) {
   
    boolean b=text.startsWith("www.");
    if(b==false)
      return false;
    
    String str1[] = text.split(".",2);
    
    int index1 = str1[1].lastIndexOf('.');
    
    if(index1==4)
      return false;
    
    char startswith1 = str1[1].charAt(0);
    if(Character.isLetter(startswith1)==false)
      return false;
  
    if(str1[1].substring(index1,index1+1)=="")
      return false;
    
    return true;
  }
    
}