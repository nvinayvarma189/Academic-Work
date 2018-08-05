#!/bin/bash
i=1
while [ $i -le 10 ]
do 
	echo "$1 * $i = "`expr $1 \* $i`
	i=`expr $i + 1`
done
