#!/bin/sh
clear
echo -n "Enter the file name : "
read file
echo "Number of spaces : $(grep -o ' ' $file | wc -l )"