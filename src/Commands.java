import file.FindDate;
import file.ReadFile;
import file.Statistics;
import file.WriteFile;

import java.util.ArrayList;
import java.util.Scanner;

public class Commands {

    private final static Scanner scanner = new Scanner(System.in);

    public static void find() throws Exception {
        System.out.print("Введите дату: ");
        String date = scanner.nextLine();
        if (date.length() != 10 || date.charAt(4) != '-' || date.charAt(7) != '-') {
            throw new Exception("!");
        }
        String[] newDate = date.split("-");
        for (String s : newDate) {
            int num = Integer.parseInt(s);
        }
        FindDate findDate = new FindDate();
        findDate.findDate(date);
    }

    public void chooseCommand(String command) throws Exception {
        switch (command) {
            case "#read" -> {
                ReadFile read = new ReadFile();
                ArrayList<String> notes = read.readFile();
                System.out.println("Ваши планы:");
                if (notes.isEmpty()) System.out.println("Планы не найдены!");
                else {
                    for (String s : notes) {
                        System.out.println(s);
                    }
                }
            }
            case "#write" -> {
                System.out.print("Введите ваши планы на сегодня: ");
                String info = scanner.nextLine();
                WriteFile write = new WriteFile();
                write.writeFile(info);
            }
            case "#statistics" -> {
                Statistics statistics = new Statistics();
                statistics.printStatistics();
            }
            case "#find" -> {
                System.out.println("Введите дату в формате гггг-мм-дд (например: 2024-05-01)");
                try {
                    find();
                } catch (Exception e) {
                    throw new Exception("Неверный формат даты!");
                }
            }
            default -> throw new Exception("Неизвестная команда!");
        }
    }
}
