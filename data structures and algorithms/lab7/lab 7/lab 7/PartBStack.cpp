#include<iostream>
#include <list>
#include <vector>
#include <stack>
using namespace std;

// gotten help from https://www.geeksforgeeks.org/stack-set-3-reverse-string-using-stack/
// most of the code is copied 
void swap(char* a, char* b)
{
    char temp = *a;
    *a = *b;
    *b = temp;
}

void reverse(char str[])
{
    int n = strlen(str), i;
    for (i = 0; i < n / 2; i++)
        swap(&str[i], &str[n - i - 1]);
}

int main1()
{
    char str[] = "string";
    reverse(str);
    cout << str;
    return 0;
}