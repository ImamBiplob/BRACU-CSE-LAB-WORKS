/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

/**
 *
 * @author 18301276
 */
import java.io.*;
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class BFS{
  
  // an array of ArrayList
  // You can also use a arraylist of arraylist
  int [][] g;
  // level array is to store the level of each vertex
  int [] level;
  // parent array is to store the parent of each vertex
  int [] parent;
  // we will be using the java's built in queue
  Queue<Integer> q;
   public static void main(String[] args) {
        // TODO code application log
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
      
        // create the matrix
        graph = new int[v][v];
      
      LinkedList [] al = new LinkedList[v];   //LinkedList Array
      
      for (int i= 0;i<al.length;i++){
        al[i] = new LinkedList<String>();     //Declaring LinkedList For Each Vertex
      }
      
      while ((str = obj.readLine()) != null) {
        // tokenize = a,b
        StringTokenizer st = new StringTokenizer(str," ");
        int token1 = Integer.parseInt(st.nextToken());
        
        String token2 = st.nextToken();
        
        graph[token1][Integer.parseInt(token2)]=1;
       
      }
      
      
      
      
    } catch (IOException e) {
      
      e.printStackTrace();
      
    }
    System.out.println("Adjacency Matrix of this graph is: ");
    for (int i= 0;i<graph.length;i++){
      
      for(int j = 0;j < graph.length;j++){
        
        System.out.print(graph[i][j]);
      }
      System.out.println();
    }
    BFS b = new BFS(graph);
    b.runBfs(0);
   }
    
  // constructor
  //@ parameter pass the array of arraylist of the graph
  public BFS(int [] []arr){
    // save the arraylist globally 
    // TO DO
    g = arr;
    // create the level and parent array 
    // TO DO
    level = new int[g.length];
    
    parent = new int[g.length];
    // Queue object created 
    // Queue will use linked list as underlying data structure
    q = new LinkedList<Integer>();
    
    // initializing the level and parent arrays with -1
    // This is done to keep track which vertices are unvisited
    // you might have different techniques
    for(int i = 0;i<g.length;i++){
      level[i] = -1;
      parent[i] = -1;
    }
  }
  
  // This method runs BFS
  // @parameter the source
  public void runBfs(int source){
    // set the level of source to 0 and add it to Queue
    // TO DO
   level[source] = 0;
   parent[source] = -1;
   q.add(source);
   int [] a=new int[g.length];
    // run the loop while queue not empty
    while(!(q.isEmpty())){
      // dequeue vertex
      // TO DO
      int u = q.remove();
      System.out.println(u+" is visited");
      // for each adjacent vertex of u
      for(int i = 0;i<g.length;i++){
        // check if visited
        
        if(g[u][i]==1){
          // The visit status of each vertex is checked using the the values of level
          // -1 indicated unvisted 
          if(level[i]==-1){
            // increment level
            // TO DO 
            level[i] = level[u]+1;
            // add parent
            // TO DO
            parent[i] = u;
          
            // enque in the queue
            // TO DO
            if(a[i]==0){
              q.add(i);
              a[i]=1;
            }
               
          }
        }
      }
    }
    System.out.println("Level of vertex 4 is "+level[4]);
    System.out.println("Parent of vertex 3 is "+parent[3]);
    
    // The following is done for you
    // this prints the path of every vertex from the source
    /*for(int i = 0;i<g.length;i++){
 
      String ans = "";
      if (parent[i]==-1){
         System.out.println(i+" is the Source.");
      }else{
        ans = ""+i;
        int j = i;
        //int x = ();
        while(parent[j]!=-1){
          
          j = parent[j];
          //System.out.println(j);
          ans = j +">"+ ans;
        }
        System.out.println(ans);
      }
    }*/
    
  }
}
