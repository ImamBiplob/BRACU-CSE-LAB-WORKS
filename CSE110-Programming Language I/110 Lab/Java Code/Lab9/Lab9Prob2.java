public class Lab9Prob2{
  public static void main(String[] args){
    int i,sum=0;
    for(i=7;i<=600;i++){
      if(i%7==0&&i%9==0)
      sum=sum+i;
    }
    System.out.print(sum);
  }
}