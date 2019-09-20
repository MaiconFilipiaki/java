package Program;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAcount;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

//        Account account = new Account(1000, "Alex", 0.0);
//
//        BusinessAcount bacc = new BusinessAcount(1002, "maicon", 0.0, 500.0);
//
//        // UPCASTING
//
//         Account acc1 = bacc;
//         Account acc2 = new BusinessAcount(1002, "maicon", 0.0, 500.0);
//        Account acc3 = new SavingsAcount(1002, "douglas", 0.0, 0.01);
//
//        // DOWNCASTING;
//
//        BusinessAcount acc4 = (BusinessAcount)acc2;
//
//        // BusinessAcount acc5 = (BusinessAcount)acc3;
//
//        if (acc3 instanceof BusinessAcount) {
//            BusinessAcount acc5 = (BusinessAcount)acc3;
//            acc5.loan(200.0);
//            System.out.println("Loan!");
//        }
//
//        if (acc3 instanceof SavingsAcount) {
//            SavingsAcount acc5 = (SavingsAcount)acc3;
//            acc5.updateBalance();
//            System.out.println("Update!");
//        }

        //Override
//        Account acc1 = new Account(100, "Maicon", 100.00);
//        acc1.withdraw(10);
//
//        System.out.println("ACC1 => " + acc1.getBalance());
//
//        SavingsAcount acc2 = new SavingsAcount(100, "Maicon", 100.00, 0.01);
//        acc2.withdraw(10);
//        System.out.println("ACC2 => " + acc2.getBalance());
//
//        BusinessAcount acc3 = new BusinessAcount(100, "Maicon", 100.00, 500.00);
//        acc3.withdraw(10);
//
//        System.out.println("ACC3 => " + acc3.getBalance());



        //ABSTRACT

//        Account acc1 = new Account(100, "Maicon", 100.00);
//        Account acc2 = new SavingsAcount(100, "Maicon", 100.00, 0.01);
//        Account acc3 = new BusinessAcount(100, "Maicon", 100.00, 500.00);

        List<Account> list = new ArrayList<>();
        list.add(new SavingsAcount(100, "Maicon", 100.0, 0.01));
        list.add(new BusinessAcount(100, "Maicon", 100.0, 500.00));

        double sum = 0.0;
        for (Account acc:list) {
            sum += acc.getBalance();
        }

        System.out.println(sum);

        for (Account acc:list) {
            acc.deposit(10.0);
        }

        double sum1 = 0.0;
        for (Account acc:list) {
            sum1 += acc.getBalance();
        }
        System.out.println(sum1);
    }

}
