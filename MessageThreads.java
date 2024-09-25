class DisplayMessage extends Thread {
    private String message;
    private int interval;

    public DisplayMessage(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(message);
            try {
                Thread.sleep(interval * 1000); // Convert seconds to milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MessageThreads {
    public static void main(String[] args) {
        // Create and start three threads with different messages and intervals
        DisplayMessage thread1 = new DisplayMessage("Good Morning", 1);
        DisplayMessage thread2 = new DisplayMessage("Hello", 2);
        DisplayMessage thread3 = new DisplayMessage("Welcome", 3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

