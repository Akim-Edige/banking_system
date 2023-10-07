package banking_system;
import outside.Customer;
import outside.Tester;

import java.util.ArrayList;

public class ATM{

    private Bank linked;
    private int acc_tracker=0;
    public String getInfo(){
        return toString();
    }

    public boolean loginToAccount(int acctNum){
        int val=0;
        while(linked.AkimBank.size() > val){
            if(acctNum==linked.AkimBank.get(val).getAccount_number()) {
                acc_tracker=acctNum;
                return true;
            }
            val++;
        }
        return false;
    }

    public boolean deposit(int amount) throws Exception {
        try {
            linked.updateAcctBal(acc_tracker, amount);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public boolean withdraw(int amount) throws Exception {
        amount=-amount;
        try {
            linked.updateAcctBal(acc_tracker, amount);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public int getBalance() throws Exception{
        if(acc_tracker !=0){
            try {
                return linked.accessAcctInfo(acc_tracker);
            } catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        return 0;
    }

    public void setBank(Bank b){
        linked = b;
    }
    public void logout(){
        acc_tracker=0;
    }

    public ATM (Bank b){
        linked=b;
        acc_tracker=0;
    }

}
