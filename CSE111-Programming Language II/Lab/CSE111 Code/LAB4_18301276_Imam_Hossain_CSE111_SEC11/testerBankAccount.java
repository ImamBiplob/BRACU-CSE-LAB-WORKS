public class testerBankAccount {
  public static void main(String[] args){
    BankAccount acc1=new BankAccount();
    acc1.setName("Rahman");
    System.out.println(acc1.getName());
    acc1.setAccountID("0001");
    System.out.println(acc1.getAccountID());
    acc1.setAddress("Gulshan");
    System.out.println(acc1.getAddress());
    acc1.setBalance(1000);
    System.out.println(acc1.getBalance());
    acc1.addInterest();
    BankAccount acc2=new BankAccount();
    acc2.setName("Daniels");
    System.out.println(acc2.getName());
    acc2.setAccountID("0002");
    System.out.println(acc2.getAccountID());
    acc2.setAddress("Niketon");
    System.out.println(acc2.getAddress());
    acc2.setBalance(990);
    System.out.println(acc2.getBalance());
    acc2.addInterest();
    BankAccount acc3=new BankAccount();
    acc3.setName("Turner");
    System.out.println(acc3.getName());
    acc3.setAccountID("0003");
    System.out.println(acc3.getAccountID());
    acc3.setAddress("Banani");
    System.out.println(acc3.getAddress());
    acc3.setBalance(1000);
    System.out.println(acc3.getBalance());
    acc3.addInterest();
  }
}