#!/bin/bash
ls
echo Enter the first filename
read f1
echo Enter the second filename
read f2
cat $f1  $f2 > t.txt
cat t.txt
