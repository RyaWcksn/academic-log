#!/bin/bash
now=`date +"%m_%d_%Y"`
name="PRAMUDYA_ARYA_WICAKSANA"
npm="2242805"

mkdir build -p
file="$1"
filename="$(basename $file .md)"
echo $filename

pandoc -s $1 \
--filter pandoc-citeproc \
--from=markdown+tex_math_single_backslash+tex_math_dollars+raw_tex \
--to=latex \
--template "./assignment.tex" \
--highlight-style tango \
--metadata-file "$(pwd)/metadata.yaml" \
-o $(pwd)/build/${filename}-${name}-${npm}-${now}.pdf \
--pdf-engine=xelatex
