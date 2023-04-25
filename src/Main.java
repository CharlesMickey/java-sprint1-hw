import java.util.Scanner;

public class Main {

  public static void main(String[] arg) {
    Scanner scanner = new Scanner(System.in);
    StepTracker stepTracker = new StepTracker(scanner);

    while (true) {
      printMenu();
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
        System.out.println ("Кажется такой команды нет...;(");
      }
    }
  }

  public static void printMenu() {
    System.out.println(
      "Введите комманду: 1: Указать пройденное количесвто шагов, " +
      "2: Задать цель по количеству шагов в день, " +
      "3: Статистика за месяц, " +
      "0: Выход"
    );
  }
}
