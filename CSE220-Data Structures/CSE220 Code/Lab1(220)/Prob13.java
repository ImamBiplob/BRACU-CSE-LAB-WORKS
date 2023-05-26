public class Prob13 {
    public static int [] removeOdd (int [] input){
      int c=0;
      int i=0,k=-1;
      while(i<input.length){
        if(input[i]%2==0){
          c++;
        }
        i++;
      } 
      int a[]=new int[c];
      for(int j=0;j<input.length;j++) {
        if(input[j]%2==0) {
          k++;
          a[k]=input[j];
        }
      }
      return a;
   }
      
  public static void main(String [] args){
    int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
    for (int i = 0; i < mixedArray.length; i++) {
      System.out.print(mixedArray[i] + " ");
    }
    System.out.println();
    int [] noOdd = removeOdd(mixedArray);
    for (int i = 0; i < noOdd.length; i++) {
      System.out.print(noOdd[i] + " ");
    }    
  }
}
 
