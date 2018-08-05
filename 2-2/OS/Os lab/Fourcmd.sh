#!/bin/bash
a=0
b=1
echo "Fibonacci Series :"
if [ $1 -ge 1 ]
then
	echo $a
fi
if [ $1 -ge 2 ]
then
  echo $b
fi
i=2
while [ $i -lt $1 ]
do
	a=`expr $a + $b`
	echo $a
	i=`expr $i + 1`
	if [ $1 -gt $i ]
	then
		b=`expr $a + $b`
		echo $b
		i=`expr $i + 1`
	fi
done
