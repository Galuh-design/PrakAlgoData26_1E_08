# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 10 QUEUE

<h4>Nama : Galuh Pramudya Ananta<h4>
<h4>NIM : 254107020127<h4>
<h4>Kelas : TI-1E<h4>



## Praktikum 1 Operasi Dasar Queue
Code program Queue08:
###
<img width="546" height="700" alt="image" src="https://github.com/user-attachments/assets/d78d5945-0570-4299-9ade-66d837e1d2ba" />

###
<img width="606" height="657" alt="image" src="https://github.com/user-attachments/assets/f5db2c1e-263f-4030-b824-914b67d1bace" />

###
<img width="214" height="86" alt="image" src="https://github.com/user-attachments/assets/0220f4ec-c700-4379-83fd-46796c20ac8b" />

###
Code program QueueMain08:

###
<img width="621" height="683" alt="image" src="https://github.com/user-attachments/assets/0c4d9fbf-bcd5-4dc9-acf8-656468500647" />

###
<img width="329" height="120" alt="image" src="https://github.com/user-attachments/assets/ee021539-194e-4813-b27d-6a7e7dd5f7ff" />

###
Output:

###
<img width="441" height="714" alt="image" src="https://github.com/user-attachments/assets/2efd8698-d880-413a-945e-7fe7971b9028" />

### Pertanyaan praktikum 1
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size
bernilai 0?
#### jawab:
nilai awal atribut front dan rear bernilai -1 karena sebagai penanda Queue sedang dalam keadaan kosong / tidak memilih index manapun,
size bernilai 0 dikarenakan belum ada elemen yang tersimpan pada Queue.

###
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!

<img width="341" height="93" alt="image" src="https://github.com/user-attachments/assets/bbf2e6a8-e051-4926-9f22-a0fd6457b105" />

#### jawab:
untuk mengembalikan rear ke indeks 0 bila rear mencapai batas maks namun size belum mencapai nilai maks / belum penuh agar dapat menggunakan ruang tersebut.

###
3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!

<img width="421" height="80" alt="image" src="https://github.com/user-attachments/assets/611141e6-54c4-4964-b3f9-31600f3aabcf" />


#### jawab:
untuk mengembalikan front ke indeks 0 setelah mengambil data di indeks terakhir agar dapat mengakses elemen berikutnya.

###
4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0),
melainkan int i=front?

#### jawab:
Looping tidak selalu mulai dari indeks ke-0 karena front tidak selalu berada di indeks ke-0

###
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!

<img width="216" height="54" alt="image" src="https://github.com/user-attachments/assets/eb13e06f-7276-49bd-8262-917ae31b633b" />

#### jawab:
i+1 digunakan agar i bergeser ke elemen selanjutnya, sedangkan modulo %max agar i kembali ke 0 saat i sudah mencapai indeks terakhir sehingga queue dapat terus beroperasi selama jumlah elemen / size tidak melebihi max.

###
6. Tunjukkan potongan kode program yang merupakan queue overflow!

#### jawab:

<img width="374" height="111" alt="image" src="https://github.com/user-attachments/assets/67ac49eb-8441-4944-add9-53791a747de1" />

###
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi
queue overflow dan queue underflow, program dihentikan!

#### jawab:

###
Modifikasi Code program Queue08:
<img width="496" height="305" alt="image" src="https://github.com/user-attachments/assets/9f357b67-b4eb-4625-83f3-ea322b921e50" />

###
<img width="379" height="646" alt="image" src="https://github.com/user-attachments/assets/77d797ae-bde0-4e50-8e4c-9ecb345ab299" />

###
Modifikasi Code program QueueMain08:
<img width="597" height="519" alt="image" src="https://github.com/user-attachments/assets/b1d13bc8-1a5b-418b-8888-3fdac08c9ed7" />

###
Output:
<img width="526" height="516" alt="image" src="https://github.com/user-attachments/assets/f50070cb-5df2-4d51-aa24-a6a580c2aab4" />


## Praktikum 2 Antrian Layanan Akademik

Code program Mahasiswa08:
###

<img width="759" height="569" alt="image" src="https://github.com/user-attachments/assets/dc446517-04da-40cf-85e5-5cac24b0197a" />

###

Code program AntrianLayanan08:
###

<img width="635" height="660" alt="image" src="https://github.com/user-attachments/assets/dc873f2b-84a1-4813-b6f3-971c26f48305" />

###

<img width="479" height="442" alt="image" src="https://github.com/user-attachments/assets/fe5f95e2-8b7f-4038-8e0d-efd21295a4a1" />

###

Code program LayananAkademikSIAKAD08:
###

<img width="425" height="739" alt="image" src="https://github.com/user-attachments/assets/ab39518c-295e-4a08-adf3-7df107c5d5c0" />

<img width="574" height="417" alt="image" src="https://github.com/user-attachments/assets/71d6dab0-23e3-4ed2-89d1-a44a5acdc3f3" />

###

Output:

<img width="420" height="641" alt="image" src="https://github.com/user-attachments/assets/6e3a02e7-1225-4f40-8b46-ff741310d681" />

###

<img width="354" height="544" alt="image" src="https://github.com/user-attachments/assets/7505c91f-d460-4432-b368-e369c9816b73" />

###

### Pertanyaan praktikum 2
1. Lakukan modifikasi program dengan menambahkan method baru bernama LihatAkhir pada class 
AntrianLayanan yang digunakan untuk mengecek antrian yang berada di posisi belakang. Tambahkan 
pula daftar menu 6. Cek Antrian paling belakang pada class LayananAkademikSIAKAD sehingga 
method LihatAkhir dapat dipanggil!

#### jawab:

Modifikasi Code program AntrianLayanan08:

###

<img width="370" height="177" alt="image" src="https://github.com/user-attachments/assets/d5ea3245-e7a0-4ca4-8688-e1eeb521a7ca" />


###

Modifikasi Code program LayananAkademikSIAKAD08:

###

<img width="238" height="83" alt="image" src="https://github.com/user-attachments/assets/ba82afd4-86cd-4842-abff-c4aba3bce93a" />

###

Output:

###
<img width="416" height="534" alt="image" src="https://github.com/user-attachments/assets/adf084f0-559c-4654-8e63-11c420ecde1e" />

###

## Tugas Praktikum

### Diagram Class

Mahasiswa:

<img width="350" height="239" alt="image" src="https://github.com/user-attachments/assets/e526d26d-2bc1-4afe-8bb1-491b9c13430e" />

QueueKRS:

<img width="348" height="358" alt="image" src="https://github.com/user-attachments/assets/abe45bca-47bf-42c3-8608-7b9aba2e7f6a" />

###



