public class BankAccount {
    private int accountNumber;
    private double balance = 0;
    private String customerName;
    private String emailAddress;
    private long phoneNumber;

    public void setNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void deposit(double amount){
        System.out.println("Deposit of " + amount + " made.");
        this.balance += amount;
    }

    public void getMoney(double amount){
        if ((this.balance - amount) < 0 ){
            System.out.println("Insufficient balance!");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal amount: " + amount);;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress(){
        return this.emailAddress;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber(){
        return this.phoneNumber;
    }
}
