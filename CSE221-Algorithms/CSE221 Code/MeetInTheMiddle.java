import java.util.*; 
import java.lang.*; 
import java.io.*; 
import java.util.Scanner;

class MeetInTheMiddle { 
 // A utility function to find the vertex with minimum distance value, 
 // from the set of vertices not yet included in shortest path tree 
 int V;
 public MeetInTheMiddle(int v) {
   V=v;
 }
 
 int minDistance(int dist[], Boolean sptSet[]) 
 { 
  // Initialize min value 
  int min = Integer.MAX_VALUE, min_index = -1; 

  for (int v = 0; v < V; v++) 
   if (sptSet[v] == false && dist[v] <= min) { 
    min = dist[v]; 
    min_index = v; 
   } 

  return min_index; 
 } 

 // A utility function to print the constructed distance array 
 /*void printSolution(int dist[]) 
 { 
   
  for (int i = 1; i < V; i++) 
   System.out.println(dist[i]); 
 } */

 // Function that implements Dijkstra's single source shortest path 
 // algorithm for a graph represented using adjacency matrix 
 // representation 
 int[] dijkstra(int graph[][], int src) 
 { 
  int dist[] = new int[V]; // The output array. dist[i] will hold 
  // the shortest distance from src to i 

  // sptSet[i] will true if vertex i is included in shortest 
  // path tree or shortest distance from src to i is finalized 
  Boolean sptSet[] = new Boolean[V]; 

  // Initialize all distances as INFINITE and stpSet[] as false 
  for (int i = 0; i < V; i++) { 
   dist[i] = Integer.MAX_VALUE; 
   sptSet[i] = false; 
  } 

  // Distance of source vertex from itself is always 0 
  dist[src] = 0; 

  // Find shortest path for all vertices 
  for (int count = 0; count < V ; count++) { 
   // Pick the minimum distance vertex from the set of vertices 
   // not yet processed. u is always equal to src in first 
   // iteration. 
   int u = minDistance(dist, sptSet); 

   // Mark the picked vertex as processed 
   sptSet[u] = true; 

   // Update dist value of the adjacent vertices of the 
   // picked vertex. 
   for (int v = 0; v < V; v++) 

    // Update dist[v] only if is not in sptSet, there is an 
    // edge from u to v, and total weight of path from src to 
    // v through u is smaller than current value of dist[v] 
    if (!sptSet[v] && graph[u][v] != -1 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) 
     dist[v] = dist[u] + graph[u][v]; 
  } 

 
     return dist; 
 } 

 // Driver method 
 public static void main(String[] args) 
 { 
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int m = sc.nextInt();
   int graph[][] = new int[n][n];
   for(int i=0;i<n;i++){
     for(int j=0;j<n;j++){
       graph[i][j]=-1;
     }
   }
   for(int i=0;i<m;i++) {
     int v1 = sc.nextInt();
     int v2 = sc.nextInt();
     int d = sc.nextInt();
     graph[v1][v2] = d;
   }
  
 
  MeetInTheMiddle t1 = new MeetInTheMiddle(n); 
  int d1[] = t1.dijkstra(graph, 0);
  
  //MeetInTheMiddle t2 = new MeetInTheMiddle(n); 
  int d2[] = t1.dijkstra(graph, n-1);
  
  int minD = 1000000000;//d1[n-1];
  int minC = 0;//n-1;
  
 /* if(d2[0]<minD){
    minD=d2[0];
    minC=0;
  }
  else if(d2[0]==minD){
    minC=0;
  }*/
    
  for(int i=0;i<n;i++) {
    int sum=d1[i]+d2[i];
    if(sum<minD){
      minD=sum;
      minC=i;
    }
    /*else if(d1[i]+d2[i]==minD){
      if(i<minC){
        minC=i;
      }
    }*/
  }
  System.out.println(minC);
 } 
} 