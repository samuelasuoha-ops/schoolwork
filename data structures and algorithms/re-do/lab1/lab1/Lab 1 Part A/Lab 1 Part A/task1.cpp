//x00157526
//Samuel Asuoha
//task 1
#include <iostream>
using namespace std;

// sample code from https://cplusplus.com/forum/beginner/213845/
// sample code from https://cplusplus.com/forum/beginner/262454/
// sample code from https://stackoverflow.com/questions/63693777/how-to-swap-two-rows-in-a-2-dimensional-array
const int row = 7;
const int col = 3;
void displayArray(int [row][col]);
bool findArray(int [row][col], int);

int main()
{
	
	int arr[row][col];	

	cout << "Enter Values:" << endl;
	for (int i = 0; i < row; i++)
	{
		for (int j = 0; j < col; j++)
		{
			cin >> arr[i][j];
			
		}
	}
	
	displayArray(arr);
	cout << '\n';
	bool found = false;
	int x;
	cout << "Input integer to search for:" << endl;
	cin >> x;

	found = findArray(arr, x);
	if (found)
	{
		cout << arr[row] << endl;
	}
	else
	{
		cout << "no row starts with the value" << endl;
	}
	
	return 0;
}

void swap(int arr[][3], int row, int col)
{
	int hold;
	int row1 = 1;
	int row2 = 2;

	for (int i = 0; i < row; i++)
	{
		hold = arr[row1 - 1][i];
		arr[row1 - 1][i] = arr[row2 - 1][i];
		arr[row2 - 1][i] = hold;
	}

	for (int i = 0; i < row; i++)
	{
		for (int j = 0; j < col; j++)
		{
			cout << arr[row][col] << ' ';
		}
		cout << '\n';
	}
}

void displayArray(int arr[row][col])
{
	for (int i = 0; i < row; i++)
	{
		for (int j = 0; j < col; j++)
		{
			cout << arr[row][col] << ' ';
		}
		cout << '\n';
	}
}

bool findArray(int arr[row][col], int x)
{
	for (int i = 0; i < row; i++)
	{
		for (int j = 0; j < col; j++)
		{
			if (arr[row][col] == x)
			{
				return true;
			}
		}
	}
	return false;
}

/*After running code, there are a few things wrong with it and 
i was unable to get the desired outcome or solution. 
I am unable to find what and where the code went wrong.*/