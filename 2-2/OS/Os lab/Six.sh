#!/bin/bash
echo "enter the limit to get prime numbers"
read n
i=$n
j=1
c=0
l=1
while [ $l -le $n ]
do
	i=$l
	c=0
	j=1
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
		echo $i
	fi
	l=`expr $l + 1`
done
