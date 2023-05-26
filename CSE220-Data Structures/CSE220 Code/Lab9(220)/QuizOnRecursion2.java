public class QuizOnRecursion2 {
  public static void main(String[] args) {
    int a=4210,n=1000;
    printChar(a,n);
  }
  //try{
   public static void printChar(int a,int n) {
        System.out.println(a/n);
        a=a%n;
        n=n/10;
        printChar(a,n);
        if(a==0) return;
    }
  }
  //catch(Exception e){
   // System.out.println(Program Ends!);
  