package Threads;

/**
 *
 * raceCondition
 * synchronized on an instance method locks the object (this — the Counter
 * instance) before entering the method. Only one thread at a time can hold that
 * lock.
 *
 * Summary
Without synchronized	With synchronized
Threads	Can interleave mid-operation	Take turns, one at a time
Result	Random, incorrect count	Always 20
Safety	Race condition	Thread-safe
 *
 */

class Counter {
    int count;

    public synchronized void increment() {
        count++;

    }
}

class raceCondition {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();
        Runnable obj = () -> {
            for (int i = 0; i < 10; i++) {
                c.increment();
            }

        };
        Runnable obj1 = () -> {
            for (int i = 0; i < 10; i++) {
                c.increment();
            }

        };
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(c.count);
    };

}