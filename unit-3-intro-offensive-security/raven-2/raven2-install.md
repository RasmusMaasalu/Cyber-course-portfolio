
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

