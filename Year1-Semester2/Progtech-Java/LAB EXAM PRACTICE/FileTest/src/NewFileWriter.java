import java.io.*;

public class NewFileWriter {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("NewWriteFile.txt");
            PrintWriter a = new PrintWriter(file);
            a.write("Hello Test.\n");
            a.write("Kunanon Sopacharoen\n");
            file.close();

            FileReader file1 = new FileReader("NewWriteFile.txt");
            BufferedReader b = new BufferedReader(file1);
            String line;
            while ((line = b.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
