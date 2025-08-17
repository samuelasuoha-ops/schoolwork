#include <iostream>
#include <random>

using namespace std;

int randrange(int low, int high)
{
    return rand() % (high - low + 1) + low;
}

int main() {
	default_random_engine defEngine;
	uniform_int_distribution<int> intDistro(0, 26);
	
	
    int finalists[25] = { 0 }, i, j;
    bool check;
    for (i = 1; i < 26; i++)
    {
        check = true;
        for (j = 0; (check) && (j < i); j++) {
            check = (finalists[i] != finalists[j]);
        }
    }

    int finalist;

    for (int i = 1; i <= 4; i++) {

        //numbers = rand() % intDistro(defEngine);
        random_shuffle(finalists, finalists + 25);
        cout << finalists[i] << " ";

    }

    
    for (i = 0; i < 9; i++)
    {
        //cout << num[i] << " ";
    }
    return 0;
	
}