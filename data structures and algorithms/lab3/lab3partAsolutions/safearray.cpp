//worked with Daniel Cullen
#include<iostream>
using namespace std;

#include "safearray.h"

int safeArray::at(int x) {
	//cout << size << endl;
	int value = x;
	
	if (value >= size) {
		cout << "array out of bounds" << endl;

		exit(-1);
	}
	else {
		cout << arr[value] << endl;
	}
	return value;
}

safeArray::safeArray() {
	cout << "in the constructor" << endl;

	
	arr = new int[10];
	size = 10;
	int array[10];
	for (int i = 0; i < 10; i++) {
		arr[i] = 0;
	}
}

safeArray::~safeArray() {
	cout << "in the destructor" << endl;
	delete[] arr;
	arr = NULL;
}