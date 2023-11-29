package Banking;

public class BankAccount {
    public static void main(String[] args) {
    Account cust1 = new Account("Mary", 200);
        System.out.println(cust1);
        System.out.println(cust1.getAccnum());

        Account cust2 = new Account("Lisa", 500);
        System.out.println(cust2.getAccnum());

        Savings scust1 = new Savings("Bill", 66);
        System.out.println(scust1.getAccnum());
    }
}

class Account{
    private int accnum;
    private double balance;
    private String custName;

    private static int baseAcc = 100000;

    Account(String custName, double balance) {
        this.custName = custName;
        this.balance = balance;
        this.accnum = ++baseAcc;

    }

    public int getAccnum() {
        return accnum;
    }

}

class Savings extends Account{
    private static double interestrate;
    Savings(String custName, double balance){
        super(custName,balance);
        this.interestrate = 4.5;
    }

}
