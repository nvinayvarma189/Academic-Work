#include<stdio.h>
int main()
{
	int i,ar[10],j,t,k;
	for(i=0;i<=9;i++){
		scanf("%d",&ar[i]);
		}
	for(i=0;i<=9;i++){
		printf("ar[%d]=%d\n",i,ar[i]);
		}
	i=0;
	j=1; 
	k=9;  
	while(k!=0)
	{	
		i=0;
		j=1;
		while(j<=k)
		{
		
			if(ar[i]>ar[j])
			{
				t=ar[j];
				ar[j]=ar[i];
				ar[i]=t;
			}
			i=i+1;
			j=j+1;
		}
		k=k-1;
	}
	printf("soortd array");
	for(i=0;i<=9;i++){
		printf("ar[%d]=%d\n",i,ar[i]);
		}
	return 0;
}
