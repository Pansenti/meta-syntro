SUMMARY = "Core libraries and applications for Syntro"
HOMEPAGE = "http://www.jumpnowtek.com"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

DEPENDS += "pkgconfig qtbase"

SRCREV = "541225abf5ceeb788ff6c13356a946daa3c9c175"
SRC_URI = "git://github.com/Pansenti/SyntroCore.git"

S = "${WORKDIR}/git"

require recipes-qt/qt5/qt5.inc

do_install() {
    export INSTALL_ROOT=${D}
    make install

    install -d ${D}${libdir}/pkgconfig/
    install -m 0644 ${S}/SyntroLib/syntro.pc ${D}${libdir}/pkgconfig/
}

FILES_${PN} = "${libdir} ${bindir}"
