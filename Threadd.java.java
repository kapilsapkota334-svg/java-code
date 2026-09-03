class First extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("First Thread: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Second extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Second Thread: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threadmethod {
    public static void main(String[] args) {

        First t1 = new First();
        Second t2 = new Second();

        t1.start();
        t2.start();
    }
}