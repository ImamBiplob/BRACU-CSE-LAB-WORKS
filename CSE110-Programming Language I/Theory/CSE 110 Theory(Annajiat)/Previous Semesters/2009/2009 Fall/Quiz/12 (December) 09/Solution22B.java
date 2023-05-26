public class Solution22B {
    public int sum;
    public int y = 3;
    public void methodA(){    
        int x=2, y =0, j = 0; 
        while (j < 2){
            y = y + j; 
            x = methodB(j , y);
            sum = x - y;
            System.out.println(x + " " + y+ " " + sum);
            j++;
        }
    }
    public int methodB(int w, int k){
        int x = 0;
        y = y - k + 2;
        x = x - 3 + w;
        sum = sum - x + y;
        System.out.println(x + " " + y+ " " + sum);  
        return sum;
    }
}
