package Threads;

/**
 * Threads
 * A Thread is the smallest unit of execution in a program.
 * 
 * A Java program starts with one thread called the main thread.
 */

public class Threads {
    public static void main(String[] args) {
        Runnable a = () -> {
            {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };
        Runnable b = () -> {
            {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t2.start();
        t1.start();

    }

}