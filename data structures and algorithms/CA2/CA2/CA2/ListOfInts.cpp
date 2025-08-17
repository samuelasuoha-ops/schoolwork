//samuel Asuoha
//x00157526
#include "ListOfInts.h"
#include <iostream>
using namespace std;

// Do not change any of the code above

void ListOfInts::operator--(int)
{
	// Add your code here below
	NodeOfInt* temp = new NodeOfInt;
	temp->next = nullptr;
	NodeOfInt* temp2 = head;
	if (head == nullptr) {
		delete temp2;
	}
	else {
		while (temp2 != nullptr) {
			temp2->theValue--;
			temp2 = temp2->next;
			//temp2->theValue--;
		}
	}
}


// Do not change any of the code below

NodeOfInt::NodeOfInt(int val)
	:next(nullptr), theValue(val)
{}

ListOfInts::ListOfInts()
	: head(nullptr)
{}

ListOfInts::~ListOfInts()
{
	NodeOfInt* temp;
	while (head)
	{
		temp = head;
		head = head->next;
		delete temp;
	}
}

void ListOfInts::insertBack(int num)
{
	auto* newNode = new NodeOfInt(num);
	NodeOfInt* tempPtr;

	if (!head)
		head = newNode;
	else
	{
		for (tempPtr = head; tempPtr->next != nullptr; tempPtr = tempPtr->next)
			;
		tempPtr->next = newNode;
	}
}

ostream& operator<<(ostream& outputStream, const ListOfInts& aList)
{

	NodeOfInt* temp = aList.head;

	while (temp)
	{
		outputStream << temp->theValue << endl;
		temp = temp->next;
	}

	return outputStream;
}

