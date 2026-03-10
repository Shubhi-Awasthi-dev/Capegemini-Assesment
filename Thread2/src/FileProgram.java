import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileProgram {
    public static void main(String[] args) {

        try {
            FileInputStream fin = new FileInputStream("source.txt");
            FileOutputStream fout = new FileOutputStream("target.txt");

            CopyDataThread t = new CopyDataThread(fin, fout);
            t.start();

        } catch (Exception e) {
            System.out.println("File error");
        }
    }
}

