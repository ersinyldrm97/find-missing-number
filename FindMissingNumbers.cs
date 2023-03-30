using System;

public class FindMissingNumbers {
  public static void Main() {
    int [] numbers = {1, 3, 5, 7, 9, 13, 15, 17};
    findMissingNumbers(numbers);
  }
  public static void findMissingNumbers(int[] numbers) {
    int expectedNumber = 1;
    foreach(int number in numbers) {
      if (number != expectedNumber) {
        Console.WriteLine("Missing number is: " + expectedNumber);
        return;
      }
      expectedNumber += 2;
    }
  }
}