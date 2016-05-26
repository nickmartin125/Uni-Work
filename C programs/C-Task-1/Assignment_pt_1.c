"/*	HCS 2015-16
Standard Template for 'C' Programmes

Programme Name:     Assignment Part 1
Author Name:        Nick Martin
Development Date:   11th February
General Outline:	A programme that calculates and displays the Factorial of user inputted number.
*/

//	Compiler Directives
#define _CRT_SECURE_NO_WARNINGS // allows use of scanf.
//	Standard Library Inclusions
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h> //defines boolean values.

// Other Inclusions
//		e.g.	#include "myheader.h"
#define clearBuffer() char ch; while ((ch = getchar()) != '\n' && ch != EOF);

//	Function Prototypes (if not included within a header file)
bool fnContinue(bool);
int fnCalculation(int,int);
int fnValue(int);
void fnPause(void);

//	Main
int main(void)
{
	// Variable Declarations
	bool boolChoice = false;
	int nValue = 0;
	int nCalced = 1;
	// Code starts here ......
	printf("Welcome to a short programme to find factorial values from user input:\n"
		"Would you like to continue...Y/N \n");
	
	boolChoice = fnContinue(boolChoice);
	if (boolChoice == true) {
		nValue = fnValue(nValue);
		nCalced = fnCalculation(nValue, nCalced);
		printf("%d is the Factorial Value of %d", nCalced, nValue);
		}
	else {
		printf("Thank you come again!");
		
	}
	fnPause();
	return 0;
}


// Function Definitions - in alphabetical order
int fnCalculation(int value, int fact) { // Function to calculate Factorial Value derived from user input.
	int i = 0;
	for ( i = 1 ; i <= value; i++) {
		fact = fact*i;
	}
	return fact;
}


bool fnContinue(bool choice) { // Function to take a user choice and return a boolean value to continue program.
	char input;
	while (choice == false) {
		scanf("%c",&input);
		if (input == 'y' || input == 'Y') {
			choice = true;
		}
		else if (input == 'n' || input == 'N') {
			choice = false;	
			break;
		}
		else {
			choice = false;
			printf("Please enter a valid choice... Y/N");
			clearBuffer();
		}
		
	}
	return choice;
}

void fnPause(void) {// Neater pause function.
	printf("\n\nPress \"Enter\" to Exit.");
	getch();
}

int fnValue(int input) {// Function to find Valid requested value for Factorising, Returning value.
	printf("Please enter a positive number between 1 - 10...");
	bool ok = false;
	while (ok != true) {
		scanf("%d", &input);
		if (input > 0 && input <= 10) {
			ok = true;	
		}

		else {
			printf("Please enter a number between 1 and 10...");
			ok = false;
			
		}
	}
		return input;
	}
	