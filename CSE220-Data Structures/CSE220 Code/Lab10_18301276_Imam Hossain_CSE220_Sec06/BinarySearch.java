import java.util.Arrays;
public class BinarySearch {
  public static void main(String[] args) {
    int a[]={2,4,3,6,8,7,1,0,9};
    Arrays.sort(a);
    int st=0;
    int end=a.length-1;
    int key=1;
    System.out.println("Position of "+key+" is : "+binarySearch(a,st,end,key));
  }
    public static int binarySearch(int a[], int st, int end, int key) 
    { 
        if (end >= st) { 
            int mid = st+(end-st)/2; 
  
            if (a[mid]==key) 
                return mid; 
  
            if (a[mid]>key) 
                return binarySearch(a,st,mid-1,key); 
  
            return binarySearch(a,mid+1,end,key); 
        } 
        return -1; 
    }
}