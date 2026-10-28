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

> Mount the root partition to /mnt and lets use debootstrap to bootstrap a full Debian trixie filesystem.

<img width="390" height="68" alt="image" src="https://github.com/user-attachments/assets/514f39a9-ced2-4a85-ba29-bdd93aeda97d" />

**2. Chrooting into our Debian rootfs**
> Before we Chroot we must bind the necessary directories and also copy over our host's DNS configuration.

<img width="529" height="136" alt="image" src="https://github.com/user-attachments/assets/6735e825-4364-4972-9bcc-d87908f70bb4" />

> Now lets chroot into our mounted rootfs with bash as our shell and lets call /etc/profile and export a basic shell prompt to show that we are in chroot.

<img width="595" height="73" alt="image" src="https://github.com/user-attachments/assets/e9fca377-f08b-491d-b54d-e51e70be6c58" />

> Running ls shows us that we are in the root of our new filesystem and we can even run apt update to confirm that is a Debian trixie system.

<img width="595" height="73" alt="image" src="https://github.com/user-attachments/assets/01377439-5554-486d-bac7-1b6829f37e69" />
