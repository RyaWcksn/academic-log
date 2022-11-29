# Protokol Jaringan

Author : Pramudya Arya Wicaksana
NIM : 2242805

## Perbedaan TCP/IP dan model OSI

TCP / IP dan OSI adalah dua model jaringan yang paling banyak digunakan untuk komunikasi. Ada
beberapa persamaan dan ketidaksamaan di antara mereka. Salah satu perbedaan utama adalah
bahwa OSI adalah model konseptual yang tidak praktis digunakan untuk komunikasi, sedangkan, TCP
/ IP digunakan untuk membangun koneksi dan berkomunikasi melalui jaringan.

Untuk TCP/IP merupakan server client digunakan untuk transmisi pertukaran data melalui jaringan internet sedangkan model OSI adalah model teoritis yang digunakan untuk sistem komputasi.

Dalam TCP/IP terdapat 5 layer dan 7 layer untuk OSI, TCP/IP dikembangkan oleh Departement of Defence sedangkan OSI dibuat oleh International Stadard Organization

Model TCP / IP dikembangkan sebelum Model OSI, dan karenanya, lapisan berbeda. Mengenai
diagram, terlihat jelas bahwa TCP / IP Model memiliki empat lapisan yaitu, Network Interface,
Internet, Transport dan Application Layer. Lapisan Aplikasi TCP / IP adalah kombinasi dari Sesi,
Presentasi dan Lapisan Aplikasi Model OSI.


## Definisi TCP/IP dan model OSI

TCP (Transmission Control Protocol) / IP (Internet Protocol) dikembangkan oleh agen proyek
Departemen Pertahanan (DoD). Tidak seperti Model OSI, itu terdiri dari empat lapisan, dengan
masing-masing memiliki protokolnya. Protokol Internet adalah seperangkat aturan yang didefinisikan
untuk komunikasi melalui jaringan. TCP / IP dianggap sebagai model protokol standar untuk jaringan.
TCP menangani pengiriman data dan alamat IP menangani.
TCP / IP suite adalah seperangkat protokol yang mencakup TCP, UDP, ARP, DNS, HTTP, ICMP, dll. Ini
kuat, fleksibel dan sebagian besar digunakan untuk menghubungkan komputer melalui internet.
Lapisan-lapisan, TCP / IP, telah adalah:

- Application Layer
Merupakan lapisan terakhir dalam arsitektur TCP/IP yang berfungsi mendefinisikan aplikasiaplikasi yang dijalankan pada jaringan. Contohnya : SMTP (Simple Mail Transfer Protocol)
untuk pengiriman e-mail, FTP (File Transfer Protocol) untuk transfer file, HTTP (Hyper Text
Transfer Protocol) untuk aplikasi web. Application layer bersedia menyediakan akses aplikasi
terhadap jaringan TCP/IP. Layer ini menangani high-level protocol, masalah representasi data,
dan dialog control yang memungkinkan terjadinya komunikasi antar aplikasi jaringan.

- Transport Layer
Adalah cara untuk melakukan pengiriman data host to host. Lapisan ini menjamin bahwa
informasi yang diterima pada sisi penerima adalah sama dengan informasi yang dikirimkan
pada pengirim. Fungsi dari transport layer adalah membuat komunikasi antar dua host. Layer
ini menyediakan layanan pengiriman dari sumber data menuju ke tujuan data dengan cara
membuat logical connection di antara keduanya. Selain itu juga bertugas memecah data dan
menyatukan kembali data yang diterima dari application layer ke dalam aliran data yang sama
antara sumber dan pengirim data.

- Internet Layer
Bertanggung jawab dalam proses pengiriman paket ke alamat yang tepat yang dilakukan oleh
ratusan aktivitas yang dilakukan oleh host pada jaringan internet. Oleh karenanya layer ini
memiliki peranan penting dalam komunikasi data internet dalam cakupan wilayah yang luas.
Elemen yang membantu proses komunikasi data pada layer ini diantaranya;
    1. IP (Internet Protocol), berfungsi untuk menyampaikan paket data ke alamat yang tepat.
    2. ARP (Address Resolution Protocol), digunakan untuk menentukan alamat Hardware dari
    host/komputer yang sama.
    3. ICMP (Internet Control Message Protocol) berfungsi untuk mengirimkan pesan dalam
    melaporkan kegagalan pengiriman data.

- Network Access Layer
Layer ini mengatur bagaimana hubungan dapat terjadi antara dua pihak yang berada pada
jaringan yang berbeda seperti Network Layer pada OSI. Fungsi dari network layer adalah untuk 
mendenisikan alamat-alamat IP serta melakukan deteksi dan koreksi kesalahan dari data yang
ditransmisikan

## Definisi model OSI

Model OSI (Open System Interconnect) diperkenalkan oleh ISO (International Standard Organization).
Ini bukan protokol tetapi model yang didasarkan pada konsep layering. Ini memiliki seperangkat
lapisan vertikal, masing-masing memiliki fungsi yang berbeda. Ini mengikuti pendekatan bottom-up
untuk mentransfer data. Ini kuat dan fleksibel, tetapi tidak nyata. Tujuh lapisan model adalah: 

- Aplication Layer
Sebagai antarmuka dengan aplikasi dengan fungsionalitas jaringan, mengatur bagaimana
aplikasi dapat mengakses jaringan, dan kemudian membuat pesan-pesan kesalahan. Protokol
yang berada dalam lapisan ini adalah HTTP, FTP, SMTP, dan NFS.

- Presentation Layer
Untuk mentranslasikan data yang hendak ditransmisikan oleh aplikasi ke dalam format yang
dapat ditransmisikan melalui jaringan. Protokol yang berada dalam level ini adalah perangkat
lunak redirektor (redirector software), seperti layanan Workstation (dalam Windows NT) dan
juga Network shell (semacam Virtual Network Computing (VNC) atau Remote Desktop
Protocol (RDP).

- Session Layer
Untuk mendefinisikan bagaimana koneksi dapat dimulai, dipelihara, atau diakhiri. Beberapa
protocol pada layer ini: NETBIOS: suatu session interface dan protocol, dikembangkan oleh
IBM, yang menyediakan layanan ke layer presentation dan layer application. NETBEUI,
(NETBIOS Extended User Interface), suatu pengembangan dari NETBIOS yang digunakan pada
produk Microsoft networking, seperti Windows NT dan LAN Manager. ADSP (AppleTalk Data
Stream Protocol). PAP (Printer Access Protocol), yang terdapat pada printer Postscript untuk
akses pada jaringan AppleTalk.

- Session Layer
Untuk mendefinisikan bagaimana koneksi dapat dimulai, dipelihara, atau diakhiri. Beberapa
protocol pada layer ini: NETBIOS: suatu session interface dan protocol, dikembangkan oleh
IBM, yang menyediakan layanan ke layer presentation dan layer application. NETBEUI,
(NETBIOS Extended User Interface), suatu pengembangan dari NETBIOS yang digunakan pada
produk Microsoft networking, seperti Windows NT dan LAN Manager. ADSP (AppleTalk Data
Stream Protocol). PAP (Printer Access Protocol), yang terdapat pada printer Postscript untuk
akses pada jaringan AppleTalk.

- Transport Layer
Untuk memecah data ke dalam paket-paket data serta memberikan nomor urut ke paketpaket tersebut sehingga dapat disusun kembali pada sisi tujuan setelah diterima. Selain itu,
pada level ini juga membuat sebuah tanda bahwa paket diterima dengan sukses
(acknowledgement), dan mentransmisikan ulang terhadap paket-paket yang hilang di tengah
jalan.
Layer transport data, menggunakan protocol seperti UDP dan TCP. Layer ini menyediakan
transfer yang reliable dan transparan antara kedua titik akhir, layer ini juga menyediakan
multiplexing, kendali aliran dan pemeriksaan error serta memperbaikinya.

- Network Layer
Untuk mendefinisikan alamat-alamat IP dan menyediakan fungsi routing sehingga paket dapat
dikirim keluar dari segment network lokal ke suatu tujuan yang berada pada suatu network
lain. Contoh protocol yang digunakan seperti IP

- Data-link layer
Untuk menentukan bagaimana bit-bit data dikelompokkan menjadi format yang disebut
sebagai frame. Selain itu, pada level ini terjadi koreksi kesalahan, flow control, pengalamatan
perangkat keras (seperti halnya Media Access Control Address (MAC Address), dan
menetukan bagaimana perangkat-perangkat jaringan seperti hub, bridge, repeater, dan
switch layer 2 beroperasi. Spesifikasi IEEE 802, membagi level ini menjadi dua level anak, yaitu 
lapisan Logical Link Control (LLC) dan lapisan Media Access Control (MAC). Fungsi LLC adalah
menyiapkan sebuah pentrasmisian kembali dari kegagalan paket ketika terindikasi. Sedangkan
fungsi lapisan MAC adalah mengkoordinasikan akses langsung terhadap lapisan fisik dengan
tergantung metode media access controlnya, seperti Carrier Sense Multiple Access with
Collision Detection (CSMA/CD), Carrier Sense Multiple Access with Collision Avoidance
(CSMA/CA).

- Physical Layer
Untuk mendefinisikan media transmisi jaringan, sinkronisasi bit, arsitektur jaringan (seperti
Ethernet), topologi jaringan dan pengabelan. Selain itu, level ini juga mendefinisikan
bagaimana Network Interface Card (NIC) dapat berinteraksi dengan media kabel atau radio.
Data biner dikodekan dalam bentuk yang dapat ditransmisi melalui media jaringan, sebagai
contoh kabel, transceiver dan konektor yang berkaitan dengan layer Physical. Peralatan
seperti repeater, hub dan network card berada pada layer ini

## Keuntungan OSI layer

- Dapat digunakan sebagai petunjuk dan referensi.
- Adanya kemudahan dalam melakukan perubahan dan troubleshooting dalam layer.
- Memiliki fleksibilitas dalam dukungan layanan jaringan.

## Keuntungan TCP/IP

TCP/IP bersifat open protocol standard sehingga bisa menghubungkan perangkat lunak dengan berbagai komputer. Protokol ini juga dapat digunakan untuk mengetahui jaringan TCP/IP lain, meskipun memiliki identitas berbeda.
