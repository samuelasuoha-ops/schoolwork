#include <iostream>
#include <fstream>
using namespace std;

void getHighScores(string name[5], int scores[5]) {


	ifstream file("scores.txt");

	if (file.is_open()) {
		string name[5] = { "Ronaldo", "Didier", "Pele", "Kaka", "Cristiano" };
		int scores[5] = { 10400, 9800, 12300, 8400, 8000 };
		

	}




}

int main() {
	//string name[5];
	//int scores[5];
	//getHighScores(name, scores);

	//cout << name << scores << endl;
	string name[5] = { "Ronaldo", "Didier", "Pele", "Kaka", "Cristiano" };
	int scores[5] = { 10400, 9800, 12300, 8400, 8000 };
	int i, j;
	int temp;
	for (int i = 0; i < 3; i++) {
		for (j = i + 1; j < 5; j++)
		{
			if (scores[i] < scores[j])
			{
				temp = scores[i];
				scores[i] = scores[j];
				scores[j] = temp;
			}
		}
		cout << name[i] << " " << scores[i] << "\n";
	}

	getHighScores(name, scores);

	return 0;
}