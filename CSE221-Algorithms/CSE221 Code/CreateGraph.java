import java.io.*;
import java.util.*;
import java.util.LinkedList;
public class CreateGraph {
  
  public static void main(String[] args) {
    int [][] graph=null;
    BufferedReader obj= null;
    try {
      String str;
      FileReader fr = new FileReader("input.txt");
      obj = new BufferedReader(fr);
      str = obj.readLine();
      // convert this to int
      int v = Integer.parseInt(str);
      System.out.println(v);
      
      // creat the matrix 
     graph=new int[v][v];
     
      while ((str = obj.readLine()) != null) {
        // tokenize = a,b
        StringTokenizer st = new StringTokenizer(str," ");
        int token1 = Integer.parseInt(st.nextToken());
        
        int token2 = Integer.parseInt(st.nextToken());
        graph[token1][token2]=1;
        //connect graph [a][b] = 1 graph[b][a] = 1
       
      }
      
      
      LinkedList [] al = new LinkedList[v];
      for (int i= 0;i<al.length;i++){
        al[i] = new LinkedList<String>();
        FileReader fr2 = new FileReader("input.txt");
        obj = new BufferedReader(fr2);
        str = obj.readLine();
        while((str=obj.readLine()) != null) {
          StringTokenizer st= new StringTokenizer(str," ");
          int token1 = Integer.parseInt(st.nextToken());
          if(token1 == i){
            String token2 = st.nextToken();
            al[i].add(token2);
          }
        }
       
      }
      //System.out.println(al);
      for(int i=0;i<al.length;i++){
      for(int j=0;j<al[i].size();j++){
       System.out.print(al[i].get(j)+" ");
      }
      System.out.println();
} 
      
    } catch (IOException e) {
      
      e.printStackTrace();
      
    }
     for (int i= 0;i<graph.length;i++){
       
       for(int j = 0;j < graph[0].length;j++){
        
         System.out.print(graph[i][j]);
    }
       System.out.println();
  }
     
  }
  
 
}