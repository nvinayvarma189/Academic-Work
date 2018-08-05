#!/bin/bash
if [ $1 -gt $2 ]
then
	num=$1
	den=$2
else
	num=$2
	den=$1
fi

r=`expr $num % $den`
while((r!=0))
do
	num=$den
	den=$r
	r=`expr $num % $den`
done
echo "The GCD is "$den
