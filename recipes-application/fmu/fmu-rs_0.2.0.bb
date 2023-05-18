SUMMARY = "fmu-rs is a Rust implementation of FullMetalUpdate which handles update for the applications on a system on which it is running."
HOMEPAGE = "https://github.com/avrabe/fmu-rs.git"
LICENSE = "MIT"

inherit cargo cargo-update-recipe-crates

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

SRC_URI = "git://github.com/avrabe/fmu-rs;protocol=https;nobranch=1;branch=main"
include ${BPN}-crates.inc

S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""

include ${BPN}-srcrev.inc
PV:append = ".AUTOINC+{SRCPV}"
DEPENDS:append = " ostree openssl pkgconfig-native "

LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=02d4db7558574285518135e97c9d2f42 \
"
