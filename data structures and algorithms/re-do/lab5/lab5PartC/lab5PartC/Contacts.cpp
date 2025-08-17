//Samuel Asuoha
//X00157526
//lab5partC

#include <iostream>
using namespace std;
#include <string>
#include "Contacts.h"
#include "NodeOfContact.h"

string Contacts::getName()
{
    return name;
}

int Contacts::getNumber()
{
    return number;
}

void Contacts::setName(const string n)
{
    name = n;
}

void Contacts::setNumber(const int num)
{
    number = num;
}

Contacts::Contacts()
{
}

Contacts::Contacts(string n, int num)
{
    setName(n);
    setNumber(num);
}
