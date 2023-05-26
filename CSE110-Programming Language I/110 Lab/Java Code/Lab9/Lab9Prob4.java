public class Lab9Prob4{
  public static void main(String[] args){
    int i,sum=0;
    for(i=7;i<=600;i++){
      if(i%7==0){
        if(i%9!=0)
          sum+=i;}
      else if(i%9==0){
        if(i%7!=0)
          sum+=i;}
    }
    System.out.print(sum);
  }
}