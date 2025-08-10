#include<iostream>
using namespace std;

int main() {
	cout << "hello" << "\n";
	cout << "  " << "\n";
	string first = "Mary";
	string last = "Rose";
	cout << "Hello " << first << "\n";
	cout << first << " " << last << "\n";
	int total = 10;
	cout << total << "\n";
	cout << total << "." << "\n";
	cout << "Wait...";

	//idea gotten from https://www.w3schools.com/cpp/cpp_user_input.asp
	string person;
	cout << "What is your name? ";
	cin >> person;
	cout << "Hi " << person << "\n";
	cout << "Done";



	return 0;
}