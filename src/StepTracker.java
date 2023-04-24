import java.util.Scanner;

public class StepTracker {

  Scanner scanner;
  MonthData[] monthToData = new MonthData[12];
  Converter converter = new Converter();
  int goalByStepsPerDay = 1000;

  StepTracker(Scanner scan) {
    scanner = scan;
    for (int i = 0; i < monthToData.length; i++) {
      monthToData[i] = new MonthData();
    }
  }

  void addNewNumberStepsPerDay() {
    System.out.println("Введите номер месяца (где 1 - Январь, а 12 - Декабрь)");
    int monthNumber = scanner.nextInt();
    if (monthNumber > 12 || monthNumber < 1) {
      System.out.println(
        "Неверный ввод. Номер месяца должен быть от 1 до 12 включительно. Вы указали: " +
        monthNumber +
        " Прощайте."
      );
      return;
    }

    System.out.println("Введите день от 1 до 30 (включительно)");
    int dayNumber = scanner.nextInt();
    if (dayNumber > 30 || dayNumber < 1) {
      System.out.println(
        "Неверный ввод. Номер дня должен быть от 1 до 30 включительно. Вы указали: " +
        dayNumber +
        " Прощайте."
      );
      return;
    }

    System.out.println("Введите количество шагов");
    int numberOfSteps = scanner.nextInt();
    if (numberOfSteps < 0) {
      System.out.println(
        "Неверный ввод. Количество шагов должно быть положительным числом. Вы указали: " +
        numberOfSteps +
        " Прощайте."
      );
      return;
    }
    MonthData monthData = monthToData[monthNumber - 1];
    monthData.days[dayNumber - 1] = numberOfSteps;
  }

  void changeStepGoal() {
    System.out.println(
      "Укажите цель по количеству шагов на день. Сейчас цель: " +
      goalByStepsPerDay +
      "."
    );
    int currentGoalBySteps = scanner.nextInt();
    if (currentGoalBySteps <= 0) {
      System.out.println(
        "Неверный ввод. Цель по количеству шагов должна быть больше 0. Вы указали: " +
        currentGoalBySteps +
        " Прощайте."
      );
      return;
    }
    goalByStepsPerDay = currentGoalBySteps;
  }

  void printStatistic() {
    System.out.println("Введите число месяца");
    int monthNumber = scanner.nextInt();
    if (monthNumber > 12 || monthNumber < 1) {
      System.out.println(
        "Неверный ввод. Номер месяца от 1 до 12 включительно. Вы указали: " +
        monthNumber +
        " Прощайте."
      );
      return;
    }

    MonthData monthData = monthToData[monthNumber - 1];
    int sumSteps = monthData.sumStepsFromMonth();
    monthData.printDaysAndStepsFromMonth();
    System.out.println(
      "Сумма шагов за " + monthNumber + " месяц равна " + sumSteps + "."
    );
    System.out.println(
      "Максимальное пройденное количества шагов за " +
      monthNumber +
      " месяц равна " +
      monthData.maxSteps() +
      "."
    );
    System.out.println(
      "Среднее пройденное количества шагов за " +
      monthNumber +
      " месяц равна " +
      (sumSteps / monthData.days.length) +
      "."
    );
    System.out.println(
      "Дистаниция за " +
      monthNumber +
      " месяц равна " +
      (converter.convertToKm(sumSteps)) +
      " км."
    );
    System.out.println(
      "Сожженно ккалорий за " +
      monthNumber +
      " месяц " +
      (converter.convertStepsToKilocalories(sumSteps)) +
      "."
    );
    System.out.println(
      "Лучшая серия за " +
      monthNumber +
      " месяц равна " +
      (monthData.bestSeries(goalByStepsPerDay)) +
      "."
    );
    System.out.println();
  }
}
