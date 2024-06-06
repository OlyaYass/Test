package file;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Statistics {
    public void printStatistics() {
        ReadFile file = new ReadFile();
        ArrayList<String> notes = file.readFile();
        System.out.println("Кол-во записей: " + notes.size());

        int count = 0;
        Map<String, Integer> map = new HashMap<>();

        for (String note : notes) {
            count += note.length();
            String[] s = note.split(" ");
            if (!map.containsKey(s[0])) {
                map.put(s[0], 1);
            }
            else map.put(s[0], map.get(s[0])+1);
        }
        System.out.println("Кол-во символов: "+count);

        String day = "";
        int mxDay = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > mxDay) {
                day = entry.getKey();
                mxDay = entry.getValue();
            }
            else if (entry.getValue() == mxDay) {
                day += ", " + entry.getKey();
            }
        }
        System.out.println("Самый активный день по записям: "+ day);
    }
}
