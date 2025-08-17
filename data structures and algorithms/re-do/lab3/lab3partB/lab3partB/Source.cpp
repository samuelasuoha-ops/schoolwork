// x00157526
// Samuel Asuoha
#include<iostream>
using namespace std;

#include "MyIntVector.h"


int main()
{
	MyIntVector v; //default constructor will set size to 10
	v.size();
	v.capacity();
	v.at(2);
	v.resize(2);
	v.push_back(6);
	v.operator[](6);
	//v.pushback(2); // push the integer 2 into the vector
	// more tests etc.
}