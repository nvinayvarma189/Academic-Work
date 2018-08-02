#include<stdio.h>
int main()
{
	int i,j,a[10][10],m,n,b[20],t,p,k,s,d;
	printf("enter no of rows");
	scanf("%d",&m);
	printf("enter no of columns");
	scanf("%d",&n);
	s=m*n;
      	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			scanf("%d",&a[i][j]);
		}
	}
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("\t%d\t",a[i][j]);
		}
		printf("\n");
	}
	j=0;
	i=0;
	t=0;
	d=1;
        p=n;
	k=m;    
	while((d<k)||(t<p))
	{                                                                                                  
	 while(j<p)
	{
		printf("%d ",a[i][j]);
		j=j+1;
	}
	j=j-1;
	i=i+1;
	while(i<k)
	{
		printf("%d ",a[i][j]);
		i=i+1;
	}
	i=i-1;
	j=j-1;
	while(j>=t)
	{
	printf("%d ",a[i][j]);
	j=j-1;
	}
	j=j+1;
	i=i-1;
	while(i>=d)
	{
		printf("%d ",a[i][j]);
		i=i-1;	
	}
	i=i+1;
	j=j+1;
	p=p-1;
	k=k-1;
	t=t+1;
	d=d+1;
	}
	return 0;
}
