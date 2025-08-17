//samuel Asuoha
//x00157526

#include<iostream>
using namespace std;

#include "ListOfInts.h"
#include "NodeofInt.h"
#include "NodeofInt.cpp"


/*
references:
> https://www.codesdope.com/blog/article/c-linked-lists-in-c-singly-linked-list/
> https://stackoverflow.com/questions/18779543/constructor-for-a-linked-list
> https://linuxhint.com/destructor-linked-list-cpp/#:~:text=A%20linked%20list%20can%20be,access%20or%20is%20deliberately%20discarded.
> https://www.geeksforgeeks.org/cpp-program-for-deleting-a-node-in-a-linked-list/
> https://www.geeksforgeeks.org/remove-last-node-of-the-linked-list/
*/

//lab5partA

ListOfInts::ListOfInts()
{
	cout << "in the constructor" << endl;
	NodeofInt* head = NULL;
}

ListOfInts::~ListOfInts()
{
	cout << "in the destructor" << endl;
	
	NodeofInt* newNode = head;
	
	while (newNode != NULL) {
		NodeofInt* tempPtr = newNode;
		newNode = newNode->next;
		delete tempPtr;
	}
	
	//while (head) {
		//tempPtr = head;

		//delete tempPtr;
	//}
}

void ListOfInts::insertBack(int x)
{
	
	NodeofInt* newNode = new NodeofInt;
	NodeofInt* nodePtr;
	if (!head) 
	{
		head = newNode;
	}
	else
	{
		for (nodePtr = head; nodePtr->next != nullptr; nodePtr = nodePtr->next);
	
		nodePtr->next = newNode;
	}
	
	
	//NodeofInt* newNode = new NodeofInt;
	//if (!newNode) return false;
	//newNode->next = head;
	//head = newNode;
	//return true;
}

void ListOfInts::displayList()
{
	NodeofInt* newNode = head;
	while (newNode != NULL)
	{
		cout << newNode->next;
		
	}
}

void ListOfInts::deleteMostRecent()
{
	/*
	NodeofInt* newNode = head;
	NodeofInt* prevNode = NULL;
	if (newNode != NULL) {
		NodeofInt* next = new NodeofInt;
		delete new NodeofInt;
	}
	*/
	if (head == NULL)
		return ;

	if (head->next == NULL) {
		delete head;
		return ;
	}
}

void ListOfInts::deleteInt(int pos)
{
	
	NodeofInt* newNode = head;
	NodeofInt* prevNode = NULL;

	if (head->theValue == pos) {
		head = head->next;
		delete newNode;
	}
	else {
		while (newNode != NULL && newNode->theValue!= pos) {
			prevNode = newNode;
			newNode = newNode->next;
		}
	}
	
	if (newNode == NULL) {
		return;
	}
	else {
		prevNode->next = newNode->next;
		delete newNode;
	}
}

//lab5partB
/*
references:
> https://stackoverflow.com/questions/43462982/implementing-copy-constructor-in-a-single-linked-list-c 
> https://cplusplus.com/forum/beginner/148011/
> https://www.geeksforgeeks.org/operator-overloading-and-operator-in-a-linked-list-class/
> https://linuxhint.com/copy-constructor-linked-list-cpp/#:~:text=A%20copy%20constructor%20is%20just,object%20parameters%20in%20the%20class.
> https://www.geeksforgeeks.org/overloading-stream-insertion-operators-c/
*/
//overloaded stream insertion operator <<
ostream& operator<<(ostream& out, const ListOfInts& listInt)
{
	NodeofInt* head;
	if (head == NULL) {
		out << "Empty List" << endl;
	}
	else {
		out << head << endl;
	}

	return out;
}

//copy constructor
ListOfInts::ListOfInts(const ListOfInts& v)
{
	head = NULL;
	*this = v;
}
