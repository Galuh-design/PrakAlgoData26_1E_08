# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 11 LINKED LIST

<h4>Nama : Galuh Pramudya Ananta<h4>
<h4>NIM : 254107020127<h4>
<h4>Kelas : TI-1E<h4>



## Praktikum 1  Pembuatan Single Linked List
Code program Mahasiswa08.java :
###

<img width="730" height="558" alt="image" src="https://github.com/user-attachments/assets/895af693-f624-45d8-b651-cf8f7eba44eb" />

###

Code program NodeMahasiswa08.java :

###

<img width="645" height="342" alt="image" src="https://github.com/user-attachments/assets/f9a3cc87-3c9c-4a86-a1d0-7cb972fd81fe" />

###

Code program SingleLinkedList08.java :

###

<img width="620" height="720" alt="image" src="https://github.com/user-attachments/assets/bb095266-6ef0-4497-95c9-e9d97d4be125" />

###

<img width="567" height="391" alt="image" src="https://github.com/user-attachments/assets/91d22630-e106-481f-81c6-b53a5e1251fa" />

###

Code program SLLMain08.java :

###

<img width="753" height="437" alt="image" src="https://github.com/user-attachments/assets/d00df60e-ab3e-49bc-bde7-78dd44d30731" />

###

Output:

###

<img width="470" height="268" alt="image" src="https://github.com/user-attachments/assets/511c741f-7d5d-476f-95ce-c7e93a4edff4" />


###

### Pertanyaan Praktikum 1

1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”? 

#### Jawab:
karena pada kode program SLLMain08 dilakukan print sebelum ditambahkan objek baru pada linked list, sehingga pada method print masuk pada kondisi isempty dikarenakan head = null / tidak ada data.

2. Jelaskan kegunaan variable temp secara umum pada setiap method! 

#### Jawab:
pada setiap method yang menggunakan temp, temp digunakan sebagai perantara head dikarenakan head tidak boleh berubah. temp berfungsi sebagai pointer head untuk mengecek tiap next dari linked list.

3. Lakukan modifikasi agar data dapat ditambahkan dari keyboard!

Modifikasi Code program SLLMain08.java :

###

<img width="471" height="622" alt="image" src="https://github.com/user-attachments/assets/5fb28d60-06b3-4957-b6d3-1953fb7b94ac" />

###

<img width="468" height="640" alt="image" src="https://github.com/user-attachments/assets/f2ac3d7c-6b66-44a6-9b13-41a85f43179a" />

###

Output:

###

<img width="347" height="587" alt="image" src="https://github.com/user-attachments/assets/7c8c6d05-5f68-4386-bb29-d02ba87cb694" />



###

<img width="319" height="373" alt="image" src="https://github.com/user-attachments/assets/4834ce9a-c38c-42b2-829b-20b1c055638b" />

###

## Praktikum 2  Modifikasi Elemen pada Single Linked List

Code program SingleLinkedList08.java :
###

<img width="475" height="666" alt="image" src="https://github.com/user-attachments/assets/e2f4e2a9-947d-4afd-971c-ed7e3f3d7a8c" />

###

<img width="594" height="537" alt="image" src="https://github.com/user-attachments/assets/9264b6b2-ce51-4955-9165-e6e9a1e42817" />

###

Code program SLLMain08.java :
###

<img width="698" height="510" alt="image" src="https://github.com/user-attachments/assets/78725cca-5111-4447-8ee4-4160b5c9464e" />

###

Output :
###

<img width="340" height="168" alt="image" src="https://github.com/user-attachments/assets/677e4e7a-f0ff-4d45-8975-8ca4cf3e4ce8" />

### Pertanyaan Praktikum 2

1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan! 

#### jawab:

break digunakan untuk menghentikan looping setelah kondisi data yang dicari sesuai dan berhasil dihapus.

2. Jelaskan kegunaan kode dibawah pada method remove

<img width="371" height="209" alt="image" src="https://github.com/user-attachments/assets/e1ddf8be-daea-40df-8f8f-c9bb11743cad" />

#### jawab:

temp.next = temp.next.next;
untuk menghapus rantai node dengan cara menimpa pointer next / node yang akan dihapus dengan  node selanjutnya (next.next).

if (temp.next == null) { tail = temp; }
Digunakan untuk kondisi jika node next yang dihapus adalah node terakhir. Saat temp.next == null true,
posisi tail diperbarui ke temp agar posisi tail berada pada node terakhir dan bukan null.

## Tugas

Code program MahasiswaTugas08.java :
###

<img width="891" height="400" alt="image" src="https://github.com/user-attachments/assets/ea50bb93-8a8e-42d3-a044-47f1d1efc98b" />

###

Code program QueueNode08.java :
###

<img width="821" height="303" alt="image" src="https://github.com/user-attachments/assets/0ef7ec6c-c24a-41e8-bb2c-0321d8ffedce" />

###

Code program QueueLinkedList08.java :
###

<img width="513" height="698" alt="image" src="https://github.com/user-attachments/assets/5a98c694-c165-47da-b7b8-7698c716ffad" />

###

<img width="386" height="316" alt="image" src="https://github.com/user-attachments/assets/1749cd3f-2578-470c-8ab9-90124d9f6450" />

###

Code program QueueDemo08.java :
###

<img width="554" height="587" alt="image" src="https://github.com/user-attachments/assets/cfd4045d-bfd9-44cd-816c-7058ff358b35" />

###

<img width="715" height="278" alt="image" src="https://github.com/user-attachments/assets/a8ace274-4f09-4322-8e53-3bf196302457" />

###

Output:
###

<img width="259" height="587" alt="image" src="https://github.com/user-attachments/assets/5a6e247f-2ddf-4efb-958f-5aadd3a512c4" />

###

<img width="371" height="530" alt="image" src="https://github.com/user-attachments/assets/8911e6d1-9edf-4893-9754-6fe6bf5deaab" />


###

