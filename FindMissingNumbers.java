public class FindMissingNumbers {
  public static int missingNumbers(int[] numbers) {
    int expectedNumber = 1;
    for (int i: numbers) {
      if (i != expectedNumber) {
        return expectedNumber;
      }
      expectedNumber += 2;
    }
    return expectedNumber;
  }

  public static void main(String[] args) {
    int[] numbers = { 1, 3, 5, 7, 9, 13, 15, 17 };
    int missingNumbers = missingNumbers(numbers);
    System.out.println(missingNumbers);
  }
}