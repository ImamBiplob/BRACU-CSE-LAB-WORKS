import java.util.Scanner;
public class lab2problem09 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 10 numbers");
    int array[]=new int[10];
    for(int i=0;i<array.length;i++){
      array[i]=sc.nextInt();
    }
    int temp;
    int sorttype;
    System.out.println("how do u want to sort the numbers? If only at odd positions type 1, if only at even positions type 2, if at all positions type any number");
    sorttype=sc.nextInt();
    if(sorttype==1){
      for(int i=0;i<array.length;i+=2) {
       for(int j=0;j<array.length-2;j+=2) {
        if(array[j]<array[j+2]) {
          temp=array[j+2];
          array[j+2]=array[j];
          array[j]=temp;
        }
       }
      }
    }
    else if(sorttype==2) {
      for(int i=1;i<array.length;i+=2) {
       for(int j=1;j<array.length-2;j+=2) {
        if(array[j]<array[j+2]) {
          temp=array[j+2];
          array[j+2]=array[j];
          array[j]=temp;
        }
       }
      }
    }
      else {
     for(int i=0;i<array.length;i++) {
      for(int j=0;j<array.length-1;j++) {
        if(array[j]<array[j+1]) {
          temp=array[j+1];
          array[j+1]=array[j];
          array[j]=temp;
        }
      }
    }
      }
    for(int i=0;i<10;i++)
      System.out.print(array[i]+" ");
    System.out.println();
  }
}