#include<iostream>
using namespace std;

#include "MyIntVector.h"

int main()
{
	// got help from https://www.tutorialspoint.com/cplusplus/cpp_copy_constructor.htm , 
    //https://www.learncpp.com/cpp-tutorial/overloading-the-assignment-operator/ , 
	//https://www.tutorialspoint.com/cplusplus/assignment_operators_overloading.htm

	//copy constructor
	MyIntVector intvector(10);
	display(intvector);

	//overloaded assignment operator= 
	MyIntVector myintvector1(4, 10), myintvector2(5, 11);

	cout << "First Vector: ";
	myintvector1.displayVector();
	cout << "Second Vector: ";
	myintvector2.displayVector();

	myintvector1 = myintvector2;
	cout << "First vector: ";
	myintvector1.displayVector();

	return 0;

}