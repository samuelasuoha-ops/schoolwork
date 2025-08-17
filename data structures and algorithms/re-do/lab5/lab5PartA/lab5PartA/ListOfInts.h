//Samuel Asuoha
//X00157526
//lab5partA
#pragma once
#include "NodeofInt.h"
class ListOfInts {
	friend class NodeofInt;
private:
	NodeofInt* head;

public:
	//lab5partA
	
	ListOfInts();
	~ListOfInts();
	void insertBack(int);
	void displayList();
	void deleteMostRecent();
	
	void deleteInt(int pos);
	

	//lab5partB
	//overloaded stream insertion operator <<
	friend ostream& operator<<(ostream& str, const ListOfInts& listInt);
	//copy constructor
	ListOfInts(const ListOfInts& v);
};

