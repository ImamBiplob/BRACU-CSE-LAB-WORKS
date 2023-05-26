import java.util.Scanner;
public class lab2problem04 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 5 numbers");
    int array[]=new int[5];
    int i=0;
    loop1:
    do{
      int n=sc.nextInt();
      loop2:
      for(int j=0;j<i;j++){
        if(n==array[j]){
        System.out.println(n+" is already taken, print another number");
        continue loop1;
       }
      }
      array[i]=n;
      i++;
    }
    while(i<array.length);
    for(i=0;i<array.length;i++)
      System.out.println(array[i]);
  }
}