package banking_system;
import outside.Customer;
import outside.Tester;

public class Account{
    private int account_number;
    private int balance;

    public Account(){

    }
    public Account(int acc_number){
        account_number= acc_number;
        balance = 0;
    }

    public int getAccount_number(){
        return account_number;
    }
    int setBalance (int num) throws Exception{
        if(balance + num > 0) {
            balance = balance+num;
            return balance;
        }else{
            throw new Exception("Balance can't be negative!");
        }
    }


    int getBalance(){
        return balance;
    }


}
