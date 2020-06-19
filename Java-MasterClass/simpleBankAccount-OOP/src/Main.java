public class Main {
    public static void main(String[] args) {
        //BankAccount brianSmith = new BankAccount();
        BankAccount brianSmith = new BankAccount(879453125,150.0,"Brian James",
                "brianJ@globalfx.com", 283034034);

//        BankAccount brianSmith = new BankAccount();
        //brianSmith.setNumber(879453125);
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
        System.out.println("--- VIP ---");
        VipPerson customerVip1 = new VipPerson();
        System.out.println(customerVip1.getName());

        VipPerson customerVip2 = new VipPerson("James", 2500.00);
        System.out.println(customerVip2.getName());

        VipPerson customerVip3 = new VipPerson("Joe", 3400.00, "joe@email.com");
        System.out.println(customerVip3.getName());
    }
}
