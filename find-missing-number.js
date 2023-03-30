function findMissingNumbers(numbers) {
  let expectedNumber = 1;

  for (let i = 0; i < numbers.length; i++) {
    if (numbers[i] !== expectedNumber) {
      console.log("Missing number is: " + expectedNumber);
      return;
    }
    expectedNumber += 2;
  }
}

const nubmers = [1, 3, 5, 7, 9, 13, 15, 17];
findMissingNumbers(numbers);