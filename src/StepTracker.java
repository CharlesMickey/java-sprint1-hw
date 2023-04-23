import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 1000;

    StepTracker(Scanner scan) {
        scanner = scan;
        for(int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца (где 1 - Январь, а 12 - Декабрь)");
        int monthNumber = scanner.nextInt();
        if(monthNumber > 12 || monthNumber < 1) {
            System.out.println("Неверный ввод. Номер месяцы от 1 до 12 включительно. Вы указали: " + monthNumber + " Прощайте.");
            return;
        }

        System.out.println("Введите день от 1 до 30 (включительно)");
        int dayNumber = scanner.nextInt();
        if(dayNumber > 30 || dayNumber < 1) {
            System.out.println("Неверный ввод. Номер дня от 1 до 30 включительно. Вы указали: " + dayNumber + " Прощайте.");
            return;
        }

        System.out.println("Введите количество шагов");
        int numberOfSteps = scanner.nextInt();
        if(numberOfSteps < 0) {
            System.out.println("Неверный ввод. Количество шагов должно быть положительным числом. Вы указали: " + numberOfSteps + " Прощайте.");
            return;
        }
        MonthData monthData = monthToData[monthNumber-1];
        monthData.days[dayNumber] = numberOfSteps;
    }

    void changeStepGoal() {
        System.out.println("Укажите цель по количеству шагов на день. Сейчас цель: " + goalByStepsPerDay + ".");
        int currentGoalBySteps = scanner.nextInt();
        if(currentGoalBySteps <= 0) {
            System.out.println("Неверный ввод. Цель по количеству шагов должна быть больше 0. Вы указали: " + currentGoalBySteps + " Прощайте.");
            return;
        }
        goalByStepsPerDay = currentGoalBySteps;
    }


}
