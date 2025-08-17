// Self implementation of
// the Vector Class in C++

#include <iostream>
using namespace std;

#include "vector.h"

template <typename T> 
class vectorClass {
	vectorClass::vectorClass() {
		arr = new T[1];
		capacity = 1;
		current = 0;
	}

	template <typename T>
	void vectorClass<T>::push(T data)
	{

	
		// if the number of elements is equal to the
		// capacity, that means we don't have space to
		// accommodate more elements. We need to double the
		// capacity
		if (current == capacity) {
			T* temp = new T[2 * capacity];

			// copying old array elements to new array
			for (int i = 0; i < capacity; i++) {
				temp[i] = arr[i];
			}

			// deleting previous array
			delete[] arr;
			capacity *= 2;
			arr = temp;
		}
		template <typename T>
		// Inserting data
		arr[current] = data;
		current++;

	}

	template <typename T>
	void vectorClass<T>::push(int data, int index)
	{


		// if index is equal to capacity then this
		// function is same as push defined above
		if (index == capacity) {
			push(data);
		}
		else {
			arr[index] = data;
		}
	}

	template <typename T>
	T vectorClass<T>::get(int index)
	{


		// if index is within the range
		if (index < current) {
			return arr[index];
		}
		return T();
	}

	template <typename T>
	void vectorClass<T>::pop()
	{
		current--;
	}

	template <typename T>
	int vectorClass<T>::size()
	{
		return current;
	}

	template <typename T>
	int vectorClass<T>::getcapacity()
	{
		return capacity;
	}

	template <typename T>
	void vectorClass<T>::print()
	{
		for (int i = 0; i < current; i++) {
			cout << arr[i] << " ";
		}
		cout << endl;
	}

}