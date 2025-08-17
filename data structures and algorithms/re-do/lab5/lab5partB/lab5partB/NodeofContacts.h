//Samuel Asuoha
//X00157526
//lab5partB
#pragma once
#include "Contacts.h"

class NodeofContacts
{
	friend class Contacts;
private:
	Contacts theContact;
	NodeofContacts* next;
public:
	NodeofContacts();

};