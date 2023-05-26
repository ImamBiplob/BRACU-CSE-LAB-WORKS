public class Account{
  String name;
  double balance;
  static double interestRate=5.0;
  Account(){
    this.name="Default Account";
    this.balance=0.0;
  }
  Account(String name,double balance) {
    this.name=name;
    this.balance=balance;
  }
  public void nameBoshao(String name){
    this.name=name;
  }
  public void balanceBoshao(double balance) {
    this.balance=balance;
  }
  public String nameKi(){
    return name;
  }
  public double balanceKi() {
    return balance;
  }
  public void withdraw(double w) {
   
    if(balance-w>100.0){
       balance=balance-w;
      System.out.println("Withdraw Successful! new balance is : "+ balance);
    }
    else
      System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
  }
}