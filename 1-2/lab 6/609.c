#include<stdio.h>
#include<stdlib.h>
int main()
{
	int i,ar[10],j,large,k,t;
	for(i=0;i<=9;i++){
	ar[i]=rand()%100;
	}
	for(i=0;i<=9;i++){
		printf("%d\n",ar[i]);
	}
	i=0;
	j=1;
	k=0;
	while(k<10)
	{
		while(j<10)
		{
			if(ar[i]>ar[j])
			{
				t=ar[i];
				ar[i]=ar[j];
				ar[j]=t;
			}
			i=j;
			j=j+1;	
			
		}
		i=0;
		j=1;
		k=k+1;
	}
		printf("soorted array\n");
		for(i=0;i<=9;i++){

		printf("%d\n",ar[i]);
	}
	return 0;
}
