/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.io.BufferedReader;
import java.io.*;
import java.util.Stack;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author 18301276
 */
public class DFS {
    int g[][];
    int parent[];
    int color[];
    int distance[];
    int static time;
    Stack d; 
    Stack p; 
    public DFS(int arr[][]) {
        g = arr;
        parent = new int[g.length];
        color = new int[g.length];
        distance = new int[g.length];
        time=0;
        d = new Stack<Integer>();
        p = new Stack<Integer>();
        for(int i=0;i<g.length;i++) {
            parent[i] = -1;
            color [i] = -1;
        }
        
        
    }

    /**
     * @param args the command line arguments
     */
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
    DFS a = new DFS(graph);
    for(int i=0;i<a.g.length;i++) {
            if(a.color[i]==-1) {
                a.DFS-visit(i);
            }
        }
    }
    
    public static void DFS-visit(int u) {
        color[u] = 0;
        time++;
        distance[u]=time;
        d.push(u);
        p.push(u);
        for(int i=0;i<g.length;i++) {
            if(g[u][i]==1) {
                if(color[i]==-1) {
                    parent[i]=u;
                    DFS-visit(i);
                }
            }
        }
        color[u]=1;
        time++;
        System.out.println(" finished time of "+p.pop();" is "+time);
        return;
        
    }
    
}
