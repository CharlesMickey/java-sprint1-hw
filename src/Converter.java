public class Converter {

  final int stepLength = 75;
  final int caloriePerStep = 50;

  int convertToKm(int steps) {
    int kmPassed = 0;
    if (steps <= 0) {
      return kmPassed;
    } else {
      kmPassed = (steps * stepLength / 100) / 1000;
    }
    return kmPassed;
  }

  int convertStepsToKilocalories(int steps) {
    int kilocaloriesPassed = 0;
    if (steps <= 0) {
      return kilocaloriesPassed;
    } else {
      kilocaloriesPassed = steps * caloriePerStep / 1000;
    }
    return kilocaloriesPassed;
  }
}
