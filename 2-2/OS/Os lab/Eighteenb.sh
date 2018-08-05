#!/bin/sh
clear
i=0
echo "The arguments are: "
for arg in $@
do
	echo "$arg "
	i=`expr $i + 1`
done
echo "The number of arguments are: $i"