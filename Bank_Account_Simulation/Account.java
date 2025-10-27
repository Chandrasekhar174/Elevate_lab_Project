
import java.util.ArrayList;

class Account{
    private  String acc_number;
    private String name;
    private double balance;
    private ArrayList<Transaction>transactions=new ArrayList<>();

    public Account(String acc_number,String name,double  balance){
        this.acc_number=acc_number;
        this.name=name;
        this.balance=balance;

    }

    public void deposite(Integer amount){
        this.balance=this.balance+amount;
        transactions.add(new Transaction("Deposite",this.balance));
        System.out.println("Balance created successfully");
    }
    public void withdraw(Integer amount){
        if(this.balance<amount){
            System.out.println("Insufficient Balance");
        }
        else{
            this.balance-=amount;
            transactions.add(new Transaction("witdraw",this.balance));
            System.out.println("Balance withdraw successfully");

        }
    }
    public void showBalance(){
        System.out.println("Your balance "+this.balance);
    }
    public void transactionHistory(){
        System.out.println("Type\t\tBalance\t\tDate");
        transactions.forEach(transaction->{
            System.out.println(transaction.toString());
        });
    }
}