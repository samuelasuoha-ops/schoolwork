#pragma once
class Book {	
public:
	int isbn;
	string title;
	//accessor
	string getTitle();
	//Mutator
	void setTitle(const string title);
};