public class InsertionSort {
  public static void main(String[] args) {
    int a[] ={12,43,56,34,78};
    int i=1;
    IS(a,i);
    for(int k=0;k<a.length;k++) {
      System.out.println(a[k]);
    }
  }
  public static void IS(int[] a,int i) {
    if(i==a.length) return;
    for(int j=i;j>0;j--) {
      if(a[j]<a[j-1]) {
        int temp=a[j-1];
        a[j-1]=a[j];
        a[j]=temp;
      }
      else break;
    }
    IS(a,i+1);
  }
}