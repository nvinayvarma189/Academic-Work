#!/bin/bash
echo "Give length"
read l
echo "Give breadth"
read b
#echo "The area of the rectangle is `expr $l \* $b` "
a=`expr $l \* $b`
echo "The area of the rectangle is $a "
p=`expr 2 \* $(( $l + $b ))`
echo "The perimeter of the rectangle is $p "
echo "Give radius"
read r 
echo "The area of the circle is "
echo 3.14 \* $r \* $r | bc
echo "The perimeter of the circle is "
echo 3.14 \* 2 \* $r | bc