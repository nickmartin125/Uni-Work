/*	HCS 2015-16
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

void fnPause(void);

//	Main
int main(void)
{
	// Variable Declarations
	char arcFirstName[50];
	char arcMiddleName[50];
	char arcFamilyName[50];
	char arcCompositeString[150];	// is this big enough ??

	// Code starts here ......
	printf("Ex43.c     Building a composite string\n\n");

	printf("Please enter your First Name : ");
	scanf("%s", arcFirstName);
	printf("Please enter your Middle Name : ");
	scanf("%s", arcMiddleName);
	printf("Please enter your Family Name : ");
	scanf("%s", arcFamilyName);

	// Now build the composite name
	strcpy(arcCompositeString, arcFirstName);
	strcat(arcCompositeString, " ");
	strcat(arcCompositeString, arcMiddleName);
	strcat(arcCompositeString, " ");
	strcat(arcCompositeString, arcFamilyName);

	printf("Your full name is %s\n", arcCompositeString);

	int nValue = 0;

	nValue = strcmp(arcFirstName, arcMiddleName);

	printf ("The value returned is %d\n", nValue);

	int i = 0;
	int j = 0;// Section Placing underscores within input String 'arcCompositeString'
	for (i = 0; i < 1; i++){
		printf("%c",arcFirstName[i]);
		for (j = 1; j < sizeof(arcFirstName) / sizeof(int); j++){
			printf("_%c", arcFirstName[j]);

		}
	}

	fnPause();

	return 0;

}


// Function Definitions - in alphabetical order


void fnPause(void) {// Neater pause function.
	printf("\n\nPress \"Enter\" to Exit.");
	getch();
}

