#include<iostream>
#include <list>
#include <vector>
#include <queue>
#include <stack>
using namespace std;

#include "Song.h"


int main() {
	//Part A
	// help gotten from https://www.geeksforgeeks.org/queue-push-and-queue-pop-in-cpp-stl/
	// help gotten from https://www.geeksforgeeks.org/queue-of-pairs-in-c-stl-with-examples/
	queue<pair<string, int>> playlist;

	playlist.push({ "song1", 180 });
	playlist.push({ "song2", 120 });
	playlist.push({ "song3", 240 });

	while (!playlist.empty()) {
		//cout >> 'song' >> playlist;
		playlist.front();
		playlist.pop();
	}

}

