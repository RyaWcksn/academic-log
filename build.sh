#!/bin/bash
now=`date +"%m_%d_%Y"`
name="PRAMUDYA_ARYA_WICAKSANA"
npm="2242805"

mkdir build -p
file="$1"
filename=$(echo "$file" | cut -f 1 -d '.')
pandoc $1 \
--filter pandoc-plot \
--from=markdown+tex_math_single_backslash+tex_math_dollars+raw_tex \
--to=latex \
--output=build/${filename}-${name}-${npm}-${now}.pdf \
--template "$HOME/Notes/campus/template.tex" \
--highlight-style tango \
--metadata-file "$HOME/Notes/campus/metadata.yaml" \
--pdf-engine=xelatex
