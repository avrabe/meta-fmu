SUMMARY = "A minimal container image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
IMAGE_FSTYPES = "container"
inherit image
IMAGE_FEATURES = ""
IMAGE_LINGUAS = ""
NO_RECOMMENDATIONS = "1"
IMAGE_INSTALL = " \
 fmu-rs \
"
SYSTEMD_CONFIG = "${THISDIR}/files/container-fmu.service"

# Workaround /var/volatile for now
ROOTFS_POSTPROCESS_COMMAND += "rootfs_fixup_var_volatile ; "
rootfs_fixup_var_volatile () {
    bbnote "Copy  systemd service config ${SYSTEMD_CONFIG} at top of ${IMAGE_ROOTFS}/"
    cp ${SYSTEMD_CONFIG} "${IMAGE_ROOTFS}/systemd.service"

    install -m 1777 -d ${IMAGE_ROOTFS}/${localstatedir}/volatile/tmp
    install -m 755 -d ${IMAGE_ROOTFS}/${localstatedir}/volatile/log
}
