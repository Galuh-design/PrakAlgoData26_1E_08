<img width="315" height="386" alt="image" src="https://github.com/user-attachments/assets/0b7a2c52-b5a3-4a18-bf16-a21df2a48a53" /># Laporan Praktikum Algoritma dan Struktur Data Jobsheet 12 Double Linked List

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
