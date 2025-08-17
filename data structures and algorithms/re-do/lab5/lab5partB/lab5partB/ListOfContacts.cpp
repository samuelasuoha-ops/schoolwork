//samuel Asuoha
//x00157526

#include<iostream>
using namespace std;

#include "Contacts.h"
#include "ListOfContacts.h"
#include "NodeofContacts.h"

ListofContacts::ListofContacts()
{
}

ListofContacts::~ListofContacts()
{
}

bool ListofContacts::insertFront(Contacts)
{
	Contacts theContact;
	if (theContact == NULL) {
		theContact = new Contacts;
	}
	return false;
}

Contacts ListofContacts::deleteFront()
{
	return Contacts();
}

ostream& operator<<(ostream& str, const ListofContacts& conList)
{
	// TODO: insert return statement here
}
