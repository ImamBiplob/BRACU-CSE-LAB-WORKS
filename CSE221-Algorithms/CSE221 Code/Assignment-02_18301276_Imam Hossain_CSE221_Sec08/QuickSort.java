import java.util.Arrays;
public class QuickSort {
  public static void main(String[] args) {
    
    int a[] = {2,8,4,6,5,1};
    quickSort(a,0,5);
    System.out.println(Arrays.toString(a));
  }
  
  public static void quickSort(int [] a, int p, int r) {
    int q=0;
    if(p<r) {
      q=partition(a,p,r);
      quickSort(a,p,q);
      quickSort(a,q+1,r);
    }
  }
  public static int partition(int[]a, int p, int q) {
    int x = a[p];
    int i = p;
    for(int j=p+1;j<=q;j++) {
      if(a[j]<=x) {
        i++;
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
    int temp = a[i];
    a[i]=a[p];
    a[p]=temp;
    return i;
  }
}