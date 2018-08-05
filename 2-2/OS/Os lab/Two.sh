#!/bin/bash
echo "enter the first number"
read m
echo "enter the second number"
read n
echo -e "enter the operation\nA.addition\nS.subtractio\nM.multiplication\nQ.quotient\nR.remainder"
read operation
if [ $operation = "a" ]
then
	a=`expr $m + $n`
	echo "The addition is "$a
elif [ $operation = "s" ]
then
	s=`expr $m - $n`
	echo "The substraction is "$s
elif [ $operation = "m" ]
then
	m=`expr $m \* $n`
	echo "The multiplication is "$m
elif [ $operation = "q" ]
then
	q=`expr $m / $n`
	echo "The quotient is "$q
elif [ $operation = "r" ]
then
	r=`expr $m % $n`
	echo "The remainder is is "$r
fi
