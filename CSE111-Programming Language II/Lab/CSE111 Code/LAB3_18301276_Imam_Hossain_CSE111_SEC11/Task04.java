import java.util.Scanner;
public class Task04 {
 public static void main(String[] args) { 
   Scanner sc = new Scanner(System.in);
   String str = sc.next();
   for(char i='A'; i<='Z'; i++){
     int count=0;
     for(int j=0; j<str.length(); j++){
       if(str.charAt(j)==i){
        count++; 
       }
     }
     System.out.println(i + " which is " +(int)i+" was found "+ count + " times");
   }
  }
}
