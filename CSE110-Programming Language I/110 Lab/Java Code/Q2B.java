public class Q2B {
  public static void main(String[] args) {
    int a=54,b=24,d=0;
    while(a%2==0&&b%2==0) {
      System.out.println(a);
      b/=2;
      ++d;
    }
    while(a!=b) {
      if (a%2==0) {
        a/=2;
      }
      else if(b%2==0) {
        b/=2;
      }
      else if(a>b) {
        a=(a-b)/2;
      } 
      else {
        b=(b-a)/2;
      }
      System.out.println(a);
      System.out.println(b);
    }
    System.out.println(a+b+d);
  }
}
      