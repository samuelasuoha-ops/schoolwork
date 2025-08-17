#include<iostream>
using namespace std;

#include "MyIntVector.h"

int main()
{
	MyIntVector v;
	v.size();
	v.capacity();
	v.at(2);
	v.resize(2);
	v.push_back(6); 
}