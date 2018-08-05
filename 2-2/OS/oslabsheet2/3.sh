#!/bin/bash

msg="Hi there"
echo $msg > mail.txt
echo "from:" $1 >> mail.txt
echo "to:" $2 >> mail.txt
echo "cc:" $3 >> mail.txt
echo "subject:" $4 >> mail.txt

cat mail.txt
