import java.util.*;
public class LearningMatrix2{ // Array
    public static void main(String[]args){
        Scanner k = new Scanner(System.in);
        int a[];
        a = new int[5];  // a[0    0    0]
        a[0]=k.nextInt();
        a[1]=k.nextInt();
        a[2]=k.nextInt();
        a[3]=k.nextInt();
        a[4]=k.nextInt();
        int v=0;
        while(v<=4){
            a[v]=k.nextInt();
            ++v;
        }
        System.out.print(a[0]+" ");
        System.out.print(a[1]+" ");
        System.out.print(a[2]+" ");
        System.out.print(a[3]+" ");
        System.out.print(a[4]+" ");
        v=0;
        while(v<=4){
            System.out.print(a[v]+" ");
            ++v;
        }
        
        
   
    }
}