#include <iostream>
using namespace std;

void findMissingNumbers(int numbers[], int size) {
  int expected_number = 1;
  
  for (int i = 0; i < size; i++) {
    if (numbers[i] != expected_number) {
      cout << "Missing number is: " << expected_number << endl;
      return;
    }
    expected_number += 2;
  }
}

int main() {
  int numbers[] = {1, 3, 5, 7, 9, 13, 15, 17};
  int size = sizeof(numbers) / sizeof(numbers[0]);
  findMissingNumbers(numbers, size);

  return 0;
}