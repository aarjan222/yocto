# Yocto Build for Raspberry Pi 4 (64-bit)

This repository contains the configuration and setup files for building a custom Yocto Linux image for the Raspberry Pi 4 (64-bit) using the Yocto Project. 
<!-- The image includes essential tools and utilities, enabling SSH access, USB support, Python development, MQTT communication, and WiFi functionality. -->

<!-- ## Features
## Requirements -->
## Setup Instructions
```bash
git clone https://github.com/aarjan222/yocto.git
cd yocto
git submodule update --init --recursive
cd src/poky
source oe-init-build-env ../../rpi-build
bitbake rpi-test-image
