# **The art of chrooting.**
## **What is chroot? And how to utilize it.**
> Chroot (change root) is the method of changing the root directory for the current running process. Essentially, transferring you to the root of another filesystem whilst remaining isolated from the host root filesystem. Its very useful for Linux system recovery, diagnostics and system deployment.

## **Basic and practical usage of chroot**
> In this demonstration lets use chroot to pre-configure a Debian system ready for installation.

**1. Creating and mounting a virtual disk**
> Lets use dd to create a virtual disk.

<img width="580" height="100" alt="image" src="https://github.com/user-attachments/assets/47765eb1-e010-4ec6-8a55-f74261fd4ed7" />

> Create our partitions with fdisk.

<img width="782" height="566" alt="image" src="https://github.com/user-attachments/assets/943186f1-c8a1-4b86-bf03-89299165ef8c" />

> Mount it as a loop device with losetup.

<img width="478" height="157" alt="image" src="https://github.com/user-attachments/assets/e8d6bf35-1f74-498e-8f86-36522e9a9095" />

> Format our partitions with mkfs.

<img width="704" height="287" alt="image" src="https://github.com/user-attachments/assets/31da21e7-1196-476f-a361-51433ff13ff7" />

> Mount the root partition to /mnt and lets use debootstrap to bootstrap a full Debian trixie filesystem

<img width="390" height="68" alt="image" src="https://github.com/user-attachments/assets/514f39a9-ced2-4a85-ba29-bdd93aeda97d" />
