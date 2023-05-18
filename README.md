# meta-fmu

[![CI](https://github.com/avrabe/meta-fmu/actions/workflows/yocto.yml/badge.svg)](https://github.com/avrabe/meta-fmu/actions/workflows/yocto.yml)

meta-fmu provides a bitbake layer for the fmu_rs application.

## Prerequisites

The kas tool and the needed minimal packages for building with bitbake are needed. For Ubuntu 20.02 this would look like:

```bash
sudo apt-get update
sudo apt-get install -y python3-pip
sudo pip3 install kas
sudo apt-get install -y gawk wget git-core diffstat unzip texinfo gcc-multilib build-essential chrpath socat libsdl1.2-dev xterm zstd cpio lz4
```

## Building

To build the updater as container you can build it with:

```bash
kas build fmu-project.yml
```

To build the example

```bash
KAS_TARGET=hello-world kas build fmu-project.yml
```

## Manual pushing of the example image

```bash
sudo rm -rf 1
mkdir 1
ostree init --mode=archive --repo=1
sudo ostree --repo=1 commit            --tree=tar=build/tmp/deploy/images/qemuarm64/hello-world-qemuarm64.tar.bz2            --skip-if-unchanged            --branch=hello-world            --subject="Commit-id: hello-world"
sshpass -p root ostree-push --debug --repo 1 ssh://root@akoya:30022/ostree/repo hello-world
```
