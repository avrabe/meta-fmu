PACKAGECONFIG:remove = "soup"
PACKAGECONFIG:append = " curl"
PACKAGECONFIG:remove = "gpgme"

SRC_URI:remove = "gitsm://github.com/ostreedev/ostree;branch=main"
SRC_URI:append = " gitsm://github.com/ostreedev/ostree;branch=main;protocol=https"
