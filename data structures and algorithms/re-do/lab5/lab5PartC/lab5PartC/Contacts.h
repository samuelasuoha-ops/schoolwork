//Samuel Asuoha
//X00157526
//lab5partC
#pragma once
#include <iostream>
using namespace std;
#include <string>
class Contacts
{
	friend class NodeofContacts;
	friend class ListOfContacts;
public:
	
	string name;
	int number;
	//accessor
	string getName();
	int getNumber();
	//Mutator
	void setName(const string n);
	void setNumber(const int num);
	
	Contacts();
	Contacts(string n, int num);
};