package lesson140527;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SortWithComparatorOnly {

    static class Transaction{
        int amount;

        public Transaction(int money) {

            amount = money;
        }
    }

    public static void main(String[] args) {
        List<Transaction> list = new LinkedList<>();

        list.add(new Transaction(1000));
        list.add(new Transaction(900));
        list.add(new Transaction(1200));
        list.add(new Transaction(500));

        Collections.sort(list, new Comparator<Transaction>() {
            @Override
            public int compare(Transaction o1, Transaction o2) {
                return o1.amount - o2.amount;
            }
        });

        for (Transaction transaction:
             list) {
            System.out.println(transaction.amount);
        }
    }
}
