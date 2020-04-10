public class Main {
    public static void main(String[] args) {
        BankAccount brianSmith = new BankAccount();
        brianSmith.setNumber(879453125);
        System.out.println("Bank account # is: " + brianSmith.getAccountNumber());
        System.out.println("Balance = " + brianSmith.getBalance());
        brianSmith.setCustomerName("Brian Smith");
        System.out.println("Customer's name: " + brianSmith.getCustomerName());
        brianSmith.setEmailAddress("brians@bmg.com");
        System.out.println("Email address: " + brianSmith.getEmailAddress());
        brianSmith.setPhoneNumber(277356146);
        System.out.println("Phone #: " + brianSmith.getPhoneNumber());
        brianSmith.deposit(3000);
        System.out.println("Balance = " + brianSmith.getBalance());
        brianSmith.getMoney(1200);
        System.out.println("Balance = " + brianSmith.getBalance());
        brianSmith.getMoney(4000);
        System.out.println("Balance = " + brianSmith.getBalance());
    }
}