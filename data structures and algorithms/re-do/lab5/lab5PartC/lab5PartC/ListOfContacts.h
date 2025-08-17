//Samuel Asuoha
//X00157526
//lab5partB
#pragma once
#include "Contacts.h"
#include <string>
class ListofContacts
{
	friend class Contacts;
public:
	ListofContacts();
	~ListofContacts();
	bool insertFront(Contacts);
	friend ostream& operator<<(ostream& str, const ListofContacts& conList);
	Contacts deleteFront();

	//lab5C
	bool insertBack(string, int);
	bool deleteBack();
	Contacts deleteContact(string nameToDelete);
	bool findContact(string nameToFind);
	bool isEmpty();
	ListofContacts(const ListofContacts &c);
	friend void swap(ListofContacts& first, ListofContacts& second);
	ListofContacts& operator=(const ListofContacts& List);
	ostream& displayList(ostream&) const;
	friend ostream& operator<<(ostream& outputStream, const ListofContacts&);
};
