public class FibWithMemoization {
  public static void main(String[] args) {
    int i=4;
    System.out.println(i+"th fibonacci number is : "+fib(i));
  }
  public static int fib(int n) {
    if(n==0||n==1) return n;
    
    int m[]=new int[100];
    
    if(m[n]!=0) return m[n];
    
    else {
      m[n]=fib(n-1)+fib(n-2);
      
      return m[n];
    }
  }
}