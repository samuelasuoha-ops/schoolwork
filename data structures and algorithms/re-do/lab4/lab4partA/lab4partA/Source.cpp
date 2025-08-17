// x00157526
// Samuel Asuoha
#include<iostream>
using namespace std;

#include "MyIntVector.h"

int main()
{
	/*
	//MY CODE FROM LAB 3B
	MyIntVector v; //default constructor will set size to 10
	v.size();
	v.capacity();
	v.at(2);
	v.resize(2);
	v.push_back(6);
	v.operator[](6);
	*/
	
	//LAB 4A
	//code samples gotten from https://www.geeksforgeeks.org/operator-overloading-and-operator-in-a-linked-list-class/?ref=gcse
	// code samples gotten from https://en.cppreference.com/w/cpp/language/copy_constructor
	// code samples gotten form https://www.geeksforgeeks.org/copy-constructor-in-cpp/
	//to test copy constructor
	MyIntVector v;//default constructor will set size to 10
	
	MyIntVector v2(v); //calling copy constructor
	

	//to test overloaded << operator
	cout << "constructor= " << v << endl;
	cout << "copy constructor= " << v2 << endl;

	
	//MyIntVector v2(v);

	return 0;
}