#resuing existing core-image-minimal image 
require recipes-core/images/core-image-minimal.bb
# require is not used for bbclass files, used for recipes
# inherit is not used for bb files

IMAGE_INSTALL += "usbutils"