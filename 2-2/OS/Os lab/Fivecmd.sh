#!/bin/bash
i=$1
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
		echo "$1 is a prime number"
	else
		echo "$1 is not a prime number"
	fi
