// CS4080PresentationClass.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <string>

auto& print = std::cout; //Type Inference, creating a reference
typedef std::string string; //giving a type a new name

class point
{

private:
	int x;
	int y;

public:
	point() {
		this->x = 0;
		this->y = 0;
	}
	point(int x, int y)
	{
		this->x = x;
		this->y = y;
	}

	string getCoordinates() {
		return (std::to_string(x)+" "+std::to_string(y));
	}

	void printPoint() {
		string s1 = std::to_string(x) + " " + std::to_string(y);
		print << s1;
		
	}

	void setCoordinates(int x, int y) {
		this->x = x;
		this->y = y;
	}
	void shift(int x, int y) {
		this->x += x;
		this->y += y;
	}

};


