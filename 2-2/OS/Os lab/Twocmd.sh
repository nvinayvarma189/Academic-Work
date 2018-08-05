#!/bin/bash
if [ $1 = "a" ]
then
	a=`expr $2 + $3`
	echo $a
elif [ $1 = "s" ]
then
	s=`expr $2 - $3`
	echo $s
elif [ $1 = "m" ]
then
	m=`expr $2 \* $3`
	echo $m
elif [ $1 = "q" ]
then
	q=`expr $2 / $3`
	echo $q
elif [ $1 = "r" ]
then
	r=`expr $2 % $3`
	echo $r
fi
