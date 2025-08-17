//x00157526
//Samuel Asuoha

#include<iostream>
using namespace std;

#include "safearray.h"

int size = 10;

int safeArray::at(int index) 
{
	
	int value = index;
	
	if (value >= size) {
		cout << "array out of bounds" << endl;

		return -1;
	}
	else {
		cout << arr[value] << endl;
		return value;
	}
	
}

safeArray::safeArray() 
{
	cout << "in the constructor" << endl;


	arr = new int[10];
	
	int arr[10];
	for (int i = 0; i < 10; i++) {
		arr[i] = 0;
	}
}

safeArray::safeArray(int size)
{
	/*int x = size;
	cout << "input size" << endl;
	cin >> x;*/
}

safeArray::~safeArray()
{
	cout << "in the destructor" << endl;
	delete[] arr;
	arr = NULL;
}


