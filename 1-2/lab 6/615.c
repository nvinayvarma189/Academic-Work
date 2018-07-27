#include<stdio.h>
int main()
{
	int i,ar[10],j,t;
	for(i=0;i<=9;i++){
		scanf("%d",&ar[i]);
		}
	for(i=0;i<=9;i++){
		printf("ar[%d]=%d\n",i,ar[i]);
		}
	i=0;
	j=1;   
	for(i=0;i<10;i++)
	{
		for(j=i+1;j<10;j++)
		{
			if(ar[i]>ar[j])
			{
				t=ar[i];
				ar[i]=ar[j];
				ar[j]=t;
			}
		}
	}
	printf("soorted array");
	for(i=0;i<=9;i++){
		printf("ar[%d]=%d\n",i,ar[i]);
		}
	return 0;
}
