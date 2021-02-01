package ru.clevertec.exchangerThreads;

import java.time.LocalDateTime;
import java.util.concurrent.Exchanger;

public class AccountService {
    private static Exchanger<Account> accountExchanger = new Exchanger<>();

    public void updateSum(Account account, double sum) {
        try {
            account.setSum(account.getSum() + sum);
            account = accountExchanger.exchange(account);
            account.setSum(account.getSum() + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void updateDateTime(Account account, LocalDateTime newDateTime) {

        try {
            account.setUpdatedDateTime(newDateTime);
            account = accountExchanger.exchange(account);
            account.setUpdatedDateTime(newDateTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
