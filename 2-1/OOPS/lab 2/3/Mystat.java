import java.util.Scanner;
 class My{
 static int i,count,modecount=0,m,mode=0;
static int n;
 static double j=0,avg,var,sd;

static  int []a=new int [50];
static  double []b=new double [50];
public static void mean(){
Scanner s=new Scanner(System.in);
System.out.println("enter the no of elements");
n=s.nextInt();
for(i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
	j=j+a[i];
}
avg=j/n;

System.out.println("average is "+avg);
}
public static void mode(){
for(i=0;i<n;i++)
{
 count=0;
 for(m=0;m<n;m++)
 {
  if(a[i]==a[m])
   count++;
 }
 if(count>modecount)
 {
  modecount=count;
  mode=a[i];
 }
}
System.out.println("mode is "+mode);
}
public static void standarddeviation(){
for(i=0;i<n;i++)
{
	b[i]=a[i]-avg;
}
j=0;
for(i=0;i<n;i++)
{
	b[i]=Math.pow(b[i],2);
	j=j+b[i];
}
sd=j/n;
System.out.println("standard deviation is"+sd);
}
public static void varience(){
var=Math.sqrt(sd);
System.out.println("varience is"+var);
}
}
