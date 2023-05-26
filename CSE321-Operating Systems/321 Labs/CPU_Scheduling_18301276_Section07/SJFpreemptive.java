import java.util.Scanner;
public class SJFpreemptive {
  public static void main(String [] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please Enter The Number Of Processes");
    int p_num = sc.nextInt();
    
    int p_ID[] = new int[p_num];
    int arrivalTime[] = new int[p_num];
    int burstTime[] = new int[p_num];
    int burstTimeSolid[] = new int[p_num];
    int ct[] = new int[p_num];
    int tat[] = new int[p_num];
    int wt[] = new int[p_num];
    int flag[] = new int[p_num];
    int sysTime = 0, totalBT = 0;
    float avgWT = 0, avgTAT = 0;
    
    for(int i=0;i<p_num;i++) {
      System.out.println("Please enter p"+(i+1)+"'s arrival time");
      arrivalTime[i] = sc.nextInt();
      System.out.println("Please enter p"+(i+1)+"'s burst time");
      burstTime[i] = sc.nextInt();
      burstTimeSolid[i] = burstTime[i];
      p_ID[i] = i+1;
      flag[i] = 0;
      totalBT = totalBT+burstTime[i];
    }
    
    int min=999,c=0;
    while(sysTime<totalBT) {
      for(int i=0;i<p_num;i++) {
        if(arrivalTime[i]==sysTime){
          flag[i]=1;                //FLAG=1 means, process has arrived
          if(burstTime[i]<min){
            min=burstTime[i];
            c=i;
          }
        }
      }
      
      sysTime++;
      burstTime[c]--;
      min=burstTime[c];
      
      if(burstTime[c]==0){
        flag[c]=2;                //FLAG=2 means, process has been completed
        ct[c]=sysTime;
        tat[c]=ct[c]-arrivalTime[c];
        wt[c]=tat[c]-burstTimeSolid[c];
        min=999;
      }
       
      for(int j=0;j<p_num;j++) {
        if(burstTime[j]<min && flag[j]==1) {
          min=burstTime[j];
          c=j;
        }
      }
     
    }
    
    for( int i=0;i<p_num;i++) {
      avgWT=avgWT+wt[i];
      avgTAT=avgTAT+tat[i];
      System.out.println("\nProcess"+p_ID[i]+"--> Arrival Time="+arrivalTime[i]+" Burst Time="+burstTimeSolid[i]+" Completion Time="+ ct[i]+" Turnaround Time="+tat[i]+" Waiting Time="+wt[i]);
    }
    System.out.println("\nAverage waiting time : " + (avgWT/p_num));
    System.out.println("Average turnaround time : " + (avgTAT/p_num));
  }
}  
//IHB