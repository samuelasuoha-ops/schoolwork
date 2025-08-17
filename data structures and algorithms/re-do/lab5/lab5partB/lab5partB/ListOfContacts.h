//Samuel Asuoha
//X00157526
//lab5partB
#pragma once
#include "Contacts.h"

class ListofContacts
{
	//friend class Contacts;
	ListofContacts();
	~ListofContacts();
	bool insertFront(Contacts);
	friend ostream& operator<<(ostream& str, const ListofContacts& conList);
	Contacts deleteFront();

};

