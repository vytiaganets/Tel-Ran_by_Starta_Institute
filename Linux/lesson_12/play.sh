#!/bin/bash 
numbers=(1 2 3 4 5 6 7 8 9 10 11 12) 
random_index=$((RANDOM % ${#numbers[@]})) 
selected_number=${numbers[$random_index]} 
echo "Выбрано число: $selected_number" 