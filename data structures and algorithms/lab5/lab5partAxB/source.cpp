#include <iostream>
#include <string>
using namespace std;

#include <ListOfBooks.h>

int main()
{
	//help gotten from https://www.w3schools.com/cpp/cpp_strings_input.asp
	int isbn;
	string title;

	cout << "ISBN: ";
	getline(cin, isbn);
	cout << "ISBN: " << isbn;

	cout << "Title: ";
	getline(cin, title);
	cout << "Title: " << title;




}