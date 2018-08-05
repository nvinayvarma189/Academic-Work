#!/bin/bash
echo "Display nice process"
ps ax -o pid,ni,cmd,user
renice 14 $$
