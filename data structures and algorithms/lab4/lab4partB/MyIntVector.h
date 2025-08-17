// from lab 3 part B

#pragma once
class MyIntVector {
private:
	int m_size;
	int m_capacity;
	int* arrPtr;

public:
	int push_back(int val);
	int size();
	int capacity();
	void resize(int i);
	MyIntVector();
	~MyIntVector();
	int at(int i);

	//copy constructor
	MyIntVector(const MyIntVector& obj);

	//overloaded assignment
	MyIntVector& operator= (const MyIntVector& myintvector);

	void displayVector();
};