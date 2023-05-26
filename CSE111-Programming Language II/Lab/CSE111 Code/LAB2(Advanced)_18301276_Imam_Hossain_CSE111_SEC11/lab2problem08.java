import java.util.Scanner;
public class lab2problem08 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 10 numbers within 0 to 9");
    int array[]=new int[10];
    int a[]=new int[10];
    int i=0,c=0,c2=0;
    loop1:
    do{
      int n=sc.nextInt();
      loop2:
      for(int j=0;j<i;j++){
        if(n==array[j]){
        c++;
        }
        if(c==4){
           System.out.println(n+" is already taken for 4 times, print another number");
           c=0;
           continue loop1;
        }
       }
      c=0;
      array[i]=n;
      a[n]++;
      i++;
    }
    while(i<array.length);
    for(i=0;i<a.length;i++) {
      if(a[i]>1)
        System.out.println(i);
    }
  }
}