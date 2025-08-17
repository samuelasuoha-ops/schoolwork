// from lab 3 part B

#include<iostream>
using namespace std;

#include "MyIntVector.h"

int MyIntVector::push_back(int val)
{
	int x = val;
	cout << push_back(x) << endl;
	//for (int i = 0; i <= x; i++) {}



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

MyIntVector::MyIntVector(const MyIntVector& obj)
{
	//gotten from sample on https://www.tutorialspoint.com/cplusplus/cpp_copy_constructor.htm
	cout << "Copy constructor allocating arrPtr." << endl;
	arrPtr = new int;
	*arrPtr = *obj.arrPtr;
}

void display(MyIntVector obj) 
{
	//gotten from sample on https://www.tutorialspoint.com/cplusplus/cpp_copy_constructor.htm
	cout << "Vector is: " << obj.size() << endl;
}

MyIntVector& MyIntVector::operator=(const MyIntVector& myintvector)
{
	//gotten help from https://www.learncpp.com/cpp-tutorial/overloading-the-assignment-operator/
	m_size = myintvector.m_size;
	m_capacity = myintvector.m_capacity;
	arrPtr = myintvector.arrPtr;


	// TODO: insert return statement here
	return *this;
}

void MyIntVector::displayVector()
{
	cout << "size:" << m_size << "capacity:" << m_capacity << endl;
}

