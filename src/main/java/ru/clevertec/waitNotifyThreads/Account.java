package ru.clevertec.waitNotifyThreads;

public class Account {
    private double balance = 0;

    public synchronized void payPhone() {

        while (balance <= 5) {
            try {
                System.out.println("balance is " + balance);
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance = 0;
        System.out.println("Payment for the phone");
    }

    public synchronized void receiving(int sum) {
        balance = +sum;
        System.out.println("balance: " + balance);
        this.notifyAll();

    }
}
