#!/bin/bash
echo `basename "$0"`
echo $$
-m & echo $!
echo $?