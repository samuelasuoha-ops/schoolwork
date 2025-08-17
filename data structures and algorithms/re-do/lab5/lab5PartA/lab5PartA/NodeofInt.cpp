//samuel Asuoha
//x00157526

#include<iostream>
using namespace std;

#include "NodeofInt.h"

//lab5partA
NodeofInt::NodeofInt()
{
	cout << "in the constructor" << endl;

	int i = 0;
	NodeofInt* NullPtr = next;
	
}

//lab5partB
NodeofInt::NodeofInt(const NodeofInt& n)
{
	int i = 0;
	NodeofInt* NullPtr = n.next;
		
}
