public class ArrayMaxMin{
  public static void main (String args[]){
    int Table[][] = {
    {20,15,12,45,4,7,17,41},
    {4,13,49,42,46,17,45,13},
    {44,20,16,2,17,46,6,24},
    {34,5,14,5,25,36,3,49},
    {20,30,26,32,50,31,13,30}
    };
 
    int i,j;
        
    int RowMax[] = new int[5];
    int ColMin[] = new int[8];
    int AllMinR=0, AllMinC=0, AllMinVal = Table[0][0];
    for (i=0;i<5; i++){
      RowMax[i] = Table[i][0];
    }
    for (j=0;j<8; j++){
      ColMin[j] = Table[0][j];
    }
    
    for (i=0;i<5; i++){
      for (j=0;j<8; j++){
        if (Table[i][j] > RowMax[i]){
          RowMax[i] = Table[i][j];
        }
        if (Table[i][j] < ColMin[j]){
          ColMin[j] = Table[i][j] ;
        }
        if (Table[i][j] < AllMinVal ){
          AllMinVal = Table[i][j];
          AllMinR = i;
          AllMinC = j;
        }
        
      }
    }
   System.out.print("RowMaxes:");
     for (i=0;i<5; i++){
      System.out.print(RowMax[i] + " ");
    }
     
    System.out.println("\nColMins:");
    for (j=0;j<8; j++){
      System.out.print(ColMin[j] + " ");
    }
    System.out.println("\nMinRow: " +AllMinR + "   MinCol: " + AllMinC);
    
    
  }
}