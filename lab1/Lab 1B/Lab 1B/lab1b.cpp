//worked with a few people who gave me tips on what to do
#include <iostream>
#include <ctime>
#include <random>
#include <list>
using namespace std;

int main() {
	//gotten from sample shown during lab session
	default_random_engine defEngine;
	uniform_int_distribution<int> intDistro(0, 365);
	//
	
	int trials = 0;
	int num_of_people;
	int count;
	int birthday[50];
	int days = 365;
	int testtrial = 5000;
	int matches;



	for (int i = 2; i <= 50; i++) {
		//birthday = (rand() % 365) + 1;
		num_of_people = 50;
		matches = 0;
		
		for (int trials = 0; trials < testtrial; trials++) {
			for (int j = 0; j < i; j++) {
				birthday[j] = intDistro(defEngine);
				
				for (int k = 0; k < i; k++) {
					if (birthday[j] = birthday[k]) {
						matches++;
					}

				}
			}
		} 

		cout << "For " << i << " people, the probability of two birthdays is about " << float(matches) / testtrial << "\n";
	}

	return 0;
}

