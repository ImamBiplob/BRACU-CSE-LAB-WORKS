public class PrintArray {
  public static void main(String[] args) {
    int a[]={1,23,4,24,56,2,67,78,5};
    int i=0;
    PA(a,i);
  }
  public static void PA(int []a,int i) {
    if(i==a.length) return;
    System.out.println(a[i]);
    PA(a,i+1);
  }
}