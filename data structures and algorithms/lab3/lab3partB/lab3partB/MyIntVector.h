#pragma once
class MyIntVector {
private:
	int m_size = 4;
	int m_capacity = 10;
	int* arrPtr;

public:
	int push_back(int val);
	int size();
	int capacity();
	void resize(int i);
	MyIntVector();
	~MyIntVector();
	int at(int i);
	 

};