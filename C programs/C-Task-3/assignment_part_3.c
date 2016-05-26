/*    HCS 2015-16
Standard Template for 'C' Programmes

Programme Name:     Nick Martin
Author Name:        Nick Martin
Development Date:   8th March 2016.
General Outline:    A programme that a program that stores structures in an array with functions that out put the array based on various requirements.
*/

//    Compiler Directives
#define _CRT_SECURE_NO_WARNINGS // allows use of scanf.
//    Standard Library Inclusions
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h> //defines boolean values.
#include <string.h>

// Other Inclusions
//        e.g.    #include "myheader.h"
#define clearBuffer() char ch; while ((ch = getchar()) != '\n' && ch != EOF);

struct strName {
   char arrTitle[20];
   char arrFamilyName[50];
   char arrMiddleName[50];
   char arrFirstName[50];
};

struct strDate {
   int nDay;
   int nMonth;
   int nYear;
};

struct strStartTime {
   int nHour;
   int nMin;
   int nSecs;
};

struct strPerson {// 'Person' Structure with nested Date/Name Structures.
   char arrJobTitle[50];
   int nEmployeeNo;
   struct strName strName;
   struct strDate strDOB;
   struct strDate strStartDate;
   struct strStartTime strStartTime;

};

typedef struct strPerson Person;

//    Function Prototypes (if not included within a header file)
bool fnContinue(bool);
void fnPopArr(Person arrStaff[]);
void fnPrintPeople(Person arrStaff[]);
void fnSortByEmpNo(Person arrStaff[]);
void fnSortAZ(Person arrStaff[]);
void fnPause(char);

//    Main
int main(void)
{
   // Variable Declarations
   bool boolChoice = true;
   Person arrStaff[5];

   // Code starts here ......
   printf("Welcome to a short programme to Sort Staff Members:\n");
   while (boolChoice == true) {
       printf("\n\nWould you like to continue...Y/N \n");
       boolChoice = fnContinue(boolChoice);
       if (boolChoice == true) {
           fnPopArr(arrStaff);
           fnPrintPeople(arrStaff);
           fnSortByEmpNo(arrStaff);
           fnPrintPeople(arrStaff);
           fnSortAZ(arrStaff);
           fnPrintPeople(arrStaff);
       }

   }
   fnPause('E');
   return 0;
}

// Function Definitions - in alphabetical order
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

void fnPopArr(Person arr[]) { // Population of array hardcoded for the purposes of the task. Scanf("%*",arr[i].strName.arrTitle); in a loop for user input. With suitable prompts for user.

   strcpy(arr[0].strName.arrTitle, "Mr");
   strcpy(arr[0].strName.arrFirstName, "David");
   strcpy(arr[0].strName.arrMiddleName, "Dennis");
   strcpy(arr[0].strName.arrFamilyName, "Hodgekiss");
   arr[0].strDOB.nDay = 4;
   arr[0].strDOB.nMonth = 8;
   arr[0].strDOB.nYear = 1954;
   strcpy(arr[0].arrJobTitle, "Senior Lecturer");
   arr[0].strStartDate.nDay = 1;
   arr[0].strStartDate.nMonth = 9;
   arr[0].strStartDate.nYear = 2001;
   arr[0].nEmployeeNo = 003;
   arr[0].strStartTime.nHour = 8;
   arr[0].strStartTime.nMin = 00;
   arr[0].strStartTime.nSecs = 00;

   strcpy(arr[1].strName.arrTitle, "Mr");
   strcpy(arr[1].strName.arrFirstName, "James");
   strcpy(arr[1].strName.arrMiddleName, "Albert");
   strcpy(arr[1].strName.arrFamilyName, "McCarren");
   arr[1].strDOB.nDay = 6;
   arr[1].strDOB.nMonth = 6;
   arr[1].strDOB.nYear = 1902;
   strcpy(arr[1].arrJobTitle, "Senior Lecturer");
   arr[1].strStartDate.nDay = 9;
   arr[1].strStartDate.nMonth = 10;
   arr[1].strStartDate.nYear = 1987;
   arr[1].nEmployeeNo = 001;
   arr[1].strStartTime.nHour = 9;
   arr[1].strStartTime.nMin = 00;
   arr[1].strStartTime.nSecs = 00;

   strcpy(arr[2].strName.arrTitle, "Ms");
   strcpy(arr[2].strName.arrFirstName, "Rachael");
   strcpy(arr[2].strName.arrMiddleName, " ");
   strcpy(arr[2].strName.arrFamilyName, "Cornes");
   arr[2].strDOB.nDay = 1;
   arr[2].strDOB.nMonth = 1;
   arr[2].strDOB.nYear = 1990;
   strcpy(arr[2].arrJobTitle, "PT Tutor");
   arr[2].strStartDate.nDay = 6;
   arr[2].strStartDate.nMonth = 11;
   arr[2].strStartDate.nYear = 2012;
   arr[2].nEmployeeNo = 004;
   arr[2].strStartTime.nHour = 9;
   arr[2].strStartTime.nMin = 30;
   arr[2].strStartTime.nSecs = 10;

   strcpy(arr[3].strName.arrTitle, "Mrs");
   strcpy(arr[3].strName.arrFirstName, "Tracy");
   strcpy(arr[3].strName.arrMiddleName, "Anne");
   strcpy(arr[3].strName.arrFamilyName, "Lewis");
   arr[3].strDOB.nDay = 0;
   arr[3].strDOB.nMonth = 0;
   arr[3].strDOB.nYear = 0;
   strcpy(arr[3].arrJobTitle, "Head Of School");
   arr[3].strStartDate.nDay = 9;
   arr[3].strStartDate.nMonth = 9;
   arr[3].strStartDate.nYear = 1989;
   arr[3].nEmployeeNo = 002;
   arr[3].strStartTime.nHour = 9;
   arr[3].strStartTime.nMin = 00;
   arr[3].strStartTime.nSecs = 00;

   strcpy(arr[4].strName.arrTitle, "Professor");
   strcpy(arr[4].strName.arrFirstName, "Hastings");
   strcpy(arr[4].strName.arrMiddleName, " ");
   strcpy(arr[4].strName.arrFamilyName, "McKenzie");
   arr[4].strDOB.nDay = 6;
   arr[4].strDOB.nMonth = 6;
   arr[4].strDOB.nYear = 1961;
   strcpy(arr[4].arrJobTitle, "Faculty Dean");
   arr[4].strStartDate.nDay = 12;
   arr[4].strStartDate.nMonth = 12;
   arr[4].strStartDate.nYear = 2014;
   arr[4].nEmployeeNo = 005;
   arr[4].strStartTime.nHour = 11;
   arr[4].strStartTime.nMin = 30;
   arr[4].strStartTime.nSecs = 00;

}
void fnPrintPeople(Person arr[]) {//Printing 'Person' Structures From an array.
   int i = 0;
   for (i = 0; i < 5; i++) {
       printf("Person No %d\t", (i + 1));
       printf("Employee No : %d\n", arr[i].nEmployeeNo);
       printf("Name : %s %s %s %s\n", arr[i].strName.arrTitle, arr[i].strName.arrFirstName, arr[i].strName.arrMiddleName, arr[i].strName.arrFamilyName);
       printf("Position : %s\n", arr[i].arrJobTitle);
       printf("Date of birth is %.2d/%.2d/%d\n", arr[i].strDOB.nDay, arr[i].strDOB.nMonth, arr[i].strDOB.nYear);
       printf("Start date is %.2d/%.2d/%d\n", arr[i].strStartDate.nDay, arr[i].strStartDate.nMonth, arr[i].strStartDate.nYear);
       printf("Start time is %.2d:%.2d:%.2d\n\n\n", arr[i].strStartTime.nHour, arr[i].strStartTime.nMin, arr[i].strStartTime.nSecs);
       fnPause('c');
   }

}
void fnSortByEmpNo(Person arr[]) {// Sorting an array of 'Person' Structures by Employee number.
   Person temp;
   int i = 0;
   int j = 0;
   printf("\n\nEmployees sorted by Employee number:\n\n");
   for (i = 0; i < 5; i++)
   {
       for (j = (i + 1); j < 5; j++)
       {
           if (arr[i].nEmployeeNo > arr[j].nEmployeeNo)
           {
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }
   }
}
void fnSortAZ(Person arr[]) {// Function to sort Array into alphabetical order.
   int i = 0;
   int j = 1;
   Person temp;
   printf("\n\nEmployees sorted Alphabetically on Family name:\n\n\n");
   for (i = 1; i < 5; i++) {
       for (j = 1; j < 5; j++) {
           if (strcmp(arr[j - 1].strName.arrFamilyName, arr[j].strName.arrFamilyName) > 0) {
               temp = arr[j - 1];
               arr[j - 1] = arr[j];
               arr[j] = temp;
           }
       }
   }
}
