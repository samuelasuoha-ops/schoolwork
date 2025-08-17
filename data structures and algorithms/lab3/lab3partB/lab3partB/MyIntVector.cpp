#include<iostream>
using namespace std;

#include "MyIntVector.h"

int MyIntVector::push_back(int x){
	int val = x;
	//cout << push_back(val) << endl;
	for (int i = 0; i <= val; i++) {
	 cout << push_back(i) << endl;
	}
		
	

	return 0;
}

int MyIntVector::size()
{
	
	return sizeof(m_size);
}

int MyIntVector::capacity()
{
	return sizeof(m_capacity);
}

void MyIntVector::resize(int i)
{
	//int* resize_arr = new int[m_size + 1];
	//for (int i = 0; i < m_size; i++)
	//	resize_arr[i] = arrPtr[i];

	//m_size++;
	//arrPtr = resize_arr;
	//delete[] resize_arr;


	//int y = i;
	if (i > m_size) {
		cout << m_size + i << endl;
	}
	else {
		cout << m_size - i << endl;
	}
}

MyIntVector::MyIntVector()
{
	cout << "in the constructor" << endl;


	arrPtr = new int[10];
	m_capacity = 10;
	
	for (int i = 0; i < 10; i++) {
		arrPtr[i] = 0;
	}
}

MyIntVector::~MyIntVector()
{
	cout << "in the destructor" << endl;
	delete[] arrPtr;
	arrPtr = NULL;
}

int MyIntVector::at(int i)
{
	int value = i;

	if (value >= m_size) {
		cout << "array out of bounds" << endl;

		exit(-1);
	}
	else {
		cout << arrPtr[value] << endl;
	}
	return value;
	
	
}
