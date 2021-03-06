SUMMARY = "Syntro Linux only camera application"
HOMEPAGE = "http://www.jumpnowtek.com"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit pkgconfig

DEPENDS += "alsa-lib qtbase syntrocore"

SRCREV = "92713dcc432cd2f5dd399763528fafc3ada206db"
SRC_URI = "git://github.com/Pansenti/SyntroLCam.git"

S = "${WORKDIR}/git"

require recipes-qt/qt5/qt5.inc

do_install() {
        export INSTALL_ROOT=${D}
        make install
}

FILES_${PN} = "${bindir}"
