SUMMARY = "This is a hello world recipes. Example of how to build an external Linux kernel module"
DESCRIPTION = "${SUMMARY}"
LICENSE = "CLOSED"

inherit module

SRC_URI = "file://Makefile \
           file://aarjan_driver.c \
           "

S = "${WORKDIR}"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

RPROVIDES:${PN} += "kernel-module-aarjan_driver"
