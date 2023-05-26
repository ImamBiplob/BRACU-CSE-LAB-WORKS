class CheckingAccount extends Account {
    public CheckingAccount(String name, double balance) {
        super(name);
        setBalance(balance);
    }
    
    public String deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            return "Deposit Successful";
        }
        
        return "Please enter amount greater than Zero";
    }
    
    public String withdraw(double amount) {
        if (amount > getBalance()) {
            return "You do not have enough funds";
        } else if (amount <= 0) {
            return "Please enter amount greater than Zero";
        }
        
        setBalance(getBalance() - amount);
        return "Withdraw Successful";
    }
    
    public void printAccountInfo() {
        System.out.println("=======================================");
        System.out.println("Name : " + getName());
        System.out.println("Account Number : " + getAccountNumber());
        System.out.println("Balance : " + getBalance());
        if (getBalance() < 500) {
            System.out.println("Your balance is less than the minimum amount");
        }
        System.out.println("=======================================");
    }
}