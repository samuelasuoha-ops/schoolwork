//x00157526
//Samuel Asuoha
#pragma once
//MY CODE FROM LAB 3B
class MyIntVector {
private:
	int m_size;
	int m_capacity;
	int* arrPtr;

public:
	void push_back(int val);
	int size();
	int capacity();
	void resize(int i);
	MyIntVector();
	~MyIntVector();
	int at(int i);
	int& operator[](int i);

	//LAB 4A
	MyIntVector(const MyIntVector& t);
	friend ostream& operator<<(ostream& str, const MyIntVector& myVec);
};