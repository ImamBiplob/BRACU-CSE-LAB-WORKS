import java.util.Arrays;
import java.io.*;
public class que1 {
  public static void main(String[] args) throws Exception{
    
    int [][] a;
    BufferedReader obj;
    String str="";
    //try{
    FileReader fr = new FileReader("input.txt");
    obj=new BufferedReader(fr);
    str = obj.readLine();
    int v = Integer.parseInt(str);
    a=new int[v+1][v+1];
    while((str=obj.readLine())!=null) {
      String []spl = str.split(" ");
      int token1=Integer.parseInt(spl[0]);
      int token2 = Integer.parseInt(spl[1]);
      a[token1][token2]=1;
    }
    System.out.println(v);
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++) {
        System.out.print(a[i][j]);
      }
      System.out.println();
      
    }
    //}
    //catch(Exception e){}
    
    
  }
}