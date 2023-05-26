public class BubbleSort {
  public static void main(String [] args) {
    int a[]={6,5,3,1,2};
    int i=a.length-1;
    BS(a,i);  //Recursive method
    for(int k=0;k<a.length;k++){
      System.out.println(a[k]);
    }
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
}