import java.io.*;
import java.util.*;
public class BankersAlgo {
  public static void main(String[] args) throws Exception {
    BufferedReader b=new BufferedReader(new FileReader("input.txt"));
    int row=Integer.parseInt(b.readLine());
    int column=Integer.parseInt(b.readLine());
    String []process = new String[row];
    int [][]max=new int[row][column];
    int [][]allocation=new int[row][column];
    int [][]need=new int[row][column];
    int [][]available=new int[row+1][column];
    LinkedList<Integer> track=new LinkedList<Integer>();
    
    for(int i=0;i<row;i++) {
      process[i]="P"+(i+1);
    }
    for(int i=0;i<row;i++) {
      String s=b.readLine();
      StringTokenizer st = new StringTokenizer(s," ");
      for(int j=0;j<column;j++) {
        max[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    for(int i=0;i<row;i++) {
      String s=b.readLine();
      StringTokenizer st = new StringTokenizer(s," ");
      for(int j=0;j<column;j++) {
        allocation[i][j] = Integer.parseInt(st.nextToken());
        need[i][j] = max[i][j]-allocation[i][j];
      }
    }
    System.out.println("Need Matrix");
    for(int i=0;i<row;i++) {
      System.out.println();
      for(int j=0;j<column;j++) {
        System.out.print(need[i][j]+" ");
      }
    }
    System.out.println();
    String s=b.readLine();
    StringTokenizer st=new StringTokenizer(s," ");
    
    int c=0;
    while(st.hasMoreTokens()) {
      available[0][c] = Integer.parseInt(st.nextToken());
      c++;
    }
    c=0;
    for(int i=0;;i++) {
      i=i%row;
      boolean flag = true;
      for(int j=0;j<column;j++) {
        if(need[i][j]<=available[c][j]) {
          
        }
        else{
          flag=false;
          break;
        }
        if(flag && j==(column-1) && !track.contains(i)){
          for(int k=0;k<column;k++) {
            available[c+1][k] = available[c][k] + allocation[i][k];
          }
          track.addLast(i);
          c++;
        }
      }
      if(track.size()==row) {
        break;
      }
    }
    System.out.println();
    System.out.println("Safe sequence is:");
    for(int i=0;i<track.size();i++) {
      System.out.print(process[track.get(i)]+" ");
    }
    
    System.out.println();
    System.out.println("\nchange in available resource matrix: ");
    for(int i=1;i<available.length;i++) {
      System.out.println();
      for(int j=0;j<column;j++) {
        System.out.print(available[i][j]+" ");
      }
    }
    System.out.println();
  }
}