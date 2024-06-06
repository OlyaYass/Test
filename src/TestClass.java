import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("Список доступных команд:");
        System.out.println("#write - записывает данные в файл");
        System.out.println("#read - получает данные из файла");
        System.out.println("#statistics - выводит статистику");
        System.out.println("#find - поиск записей по датам");
        System.out.println("#exit - закончить работу");

        System.out.print("Введите команду: ");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            if (command.equals("#exit")) break;
            else {
                Commands commands = new Commands();
                try {
                    commands.chooseCommand(command);
                }catch (Exception ex) {
                    ex.printStackTrace();
                }finally {
                    System.out.print("Введите команду: ");
                }
            }
        }


    }
}