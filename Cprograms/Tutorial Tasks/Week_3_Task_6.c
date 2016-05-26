/*	HCS 2015-16
 Standard Template for 'C' Programmes
 
 Programme Name:     Nick Martin
 Author Name:        Nick Martin
 Development Date:   4th February
 General Outline:	A programme that calculates and displays in a suitable tabular form the first 20 factorials.
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
    int nI = 0;
    int nJ = 0;
    unsigned long long int nNumfac = 1;
    
    
    // Code starts here ......
    printf("A Table of integers and their factorial values value 0 - 20.\n");
    printf("Value\t\tFactorial\n");
    for (nI = 1; nI <= 20; nI++){
        printf("Factorial of %d\t\t", nI);
        nNumfac = 1;
        for (nJ = 1; nJ <= nI ; nJ++){
            nNumfac = nNumfac * nJ;
            
            
            
        }printf("%lld\n",nNumfac);
        
    }
    return 0;
}


// Function Definitions - in alphabetical order