/*	HCS 2015-16
Standard Template for 'C' Programmes

Programme Name:     Nick Martin
Author Name:        Nick Martin
Development Date:   3rd February
General Outline:	Write a programme to generate and display a table of n and n2, for integers n ranging from 1 to 15.
Ensure that the table has appropriate column headings and is appropriately spaced.
*/

//	Compiler Directives

//	Standard Library Inclusions
#include <stdio.h>
#include <stdlib.h>

// Other Inclusions
//		e.g.	#include "myheader.h"

//	Function Prototypes (if not included within a header file)

//	Main
int main(void)
{
	// Variable Declarations
	int nCount = 0;
	int nNum = 0;
	int nNumsq = 0;

	// Code starts here ......
	printf("A Table of integers and the squared value of them from 0 - 15.\n");
	printf("Value\t\tSquared\n");
	for (nCount = 0; nCount <= 15; nCount++){
		nNum = nCount;
		nNumsq = nNum;
		nNumsq *= nNum;
		printf("%d\t\t%d\n", nNum, nNumsq);
	}
	system("PAUSE");

	return 0;
}

// Function Definitions - in alphabetical order