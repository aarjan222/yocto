include recipes-core/images/rpi-test-image.bb

DESCRIPTION = "Custom image for Greenhouse with additional features"
LICENSE = "MIT"

IMAGE_ROOTFS_EXTRA_SPACE = "3145728"
IMAGE_NAME = "greenhouse2"
IMAGE_FSTYPES ?= "wic.bz2"
IMAGE_FEATURES += "ssh-server-openssh package-management"

CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-core-buildessential \
    python3-pip git openssh \
    mosquitto mosquitto-clients \ 
    python3-paho-mqtt \
    opkg opkg-utils \
    aarjan mycapp \
"
# to prevent the cleanup of stale sstate objects:
# SSTATE_CLEANUP = "0"

# SSTATE_CLEANUP = "0"
# This disables the automatic cleanup of stale objects.

# qtbase qtwayland wayland \
# wayland = protocol, communication between a display server and its clients.
# weston = ref impl of a wayland compositor, that is a display server using wayland protoco
# minimal and fast compositor, suitable for many embedded and mobile use cases.

# IMAGE_INSTALL += "nmap apt htop"
# IMAGE_INSTALL += "procps sudo"
# opencv htop tree zsh pulseaudio dhcp
# usbutils python3.12 is already ins talled


# IMAGE_INSTALL="packagegroup-core-boot packagegroup-base-extended packagegroup-core-buildessential python3-pip git packagegroup-rpi-test"
# DISTRO_FEATURES="acl alsa bluetooth debuginfod ext2 ipv4 ipv6 pcmcia usbgadget usbhost wifi xattr nfs zeroconf pci 3g nfc x11 vfat seccomp
# opengl ptest multiarch wayland vulkan systemd usrmerge sysvinit pulseaudio gobject-introspection-data ldconfig"

# change ipk to rpm
# python3-boto maybe add meta-aws layer
# add own boot logo

# # Permissions
# IMAGE_INSTALL += "udev-rules"