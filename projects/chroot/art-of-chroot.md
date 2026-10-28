# **The art of chrooting.**
## **What is chroot? And how to utilize it.**
> Chroot (change root) is the method of changing the root directory for the current running process. Essentially, transferring you to the root of another filesystem whilst remaining isolated from the host root filesystem. Its very useful for Linux system recovery, diagnostics and system deployment.

## **How to perform a chroot.**
In this demonstration let's create a virtual Debian trixie filesystem that we can chroot into.

**1. Creating and mounting a virtual disk.**
> Use dd to create a virtual disk in a raw .img format.

<img width="580" height="100" alt="image" src="https://github.com/user-attachments/assets/47765eb1-e010-4ec6-8a55-f74261fd4ed7" />

> Create our EFI and root partitions with fdisk.

<img width="782" height="566" alt="image" src="https://github.com/user-attachments/assets/943186f1-c8a1-4b86-bf03-89299165ef8c" />

> Mount it as a loop device with losetup.

<img width="478" height="157" alt="image" src="https://github.com/user-attachments/assets/e8d6bf35-1f74-498e-8f86-36522e9a9095" />

> Format both our partitions with mkfs.

<img width="704" height="287" alt="image" src="https://github.com/user-attachments/assets/31da21e7-1196-476f-a361-51433ff13ff7" />

> Mount the root partition to /mnt and use debootstrap to bootstrap a full Debian trixie filesystem.

<img width="390" height="68" alt="image" src="https://github.com/user-attachments/assets/514f39a9-ced2-4a85-ba29-bdd93aeda97d" />

**2. Chrooting into our Debian rootfs**
> Before running the chroot command the following directories must be bound and the host's DNS configuration should also be copied over.

<img width="529" height="136" alt="image" src="https://github.com/user-attachments/assets/6735e825-4364-4972-9bcc-d87908f70bb4" />

> Now chroot into our mounted rootfs with bash as our shell, call /etc/profile and export a basic shell prompt to indicate the chroot environment.

<img width="595" height="73" alt="image" src="https://github.com/user-attachments/assets/e9fca377-f08b-491d-b54d-e51e70be6c58" />

> Running ls shows us that we are in the root of our new filesystem and we can even run apt update to confirm that is a Debian trixie system.

<img width="595" height="73" alt="image" src="https://github.com/user-attachments/assets/01377439-5554-486d-bac7-1b6829f37e69" />

## **Using the chroot environment to configure and deploy a functional system.**
> We have now chrooted into our Debian trixie filesystem. Let's go over an example use case of chroot by configuring and deploying our Debian system.

**1. Setting timezone data and system clock.**

> Note ```hwclock --systohc``` requires the package ```util-linux-extra```
<img width="740" height="53" alt="image" src="https://github.com/user-attachments/assets/51eacb02-275b-4446-a2e1-c5c09b380801" />

**2. Installing locales and setting hostname.**
> Our Debian system does not have any locales installed by default.
<img width="509" height="108" alt="image" src="https://github.com/user-attachments/assets/e1d62b96-8842-47e8-a6f9-c6fb71ca57d8" />

> Debian has its own tool ```dpkg-reconfigure locales``` for configuring locales.

> The user will be prompted with an ncurses style menu where you must select your locale and confirm.
<img width="764" height="514" alt="image" src="https://github.com/user-attachments/assets/321746be-910a-4221-a402-05875f2b99ea" />

> Set our hostname into /etc/hostname.
<img width="519" height="21" alt="image" src="https://github.com/user-attachments/assets/cc6eb714-09b8-4caa-9de0-e35601b0cf4a" />

**3. Installing the Linux kernel and bootloader.**
> The boot partition isn't mounted. Mount it to the EFI partition so that the kernel and bootloader can be installed.
<img width="442" height="18" alt="image" src="https://github.com/user-attachments/assets/ab2645da-1834-4bcb-92e2-87d23940652f" />

> Install the latest stable Debian kernel.
<img width="1265" height="125" alt="image" src="https://github.com/user-attachments/assets/36fcc594-cdde-4176-8398-ed8291fafa20" />

> Install grub for an amd64 UEFI system.
<img width="1057" height="170" alt="image" src="https://github.com/user-attachments/assets/7517ccd9-2248-4c15-b35e-40525aea33fa" />

> Use ```--removable``` as the system isn't booted on any UEFI firmware yet.
<img width="641" height="75" alt="image" src="https://github.com/user-attachments/assets/086a7045-f85d-4ff4-9a86-58a2ecce64b5" />

> Generate the grub config file
<img width="686" height="171" alt="image" src="https://github.com/user-attachments/assets/f4f0043a-7b66-4a6c-9e8e-05d62258662f" />

**4. Pre-boot setup.**
> The system is still missing it's /etc/fstab file, a non root user, and essential packages.

> List the UUID's of your block devices
<img width="915" height="89" alt="image" src="https://github.com/user-attachments/assets/a9b3592c-57fe-4ccb-bd44-014dd92d9ca2" />

> Create an fstab file either manually or use ```genfstab``` from the ```arch-install-scripts``` package.
<img width="1486" height="228" alt="image" src="https://github.com/user-attachments/assets/8b63593e-d446-4c03-ab1b-6794eed30a5b" />

> Install some basic packages.
<img width="502" height="108" alt="image" src="https://github.com/user-attachments/assets/97144aff-90cf-4ec5-9d7d-6329f4b6e75a" />

> Create a non root user.
<img width="483" height="86" alt="image" src="https://github.com/user-attachments/assets/5f8ba044-a36e-4ea1-b1ac-b0972081f8a3" />

**5. Exiting and booting**
> Exit the chroot environment and unmount /mnt recursively.
<img width="327" height="54" alt="image" src="https://github.com/user-attachments/assets/23b807ed-227c-40ab-ad52-00d69f1c57aa" />

> Inside virt-manager import the virtual disk and set target operating system to Debian 13.
<img width="933" height="654" alt="image" src="https://github.com/user-attachments/assets/4aba4f5a-2103-47fc-881d-0638067ddbee" />

> Set "customize configuration before install" to true.
<img width="933" height="654" alt="image" src="https://github.com/user-attachments/assets/9d8e2656-9ff5-4a79-b41f-e81683511e55" />

> Change firmware to "UEFI".
> Note if secureboot is enabled inside your virtualized firmware enter setup and uncheck "attempt secureboot"
<img width="1279" height="870" alt="image" src="https://github.com/user-attachments/assets/bc08ae35-3109-4ef5-9c56-341ee8aae97b" />

> Boot up the Debian machine and login as your non root user.
<img width="1281" height="872" alt="image" src="https://github.com/user-attachments/assets/caba2cbc-6b78-44e2-a6c4-ad1cce3a756a" />

## **Using chroot for system recovery.**
> In the previous demonstration we forgot to configure vital components of our system such as network and superuser privileges. Let's simulate the use of a Linux livecd and chroot for system recovery.

**1. Booting into a Linux livecd**
> Add a bootable livecd to your Debian machine.
<img width="1281" height="871" alt="image" src="https://github.com/user-attachments/assets/9b44518b-2287-4dab-bb17-bce9f5ee106f" />

> Set boot proper priority.
<img width="1281" height="871" alt="image" src="https://github.com/user-attachments/assets/1b704d5d-c278-4427-9244-f9985617c6e7" />

**2. Chroot helper script and system recovery**
> To prevent the hassle of manually binding directories. The previously mentioned ```arch-install-scripts``` comes with a helper script called ```arch-chroot```

> Install the helper script.
> <img width="1284" height="873" alt="image" src="https://github.com/user-attachments/assets/35e316e7-1f4f-47f2-91a9-d9ea67872722" />

> Mount the partitions to /mnt and /mnt/boot

> Note the identifiers for the drives have changed to /dev/vdaX
<img width="1284" height="873" alt="image" src="https://github.com/user-attachments/assets/bf76b6ef-6462-4152-8faa-95dad5f158a0" />

> Using ```arch-chroot``` chroot into the mounted filesystem

> Note that the previously copied DNS information is still present.
<img width="1284" height="873" alt="image" src="https://github.com/user-attachments/assets/f224df8a-579e-4d09-9f37-e26cdee835c5" />

> Add non root user to superuser group
<img width="1284" height="873" alt="image" src="https://github.com/user-attachments/assets/a1943f1b-e6ab-4868-85fe-ada2937f7891" />

> Install network-manager for simple network configuration.
<img width="1284" height="873" alt="image" src="https://github.com/user-attachments/assets/7858caca-5772-4c33-9685-ab24c1824dec" />

> Exit and reboot.

> Note Linux mint automatically unmounts any mounted block device.
<img width="1284" height="873" alt="image" src="https://github.com/user-attachments/assets/578a967e-54c0-4663-b111-2c1842bb8e9a" />

> Boot back into Debian and ensure everything is working.
<img width="1284" height="873" alt="image" src="https://github.com/user-attachments/assets/e483ed79-b8dd-49f3-a364-49caa048b025" />

## **Chroot usage summary.**
We have successfully used chroot to deploy a Debian trixie machine and even performed emergency system recovery via liveCD, and with the use of a helper script. Entering chroot removed all the hassle of mounting essential directories. 

Chroot has various other applications such as setting up minimal isolated Linux environments on your Host without using virtualization or containers like Docker or Podman.

Additionally QEMU provides an advanced method of chrooting called qemu-chroot which can allow an x86_64 host to have an isolated Linux system for alternative architectures such as ARM or RISC-V. This is commonly used for cross compiling software for non x86_64 processors. 
