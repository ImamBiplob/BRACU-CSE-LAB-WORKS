public class Array1 {
      public static void main (String[] args) {
            int i;
            /* way 1 of 3:
            int[] a = new int [3]; //a[0],a[1],a[2]
            a[0] = 10;
            a[1] = 30;
            a[2] = 20;*/
            /* way 2 of 3: array initializer syntax
            int[] a = {10, 30, 20};*/
            // way 3 of 3: array initializer syntax
            int[] a;
            a = new int[] {10, 30, 20};
            ....;
            a = new int[] {300,11,33,44,55};
            
            for (i=0 ; i < a.length ; ++i) {
                  System.out.println(a[i]);
            }
            
      }
}