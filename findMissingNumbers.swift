func findMissingNumbers(numbers: [Int]) {
    var expectedNumber = 1
    
    for number in numbers {
        if number != expectedNumber {
            print("Missing number is: \(expectedNumber)")
            return
        }
        
        expectedNumber += 2
    }
}

let numbers = [1, 3, 5, 7, 9, 13, 15, 17]
findMissingNumbers(numbers: numbers)