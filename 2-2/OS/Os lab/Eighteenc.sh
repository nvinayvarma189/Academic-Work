#!/bin/sh
clear
i=0
until [ "$1" = "" ]
do
	i=`expr $i + 1`
	shift
done
echo $i