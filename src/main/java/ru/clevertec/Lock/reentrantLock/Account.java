package ru.clevertec.Lock.reentrantLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private double balance = 0;
    private Lock lock = new ReentrantLock(true);
    private Condition condition = lock.newCondition();

    public void payPhone() {

        try {
            lock.lock();
            while (balance <= 5) {
                try {
                    System.out.println("balance is " + balance);
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Payment for the phone");
        } finally {
            lock.unlock();
        }
    }

    public void receive(int sum) {
        try {
            lock.lock();
            balance = +sum;
            System.out.println("balance: " + balance);

        } finally {
            condition.signalAll();
            lock.unlock();
        }
    }

}
