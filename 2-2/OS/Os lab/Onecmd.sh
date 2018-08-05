#!/bin/bash
a=`expr $1 \* $2`
echo "The area of the rectangle is $a "
p=`expr 2 \* $(( $1 + $2 ))`
echo "The perimeter of the rectangle is $p "
echo "The area of the circle is "
echo 3.14 \* $3 \* $3 | bc
echo "The perimeter of the circle is "
echo 3.14 \* 2 \* $3 | bc