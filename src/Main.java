import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);

        while (true) {
            printMenu();
            int commandNumber = scanner.nextInt();
            if(commandNumber == 0) return;

            stepTracker.changeStepGoal();
        }

    }
    public static void printMenu() {
        System.out.println("Введите комманду: 1, 2, 3: Выход");
    }

}
