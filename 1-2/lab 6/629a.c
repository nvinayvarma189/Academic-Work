#include <stdio.h>
 
int size = 4;
int arr[size];
 
int main()
{
	if(arr[0])
		printf("Not Initialized to ZERO");
	else
		printf("initialized to ZERO");
	return 0;
}
