#!/bin/bash
echo "enter the number for which the multiplication table is needed"
read x
i=1
while [ $i -le 10 ]
do
	echo "$x * $i = "`expr $x \* $i`
	i=`expr $i + 1`
done
