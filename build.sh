#!/bin/zsh

set -e

plexilc TargetPanorama.ple
tplex --int-timepoints TargetPanorama.plx
javac -version
javac -cp ~/Repositories/TPlex/TPlex.jar -d bin src/**/*.java
