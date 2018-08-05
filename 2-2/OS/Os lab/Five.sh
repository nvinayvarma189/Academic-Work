#!/bin/bash
echo "enter the number to check whether prime or not"
read n
i=$n
j=1
c=0
	while [ $j -le $i ]
	do
		k=`expr $i % $j`
		if [ $k = 0 ]
		then
		c=`expr $c + 1`
		fi
		j=`expr $j + 1`
	done
	if [ $c -le 2 ]
	then
		echo "$n is a prime number"
	else
		echo "$n is not a prime number"
	fi
