#include<stdio.h>
	int main()
	{
		int arr[3] = {2, 3, 4};
		char *p;
		 p = arr;
		 p = (char*)((int*)(p));
		printf("%d, ", *p);
		p = (int*)(p+1);
		printf("%d", *p);
		 return 0;
	}
