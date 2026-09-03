public class thread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        thread t1 = new thread();

        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}