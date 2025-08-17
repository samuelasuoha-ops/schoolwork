//samuel Asuoha
//x00157526
#pragma once
#ifndef LISTOFINTS_H_
#define LISTOFINTS_H_

#include <iostream>
using namespace std;

class NodeOfInt
{
	friend class ListOfInts;
	friend ostream& operator<<(ostream& outputStream, const ListOfInts& aList);
public:
	explicit NodeOfInt(int = 0);
private:
	int theValue = 0;
	NodeOfInt* next = nullptr;
};

class ListOfInts
{
	friend ostream& operator<<(ostream& outputStream, const ListOfInts& aList);
public:
	ListOfInts();
	~ListOfInts();

	void insertBack(int);

	void operator--(int);


private:
	NodeOfInt* head = nullptr;
};
#endif

