//x00157526
//Samuel Asuoha
//code samples gotten from https://www2.cs.sfu.ca/CourseCentral/125/tjd/vector_example.html
#pragma once
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
	//MyIntVector operator = (MyIntVector a);
	int& operator[](int i);
};
