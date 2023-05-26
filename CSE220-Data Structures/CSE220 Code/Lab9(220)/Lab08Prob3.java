public class Lab08Prob3 {
  public static void main(String [] args) {
    int a[]={6,5,3,1,2};
    int i=a.length-1;
    BS(a,i);
    for(int k=0;k<a.length;k++){
      System.out.println(a[k]);
    }
   // Node x=new Node(0,null);
   // for(int k=0;
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
 // public static void BSlist(Node 
}