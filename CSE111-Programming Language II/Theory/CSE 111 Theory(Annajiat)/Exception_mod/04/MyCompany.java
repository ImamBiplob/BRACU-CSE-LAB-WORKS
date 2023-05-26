import java.util.Scanner;
public class MyCompany{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter age");
    int age = sc.nextInt();    
    GraphCompany gc = new GraphCompany();
    System.out.println("Before Calling makeGraph");  
    try{
      gc.makeGraph(age);
    }catch(ArithmeticException e){
      System.out.println("main: I have caught the ArithmeticException");
    }          
    System.out.println("After Calling makeGraph");
    
  }
}