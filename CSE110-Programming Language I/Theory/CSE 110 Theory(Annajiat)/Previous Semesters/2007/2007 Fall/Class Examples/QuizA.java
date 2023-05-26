public class QuizA{
  public int sum;
  public int y;
  public void methodA(){    
    int x=0, y =0;
    y = y + 2; 
    x = y + 1;
    sum = x + y + methodB(x, y);
    System.out.println(x + " " + y+ " " + sum);
  }
  public int methodB(int m, int n){
    int x = 0;
    y = y + m;
    x = x + 3 + n;
    sum = sum + x + y;
    System.out.println(x + " " + y+ " " + sum);  
    return sum;
  }
}
