public class running{
    public static void main(String [] args){
        
        CricketBangladesh tamim=new CricketBangladesh();
        CricketBangladesh sakib=new CricketBangladesh();
        
        //When we are trying to print any object reference internally toString method will be called; 
        
        tamim.makeRun();
        
        System.out.println(tamim);
        System.out.println(sakib);
        
    }
}