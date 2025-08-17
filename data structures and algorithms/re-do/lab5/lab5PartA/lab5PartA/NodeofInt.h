//Samuel Asuoha
//X00157526
//lab5partA
#pragma once
class NodeofInt {
	friend class ListOfInts;
private:
	int theValue;
	NodeofInt* next;

public:
	NodeofInt();
	
	//lab5partB
	//copy constructor
	NodeofInt(const NodeofInt& n);
};