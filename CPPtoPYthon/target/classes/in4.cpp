#include <math.h>
#include <stdio.h>
#include <stdbool.h>

int iloczyn (int a, int b) {
	int c = 0;
	printf("Iloczyn");
	c = a*b;
	return c;
}

void foo(bool param){
	if(param==true) printf("foo");
	else printf("falseFoo");
}

// funkcja main

int main() {
	int a=2;
	int b=5;
	int c=10;

	int d=iloczyn(b, c);
	cout << b;
	cout << d;

	while(a!=b){
		printf("loop");
		a++;
	}

	/*komentarz
	wielolinijkowy*/

}