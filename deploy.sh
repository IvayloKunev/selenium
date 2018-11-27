#!/bin/sh

container=$(docker ps --format "{{.Names}}")
echo $container


