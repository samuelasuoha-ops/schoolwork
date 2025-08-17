#include<iostream>
#include<ctime>
#include<cstdlib>
#include <random>
using namespace std;


int main() {
	int finalists[25];
	int numbers;

	int finalist;

	for (int i = 1; i <= 4; i++) {

		//numbers = rand() % intDistro(defEngine);
		random_shuffle(finalists, finalists + 25);
		cout << finalists[i] << " ";

	}

	return 0;
}