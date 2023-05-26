public class JavaFX1B{
  public int sum=20;
  public int y;
  public void methodA(){
    int x=0, y=0;
    x = y - 7 + sum;
    y = 3 + y;
    sum = y + x;
    System.out.println(x + " " + y+ " " + sum);
  }
  public void methodB(){
    int x = 0;
    y = y + 1 + sum;
    x = x + 3 + y;
    sum = sum + x + y;
    System.out.println(x + " " + y+ " " + sum);
  }
}

