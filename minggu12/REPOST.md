# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 12 Double Linked List

<h4>Nama : Galuh Pramudya Ananta<h4>
<h4>NIM : 254107020127<h4>
<h4>Kelas : TI-1E<h4>



## Praktikum 1  Operasi Penambahan pada Double Linked List

Code program Mahasiswa08 :
###

<img width="704" height="467" alt="image" src="https://github.com/user-attachments/assets/6de4ec12-121b-4967-a687-fd7b757892e1" />

###

Code program Node08 :
###

<img width="662" height="315" alt="image" src="https://github.com/user-attachments/assets/91dbec14-c388-4e10-adbd-97260e9158c0" />

###

Code program DoubleLinkedList08 :
###

<img width="396" height="710" alt="image" src="https://github.com/user-attachments/assets/8d3d3e43-ce00-4447-be3a-84ecfa2d2cdf" />

###

Code program DoubleLinkedListMain08 :
###

<img width="484" height="711" alt="image" src="https://github.com/user-attachments/assets/6cc91756-457c-4a96-8339-454374763226" />

###

Output :
###

<img width="438" height="630" alt="image" src="https://github.com/user-attachments/assets/5abd6054-b271-4739-88b4-5da1f95eeaa6" />

###


### Pertanyaan Praktikum 1

1.Jelaskan perbedaan struktur dan mekanisme traversal antara Single Linked List dan Double Linked List!
#### Jawab:
Perbedaan Single dan Double Linked List terletak pada pointer. Single hanya memiliki next / traversal searah sehingga traversal terbatas satu arah maju, sedangkan Double memiliki next dan prev / traversal dua arah sehingga traversal dapat maju maupun mundur.

2.Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Jelaskan fungsi masing-masing atribut tersebut pada proses traversal dan manipulasi node!
#### Jawab:

Atribut next berfungsi menunjuk ke node berikutnya untuk traversal maju, sedangkan prev menunjuk ke node sebelumnya untuk traversal mundur. masing masing atribut digunakan sebagai pointer untuk memanipulasi node sebelumnya maupun berikutnya.

3.Perhatikan konstruktor pada class DoubleLinkedList. Jelaskan fungsi konstruktor tersebut terhadap kondisi awal linked list!
#### Jawab:

fungsi konstruktor pada class Doublelinkedlist08 adalah untuk menginisialisasi linked list saat pertama kali dibuat dengan mengatur pointer head dan tail bernilai null untuk menandakan bahwa list masih kosong.

4.Perhatikan potongan kode berikut:
###

<img width="247" height="74" alt="image" src="https://github.com/user-attachments/assets/53841380-5fa1-4efd-a90e-d88ae031edd4" />

###
Mengapa head dan tail harus menunjuk node yang sama ketika linked list masih kosong?
#### Jawab:

penambahan data pertama kali menyebabkan node baru tersebut menjadi satu-satunya elemen di dalam list, sehingga node tersebut sekaligus bertindak sebagai head dan tail.

5.Modifikasi method print() agar menampilkan pesan "Linked List masih kosong" ketika tidak terdapat data pada linked list!
#### Jawab:
Code Program DoubleLinkedlist08:
###

<img width="693" height="199" alt="image" src="https://github.com/user-attachments/assets/ca1f4355-0b99-4fae-bbdc-b7d6c81c8caf" />

###

Output:
###

<img width="305" height="349" alt="image" src="https://github.com/user-attachments/assets/c15376f4-c54d-4e9d-a69f-c47d0634a5b9" />

###

6.Modifikasi kode program dengan menambahkan method printReverse() untuk
menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail
menuju head!
#### Jawab:

Modifikasi Code Program DoubleLinkedList08:
###

<img width="561" height="364" alt="image" src="https://github.com/user-attachments/assets/43af7522-020e-46b5-8be3-8bbaad8f6249" />

###

Modifikasi Code Program DoublelinkedlistMain08:
###

<img width="357" height="179" alt="image" src="https://github.com/user-attachments/assets/3b3e1e51-3b81-4769-9dd5-ffdf376f7923" />

###

###

<img width="315" height="386" alt="image" src="https://github.com/user-attachments/assets/6e37894d-d583-4052-9d85-4e2d629db124" />

###


Output:
###

<img width="258" height="492" alt="image" src="https://github.com/user-attachments/assets/f6a40f08-1c45-4a56-993b-c3c3d6f14993" />

###

## Praktikum 2  Operasi Penghapusan pada Double Linked List

Modifikasi Code Program DoubleLinkedList08:
###

<img width="483" height="465" alt="image" src="https://github.com/user-attachments/assets/48e21865-720a-48ff-91e1-c514330483a1" />

###

Output:
###

<img width="310" height="393" alt="image" src="https://github.com/user-attachments/assets/3af229f1-393b-48d5-b5b6-c9d2038d1743" />

###

### Pertanyaan Praktikum 2
1.Perhatikan potongan kode berikut pada method removeFirst():

<img width="169" height="42" alt="image" src="https://github.com/user-attachments/assets/081426f4-847e-4a35-9d85-d4ebdf5bbe51" />

Jelaskan fungsi masing-masing statement tersebut pada proses penghapusan node!

#### Jawab:
head = head.next; Berfungsi untuk memindahkan pointer head ke node berikutnya, membuat posisi node didepan bergeser menggantikan node awal.
###
head.prev = null; Berfungsi untuk memutuskan hubungan pointer prev pada node baru ke node lama yang dihapus. karena head posisi terdepan, maka previous dari head harus null.

2.Modifikasi method removeFirst() dan removeLast() agar program menampilkan data yang berhasil dihapus!

#### Jawab:
Modifikasi Code Program DoubleLinkedList08:
###

<img width="387" height="575" alt="image" src="https://github.com/user-attachments/assets/907093cc-24df-446e-80d8-dd7106ecf7cf" />

###

Output:
###

<img width="555" height="646" alt="image" src="https://github.com/user-attachments/assets/2308ec97-d9d8-458a-948b-ae1346026500" />

###

## Tugas Praktikum

Modifikasi Code Program DoubleLinkedList08:
###

<img width="541" height="489" alt="image" src="https://github.com/user-attachments/assets/281a61bf-9b03-4397-9000-9338aad01b04" />

###

###

<img width="477" height="537" alt="image" src="https://github.com/user-attachments/assets/af27edf1-80fc-4514-b9fc-bffe3cb9f998" />

###

###

<img width="492" height="448" alt="image" src="https://github.com/user-attachments/assets/67de3329-a92f-4cce-829a-da6f40a32244" />

###

###

<img width="498" height="637" alt="image" src="https://github.com/user-attachments/assets/8ec38668-72fe-40ba-a630-5058e772c46b" />

###

###

<img width="467" height="596" alt="image" src="https://github.com/user-attachments/assets/6c68baa0-732e-47b1-a19d-ed31555add5b" />

###

###

<img width="389" height="268" alt="image" src="https://github.com/user-attachments/assets/e250143c-d4ca-4ddc-8596-ea4f8b0d3e66" />

###

Modifikasi Code Program DoubleLinkedListMain08:
###

<img width="484" height="504" alt="image" src="https://github.com/user-attachments/assets/48629458-3a9a-423c-927c-855b33ea8afa" />

###

###

<img width="612" height="598" alt="image" src="https://github.com/user-attachments/assets/fc4c2e6f-d95e-49d0-a316-c59220135eb4" />

###

###

<img width="605" height="447" alt="image" src="https://github.com/user-attachments/assets/44491179-b9d5-41bd-b1c7-d87e9b4b4855" />

###

Output:
###

<img width="291" height="479" alt="image" src="https://github.com/user-attachments/assets/639ef6f6-5f82-4a60-8bad-4829ab7c4ade" />

###

###

<img width="182" height="704" alt="image" src="https://github.com/user-attachments/assets/d325ad3a-8538-4fbb-82d7-67a0cfb56ba9" />

###

###

<img width="184" height="662" alt="image" src="https://github.com/user-attachments/assets/93d44581-6774-4759-a9ea-ec61990bf11a" />

# Laporan Praktikum Algoritma dan Struktur Data : CM
Code Program CM02Pembeli08:
###

<img width="951" height="382" alt="image" src="https://github.com/user-attachments/assets/45160a9e-4e19-4f4d-9179-52f733b39ead" />

###

blueprint untuk objek pembeli

###

Code Program CM02Pesanan08:
###

<img width="1026" height="399" alt="image" src="https://github.com/user-attachments/assets/301d4dd7-f069-4c4c-b213-42d3cfb448b1" />

###

blueprint untuk objek pesanan
###

CodeProgram CM02Node08:
###

<img width="946" height="437" alt="image" src="https://github.com/user-attachments/assets/dbabc9de-2f14-4c52-995c-ebf9dafb966b" />

###

sebagai node, pointer

###
Code Program CM02DLL08:

###

<img width="717" height="653" alt="image" src="https://github.com/user-attachments/assets/e64b68e0-ceef-43be-9f2f-3dea0faa4e30" />

<img width="643" height="664" alt="image" src="https://github.com/user-attachments/assets/f4afb426-cd3f-4757-8eca-a47b5a03cd32" />

<img width="611" height="536" alt="image" src="https://github.com/user-attachments/assets/0d3cf53f-e999-482d-94cb-d648374d8374" />

###

Class pengoperasian doublelinkedlist
###

CodeProgram CM02Main08:
###

<img width="616" height="685" alt="image" src="https://github.com/user-attachments/assets/4c9a368b-8ff0-4936-973a-72d27a97a43a" />

###

class main

###

Output:
###

