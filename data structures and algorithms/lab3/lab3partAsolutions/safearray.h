#pragma once
class safeArray {
private:
	int* arr;
	int size = 10;

public:
	safeArray();
	~safeArray();
	int at(int);
};
