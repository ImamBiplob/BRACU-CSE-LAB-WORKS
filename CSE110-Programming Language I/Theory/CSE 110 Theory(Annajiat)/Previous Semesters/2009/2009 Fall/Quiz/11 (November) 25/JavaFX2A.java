public class JavaFX2A{
  public int y;
  public int sum=20;
  public void methodA(){
    int x = 0;
    y = y + 3 + sum;
    x = x + 1 + y;
    sum = sum + x + y;
    System.out.println(x + " " + y+ " " + sum);
  }
  public void methodB(){
    int x=0, y=0;
    x = y - 4 + sum;
    y = 4 + y;
    sum = y + x;
    System.out.println(x + " " + y+ " " + sum);
  }
}

