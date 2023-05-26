public class Solution21A
{  
    public static void main(String args[])
    {
        int x = 0, y =0;
        int sum = 0;
        while (x < 10){
            y = x - 3;
            while (y < 2){
                sum = (sum % 2) + x*3 - y;
                System.out.println(sum);         
                y = y + 1;
            }
            if (x > 8){
                x++;
            }else{
                x += 2;
            }
        }
        sum = sum + x + y;
        System.out.println(sum);
    }
}
