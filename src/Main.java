import java.util.Scanner;

// Привет, Семен!)

public class Main {

  public static void main(String[] arg) {
    Scanner scanner = new Scanner(System.in);
    StepTracker stepTracker = new StepTracker(scanner);

    while (true) {
      printMenu();
      try {
        int commandNumber = scanner.nextInt();

        if (commandNumber == 1) {
          stepTracker.addNewNumberStepsPerDay();
        } else if (commandNumber == 2) {
          stepTracker.changeStepGoal();
        } else if (commandNumber == 3) {
          stepTracker.printStatistic();
        } else if (commandNumber == 0) {
          return;
        } else {
          System.out.println("Кажется такой команды нет...;(");
        }
      } catch (Exception e) {
        System.out.println(
          "Пожалуйста, в следующий раз вводите цифры. Хорошего дня и настроения :)"
        );
        scanner.nextLine();
      }
    }
  }

  public static void printMenu() {
    System.out.println("Введите команду:");
    System.out.println("1: Указать пройденное количество шагов");
    System.out.println("2: Задать цель по количеству шагов в день");
    System.out.println("3: Статистика за месяц");
    System.out.println("0: Выход");
  }
}
