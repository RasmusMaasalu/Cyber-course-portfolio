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
