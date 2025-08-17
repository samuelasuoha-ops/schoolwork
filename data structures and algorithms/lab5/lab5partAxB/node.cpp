#include<iostream>
using namespace std;

#include "NodeofInt.h"
#include "ListOfInts.h"
#include "ListOfbooks.h"
#include "NodeOfBook.h"

NodeofInt::NodeofInt()
{
	cout << "in the constructor" << endl;
	
	int i = 0;
	int* x = NullPtr;
}

void ListOfInts::insertBack(int x)
{
	NodeofInt* next = new NodeofInt;
	next->NullPtr;
	//theValue.push_back(x)
	


}

void ListOfInts::displayList()
{
	NodeofInt* x = head;
	while (x != NULL)
	{
		cout << x->NullPtr;
		
	}
}

void ListOfInts::deleteMostRecent()
{
	NodeofInt* x = head, *trailPtr = NULL;

	while (x != NULL) {
		NodeofInt* next = new NodeofInt;
		delete new NodeofInt;
	}
}

ListOfInts::ListOfInts()
{
	cout << "in the constructor" << endl;


	
}

ListOfInts::~ListOfInts()
{
	cout << "in the destructor" << endl;

	while (head) {
		tempPtr = head;

		delete tempPtr;
	}
}

void ListOfInts::deleteInt(int pos)
{
	//gotten from https://stackoverflow.com/questions/68982624/deleting-a-node-at-nth-position-in-a-linked-list-in-c-last-number-is-no
	struct NodeofInt* temp1 = head;

	if (pos == 1)
	{
		head = temp1->next;
		free(temp1);
		return;
	}
	for (int i = 0; i < pos - 2; i++) {
		
	}

	struct NodeofInt* node_to_be_deleted = temp1;
	temp1->next = node_to_be_deleted->next;

	free(node_to_be_deleted);
}

// lab 5B Part A
ostream& operator<<(ostream& out, const ListOfInts& c)
{
	//help gotten from https://www.geeksforgeeks.org/overloading-stream-insertion-operators-c/
	
	if (ListOfInts = []) {
		out << "empty list" << endl;
	}
	// TODO: insert return statement here
	return out;
}

//copy constructor
ListOfInts::ListOfInts(const ListOfInts& v)
{
	//help gotten from https://stackoverflow.com/questions/7811893/creating-a-copy-constructor-for-a-linked-list
	NodeofInt* p1 = 0;//current
	NodeofInt* p2 = 0;//next

	if (v.head == 0)
		head = 0;

	else
	{
		head = new NodeofInt;
		head->theValue = v.head->theValue;
		

		p1 = head;
		p2 = v.head->next;
	}

	while (p2)
	{
		p1->next = new NodeofInt;
		p1 = p1->next;
		p1->theValue = p2->theValue;
		

		p2 = p2->next;
	}
	p1->next = 0;
}

ListOfInts& ListOfInts::operator=(const ListOfInts& listofint)
{
	//help gotten from https://www.daniweb.com/programming/software-development/threads/416288/linked-list-overloading-assignment-operator
	if (this != &listofint)
	{
		this->~ListOfInts();

		NodePointer temp;
		while (tempPtr != NULL) {
			temp = new Node(tempPtr->data);
			NullPtr->next = temp;
			NullPtr = NullPtr->next;
			tempPtr = tempPtr->next;
		}
	}
	// TODO: insert return statement here
	return *this;
}

// lab 5B Part B
string Book::getTitle()
{
	return title;
}

void Book::setTitle(const string title)
{
	title = title;
	return;
}

NodeofBook::NodeofBook()
{
	
}
