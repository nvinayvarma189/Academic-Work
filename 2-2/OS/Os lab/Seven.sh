#!/bin/bash
echo "enter the first number"
read i
echo "enter the second number"
read j
if ((i>j))
then
	num=$i
	den=$j
else
	num=$j
	den=$i
fi
r=`expr $num % $den`
while((r!=0))
do
	num=$den
	den=$r
	r=`expr $num % $den`
done
echo "The GCD is "$den
