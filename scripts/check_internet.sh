#!/bin/bash

echo "===== Internet Connection Check ====="
echo "Date: $(date)"
echo "Checking connection to the internet..."

ping -c 1 8.8.8.8 > /dev/null 2>&1

if [ $? -eq 0 ]; then
    echo "Status: Internet connection is available."
else
    echo "Status: No internet connection."
fi

echo "====================================="
