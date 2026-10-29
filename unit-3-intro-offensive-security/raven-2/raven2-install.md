### **1. Downloading Raven2 VM image**

> Raven2 image
<img width="461" height="131" alt="image" src="https://github.com/user-attachments/assets/c44c0429-1735-4370-a7a0-2ace86ea1b03" />


**3. Converting raven2-disk1.vmdk to raven2-disk1.qcow**
> Extract the .ova image
<img width="203" height="109" alt="image" src="https://github.com/user-attachments/assets/1aebd8d1-f956-4a00-8d5e-2ab38a1bccf3" />

> Use qemu-img to convert. In the terminal run the following command.
<img width="655" height="52" alt="image" src="https://github.com/user-attachments/assets/f0413e40-fc0d-4ca4-8525-548aa02256d0" />


> Now that the image is in qcow format we can import it the same way.
<img width="933" height="658" alt="image" src="https://github.com/user-attachments/assets/bb8d172f-404b-426d-86be-bc443504cf61" />


> Point to the converted image and set target operating system to generic linux 2024.
<img width="933" height="658" alt="image" src="https://github.com/user-attachments/assets/d71679b8-8f3d-4ad6-bf36-41ae97c1cb14" />


  
> Adjust the memory and cpu core allocation.
<img width="933" height="658" alt="image" src="https://github.com/user-attachments/assets/bb774373-8cbb-444c-9cfd-f88ffa80c8c5" />


> Rename the VM and set "Customize configuration before install" to true, and we can also add our bridge device here.
<img width="933" height="658" alt="image" src="https://github.com/user-attachments/assets/99cf29c5-96da-41eb-8a34-5886c96dbe9a" />

 
**3. Additional configuration before install**
> Inside the configuration menu we must change the chipset to i440fx this is necessary for our bridge device driver.
<img width="1283" height="871" alt="image" src="https://github.com/user-attachments/assets/445d605f-29e3-4f32-8283-2f81ac687811" />


> Change the bridge device model to "rtl8139".
<img width="1283" height="871" alt="image" src="https://github.com/user-attachments/assets/4d2f92b0-97d0-49a6-aa94-fdd194ce7164" />

