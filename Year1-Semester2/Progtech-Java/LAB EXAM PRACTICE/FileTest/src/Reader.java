import java.io.*;

public class Reader {
    public static void main(String[] args) {
        try {
            FileReader a = new FileReader("WriteFile.txt");
            BufferedReader read = new BufferedReader(a);
            String inputLine = read.readLine();
            String inputLine2 = read.readLine();
            System.out.println(inputLine);
            System.out.println(inputLine2);
            a.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}