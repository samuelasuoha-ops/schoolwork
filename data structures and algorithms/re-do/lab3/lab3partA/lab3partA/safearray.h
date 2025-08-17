//x00157526
//Samuel Asuoha

#pragma once
class safeArray {
private:
	int* arr;
	int size = 10;

public:
	int at(int index);
	safeArray();
	safeArray(int size);
	~safeArray();
	
};