import java.util.*;

public class Task7b {
 public static void main(String[] args) { 
   Scanner sc = new Scanner(System.in);
   String a = sc.next();
   String b = sc.next();
   if(a.compareToIgnoreCase(b)<0){
     System.out.println(b + " is lexiographycally greater than " + a);
   }
   else if(a.compareToIgnoreCase(b)==0){
     System.out.println(b + " is lexiographycally equal with " + a);
   }
   else{
    System.out.println(b + " is lexiographycally less than " + a);
   }
  }
}