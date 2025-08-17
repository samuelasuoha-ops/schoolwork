//x00157526
//Samuel Asuoha

#include<iostream>
using namespace std;

#include "MyIntVector.h"
//code samples gotten from https://www2.cs.sfu.ca/CourseCentral/125/tjd/vector_example.html
//code samples gotten from https://stackoverflow.com/questions/42238712/change-array-size-c

const int m_size = 4;
const int m_capacity = 10;

void MyIntVector::push_back(int x) {
	//int val = x;
	//cout << push_back(val) << endl;
	/*
	for (int i = 0; i <= val; i++) {
		//cout << push_back(i) << endl;
	}

	*/


	if (m_size <= m_capacity) return;

	int* new_arr = new int[m_size];   // allocate a new array on the free store

	for (int i = 0; i < m_capacity; ++i)   // copy old vector into new one
	{ 
		new_arr[i] = arrPtr[i];
	}
	m_capacity = m_size;                      // set the new capacity

	delete[] arrPtr;                       // delete the old vector
	arrPtr = new_arr;


	if (m_size >= m_capacity) {
		m_capacity = (2 * m_capacity);
		arrPtr[m_size] = x;
		++m_size;
	}
}

int MyIntVector::size()
{
	return m_size;
}

int MyIntVector::capacity()
{
	m_capacity = 10;
	arrPtr = new int[m_capacity];
	return m_capacity;
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
	int element;
	if (i > m_size) {
		element = 0;
		cout << m_size + i << endl;

	}
	else {
		cout << m_size - i << endl;
	}
}

MyIntVector::MyIntVector()
{
	cout << "in the constructor" << endl;

	m_capacity = 10;
	arrPtr = new int[m_capacity];
	
	int arrPtr[10];
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
		return value;
	}
}

int& MyIntVector::operator[](int i)
{
	if (i < 0 || i >= m_size) {
		cout << "out of range" << endl;
	}

	return arrPtr[i];
}


