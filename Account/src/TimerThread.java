public class TimerThread {
    public static void main(String[] args) {
                TimerTask t = new TimerTask();
                Thread th = new Thread(t);
                th.start();
            }
}
