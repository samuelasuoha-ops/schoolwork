#pragma once
class Book {
private:
	struct NodeofBook* head;
public:
	int isbn;
	string title;
	//accessor
	string getTitle();
	//Mutator
	void setTitle(const string title);
	void deletefromBack();
	bool insertFront(int, string);
	bool deleteFront();
	bool deleteBook(int isbnToDelete);
	bool findBook(int isbn);
	Book();
	~Book();
	//copy constructor
	Book(const Book& v);
	//overloaded assignment operator
	Book& operator= (const Book& listofbooks);

	void displayList(ostream&) const;
	void* tempPtr;
	friend ostream& operator<<(ostream&, const Book&);

};