//x00157526
//Samuel Asuoha

#include<iostream>

using namespace std;
#include "safearray.h"
int main() 
{
	safeArray mySafeArray; //default safeArray of size 10
	safeArray anotherSafeArray(9); //a safeArray of size 9

	int size;
	cout << "input size: " << endl;
	cin >> size;
	
	int element = 0;
	element = mySafeArray.at(size);
	cout << element << endl;

	return 0;
}