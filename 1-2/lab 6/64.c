#include<stdio.h>
int main()
{
	int a[10],l,i,s,t,k;
	printf("Enter the elements\n");
	for(i=0;i<10;i++)
	{
	    scanf(" %d",&a[i]);
	}
	for(i=0;i<10;i++)
	{
	    printf(" %d",a[i]);
	}
	    printf("\n");
	l=a[0];
	for(i=1;i<10;i++)
	{
	    if (l>a[i])
		continue;
	    else
		 l=a[i];
	}
	printf("The largest element is %d\n",l);
	s=a[0];
	for(i=1;i<10;i++)
	{
	    if (s<a[i])
		continue;
	    else
		 s=a[i];
	}
	printf("The smallest element is %d\n",s);
        for(i=0;i<10;i++)
	{
	  if (a[i]==l)
	  {
	      t=a[i];
	      break;
	  }
	}
        for(k=0;k<10;k++)
	{
	  if (a[k]==s)
	  {
	      a[i]=a[k];
	      break;
	  }
	}
	a[k]=t;
	for(i=0;i<10;i++)
	{
	    printf(" %d",a[i]);
	}
	    printf("\n");
	return 0;
}
