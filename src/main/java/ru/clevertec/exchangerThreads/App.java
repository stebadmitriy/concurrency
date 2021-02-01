package ru.clevertec.exchangerThreads;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        Account firstAccount = new Account(10.3, LocalDateTime.now(), "First Account");
        Account secondAccount = new Account(20.8, LocalDateTime.now(), "SecondAccount");
        AccountService accountService = new AccountService();

        System.out.println("firstAccount is " + firstAccount);
        System.out.println("secondAccount is " + secondAccount);

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() -> accountService.updateSum(firstAccount, 5)).start();
        new Thread(() -> accountService.updateDateTime(secondAccount, LocalDateTime.now())).start();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("updated firstAccount is " + firstAccount);
        System.out.println("updated secondAccount is " + secondAccount);

    }
}
