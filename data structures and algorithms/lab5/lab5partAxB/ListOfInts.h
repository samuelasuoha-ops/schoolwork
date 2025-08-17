#pragma once
class ListOfInts {
private:
	NodeofInt* head;

public:
	void insertBack(int);
	void displayList();
	void deleteMostRecent();
	ListOfInts();
	~ListOfInts();

	void* tempPtr;

	void deleteInt(int pos);
	// lab 5 part B
	friend ostream& operator << (ostream& out, const ListOfInts& c);
	//copy constructor
	ListOfInts(const ListOfInts& v);
	//overloaded assignment operator
	ListOfInts& operator= (const ListOfInts& listofint);
};