import java.util.Scanner;
public class P9{ //18301276
  public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    System.out.print("enter line limit");
    int input=k.nextInt();
    for(int line=1;line<=input;line++)
    { 
      for(int sp=1;sp<=input-line;sp++)
      {
        System.out.print(" ");
      }
      for(int col=1;col<=2*line-1;col++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
              