#include <iostream>
#include <fstream>
using namespace std;

void getHighScores(string name[5], int scores[5]) {
	
	
	ifstream file("scores.txt");

	if (file.is_open()) {
		string name[5] = { "Ronaldo", "Didier", "Pele", "Kaka", "Cristiano" };
		int scores[5] = { 10400, 9800, 12300, 8400, 8000 };
		int i, j;
		for (int i = 0; i < 3; i++) {
			
			cout << name[i] << " " << scores[i] << "\n";
		}
		
	}
	
	
	

}

int main() {
	string name[5];
	int scores[5];
	getHighScores(name, scores);
	
	//cout << name << scores << endl;



	return 0;
}