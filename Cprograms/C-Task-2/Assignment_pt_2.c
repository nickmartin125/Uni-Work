/* HCS 2015-16
Standard Template for 'C' Programmes

Programme Name:     Nick Martin
Author Name:        Nick Martin
Development Date:   22nd February
General Outline: A programme that randomly populates a 5 x 6 array, with functions that return minimum, maximum and mean values.
also comparing the Mean against values for the closest to Mean and its
*/

// Compiler Directives
#define _CRT_SECURE_NO_WARNINGS // allows use of scanf.

// Standard Library Inclusions
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h> //defines boolean values.

// Other Inclusions
//  e.g. #include "myheader.h"
#define clearBuffer() char ch; while ((ch = getchar()) != '\n' && ch != EOF);

// Function Prototypes (if not included within a header file)
int fnValueChoice(char);
int fnPopulateArray(int, int, int[][6]);
int fnPrintArray(int[][6]);
int fnMinMax(int[][6], int, char);
void fnPause(void);
void fnCloseToMean(double, int, int[][6]);

// Main
int main(void)
{
	// Variable Declarations
	int nRangeMin = 0;
	int nRangeMax = 0;
	int nMinVal = 0;
	int nMaxVal = 0;
	int nSum = 0;
	int nCount = 0;
	double nMean = 0;
	int arRandom[5][6];

	// Code starts here ......
	printf("Random Array Generator.\n\nAfter entering a minimum and maximum value to populate the array the following program \nwill return the highest and lowest randomly generated value and the mean of the generated array.\n\n");
	nRangeMin = fnValueChoice('m');
	nRangeMax = fnValueChoice('M');
	nSum = fnPopulateArray(nRangeMin, nRangeMax, arRandom);
	nCount = fnPrintArray(arRandom);
	nMinVal = fnMinMax(arRandom, nRangeMax, 'm');
	nMaxVal = fnMinMax(arRandom, nRangeMax, 'M');
	nMean = (double)nSum / (double)nCount;
	fnCloseToMean(nMean, nRangeMin, arRandom);
	printf("\n\nThe Mean Value is:\t\t %.2f  \nThe Smallest Value is:\t\t %d \nThe Largest Value is:\t\t %d", nMean, nMinVal, nMaxVal);
	clearBuffer()
	fnPause();
	return 0;
}


// Function Definitions - in alphabetical order
void fnCloseToMean(double mean, int diff, int arr[][6]) {
	int i = 0;
	int j = 0;
	int row = 0;
	int column = 0;
	int close = 0;
	double calc;
	for (i = 0; i <= 4; i++) {
		for (j = 0; j <= 5; j++) {
			calc = (double)arr[i][j] - mean;
			calc = abs((int)calc);
			if (calc < (double)diff) {
				diff = (int)calc;
				close = arr[i][j];
				row = i;
				column = j;
			}
		}
	}
	printf("\n\nThe closest value to the Mean is %d and its position within the array is [%d][%d]", close, row, column);
}

int fnMinMax(int arr[][6], int max, char flag) { // Function which iterates through a passed into array to find high and low values based on a flag in call.
	int val = 0;
	int i = 0;
	int j = 0;
	if (flag == 'm') {
		val = max;
		for (i = 0; i <= 4; i++) {
			for (j = 0; j <= 5; j++) {
				if (val >= arr[i][j]) {
					val = arr[i][j];
				}
			}
		}
	}
	else {
		val = 1;
		for (i = 0; i <= 4; i++) {
			for (j = 0; j <= 5; j++) {
				if (val <= arr[i][j]) {
					val = arr[i][j];
				}
			}
		}
	}
	return val;
}


void fnPause(void) { // Neater pause function.
	printf("\n\nPress \"Enter\" to Exit.");
	getchar();
}

int fnPopulateArray(int min, int max, int arr[][6]) { // populates an Array with Random Values between user specified limits. Also keeps a running total for the mean Value.
	int i = 0;
	int j = 0;
	int randInput = 0;
	int sum = 0;
	for (i = 0; i <= 4; i++) {
		for (j = 0; j <= 5; j++) {
			randInput = min + (rand() % (max - min));
			arr[i][j] = randInput;
			sum = sum + randInput;

		}
	}
	return sum;
}

int fnPrintArray(int arr[][6]) { // Function to print array and return a count of array items for mean value.
	int i = 0;
	int j = 0;
	int count = 0;
	printf("The random values in the array are as follows, \n\n");
	for (i = 0; i <= 4; i++) {
		printf("\n row %d -->\t", i);
		for (j = 0; j <= 5; j++) {
			printf("[%d]\t\t", arr[i][j]);
			count++;
		}
	}
	return count;
}


int fnValueChoice(char cFlag) { // Requests and returns minimum and maximum values dependant on flag in call.
	int val = 0;
	if (cFlag == 'm') {
		printf("Please enter the Minimum value you wish to have in your array: ");
		scanf("%d", &val);

	}
	else {
		printf("Please enter the Maximum value you wish to have in your array: ");
		scanf("%d", &val);

	}
	return val;
}