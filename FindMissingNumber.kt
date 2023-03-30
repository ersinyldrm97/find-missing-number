fun FindMissingNumber() {
  val numbers = intArrayOf(1, 3, 5, 7, 9, 13, 15, 17)
  findMissingNumbers(numbers)
}

fun findMissingNumbers(numbers: IntArray) {
  var expectedNumber = 1

  for (number in numbers) {
    if (number != expectedNumber) {
      println("Missing number is: $expectedNumber")
      return
    }
    expectedNumber += 2
  }
}