#!/bin/bash

if [ $# -ne 2 ]; then
    echo "Usage: $0 <directory> <days>"
    exit 1
fi

DIR=$1
DAYS=$2

if [ ! -d "$DIR" ]; then
    echo "Error: Directory does not exist."
    exit 1
fi

echo "Deleting files older than $DAYS days from $DIR"

find "$DIR" -type f -mtime +"$DAYS" -print -delete

echo "Done."
