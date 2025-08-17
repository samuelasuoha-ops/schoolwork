#include <iostream>
#include <fstream>
using namespace std;

void getHighScores() {
	string name[5];
	int scores[5];
	ifstream file;
	file.open("scores.txt");
	while (!file.eof())
	{
		getline(file, name)
	};


}

int main() {
	
	getHighScores();

	return 0;
}