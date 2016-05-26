#pragma once
typedef struct strPerson
{
	char arcFirstName[50];
	char arcFamilyName[50];
	char arcRole[25];
	char arcUserName[6];
	char EmployeeNumber[5];
} Person;

struct strDataNode
{
	struct strPerson personData;
	struct strDataNode *ptrNext;
};