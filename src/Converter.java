public class Converter {

  final int STEP_LENGTH = 75;
  final int CALORIE_PER_STEP = 50;

  int convertToKm(int steps) {
    int kmPassed = 0;
    if (steps <= 0) {
      return kmPassed;
    } else {
      kmPassed = (steps * STEP_LENGTH / 100) / 1000;
    }
    return kmPassed;
  }

  int convertStepsToKilocalories(int steps) {
    int kilocaloriesPassed = 0;
    if (steps <= 0) {
      return kilocaloriesPassed;
    } else {
      kilocaloriesPassed = steps * CALORIE_PER_STEP / 1000;
    }
    return kilocaloriesPassed;
  }
}
