#!/bin/bash
echo "enter the number"
read n
i=1
while [ $i -le 10 ]
do 
	echo "$n * $i = "`expr $n \* $i`
	i=`expr $i + 1`
done