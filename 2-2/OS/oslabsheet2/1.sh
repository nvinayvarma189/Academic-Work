#!/bin/bash
echo "Enter the text you want to enter and enter '-1' to exit "
read t
while [ $t != '-1' ]
do
echo $t >>textq1.txt
read t
done
echo `wc -l textq1.txt`
