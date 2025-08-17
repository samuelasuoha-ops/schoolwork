#include<iostream>
#include <list>
using namespace std;

#include "NodeOfBook.h"
#include "ListOfBooks.h"


NodeofBook::NodeofBook()
{
}

string Book::getTitle()
{
	return string();
}

void Book::setTitle(const string title)
{
	title == string();
	return;
}

void Book::deletefromBack()
{
	//help gotten from https://stackoverflow.com/questions/19326017/deleting-the-back-element-in-a-linked-list
	if (head->next == NULL) {
		delete head;
		head = NULL;
	}
	else {
		NodeofBook* nextToEnd = head;
		NodeofBook* end = head->next;
		while (end->next != NULL) {
			nextToEnd = end;
			end = end->next;
		}
		delete end;
		nextToEnd->next = NULL;
	}
}

bool Book::insertFront(int x, string y)
{
	//help gotten from https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/
	NodeofBook* t = new NodeofBook();
	t->book = x, y;
	t->next = head;

	head = t;

	return false;
}

bool Book::deleteFront()
{
	if (head == NULL)
		return NULL;

	// Move the head pointer to the next node
	NodeofBook* temp = head;
	head = head->next;

	delete temp;

	return head;
	
}

bool Book::deleteBook(int isbnToDelete)
{
	return false;
}

bool Book::findBook(int isbn)
{
	
	return false;
}

Book::Book()
{
}

Book::~Book()
{
}

Book::Book(const Book& v)
{
	//help gotten from https://stackoverflow.com/questions/7811893/creating-a-copy-constructor-for-a-linked-list
	NodeofBook* p1 = 0;//current
	NodeofBook* p2 = 0;//next

	if (v.head == 0)
		head = 0;

	else
	{
		head = new NodeofBook;
		head->book = v.head->book;


		p1 = head;
		p2 = v.head->next;
	}

	while (p2)
	{
		p1->next = new NodeofBook;
		p1 = p1->next;
		p1->book = p2->book;


		p2 = p2->next;
	}
	p1->next = 0;
}

Book& Book::operator=(const Book& listofbooks)
{
	//gotten from previous lab work
	if (this != &listofbooks)
	{
		this->~Book();

		NodeofBook* temp;
		while (tempPtr != NULL) {
			temp = new NodeofBook(NullPtr->isbn);
			NullPtr->next = temp;
			NullPtr = NullPtr->next;
			tempPtr = tempPtr->next;
		}
	}
	
	return *this;
}

void Book::displayList(ostream&) const
{
	//gotten from sample in lecture slides
	NodeofBook* tempPtr = head;
	while (tempPtr != NULL) {
		cout << tempPtr->book;
		tempPtr = tempPtr->next;
	}
}

ostream& operator<<(ostream&, const Book&)
{
	//help gotten from https://www.geeksforgeeks.org/overloading-stream-insertion-operators-c/

	if (Book.empty()) {
		cout << "empty list" << endl;
	}
	// TODO: insert return statement here
	return cout;
}
