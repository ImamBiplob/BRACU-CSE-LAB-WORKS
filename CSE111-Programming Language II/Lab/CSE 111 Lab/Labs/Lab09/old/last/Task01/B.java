class B extends A {
  public int x;
  public int sum;
  public B(){
    y = temp + 3 ;
    sum = 3 + temp + 2;
    temp-=1;
  }  
  public B(B b){
    sum = b.sum;
    x = b.x;
  }
  public void methodB(int m, int n){    
    int  y =0;
    y = y + this.y; 
    x = this.y + 2 + temp;
    methodA(x, y);
    sum = x + y + sum;
    System.out.println(x + " " + y+ " " + sum);
  }
}
