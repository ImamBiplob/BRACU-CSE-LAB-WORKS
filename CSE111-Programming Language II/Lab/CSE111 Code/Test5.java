public class Test5{
  static int sum;
  private int x, y;
  public Test5(int[] a){
    x=++a[0];
    y= a[1]++;
  }
  public Test5(int[] a, int x, int p){
    this.x = p+a[1];
    y = x-a[0];
  }
  public void methodA(){
    int x=2;
    int[] msg = {2, 7, 4};
    methodB(msg[2], msg[1]);
    sum = this.x+x+y+msg[0];
    System.out.println(this.x+" "+x+" "+sum);
  }
  private int methodB(int mg2, int y){
    int x =2;
    this.y = this.y+y-mg2;
    this.x = x-5+y+this.x;
    x = y+this.y;
    sum = sum-x+y;
    mg2 = y-sum;
    System.out.println(x+" "+y+" "+sum);
    return mg2;
  }
}
