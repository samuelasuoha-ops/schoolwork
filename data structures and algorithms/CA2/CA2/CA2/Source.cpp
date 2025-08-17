//samuel Asuoha
//x00157526
#include"ListOfInts.h"
#include<iostream>
using namespace std;

int main()
{
	ListOfInts l;

	l.insertBack(1);
	l.insertBack(2);
	l.insertBack(3);

	cout << "L is : " << endl << l << endl;

	l--;

	cout << "L is now : " << endl << l << endl;

	return 0;
}