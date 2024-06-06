package file;

import java.util.ArrayList;

public class FindDate {
    public void findDate(String date) {
        System.out.println("Записи от "+ date+":");
        ReadFile file = new ReadFile();
        ArrayList<String> notes = file.readFile();

        boolean valid = false;
        for (String note : notes) {
            String[] s = note.split(" ");
            if (s[0].equals(date)) {
                System.out.println(note);
                valid = true;
            }
        }
        if (!valid) System.out.println("Записи не найдены");
    }
}
