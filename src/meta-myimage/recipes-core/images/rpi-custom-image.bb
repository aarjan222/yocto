include ../../../meta-raspberrypi/recipes-core/images/rpi-test-image.bb

DESCRIPTION = "Custom image for Greenhouse with additional features"
LICENSE = "MIT"

INHERIT += "rm_work"
ENABLE_UART = "1"
BB_NUMBER_THREADS = "9"
PARALLEL_MAKE = "-j 9"

# IMAGE_ROOTFS_EXTRA_SPACE = "2097152"
IMAGE_NAME = "rootfs0_v2"
# IMAGE_FSTYPES ?= "wic.bz2"
# IMAGE_FEATURES += "ssh-server-openssh package-management"
# CORE_IMAGE_EXTRA_INSTALL += "packagegroup-core-buildessential python3-pip git mosquitto mosquitto-clients openssh python3-paho-mqtt opkg opkg-utils sudo aarjan"
# Size in KB (2GB)

# DISTRO_FEATURES:append = " systemd usrmerge"
# DISTRO_FEATURES_BACKFILL_CONSIDERED += "sysvinit"
# VIRTUAL-RUNTIME_init_manager = "systemd"
# VIRTUAL-RUNTIME_initscripts = "systemd-compat-units"


# KERNEL_MODULE_AUTOLOAD += "aarjan_driver"

# to prevent the cleanup of stale sstate objects:
# SSTATE_CLEANUP = "0"

# IMAGE_INSTALL += "nmap util-linux sudo connman connman-client git-perltools apt htop"
# IMAGE_INSTALL += "procps sudo"
# IMAGE_INSTALL += "python3-pip git python3-paho-mqtt"
# opencv htop tree zsh pulseaudio dhcp
# usbutils python3.12 is already ins talled
# wpa-supplicant not necessary connman can do the thing


# SSTATE_CLEANUP = "0"
# This disables the automatic cleanup of stale objects.

# add own linux-driver module
# startup-script build-essential wasnot found


# kernel looks for any device needing this driver and then insert this module
# driver is in the image, but to insert it in the kernel, 

# -------------------------debug-------------------------------------------------------------

# IMAGE_INSTALL="packagegroup-core-boot packagegroup-base-extended packagegroup-core-buildessential python3-pip git packagegroup-rpi-test"
# DISTRO_FEATURES="acl alsa bluetooth debuginfod ext2 ipv4 ipv6 pcmcia usbgadget usbhost wifi xattr nfs zeroconf pci 3g nfc x11 vfat seccomp
# opengl ptest multiarch wayland vulkan systemd usrmerge sysvinit pulseaudio gobject-introspection-data ldconfig"

# Added
# add your own Linux driver #lsmod
# change rootfs to 2GB only
# change ipk to rpm(not recommended)

# To Add
# python3-boto maybe add meta-aws layer
# add own boot logo

# Remove old builds
# RM_OLD_IMAGE = "1"

# # Permissions
# IMAGE_INSTALL += "\
# udev-rules \
# "