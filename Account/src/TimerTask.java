import java.util.Date;
public class TimerTask implements  Runnable {
    public void run() {
        while (true) {
            Date d = new Date();
            System.out.println(d);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}