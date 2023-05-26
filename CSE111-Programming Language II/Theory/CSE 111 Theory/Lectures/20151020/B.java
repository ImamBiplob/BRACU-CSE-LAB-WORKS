class B extends A {
    public static int x = 2;
    public B(){
        y = temp + 200 ;
        x = 2 + temp + x;
        temp -= 1;
    }
    public B(B b){
        sum = b.sum + sum;
        b.x = b.x + sum;
        b.methodA(sum, 200);
    }
    public void methodB(int m, int n){
        int y = 2, temp = 2;
        y = y + this.y + m;
        x = y + 2 + temp - n;
        methodA(x, y);
        sum = x + y + sum;
        System.out.println(x + " " + y+ " " + sum);
    }
}