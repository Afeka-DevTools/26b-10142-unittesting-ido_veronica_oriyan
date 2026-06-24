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

for file in "$DIR"/*
do
    if [ -f "$file" ]; then
        lines=$(wc -l < "$file")
        words=$(wc -w < "$file")
        chars=$(wc -m < "$file")

        echo "File: $(basename "$file")"
        echo "Lines: $lines"
        echo "Words: $words"
        echo "Characters: $chars"
        echo "-------------------------"
    fi
done
