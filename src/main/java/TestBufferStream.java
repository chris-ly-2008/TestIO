import java.io.*;

public class TestBufferStream {
    public static void main(String[] args) throws IOException {
        String usePath = System.getProperty("user.dir");
        String pomPath = usePath + File.separator + "pom.xml";
        FileInputStream in = new FileInputStream(pomPath);
        BufferedInputStream bin = new BufferedInputStream(in);
        BufferedReader bRead = new BufferedReader(new FileReader(pomPath));
        BufferedWriter bWrite = new BufferedWriter(new FileWriter("D://Temp//testBufferWriter.xml"));

        String strLine = null;
        while ((strLine = bRead.readLine()) != null) {
            System.out.println(strLine);
            bWrite.write(strLine);
            bWrite.newLine();
        }

        bWrite.flush();
        bWrite.close();
        bRead.close();
    }
}
