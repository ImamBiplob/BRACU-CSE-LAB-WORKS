public class Main {
    
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount("John", "NY", "111", 10000.00);
        BankAccount acc2 = new BankAccount("Jack", "LA", "321", 12000.00);
        BankAccount acc3 = new BankAccount("Johnny", "Chicago", "142", 30120.00);
        
        acc1.addInterest();
        acc3.addInterest();
        
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        
    }
}
