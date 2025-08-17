//samuel Asuoha
//x00157526

#include<iostream>
using namespace std;
#include <string>
#include "Contacts.h"
#include "ListOfContacts.h"
#include "NodeOfContact.h"


bool ListofContacts::insertBack(string, int)
{
	NodeofContacts* newNode = new NodeofContacts;
	NodeofContacts* nodePtr;
	newNode->next = nullptr;

	

	return false;
}

bool ListofContacts::deleteBack()
{
	NodeofContacts* temp;
	if (temp == nullptr) {
		return false;
	}
	if (temp->next = nullptr) {
		delete temp;
		return true;
	}
	NodeofContacts* current;
	while (current->next->next != nullptr) {
		current->next = current->next->next;
	}
}

Contacts ListofContacts::deleteContact(string nameToDelete)
{
	/*
	NodeofContacts* head;
	NodeofContacts* lead = head;
	NodeofContacts* trail = nullptr;
	bool found = false;
	if (head) {
		while (lead && !found) {
			if (lead->theContact)
		}
	}
	*/
	
}

bool ListofContacts::findContact(string nameToFind)
{
	NodeofContacts* current;
	while (current->next != NULL) {
		
		current = current->next;
	}
	return false;
}

bool ListofContacts::isEmpty()
{
	return false;
}

void swap(ListofContacts& first, ListofContacts& second)
{
	/*
	using std::swap;
	swap(first.name, second.name);
	swap(first.number, second.number);
	*/
}

ListofContacts& ListofContacts::operator=(const ListofContacts& origList)
{
	ListofContacts copy(origList);
}

ostream& ListofContacts::displayList(ostream&) const
{
	NodeofContacts* tempptr;
	while (tempptr != nullptr)
	{
	
		tempptr = tempptr->next;
	}
}


ostream& operator<<(ostream& outputStream, const ListofContacts& L)
{
	
}
