# Fully annotated install of metasploitable 2 and kali linux VM on QEMU via virt-manager
> Setup performed on Gentoo Linux kernel v 7.2.12, be sure to check correct package names for your distribution.

### **Step 1: prerequisites**
Before we setup any sort of VM we are going to need our type 2 hypervisor and frontend which in this setup is going to be QEMU and virt-manager.
1. Check that Intel vmx or AMD svm is enabled and check if KVM is enabled.

> grep cpuinfo for vmx/svm
<img width="527" height="26" alt="image" src="https://github.com/user-attachments/assets/e63c4288-8a53-4400-aa59-9794ef3c0a63" />

> List /dev/kvm for KVM
<img width="527" height="38" alt="image" src="https://github.com/user-attachments/assets/6a77d71b-4bc6-44cb-892a-5fc748112134" />

2. Install the following packages:
```qemu libvirt bridge-utils virt-manager```

> Example for a Debian based system
<img width="888" height="61" alt="image" src="https://github.com/user-attachments/assets/59671912-2065-415a-8186-c69a7d5949f0" />
