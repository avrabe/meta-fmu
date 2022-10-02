# Switch from soup to curl for compilation reasons.
# Remove the gpgme as it is currently not used.
PACKAGECONFIG:remove = "soup gpgme"
PACKAGECONFIG:append = " curl"

# Remove the dependency to bash. 
# Keep the bash-completion still be installed.
RDEPENDS:${PN}:remove = "bash"

# Switch to https to avoid proxy issues.
SRC_URI:remove = "gitsm://github.com/ostreedev/ostree;branch=main"
SRC_URI:append = " gitsm://github.com/ostreedev/ostree;branch=main;protocol=https"
