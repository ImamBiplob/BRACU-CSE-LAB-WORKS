public class LearningMatrix{ // Array
    public static void main(String[]args){
        int []a;
        a = new int[3];  // a[0    0    0]
        
        a[0]=10;   // a[10    0    0]
        a[1]=33;   // a[10    33    0]
        a[2]=400;   // a[10   33    400]
     
        System.out.print("[");
        System.out.print(a[0]+" ");
        System.out.print(a[1]+" ");
        System.out.print(a[2]);
        System.out.println("]");
        System.out.print(a[2]);
    }
}