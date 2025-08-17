//Samuel Asuoha
//X00157526
//lab5partB
#pragma once
#include <iostream>
using namespace std;
	
class Contacts
{
	friend class NodeofContacts;
public:
	string name;
	int number;
	//accessor
	string getName();
	int getNumber();
	//Mutator
	void setName(const string n);
	void setNumber(const int num);
};
