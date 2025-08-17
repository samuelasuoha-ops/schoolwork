#include <iostream>
using namespace std;

#include "Contacts.h"
#include "ListOfContacts.h"
#include "NodeofContacts.h"

int main()
{
	ListofContacts l;

	l.insertFront();
	l.deleteFront();

	

	cout << l;
	return 0;
}