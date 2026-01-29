import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NewFileReader {
    public static void main(String[] args) {
        try {
            // เรียกใช้ FileReader เพื่อเปิดไฟล์
            FileReader fileReader = new FileReader("Hello.txt");

            // เรียกใช้ BufferedReader เพื่ออ่านข้อมูลจาก FileReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String a;

            // อ่านข้อมูลทีละบรรทัดและแสดงผลลัพธ์
            while ((a = bufferedReader.readLine()) != null) {
                System.out.println(a);
            }

            // ปิด BufferedReader
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}