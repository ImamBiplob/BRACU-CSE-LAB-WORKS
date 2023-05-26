 public class Design {
     public int v1 = 7;
     public int v2 = 5;
     public void proc() {
       v1 = v1 + 10;
       System.out.println(v1+" "+v2);
     }
   
     public int callBack() {

      int v2 = 8;
       v1 = v1 + v2;
       v2 = v1 - v2;
       System.out.println(v1+" "+v2);
       return v1 + v2;
     }
   }
