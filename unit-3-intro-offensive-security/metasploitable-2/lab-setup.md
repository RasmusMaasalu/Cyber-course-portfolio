# Fully annotated install of metasploitable 2 and kali linux VM on QEMU via virt-manager
> Setup performed on Gentoo Linux kernel v 7.2.12, be sure to check correct package names for your distribution.

## **Step 1: prerequisites**
### Before we setup any sort of VM we are going to need our type 2 hypervisor and frontend which in this setup is going to be QEMU and virt-manager.
**1. Check that Intel vmx or AMD svm is enabled and check if KVM is enabled.**

> grep cpuinfo for vmx/svm
<img width="527" height="26" alt="image" src="https://github.com/user-attachments/assets/e63c4288-8a53-4400-aa59-9794ef3c0a63" />


> List /dev/kvm for KVM
<img width="527" height="38" alt="image" src="https://github.com/user-attachments/assets/6a77d71b-4bc6-44cb-892a-5fc748112134" />


**2. Install the following packages:**
```qemu libvirt bridge-utils virt-manager```

> Example for a Debian based system
<img width="888" height="61" alt="image" src="https://github.com/user-attachments/assets/59671912-2065-415a-8186-c69a7d5949f0" />

> On a Gentoo based system
<img width="609" height="20" alt="image" src="https://github.com/user-attachments/assets/c688a42e-ad86-4790-84d4-3ab04488ed82" />

**3. Add user to required groups**

<img width="304" height="111" alt="image" src="https://github.com/user-attachments/assets/364c39ec-e8c8-4e07-8590-4a631fd538eb" />

**4. Initialize libvirt daemon**
> Please note that Libvirt version 9.3.0 has swapped to a modular daemon architecture. Older versions use a singular monolithic daemon.

<img width="466" height="213" alt="image" src="https://github.com/user-attachments/assets/c061592c-c6ee-4caa-a04a-acc235abb979" />

> Legacy libvirt monolithic daemon

<img width="419" height="41" alt="image" src="https://github.com/user-attachments/assets/c7f340e1-fcb6-40ed-88b0-abc24aa4f291" />

### If everything is setup correctly when you open virt-manager it should look like this.
<img width="927" height="654" alt="image" src="https://github.com/user-attachments/assets/ceec3566-16b6-4507-a62c-9e501a4fb2fd" />

## **Step 2: Importing Metasploitable 2 and Kali Linux**
### Now that we have QEMU installed and working we are going to go over importing the official Kali linux VM and converting metasploitable 2 to qcow format.

**1. Downloading and importing the official qcow image for Kali linux**

> Kali linux qemu qcow image
<img width="329" height="332" alt="image" src="https://github.com/user-attachments/assets/f339638b-687d-4001-b314-4ed7bd188d6e" />

> Inside virt-manager click the + icon and import existing image
<img width="930" height="652" alt="image" src="https://github.com/user-attachments/assets/51634717-a4b5-4c26-83ba-6ce4beef436c" />

> Point to the location of your qcow file and set target operating system to generic linux 2024
<img width="930" height="652" alt="image" src="https://github.com/user-attachments/assets/ccdfd973-89f4-455c-b15e-1042c9488023" />

> Name your VM and set "Customize configuration before install" to true
<img width="930" height="652" alt="image" src="https://github.com/user-attachments/assets/de25cf27-15c6-43c4-be84-340b81d10665" />




