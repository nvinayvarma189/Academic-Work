 #include<stdio.h>
	void fun(void *p);
	int i;
	int main()
	{
			void *vptr;
			vptr = &i;
			fun(vptr);
			return 0;
	}
	void fun(void *p)
	{
			int **q;
			q = (int**)&p;
			 printf("%d\n", **q);
	}
