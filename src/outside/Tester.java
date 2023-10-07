package outside;

import banking_system.ATM;
import banking_system.Bank;
import banking_system.Account;

public class Tester {

    public static void main(String[] args) {
        Bank test = new Bank();
        ATM bir = new ATM(test);
        ATM eki = new ATM(test);
        test.attachATM(bir);
        test.attachATM(eki);

        Customer Edige = new Customer(test, bir);
        Customer Dias = new Customer(test, bir);
        Customer Ayan = new Customer(test, eki);


        Edige.openAccount(test);
        Dias.openAccount(test);
        Ayan.openAccount(test);

        try{
            System.out.println("Edige account number " + Edige.getAccount_number());
            System.out.println("Edige Balance " +  Edige.checkBalance());
            Edige.depositMoney(8000);
            System.out.println("Edige Balance " +  Edige.checkBalance());
            Edige.withdrawMoney(2000);
            System.out.println("Edige Balance " +  Edige.checkBalance());

            System.out.println("\nDias account number " + Dias.getAccount_number());
            System.out.println("Dias Balance " +  Dias.checkBalance());
            Dias.depositMoney(20000);
            System.out.println("Dias Balance " +  Dias.checkBalance());
            Dias.withdrawMoney(30000);
            System.out.println("Dias Balance " +  Dias.checkBalance());


            System.out.println("\nAyan account number " + Ayan.getAccount_number());
            Ayan.depositMoney(12000);
            System.out.println("Ayan Balance " +  Ayan.checkBalance());
            Ayan.withdrawMoney(11900);
            System.out.println("Ayan Balance " +  Ayan.checkBalance());

        }catch(Exception ex){

        }

    }

}
