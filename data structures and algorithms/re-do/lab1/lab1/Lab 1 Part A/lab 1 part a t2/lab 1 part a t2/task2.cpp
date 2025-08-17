//x00157526
//Samuel Asuoha
//Task 2
#include <iostream>
using namespace std;
//sample code gotten from https://www.tutorialspoint.com/fizz-buzz-implementation-in-cplusplus# 
int main() {

    for (int i = 1; i <= 100; i++) {

        if (i == 3)
            cout << "Fizz ";
        if (i == 33)
            cout << "Fizz Fizz ";
        if (i == 5)
            cout << "Buzz ";
        if (i == 55)
            cout << "Buzz Buzz ";
        if (i == 7)
            cout << "Woof ";
        if (i == 77)
            cout << "Woof Woof ";
        if (i == 15)
            cout << "Fizz ";
        if (i % 15 == 0)
            cout << "Fizz Buzz,\t";
        else if ((i % 3) == 0)
            cout << "Fizz,\t";
        else if ((i % 5) == 0)
            cout << "Buzz,\t";
        else if ((i % 7) == 0)
            cout << "Woof,\t";
        else
            cout << i << ",\t";
    }
    return 0;
}