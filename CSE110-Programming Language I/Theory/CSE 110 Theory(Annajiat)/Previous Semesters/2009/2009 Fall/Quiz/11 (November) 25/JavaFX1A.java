public class JavaFX1A{
  public int sum=10;
  public int y;
  public void methodA(){
    int x=0, y=0;
    x = y + 11 + sum;
    y = 8 + y;
    sum = y + x;
    System.out.println(x + " " + y+ " " + sum);
  }
  public void methodB(){
    int x = 0;
    y = y + 11 + sum;
    x = x + 33 + y;
    sum = sum + x + y;
    System.out.println(x + " " + y+ " " + sum);
  }
}

