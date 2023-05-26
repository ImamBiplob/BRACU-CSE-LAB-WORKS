public class SelectionSort {
  public static void main(String[] args) {
    int a[] ={12,43,56,34,78};
    int i=a.length-1;
    SS(a,i);
    for(int k=0;k<a.length;k++) {
      System.out.println(a[k]);
    }
  }
  public static void SS(int[] a,int i) {
    if(i==0) return;
    int max=a[0];
    int maxIdx=0;
    for(int j=1;j<=i;j++) {
      if(a[j]>max) {
        max=a[j];
        maxIdx=j;
      }
    }
      int temp=a[i];
      a[i]=max;
      a[maxIdx]=temp;
      SS(a,i-1);
  }
}