public class Prob13 {
    public static int [] removeOdd (int [] input){
      int c=0;
      for(int i=0;i<input.length-1;i++){
        if(input[i]%2!=0){
          for(int k=i;k<input.length-1;k++){
            input[k]=input[k+1];
          }
          c++;
        }
      }
        
        int a[]=new int[input.length-c];
        for(int i=0;i<a.length;i++) {
          a[i]=input[i];
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
 
