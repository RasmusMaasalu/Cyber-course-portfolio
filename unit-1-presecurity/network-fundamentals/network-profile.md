**Q1: What is your machine's IPv4 address and MAC address?**
Q1.1: For ip address i ran the command 'ip a' and received an address of '172.20.10.x' for my wireless network device

Q1.2: For mac address i ran the same command and received 'E8:65:38:21:86:xx' for the same device

**Q2: what is the difference between a private IP address and a public one?**
Q1.1: A Private ip address is an address assigned to devices in your local network typically given to your devices by a router or DHCP server. Private addresses are not visible on the public internet but this does not mean they are completely secure and still depend on additional hardening methods such as firewalls and NATs.

Q1.2: A Public ip address is assigned by your ISP and is a compilation of all addresses in your LAN. Public ip is visible on the public internet and can be traced down to your ISP and even geographical location.

**Q3: What is the difference between your IP address and your MAC address?**
Q3.1: An ip address is a network address that is assigned to your device either manually as a static address or automatically as a dynamic address meaning it can change. It operates at the Network layer of the OSI model.

Q3.2: A MAC address is a hardware address and identifier assigned to the physical network adapters of your device and cannot be changed. It operates at the data link layer of the OSI model.

**Q4: Your subnet mask is most likely 255.255.255.0, which is written as /24 in CIDR notation.**
- How many total addresses does a /24 contain?
/24 contains a total of 256 addresses

- How many of those are usable for devices (after subtracting the network and broadcast addresses)?
After subtracting network and broadcast you are left with 254 addresses

- If your IP is 192.168.1.37/24, what is the network address and what is the broadcast address?
The network address is 192.168.1.0 and broadcast address is 192.168.1.255

**Q5: What is your default gateway's IP address? Is it on the same subnet as your machine? (It should be — explain how you can tell.)**
My default gateway ip address is 172.20.10.1 and it exists on the same subnet which i was able to tell by its CIDR notation
 
**Q6: What was the average round-trip time to your gateway versus to 1.1.1.1? Why is one much faster than the other?**
The average trip to my gateway is around 20ms and the average trip to 1.1.1.1 is around 38ms. Its speed is dependant on distance and since gateway is much closer it is faster.

**Q7: Now try ping -c 4 example.com (or -n 4 on Windows). It worked using a name instead of an IP address. What service made that possible? (This leads into Part 3.)**
Pinging example.com works because it uses DNS (Domain Name System) to assign a name to its ip address.

**Q8: What DNS server(s) is your machine configured to use? Is it your gateway, a public resolver (like 1.1.1.1 or 8.8.8.8), or something else?**
My DNS is the same as my gateway address which is 172.20.10.1

 
**Q9: What IP address(es) did example.com resolve to? Run the lookup for two more sites you use. Do any of them return multiple IP addresses? Why might a large website have more than one?**
example.com output 4 addreses (2 ipv4 and 2 ipv6) other sites such as google.com return multiple addresses because it has several servers around the world.

**Q10: A security thought: DNS lookups are usually sent in cleartext. If someone could watch your network traffic, what could they learn about you just from your DNS queries — even if all the websites you visit use HTTPS?**
If someone was watching your traffic and checking your DNS queries they could tell which websites you are going to.

**Q11: How many hops did it take to reach example.com? What is the first hop (hint: you've seen it already in this exercise)?**

