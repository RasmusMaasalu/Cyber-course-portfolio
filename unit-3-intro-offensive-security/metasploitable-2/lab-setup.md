# Fully annotated install of metasploitable 2 and kali linux VM on QEMU via virt-manager
> Setup performed on Gentoo Linux kernel v 7.2.12, be sure to check correct package names for your distribution.

## **Step 1: prerequisites**
### Before we setup any sort of VM we are going to need our type 2 hypervisor and frontend which in this setup is going to be QEMU and virt-manager.
**1. Check that Intel vmx or AMD svm is enabled and check if KVM is enabled.**

> grep cpuinfo for vmx/svm
<img width="527" height="26" alt="image" src="https://github.com/user-attachments/assets/e63c4288-8a53-4400-aa59-9794ef3c0a63" />


> List /dev/kvm for KVM
<img width="527" height="38" alt="image" src="https://github.com/user-attachments/assets/6a77d71b-4bc6-44cb-892a-5fc748112134" />


&nbsp;
**2. Install the following packages:**
```qemu libvirt bridge-utils virt-manager```

> Example for a Debian based system

<img width="888" height="61" alt="image" src="https://github.com/user-attachments/assets/59671912-2065-415a-8186-c69a7d5949f0" />

&nbsp;

> On a Gentoo based system
<img width="609" height="20" alt="image" src="https://github.com/user-attachments/assets/c688a42e-ad86-4790-84d4-3ab04488ed82" />

&nbsp;

**3. Add user to required groups**

<img width="304" height="111" alt="image" src="https://github.com/user-attachments/assets/364c39ec-e8c8-4e07-8590-4a631fd538eb" />

&nbsp;

**4. Initialize libvirt daemon**
> Please note that Libvirt version 9.3.0 has swapped to a modular daemon architecture. Older versions use a singular monolithic daemon.

<img width="466" height="213" alt="image" src="https://github.com/user-attachments/assets/c061592c-c6ee-4caa-a04a-acc235abb979" />

&nbsp;

> Legacy libvirt monolithic daemon

<img width="419" height="41" alt="image" src="https://github.com/user-attachments/assets/c7f340e1-fcb6-40ed-88b0-abc24aa4f291" />


&nbsp;

### If everything is setup correctly when you open virt-manager it should look like this.

&nbsp;
<img width="927" height="654" alt="image" src="https://github.com/user-attachments/assets/ceec3566-16b6-4507-a62c-9e501a4fb2fd" />


&nbsp;
## **Step 2: Importing Metasploitable 2 and Kali Linux**
### Now that we have QEMU installed and working we are going to go over importing the official Kali linux VM and converting metasploitable 2 to qcow format.

### **1. Downloading the official qcow image for Kali linux**

> Kali linux qemu qcow image
<img width="329" height="332" alt="image" src="https://github.com/user-attachments/assets/f339638b-687d-4001-b314-4ed7bd188d6e" />


&nbsp;
**2. Import the Kali linux image inside virt-manager**

> Inside virt-manager click the + icon and import existing image.
<img width="930" height="652" alt="image" src="https://github.com/user-attachments/assets/51634717-a4b5-4c26-83ba-6ce4beef436c" />


&nbsp;
> Point to the location of your qcow file and set target operating system to generic linux 2024.
<img width="930" height="652" alt="image" src="https://github.com/user-attachments/assets/ccdfd973-89f4-455c-b15e-1042c9488023" />


&nbsp;
> Name your VM and set "Customize configuration before install" to true.
<img width="930" height="652" alt="image" src="https://github.com/user-attachments/assets/de25cf27-15c6-43c4-be84-340b81d10665" />


&nbsp;
**3. Additional configuration before install**
> Inside the configuration menu click on add hardware and under the network tab add the following device and device name.
<img width="1278" height="869" alt="image" src="https://github.com/user-attachments/assets/7c4238e8-ff32-46fd-bfd7-f41095c555b4" />


&nbsp;
> After applying settings begin the installation, login, and open the terminal to run ifconfig and it should show two devices.
<img width="1278" height="869" alt="image" src="https://github.com/user-attachments/assets/89fea850-0c72-413c-b831-88a9267669ac" />

&nbsp; &nbsp; &nbsp; 
### **4. Downloading Metasploitable 2 VM image**

> Metasploitable 2 image
<img width="396" height="287" alt="image" src="https://github.com/user-attachments/assets/feeb8ff9-0c7e-4492-be5c-3b9ae13a23e1" />

&nbsp;
**5. Converting Metasploitable.vmdk to Metasploitable.qcow**
> QEMU comes with its own image conversion tool. In the terminal run the following command.
<img width="695" height="23" alt="image" src="https://github.com/user-attachments/assets/d36c30cf-4e75-4a7b-8685-6e40d1518f26" />

**6. Import the converted Metasploitable 2 image**
> Now that the image is in qcow format we can import it the same way.
<img width="929" height="658" alt="image" src="https://github.com/user-attachments/assets/5209a6c4-11ff-4454-a612-0f0ce337baaa" />

&nbsp;
> Point to the converted image and set target operating system to generic linux 2024.
<img width="929" height="658" alt="image" src="https://github.com/user-attachments/assets/d71558ae-6ab2-447e-b9d7-25a5d356a50e" />


&nbsp;  
> Adjust the memory and cpu core allocation.
<img width="928" height="653" alt="image" src="https://github.com/user-attachments/assets/fd5c7974-0b8a-4ff2-9c88-83a252ff24a0" />

&nbsp; 
> Rename the VM and set "Customize configuration before install" to true, and we can also add our bridge device here.
<img width="928" height="653" alt="image" src="https://github.com/user-attachments/assets/2b827236-f890-4f05-b19b-a8dc8522213d" />

&nbsp; 
**3. Additional configuration before install**
> Inside the configuration menu we must change the chipset to i440fx this is necessary for our bridge device driver.
<img width="617" height="433" alt="image" src="https://github.com/user-attachments/assets/11f313a8-798e-4f00-9249-e7fb16cfd27f" />

&nbsp;
> Change the bridge device model to "rtl8139".
<img width="412" height="278" alt="image" src="https://github.com/user-attachments/assets/cf34df32-ef55-42c8-8374-4a10ebab97ac" />

&nbsp;
>  After applying settings begin the installation, login, and run ifconfig and it should show a single network device.
<img width="1286" height="872" alt="image" src="https://github.com/user-attachments/assets/4866eb5b-40a4-4d00-9668-f24450959779" />

&nbsp;
**7. Test ping from Kali machine to metasploitable machine**
> Inside Kali ping the ip of your Metasploitable VM.
<img width="1286" height="872" alt="image" src="https://github.com/user-attachments/assets/487aa433-89a7-4456-a2b5-f9739d638274" />


