public class Starter {
    public static void main(String[] args){
        Runtime r=Runtime.getRuntime();
        Process p=null;
        
        try {
            String what= "c:\\windows\\notepad.exe";
            p = r.exec(what);
            
        }catch(Exception e) {
            System.out.println("error="+e.getMessage());
            e.printStackTrace();
        }
    }
}