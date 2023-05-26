import java.util.Scanner;
public class P11{ //18301276
  public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    System.out.print("enter row and column limit");
    int input=k.nextInt();
    for(int line=1;line<=input;line++)
    { 
      for(int sp=1;sp<=input-line;sp++)
      {
        System.out.print(" ");
      }
      for(int col=input-line+1;col<=input;col++)
      {
        System.out.print(col);
      }
      System.out.println();
    }
  }
}
              