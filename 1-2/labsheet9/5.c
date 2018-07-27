#include<stdio.h>
void minmax(double *,int,double *,double *);
int main()
{
	int i,j,n;
	double a[10],min,max;
	printf("input a size: ");
	scanf("%d",&n);
	printf("enter array elements:");
	for(i=0;i<n;i++)\
	{
		scanf("%lf",&a[i]);
	}
	minmax(&a,n,&min,&max);
	printf(" minimum element =%lf \n maximum element= %lf \n",min,max);
	return 0;
}
void minmax(double *data,int len,double *retmin,double *retmax)
{
	int i,j;
	double t;
	for(i=0;i<len-1;i++)
	{
		for(j=i+1;j<len;j++)
		{
			if(*(data+i)>*(data+j))
			{
				t=*(data+i);
				*(data+i)=*(data+j);
				*(data+j)=t;
			}
		}
	}
	*retmin=*(data+0);
	*retmax=*(data+len-1);
}
