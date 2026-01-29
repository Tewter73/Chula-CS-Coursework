import java.io.*;

public class WriterTest {
    public static void main(String[] args) {
        try {
            FileWriter a = new FileWriter("WriteFile.txt");
            PrintWriter b = new PrintWriter(a);
            b.print("Hello 1\n");
            b.print("Hello 2");
            a.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR : File Not Found.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

