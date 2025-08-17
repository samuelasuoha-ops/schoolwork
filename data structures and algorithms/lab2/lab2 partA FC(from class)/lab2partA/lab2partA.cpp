//I was unable to complete during allocated time 

#include <iostream>
#include <random>
using namespace std;

int main() {
	default_random_engine defEngine;
	uniform_int_distribution<int> intDistro(0, 26);

	int finalists[25];
	int numbers;
	int i;

	for (int i = 1; i <= 4; i++) {

		numbers = rand() % finalists;

		cout << numbers << " ";

	}

	return 0;
}