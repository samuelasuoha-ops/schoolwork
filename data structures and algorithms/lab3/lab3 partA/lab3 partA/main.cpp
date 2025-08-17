#include<iostream>
using namespace std;

#include "safearray.h"

int main() {

	safeArray mySafeArray; //safeArray of default size 10

	//safeArray anotherSafeArray(); //safeArray of default size 10

	//int element = 0;

	//cout << (element = mySafeArray(2)) << endl;

	mySafeArray.at(9);

	return 0;
}