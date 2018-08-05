#!/bin/bash
ls
echo "enter the file name to search in "
read file
echo "enter the word you are searching for"
read a
grep $a $file
