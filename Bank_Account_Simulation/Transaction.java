
import java.util.Date;

class Transaction{
    private String type;
    private  double balance;
    private Date date;

    public Transaction(String type,double bal){
        this.type=type;
        this.balance=bal;
        this.date=new Date();
    }
    public String toString(){
        return this.type+"\t"+this.balance+"\t"+this.date;
    }
}