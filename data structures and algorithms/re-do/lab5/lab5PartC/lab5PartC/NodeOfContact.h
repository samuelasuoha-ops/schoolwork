//Samuel Asuoha
//X00157526
//lab5partC
#pragma once
#include "Contacts.h"
#include <string>
class NodeofContacts
{
	friend class Contacts;
	friend class ListofContacts;
private:
	Contacts theContact;
	NodeofContacts* next;
public:
	
	NodeofContacts();
	
	
	NodeofContacts(string n, int num);


};
