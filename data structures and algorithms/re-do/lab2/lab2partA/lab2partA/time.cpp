//X00157526
//Samuel Asuoha
//LAB 2 PART A
#include<iostream>
using namespace std;

//code gotten from https://www.geeksforgeeks.org/convert-time-from-24-hour-clock-to-12-hour-clock-format/
//code gotten from https://www.geeksforgeeks.org/program-convert-time-12-hour-24-hour-format/

void convert12(string str)
{
	int h1 = (int)str[0] - '0';
	int h2 = (int)str[1] - '0';
	int hh = h1 * 10 + h2;

	char Meridien;
	if (hh < 12) {
		Meridien = 'A';
	}
	else
		Meridien = 'P';

	hh %= 12;

	if (hh == 0) 
	{
		cout << "12";
		for (int i = 2; i <= 7; ++i) 
		{
			cout << str[i];
		}
	}
	else 
	{
		cout << hh;
		for (int i = 2; i <= 7; ++i) 
		{
			cout << str[i];
		}
	}

	cout << " " << Meridien << '\n';
}

void convert24(string str)
{
	int h1 = (int)str[1] - '0';
	int h2 = (int)str[0] - '0';
	int hh = h2 * 10 + h1 % 10;

	if (str[8] == 'A')
	{
		if (hh == 12)
		{
			cout << "00";
			for (int i = 2; i <= 7; i++)
			{
				cout << str[i];
			}
		}
		else
		{
			for (int i = 0; i <= 7; i++)
			{
				cout << str[i];
			}
		}
	}
	else
	{
		if (hh == 12)
		{
			cout << "12";
			for (int i = 2; i <= 7; i++)
			{
				cout << str[i];
			}
		}
		else
		{
			hh = hh + 12;
			cout << hh;
			for (int i = 2; i <= 7; i++)
			{
				cout << str[i];
			}
		}
	}
}

void insertvalue(string time)
{
	int hh, mm;
	char mer;
	cout << "Enter the time you wish to convert:\n";
	cin >> hh;
	if (hh > 23) 
	{
		cout << "invalid hours" << endl;
	}
	cin >> mm;
	if (mm > 60)
	{
		cout << "invalid minutes" << endl;
	}
	cout << "Enter the time meridien A for AM / P for PM:";
	cin >> mer;
	if (isblank(mer))
	{
		cout << " " << endl;
	}
	int time[10];
	cout << "Time inserted:" << hh << ":" << mm << " " << mer << endl;
}


int main() 
{
	string time;
	insertvalue(time);
	cout << "Do you want to convert to 12hrs or 24hrs?";
	string ans;
	cin >> ans;
	if (ans == "12")
	{
		convert12(time);
	}
	else if (ans == "24")
	{
		convert24(time);
	}
	else
	{
		cout << "Invalid option" << endl;
	}
	return 0;
}


/*For this code, i have sited the websites i based my code off. while i was running the code,
i encountered a problem towards the end of my output and it seems that the string subscript 
was out of range. I have never encountered this problem before so i am unsure of how to proceed. 
Apart from that this is the code I have for Lab sheet 2 part A*/