#!/bin/bash

if [ $# -ne 1 ]; then
    echo "Usage: $0 <directory>"
    exit 1
fi

DIR=$1

if [ ! -d "$DIR" ]; then
    echo "Error: Directory does not exist."
    exit 1
fi

echo "Disk usage for directories inside: $DIR"
echo "-------------------------------------"

du -sh "$DIR"/*/ 2>/dev/null
