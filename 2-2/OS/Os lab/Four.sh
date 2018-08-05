#!/bin/bash
echo "enter the number of iterations of Fibonacci series are neededs"
read n
a=0
b=1
echo "Fibonacci Series:"
if [ $n -ge 1 ]
then
	echo $a
fi
if [ $n -ge 2 ]
then
	echo $b
fi
i=2
while [ $i -lt $n ]
do
	a=`expr $a + $b`
	echo $a
	i=`expr $i + 1`
	if [ $n -gt $i ]
	then
		b=`expr $a + $b`
		echo $b
		i=`expr $i + 1`
	fi
done
