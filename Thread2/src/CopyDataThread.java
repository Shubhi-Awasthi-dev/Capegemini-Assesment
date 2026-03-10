
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyDataThread extends Thread {

    FileInputStream fin;
    FileOutputStream fout;

    CopyDataThread(FileInputStream fin, FileOutputStream fout) {
        this.fin = fin;
        this.fout = fout;
    }

    public void run() {
        try {
            int ch;
            int count = 0;

            while ((ch = fin.read()) != -1) {
                fout.write(ch);
                count++;

                if (count == 10) {
                    System.out.println("10 characters are copied");
                    count = 0;
                    Thread.sleep(5000);
                }
            }

            fin.close();
            fout.close();
            System.out.println("File copying completed");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}