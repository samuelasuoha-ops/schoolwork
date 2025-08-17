#include <iostream>
using namespace std;

#include "ListOfInts.h"

int main()
{
	ListOfInts l;
	
	l.insertBack(2);
	l.insertBack(3);
	l.insertBack(5);
	l.insertBack(8);
	l.insertBack(6);
	
	l.displayList();

	l.deleteMostRecent();
	l.deleteInt(8);

	cout << l;
	return 0;
}