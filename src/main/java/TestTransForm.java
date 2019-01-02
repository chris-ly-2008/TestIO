import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class TestTransForm {
    public static void main(String[] args) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D://Temp//1.txt"));
            osw.write("ahhah");
            System.out.println(osw.getEncoding());
            osw.flush();
            osw.close();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
