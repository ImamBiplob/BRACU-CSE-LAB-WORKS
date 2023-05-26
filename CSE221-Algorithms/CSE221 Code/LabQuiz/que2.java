import java.util.Arrays;
public class que2 {
  public static void main(String[] args) {
    String ar[] = new String[9];
    ar[0]="0,1,5";
    ar[1]="1,3,11";
    ar[2]="1,2,-5";
    ar[3]="2,3,14";
    ar[4]="0,3,7";
    ar[5]="0,4,-2";
    ar[6]="0,5,-1";
    ar[7]="5,6,4";
    ar[8]="4,6,13";
    //System.out.println(ar[8]);
    //String spl[]=ar[0].split(",");
    for(int i=ar.length-1;i>=0;i--) {
      for(int j=0;j<i;j++) {
        String spl1[]=ar[j].split(",");
        String spl2[]=ar[j+1].split(",");
        int c1=Integer.parseInt(spl1[2]);
        int c2=Integer.parseInt(spl2[2]);
        if(c2<c1){
          String temp=ar[j];
          ar[j]=ar[j+1];
          ar[j+1]=temp;
        }
      }
    }
    System.out.println(Arrays.toString(ar));
  }
}