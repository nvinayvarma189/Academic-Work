#!/bin/sh
clear
#!/bin/bash
if [ $# -eq 0 ]
then
	echo "No arguments"
	exit 1
fi
file=$1
echo "Number of spaces : $(grep -o ' ' $file | wc -l )"