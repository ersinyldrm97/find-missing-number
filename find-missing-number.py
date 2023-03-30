def find_missing_odd_number(numbers):
    expected_number = 1
    for number in numbers:
        if number != expected_number:
            return expected_number
        expected_number += 2

numbers = [1,3,5,7,9,13,15,17]
missing_number = find_missing_odd_number(numbers)
print(missing_number)