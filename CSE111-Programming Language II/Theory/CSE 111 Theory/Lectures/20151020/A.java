class A{
    public static int temp = 2;
    public int sum = 2;
    public int y = 2;
    public A(){
        y = temp - 2;
        sum = temp + 2;
        temp-= 2;
    }
    public void methodA(int m, int n){
        int x = 122;
        y = y + m + (temp++);
        x = x + 22 + n;
        sum = sum + x + y;
        System.out.println(x + " " + y+ " " + sum);
    }
}
