

class Main{
    public static void main(String[] args) {
        Account account=new Account("12345633","chandra",20000);
        account.deposite(40000);
        account.deposite(50000);
        account.withdraw(10000);
        account.deposite(90000);
        account.withdraw(50000);
        account.showBalance();
        account.transactionHistory();
       }
}