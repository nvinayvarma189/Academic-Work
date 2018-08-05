#!/bin/bash
gcd()
{
		m=0
		i=0
		if [ $1 -gt $2 ]
		then
				m=$2
			else
				m=$1
			fi
		i=$m
		while [ $i -ge 2 ]
		do
			a=`expr $1 % $i`
			b=`expr $2 % $i`
		if [ $a -eq 0 -a $b -eq 0 ]
			then
				echo "The GCD is $i"
				break
		fi
			i=`expr $i - 1`
		done
	}

gcd 5 10
