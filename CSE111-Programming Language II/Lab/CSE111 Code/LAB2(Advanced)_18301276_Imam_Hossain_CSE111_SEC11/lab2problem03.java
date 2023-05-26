import java.util.Scanner;
public class lab2problem03 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 10 numbers");
    int array[]=new int[10];
    for(int i=0;i<array.length;i++){
      array[i]=sc.nextInt();
    }
    int temp;
    for(int i=0;i<array.length;i++) {
      for(int j=0;j<array.length-1;j++) {
        if(array[j]<array[j+1]) {
          temp=array[j+1];
          array[j+1]=array[j];
          array[j]=temp;
        }
      }
    }
    for(int i=0;i<10;i++)
      System.out.print(array[i]+" ");
    System.out.println();
  }
}
                                 