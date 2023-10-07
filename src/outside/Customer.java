package outside;


import banking_system.ATM;
import banking_system.Bank;
import banking_system.Account;

public class Customer{

    private ATM avtomat;
    private Bank bank_n;
    int tracker=0;

    public int openAccount(Bank b) {
        tracker = b.createAccount();
        return tracker;
    }

    void depositMoney(int amount) throws Exception{
        avtomat.loginToAccount(tracker);
        avtomat.deposit(amount);
        avtomat.logout();
    }

    void withdrawMoney(int amount) throws Exception{
        avtomat.loginToAccount(tracker);
        avtomat.withdraw(amount);
        avtomat.logout();
    }


    int getAccount_number() {
        return tracker;
    }

    public int checkBalance() throws Exception{
        int bal = 0;
        avtomat.loginToAccount(tracker);
        bal = avtomat.getBalance();
        avtomat.logout();
        return bal;
    }

    public Customer(Bank b, ATM a){
        bank_n=b;
        avtomat=a;
    }
}
