public class BankAccount {
  private String name,accountid,address;
  private double balance;
  public String getName(){
    return name;
  }
  public void setName(String n){
    name=n;
  }
  public String getAccountID(){
    return accountid;
  }
  public void setAccountID(String i){
    accountid=i;
  }
  public String getAddress(){
    return address;
  }
  public void setAddress(String a){
    address=a;
  }
  public double getBalance(){
    return balance;
  }
  public void setBalance(double b){
    balance=b;
  }
  public void addInterest(){
    balance=7*balance/100.0+balance;
    System.out.println("Balance(including interest) : "+balance);
  }
}