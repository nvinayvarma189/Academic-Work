 #include<stdio.h>
int main()
{
    int a = 12;
    *ptr = (int *)&a;
    printf("%d", *ptr);
    return 0;
}
