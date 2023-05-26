public class Lab9Prob11{
  public static void main(String[] args){
    for(int i=40;i<=50;i++)
    {
      int k=0;
      for(int j=1;j<=i;j++){
        if(i%j==0)
        k++;
      }
      if(k==2)
        System.out.println(i);
    }
  }
}
    