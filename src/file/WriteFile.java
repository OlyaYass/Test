package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;

public class WriteFile {
    public void writeFile(String info) {
        String fileName = "temp.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true))) {
            LocalDate date = LocalDate.now();
            bufferedWriter.write(date + " " + info + "\n");
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
