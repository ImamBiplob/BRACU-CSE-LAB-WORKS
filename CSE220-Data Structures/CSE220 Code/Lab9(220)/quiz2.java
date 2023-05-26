public class quiz2 {
  public static void main(String[] args) {
    int a[]={2,3,4,5,7};int i=1;
    int max=a[0];
    System.out.println(maximum(a,i,max));
  }
  public static int  maximum(int a[],int i,int m) {
    
    if(i==a.length)return m;
    
      if(a[i]>m){
        m=a[i];
      }
      i++;
      
      return maximum(a,i,m);
    
  }
}
    