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

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!

<img width="421" height="80" alt="image" src="https://github.com/user-attachments/assets/611141e6-54c4-4964-b3f9-31600f3aabcf" />


#### jawab:
untuk mengembalikan front ke indeks 0 setelah mengambil data di indeks terakhir agar dapat mengakses elemen berikutnya.

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0),
melainkan int i=front?
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
6. Tunjukkan potongan kode program yang merupakan queue overflow!
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi
queue overflow dan queue underflow, program dihentikan!



