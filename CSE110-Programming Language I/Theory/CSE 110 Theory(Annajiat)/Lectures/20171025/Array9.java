public class Array9 {
      public static void main (String[] args) {
            int i;
            int[] a = {10,30,20};
            int[] b = {105,305,205};
            int[] c = new int[3];
            
            for (i=0 ; i<c.length ; ++i) {
                  c[i] = a[i] + b[i];
            }
            for (i=0 ; i<c.length ; ++i) {
                  System.out.print(c[i]+" ");
            }
      }
}