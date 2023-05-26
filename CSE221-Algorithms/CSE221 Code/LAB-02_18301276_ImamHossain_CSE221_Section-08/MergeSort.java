import java.util.Arrays;
public class MergeSort{
  public static void main(String[] args) {
    int a[] = {10,9,7,8};
    a=mergeSort(a);
    for(int i=0;i<a.length;i++) {
      System.out.println(a[i]);
    }
  }
  //int farray [];
  public static int[] mergeSort(int [] a){
    if (a.length==1){
      return a;
    }else{
      int mid = a.length/2;
      int ar1[] = new int [mid];
      int ar2[] =new int [a.length-mid];
      for(int i=0;i<mid;i++) {
        ar1[i]=a[i];
      }
      for(int i=0;i<ar2.length;i++) {
        ar2[i] = a[i+mid];
      }
      // create the second half with a.lenght-mid
      // copy the first half to ar1
      // copy the second half to ar2
     ar1=mergeSort(ar1);
     ar2=mergeSort(ar2);
     a=Merge(ar1,ar2);
     return a;
      // call mergeSort on the second half
      // then merge the 2 subarrays
    }
  }
  public static int[] Merge(int a[],int b[]) {
    int n1=a.length, n2=b.length;
    int n=n1+n2;
    int c[] = new int [n];
    int i=0,j=0,k=0;
    while(i<a.length && j<b.length) {
      if(a[i]<b[j]) {
        c[k]=a[i];
        i++;
      }
      else {
        c[k]=b[j];
        j++;
      }
      k++;
    }
    if(i!=a.length) {
      for(int x=i;x<a.length;x++){
        c[k]=a[i];
        i++;
        k++;
      }
    }
    if(j!=b.length) {
      for(int x=j;x<b.length;x++) {
        c[k]=b[j];
        j++;
        k++;
      }
    }
    return c;
  }
      
  
  
}