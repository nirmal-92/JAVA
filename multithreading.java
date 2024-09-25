public class multithreading implements Runnable {
    public void run(){
        for(int counter = 1; counter <= 100; counter++){
            System.out.println("thread is running..."+counter);
        }  
    }

    public static void main(String[] args) {
        multithreading threadDemo = new multithreading();
        Thread t1 = new Thread(threadDemo);
        t1.start();
    }
}
