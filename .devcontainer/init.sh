#!/bin/bash

export http_proxy=http://172.17.0.1:10810
export https_proxy=http://172.17.0.1:10810

curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install java 25.0.1-tem

rm -f init.sh