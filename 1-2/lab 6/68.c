#include<stdio.h>
#include<stdlib.h>
int main()
{
	int i,ar[10],j,large;
	for(i=0;i<=9;i++){
	ar[i]=rand()%100;
	}
	for(i=0;i<=9;i++){
		printf("%d\n",ar[i]);
	}
	i=0;
	large=ar[i];
	j=1;
	while(j<=9)
	{
		if(large<ar[j])
		{
			large=ar[j];
		}
		i=i+1;
		j=j+1;
	}
	printf("large  number is %d",large);
	return 0;
}
