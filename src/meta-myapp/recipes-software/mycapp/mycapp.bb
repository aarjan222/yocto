SUMMARY = "This is a c program to demonstrate helloworld."
DESCRIPTION = "${SUMMARY}"
SECTION = "examples"
LICENSE = "CLOSED"

SRC_URI = "file://mycapp.c"
S = "${WORKDIR}"

do_compile(){
    ${CC} ${CFLAGS} mycapp.c -o mycapp ${LDFLAGS}
}

do_install(){
    install -d ${D}${bindir}
    install -m 0775 mycapp ${D}${bindir}/
}