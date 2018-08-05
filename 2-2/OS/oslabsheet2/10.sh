#!/bin/bash
#Recursive factorial function
factorial()
{
  local=$1
  if((local<=2));
  then
    echo $local
  else
    f=$((local -1))
    f=$(factorial $f)
    f=$((f*local))
    echo $f
  fi
}
read -p "Enter the number:" n
if((n==0)); then
echo 1
else
factorial $n
fi
