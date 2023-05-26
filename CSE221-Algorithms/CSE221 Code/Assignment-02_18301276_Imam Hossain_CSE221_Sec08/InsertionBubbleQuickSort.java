public class InsertionBubbleQuickSort {
  public static void main(String[] args) {
    int a[] ={12,43,56,34,78};
    int i=1;
    IS(a,i);   //Recursive method for Insertion Sort
    i=a.length-1;
    BS(a,i);  //Recursive method Bubble Sort
    quickSort(a,0,4);   //QuickSort Method
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
  public static void BS(int []a,int i) {
    if(i==0) return;
    for(int j=0;j<i;j++) {
      if(a[j]>a[j+1]) {
        int key=a[j];
        a[j]=a[j+1];
        a[j+1]=key;
      }
    }
    BS(a,i-1);
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