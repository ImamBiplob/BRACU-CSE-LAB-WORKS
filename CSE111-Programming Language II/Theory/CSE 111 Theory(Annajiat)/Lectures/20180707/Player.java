public class Player{
    private String name = "Default";
    private int number = 0;  
    private String team = "Default"; 
    //your code here 
    void setName(String name) {
        this.name = name;
    }
    void setTeam(String team) {
        this.team = team;
    }
    void setNumber(int number) {
        this.number = number;
    }
    Player(){
    }
    Player(String name){
        setName(name);
    }
    Player(String name, int number){
        this(name);
        setNumber(number);
    }
    Player(String name, int number, String team){
        setTeam(team);
        this(name, number);
    }
    void detail() {
                            //Neymar*is*no.10*for*Brazil
        System.out.println(name+"*is*no."+number+"*for*"+team);
    }
    
    
    
    
}
