package OOPG.Week8;
public class CheckingAccount {
    private double balance;
    private String acc_number;

    CheckingAccount(){}
    CheckingAccount(double balance, String acc_number){
        this.balance = balance;
        this.acc_number = acc_number;
    }

    public void deposit(double amount) throws IllegalArgumentException{
        if(amount <= 0){
            throw new IllegalArgumentException("Deposit amount has to be a value greater than 0");
        }

        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException(amount);
        }
        else if( amount < balance){
            balance -= amount;
        }
    }

    public double getBalance(){
        return this.balance;
    }
    
    public String getNumber(){
        return this.acc_number;
    }
}