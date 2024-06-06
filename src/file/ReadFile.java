package file;
import java.io.*;
import java.util.ArrayList;

public class ReadFile {

    public ArrayList<String> readFile() {
        String fileName = "temp.txt";
        ArrayList<String> notes = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            while (bufferedReader.ready()) {
                notes.add(bufferedReader.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return notes;
    }
}
