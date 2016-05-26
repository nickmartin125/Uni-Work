/*	HCS 2015-16
Standard Template for 'C' Programmes

Programme Name:     Nick Martin
Author Name:        Nick Martin
Development Date:   1th April 2016.
General Outline:	A programme That .
*/

//	Compiler Directives
#define _CRT_SECURE_NO_WARNINGS // allows use of scanf.
//	Standard Library Inclusions
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h> //defines boolean values.
#include <string.h>

// Other Inclusions
//		e.g.	#include "myheader.h"
#define clearBuffer() char ch; while ((ch = getchar()) != '\n' && ch != EOF);
#include "MyStructures.h"
#include "MyPrototypes.h"



//	Function Prototypes (if not included within a header file)

//	Main
int main(void)
{
	// Variable Declarations
	bool boolChoice = true;
	struct strDataNode *ptrHead = NULL;
	struct strPerson temp = { " ", " "," ", " ", " " };
	int nCount = 0;
	char flag = ' ';
	// Code starts here ......
	printf("Welcome to a short programme to Store Staff Members:\n");
	while (boolChoice == true) {
		ptrHead = fnMenu(ptrHead, boolChoice,temp);

	}
	fnPause('E');
	return 0;
}

// Function Definitions - in alphabetical order
struct strPerson fnEnterPersonDetails(struct strPerson PersonData) {
	printf("Please Enter the following details:\nFirst Name: ");
	scanf("%s", PersonData.arcFirstName);
	printf("\nSurname: ");
	scanf("%s", PersonData.arcFamilyName);
	printf("\nRole: ");
	scanf("%s", PersonData.arcRole);
	printf("\nUserName: ");
	scanf("%s", PersonData.arcUserName);
	printf("\nEmployee number: ");
	scanf("%s", PersonData.EmployeeNumber);
	return PersonData;

}
struct strDataNode* fnAddToListStart(struct strDataNode* ptrH, struct strPerson ptrPersonData)
{
	struct strDataNode *ptrTemp;
	ptrTemp = (struct strDataNode *) malloc(sizeof(struct strDataNode));
	if (!ptrTemp)
	{
		printf("Malloc has failed ....");
		exit(1);
	}

	ptrTemp->personData = ptrPersonData;
	ptrTemp->ptrNext = ptrH;
	ptrH = ptrTemp;

	return ptrH;
}

struct strDataNode* fnAddToListEnd(struct strDataNode* ptrH, struct strPerson ptrPersonData) {
	struct strDataNode *ptrTemp = NULL;		// Temporary pointer

	if (ptrH == NULL)
	{
		// Special case as list is empty
		ptrH = (struct strDataNode *) malloc(sizeof(struct strDataNode));
		if (!ptrH)
		{
			printf("Malloc has failed\n");
			exit(1);
		}
		else
		{
			ptrH->personData = ptrPersonData;
			ptrH->ptrNext = NULL;
		}
	}
	else
	{
		// List already has items within it, need to find end
		ptrTemp = ptrH;
		while (ptrTemp->ptrNext != NULL)
			ptrTemp = ptrTemp->ptrNext;

		// ptrTemp is now pointing to last item within the list
		ptrTemp->ptrNext = (struct strDataNode *) malloc(sizeof(struct strDataNode));
		if (!ptrTemp->ptrNext)
		{
			printf("Malloc has failed\n");
			exit(1);
		}
		ptrTemp->ptrNext->personData = ptrPersonData;
		ptrTemp->ptrNext->ptrNext = NULL;
	}
	return ptrH;
}

bool fnContinue(bool choice) { // Function to take a user choice and return a boolean value to continue program.
	char input;
	choice = false;
	while (choice == false) {
		scanf("%c", &input);
		if (input == 'y' || input == 'Y') {
			choice = true;
			clearBuffer();
		}
		else if (input == 'n' || input == 'N') {
			choice = false;
			break;
		}
		else {
			choice = false;
			clearBuffer();
			printf("Please enter a valid choice... Y/N\n");
		}
	}
	return choice;
}


struct strDataNode* fnEmpNameSearch(struct strDataNode *ptrH, struct strPerson temp)
{

	int i = 0;
	char Fname[50];
	char empNo[5];
	struct strDataNode *ptrTemp;
	ptrTemp = ptrH;
	while (i != 2){
		while (ptrTemp->ptrNext != NULL)
		{

			printf("\nPlease enter the name for your search: ");
			scanf("%s", Fname);
			if (!(strstr(ptrTemp->personData.arcFamilyName, Fname)))
			{

				printf("\nThe persons is : %s %s and their Employment number %s : ", ptrTemp->personData.arcFirstName, ptrTemp->personData.arcFamilyName, ptrTemp->personData.EmployeeNumber);
				i++;
			}
			else {
				printf("%s was not found\n", empNo);
			}
			ptrTemp = ptrTemp->ptrNext;	
			}
	}
	return ptrH;
}
struct strDataNode* fnEmpNoSearch(struct strDataNode *ptrH, struct strPerson temp) {

	int i = 0;
	char Fname[50];
	char empNo[5];
	struct strDataNode *ptrTemp;
	ptrTemp = ptrH;
	while(i !=2 ){
		while (ptrTemp->ptrNext != NULL)
		{

			printf("\nPlease enter the employee number for your search: ");
			scanf("%s", empNo);
			if (strstr(ptrTemp->personData.EmployeeNumber, Fname))
			{
				printf("\nThe persons is : %s %s and their Employment number %s : ", ptrTemp->personData.arcFirstName, ptrTemp->personData.arcFamilyName, ptrTemp->personData.EmployeeNumber);
			}
			else {
		printf("%s was not found\n", Fname);
		i++;
	}
		}
		ptrTemp = ptrTemp->ptrNext;
	
	}
	return ptrH;
}

/*struct strDataNode* fnExportFile (struct strDataNode *ptrHead)
{
	FILE *outFile;
	int i = 0;
	int attempts = 3;
	char path[100] = "C:\\Data\\"; // Virtual Machine seemed to be having issues with the file within Visual Studio, so set file on to desktop in order to continue the work
	char file[30] = "";
	for (i = 0; i < 3; i++)
	{
		printf("Please enter the file name required: ");
		scanf("%s", file);
		strcat(path, file);
		outFile = fopen(path, "w");
		if (outFile == NULL)
		{
			attempts--;
			printf("Error opening %s - %d more attempts remain.\n", file, attempts);
			printf("Error: %d (%s)\n", errno, strerror(errno));

			if (attempts == 0) {
				printf("\n*** No remaining attempts. Returning to menu ***\n\n");
			}
		}
		else {
			i = 4;
			printf("***File open***\n\n");

			while (!feof(outFile))			// Check to see if EOF found
			{
				struct strPerson temp;
				// EOF not encounterd - read the line
				fprintf(outFile, "%s %s %s %s %s", temp.arcFirstName, temp.arcFamilyName, temp.arcRole, temp.arcUserName, temp.EmployeeNumber);
				//printf("%s %s\n %s\n %s\n %s\n", temp.arcFirstName, temp.arcFamilyName, temp.arcRole, temp.arcUserName, temp.arcEmployeeNumber);
};*/

struct strDataNode* fnMenu(struct strDataNode *ptrHead, bool BoolChoice,struct strPerson PersonData) {
	int nChoice = 0;
	printf("\n\nWelcome to the Staff Entry and Enquiry system.\n"
		"1.\tAdd to end of the list.\n"
		"2.\tAdd to the Start of the list.\n"
		"3.\tSearch the List on Employee Number.\n"
		"4.\tExport list contents to user specified file.\n"
		"5.\tSearch by Name.\n"
		"6.\tRead User specified list.\n"
		"7.\tPrint List\n"
		"8.\tExit.\n\n"
		"Choice: ");

	scanf("%d", &nChoice);

	switch (nChoice) {
	case 1:
		PersonData = fnEnterPersonDetails(PersonData);
		ptrHead = fnAddToListEnd(ptrHead, PersonData);
		break;
	case 2:
		PersonData = fnEnterPersonDetails(PersonData);
		ptrHead = fnAddToListStart(ptrHead, PersonData);
		break;
	case 3:
		ptrHead = fnEmpNoSearch(ptrHead, PersonData);
		break;
	case 4:
		//ptrHead = fnExportFile(ptrHead);
		break;
	case 5:
		ptrHead = fnEmpNameSearch(ptrHead, PersonData);
		break;
	case 6:
		ptrHead = fnReadFile(ptrHead);
		break;
	case 7:
		ptrHead = fnPrintList(ptrHead);
		break;
	case 8:
		exit(EXIT_SUCCESS);
		break;
	default:
		printf("Invalid entry Please try again");

	}
	return ptrHead;
}

void fnPause(char input) { // Neater pause function.
	if (input == 'E') {
		printf("\nPress \"Enter\" to Exit.\n");
		getch();
	}
	else {
		printf("\n\nPress \"Enter\" to Continue.\n\n");
		getch();
	}
}

struct strDataNode* fnPrintList(struct strDataNode *ptrH) {
	struct strDataNode *ptrTemp = ptrH;
	printf("\nThe list contains ...\n");
	if (!ptrH)
	{
		printf("List is empty ....\n");
	}
	else
	{
		while (ptrTemp)
		{
			printf("%s %s\n %s\n %s\n %s\n", ptrTemp->personData.arcFirstName, ptrTemp->personData.arcFamilyName, ptrTemp->personData.arcRole, ptrTemp->personData.arcUserName, ptrTemp->personData.EmployeeNumber);
			ptrTemp = ptrTemp->ptrNext;

		}
	}
	printf("..... End of list ....\n");
	return ptrH;
}

struct strDataNode* fnReadFile(struct strDataNode* ptrH) {
	FILE *inFile;
	int i = 0;
	int attempts = 3;
	char path[100] = "C:\\Data\\"; // Virtual Machine seemed to be having issues with the file within Visual Studio, so set file on to desktop in order to continue the work
	char file[30] = "";
	for (i = 0; i < 3; i++)
	{
		printf("Please enter the file name required: ");
		scanf("%s", file);
		strcat(path, file);
		inFile = fopen(path, "r");
		if (inFile == NULL)
		{
			attempts--;
			printf("Error opening %s - %d more attempts remain.\n", file, attempts);
			printf("Error: %d (%s)\n", errno, strerror(errno));

			if (attempts == 0) {
				printf("\n*** No remaining attempts. Returning to menu ***\n\n");
			}
		}
		else {
			i = 4;
			printf("***File open***\n\n");

			while (!feof(inFile))			// Check to see if EOF found
			{
				struct strPerson temp;
				// EOF not encounterd - read the line
				fscanf(inFile, "%s %s %s %s %s", temp.arcFirstName, temp.arcFamilyName, temp.arcRole, temp.arcUserName, temp.EmployeeNumber);
				//printf("%s %s\n %s\n %s\n %s\n", temp.arcFirstName, temp.arcFamilyName, temp.arcRole, temp.arcUserName, temp.arcEmployeeNumber);
				ptrH = fnAddToListEnd(ptrH, temp);

			}
			fclose(inFile);
			printf("File Read in successfully!!");
			fnPause('c');
		}
	}
	return ptrH;

}