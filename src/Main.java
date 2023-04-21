import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int commandNumber = scanner.nextInt();
            if(commandNumber == 0) return;
        }

    }
    public static void printMenu() {
        System.out.println("Введите комманду: 1, 2, 3: Выход");
    }
}
