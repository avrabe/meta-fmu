# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get fmu_rs could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/fmu_rs/0.2.0"
SRC_URI += "git://github.com/avrabe/fmu-rs;protocol=https;nobranch=1;branch=main"
SRCREV = "47b8b0881b7bcebf0025bffd0a88de82a8fe1f1e"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV:append = ".AUTOINC+47b8b0881b"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/ahash/0.7.6 \
    crate://crates.io/anyhow/1.0.42 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/base64/0.13.0 \
    crate://crates.io/base64/0.20.0 \
    crate://crates.io/bitflags/1.2.1 \
    crate://crates.io/block-buffer/0.9.0 \
    crate://crates.io/bumpalo/3.12.0 \
    crate://crates.io/bytes/1.0.1 \
    crate://crates.io/cc/1.0.69 \
    crate://crates.io/cfg-expr/0.11.0 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/clap/4.1.13 \
    crate://crates.io/clap_derive/4.1.12 \
    crate://crates.io/clap_lex/0.3.0 \
    crate://crates.io/core-foundation-sys/0.8.2 \
    crate://crates.io/core-foundation/0.9.1 \
    crate://crates.io/cpufeatures/0.1.5 \
    crate://crates.io/digest/0.9.0 \
    crate://crates.io/dlv-list/0.3.0 \
    crate://crates.io/encoding_rs/0.8.28 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.2.8 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/form_urlencoded/1.0.1 \
    crate://crates.io/fuchsia-cprng/0.1.1 \
    crate://crates.io/futures-channel/0.3.16 \
    crate://crates.io/futures-core/0.3.16 \
    crate://crates.io/futures-executor/0.3.16 \
    crate://crates.io/futures-io/0.3.16 \
    crate://crates.io/futures-macro/0.3.16 \
    crate://crates.io/futures-sink/0.3.16 \
    crate://crates.io/futures-task/0.3.16 \
    crate://crates.io/futures-util/0.3.16 \
    crate://crates.io/futures/0.3.16 \
    crate://crates.io/generic-array/0.14.4 \
    crate://crates.io/getrandom/0.2.3 \
    crate://crates.io/gio-sys/0.16.3 \
    crate://crates.io/gio/0.16.3 \
    crate://crates.io/glib-macros/0.16.3 \
    crate://crates.io/glib-sys/0.16.3 \
    crate://crates.io/glib/0.16.3 \
    crate://crates.io/gobject-sys/0.16.3 \
    crate://crates.io/h2/0.3.13 \
    crate://crates.io/hashbrown/0.11.2 \
    crate://crates.io/hawkbit/0.6.0 \
    crate://crates.io/heck/0.3.3 \
    crate://crates.io/heck/0.4.0 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hermit-abi/0.2.6 \
    crate://crates.io/hex/0.4.3 \
    crate://crates.io/http-body/0.4.3 \
    crate://crates.io/http/0.2.4 \
    crate://crates.io/httparse/1.7.1 \
    crate://crates.io/httpdate/1.0.1 \
    crate://crates.io/hyper-tls/0.5.0 \
    crate://crates.io/hyper/0.14.19 \
    crate://crates.io/idna/0.2.3 \
    crate://crates.io/indexmap/1.7.0 \
    crate://crates.io/io-lifetimes/1.0.4 \
    crate://crates.io/ipnet/2.3.1 \
    crate://crates.io/is-terminal/0.4.2 \
    crate://crates.io/itoa/0.4.7 \
    crate://crates.io/itoa/1.0.1 \
    crate://crates.io/js-sys/0.3.52 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.140 \
    crate://crates.io/linux-raw-sys/0.1.4 \
    crate://crates.io/lock_api/0.4.6 \
    crate://crates.io/log/0.4.14 \
    crate://crates.io/matches/0.1.8 \
    crate://crates.io/md-5/0.9.1 \
    crate://crates.io/memchr/2.4.0 \
    crate://crates.io/memoffset/0.7.1 \
    crate://crates.io/mime/0.3.16 \
    crate://crates.io/mio/0.8.5 \
    crate://crates.io/native-tls/0.2.7 \
    crate://crates.io/nix/0.26.2 \
    crate://crates.io/nu-ansi-term/0.46.0 \
    crate://crates.io/num_cpus/1.13.0 \
    crate://crates.io/once_cell/1.13.0 \
    crate://crates.io/opaque-debug/0.3.0 \
    crate://crates.io/openat/0.1.21 \
    crate://crates.io/openssl-macros/0.1.0 \
    crate://crates.io/openssl-probe/0.1.4 \
    crate://crates.io/openssl-sys/0.9.83 \
    crate://crates.io/openssl/0.10.48 \
    crate://crates.io/ordered-multimap/0.4.2 \
    crate://crates.io/os_str_bytes/6.0.0 \
    crate://crates.io/ostree-sys/0.12.0 \
    crate://crates.io/ostree/0.17.1 \
    crate://crates.io/overload/0.1.1 \
    crate://crates.io/parking_lot/0.12.0 \
    crate://crates.io/parking_lot_core/0.9.1 \
    crate://crates.io/percent-encoding/2.1.0 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.19 \
    crate://crates.io/ppv-lite86/0.2.10 \
    crate://crates.io/proc-macro-crate/1.0.0 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro-hack/0.5.19 \
    crate://crates.io/proc-macro-nested/0.1.7 \
    crate://crates.io/proc-macro2/1.0.53 \
    crate://crates.io/quote/1.0.26 \
    crate://crates.io/rand/0.4.6 \
    crate://crates.io/rand/0.8.4 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.3.1 \
    crate://crates.io/rand_core/0.4.2 \
    crate://crates.io/rand_core/0.6.3 \
    crate://crates.io/rand_hc/0.3.1 \
    crate://crates.io/rdrand/0.4.0 \
    crate://crates.io/redox_syscall/0.2.10 \
    crate://crates.io/remove_dir_all/0.5.3 \
    crate://crates.io/reqwest/0.11.4 \
    crate://crates.io/rust-ini/0.18.0 \
    crate://crates.io/rustbus/0.19.2 \
    crate://crates.io/rustbus_derive/0.5.0 \
    crate://crates.io/rustix/0.36.6 \
    crate://crates.io/ryu/1.0.5 \
    crate://crates.io/schannel/0.1.19 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/security-framework-sys/2.3.0 \
    crate://crates.io/security-framework/2.3.1 \
    crate://crates.io/serde/1.0.158 \
    crate://crates.io/serde_derive/1.0.158 \
    crate://crates.io/serde_json/1.0.94 \
    crate://crates.io/serde_urlencoded/0.7.0 \
    crate://crates.io/sha-1/0.9.7 \
    crate://crates.io/sha2/0.9.5 \
    crate://crates.io/sharded-slab/0.1.4 \
    crate://crates.io/signal-hook-registry/1.4.0 \
    crate://crates.io/slab/0.4.4 \
    crate://crates.io/smallvec/1.10.0 \
    crate://crates.io/socket2/0.4.4 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/strum/0.21.0 \
    crate://crates.io/strum_macros/0.21.1 \
    crate://crates.io/syn/1.0.107 \
    crate://crates.io/syn/2.0.8 \
    crate://crates.io/system-deps/6.0.3 \
    crate://crates.io/tempdir/0.3.7 \
    crate://crates.io/tempfile/3.2.0 \
    crate://crates.io/termcolor/1.1.2 \
    crate://crates.io/thiserror-impl/1.0.26 \
    crate://crates.io/thiserror/1.0.26 \
    crate://crates.io/thread_local/1.1.4 \
    crate://crates.io/tinyvec/1.3.1 \
    crate://crates.io/tinyvec_macros/0.1.0 \
    crate://crates.io/tokio-macros/1.7.0 \
    crate://crates.io/tokio-native-tls/0.3.0 \
    crate://crates.io/tokio-util/0.7.2 \
    crate://crates.io/tokio/1.26.0 \
    crate://crates.io/toml/0.5.8 \
    crate://crates.io/tower-service/0.3.1 \
    crate://crates.io/tracing-attributes/0.1.23 \
    crate://crates.io/tracing-core/0.1.30 \
    crate://crates.io/tracing-log/0.1.3 \
    crate://crates.io/tracing-subscriber/0.3.16 \
    crate://crates.io/tracing/0.1.37 \
    crate://crates.io/try-lock/0.2.3 \
    crate://crates.io/typenum/1.13.0 \
    crate://crates.io/unicode-bidi/0.3.5 \
    crate://crates.io/unicode-ident/1.0.4 \
    crate://crates.io/unicode-normalization/0.1.19 \
    crate://crates.io/unicode-segmentation/1.8.0 \
    crate://crates.io/url/2.2.2 \
    crate://crates.io/valuable/0.1.0 \
    crate://crates.io/vcpkg/0.2.15 \
    crate://crates.io/version-compare/0.1.0 \
    crate://crates.io/version_check/0.9.3 \
    crate://crates.io/want/0.3.0 \
    crate://crates.io/wasi/0.10.2+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.75 \
    crate://crates.io/wasm-bindgen-futures/0.4.25 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.75 \
    crate://crates.io/wasm-bindgen-macro/0.2.75 \
    crate://crates.io/wasm-bindgen-shared/0.2.75 \
    crate://crates.io/wasm-bindgen/0.2.75 \
    crate://crates.io/web-sys/0.3.52 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.32.0 \
    crate://crates.io/windows-sys/0.42.0 \
    crate://crates.io/windows-sys/0.45.0 \
    crate://crates.io/windows-targets/0.42.1 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.1 \
    crate://crates.io/windows_aarch64_msvc/0.32.0 \
    crate://crates.io/windows_aarch64_msvc/0.42.1 \
    crate://crates.io/windows_i686_gnu/0.32.0 \
    crate://crates.io/windows_i686_gnu/0.42.1 \
    crate://crates.io/windows_i686_msvc/0.32.0 \
    crate://crates.io/windows_i686_msvc/0.42.1 \
    crate://crates.io/windows_x86_64_gnu/0.32.0 \
    crate://crates.io/windows_x86_64_gnu/0.42.1 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.1 \
    crate://crates.io/windows_x86_64_msvc/0.32.0 \
    crate://crates.io/windows_x86_64_msvc/0.42.1 \
    crate://crates.io/winreg/0.7.0 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=02d4db7558574285518135e97c9d2f42 \
"

SUMMARY = "fmu-rs is a Rust implementation of FullMetalUpdate which handles update for the applications on a system on which it is running."
HOMEPAGE = "https://github.com/avrabe/fmu-rs.git"
LICENSE = "MIT"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include fmu_rs-${PV}.inc
include fmu_rs.inc
