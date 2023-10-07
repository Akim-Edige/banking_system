package banking_system;
import outside.Customer;
import outside.Tester;
import java.util.ArrayList;
import java.util.Random;

public class Bank{

    Random random = new Random();

    ArrayList<Account> AkimBank;
    ArrayList<ATM> BankATMs;
    public Bank (){
        AkimBank = new ArrayList<Account>();
        BankATMs = new ArrayList<ATM>();
    }

    public int createAccount(){
        Account zhana = new Account(random.nextInt(10000));
        AkimBank.add(zhana);
        return zhana.getAccount_number();
    }


    public void attachATM(ATM atm){
        BankATMs.add(atm);
        atm.setBank(this);
    }

    public int accessAcctInfo(int acctNum) throws Exception{
        int val=0;
        while(AkimBank.size()>val){
            if(acctNum==AkimBank.get(val).getAccount_number()){
                return AkimBank.get(val).getBalance();
            }
            val++;
        }
        throw new Exception("Account was not found");
    }

    boolean updateAcctBal(int acctNum, int diff) throws Exception{
        int ind=0;
        int val=0;
        while(AkimBank.size()>val){
            if(acctNum==AkimBank.get(val).getAccount_number()){
                ind=1;
                break;
            }
            val++;
        }


        if(ind !=0){
            AkimBank.get(val).setBalance(diff);
            return true;
        }

        if(ind==0){
            throw new Exception("Account was not found");
        }
        return false;
    }

}
