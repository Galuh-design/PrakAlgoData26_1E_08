# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 3 ARRAY OF OBJECTS

<h4>Nama : Galuh Pramudya Ananta<h4>
<h4>NIM : 254107020127<h4>
<h4>Kelas : TI-1E<h4>



## Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan
Code program mahasiswa08 :

<img width="358" height="311" alt="image" src="https://github.com/user-attachments/assets/be8035eb-90d5-4d7a-a9f7-8bd3d0041cf3" />

Code program MahasiswaDemo08 :

<img width="768" height="732" alt="image" src="https://github.com/user-attachments/assets/35048905-4d63-406a-803a-cf2fdd070f41" />

<img width="707" height="444" alt="image" src="https://github.com/user-attachments/assets/1b7ea45e-9200-434a-b5e7-00092f9a257a" />


Output :

<img width="456" height="445" alt="image" src="https://github.com/user-attachments/assets/5258c83d-f8c7-407f-8e70-f1952abe4540" />

### Pertanyaan Percobaan 1
#### 1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!
Jawab:
untuk attribute diperlukan karena untuk memberi identitas pada objek array seperti memisahkan dua objek dan memberi identitas contohnya arrayofmahasiswa[0] dan arrayofmahasiswa[1] sehingga dapat dipisahkan datanya, sedangkan method bersifat optional karena sebagai pemisah operasi yang butuh dipanggil sehingga tidak diwajibkan menggunakan method.

#### 2. Apa yang dilakukan oleh kode program berikut?

<img width="679" height="33" alt="image" src="https://github.com/user-attachments/assets/b6b12dd9-7a32-4142-9b01-042c7f9178a8" />

Jawab:
untuk menginstansiasi objek kedalam array indeks ke 3.

#### 3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut?

<img width="478" height="35" alt="image" src="https://github.com/user-attachments/assets/b25c59ef-b238-4ae3-8958-d7187730a85e" />

Jawab:
ya, kode tersebut memiliki konstruktor default tanpa parameter karena dilakukan pemanggilan class mahasiswa.


#### 4. Apa yang dilakukan oleh kode program berikut?

<img width="472" height="111" alt="image" src="https://github.com/user-attachments/assets/fd004587-5cdd-40db-a175-b1d09d2b96df" />

Jawab:

memberikan input kepada objek yang ada pada array indeks ke 0.


#### 5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?
Jawab:

Karena untuk dilakukannya konstruktor default yang memanggil class antar file.


## Percobaan 2: Menerima Input Isian Array Menggunakan Looping
Code Program Mahasiswa08:

<img width="319" height="301" alt="image" src="https://github.com/user-attachments/assets/afd4cbaf-b68e-4fe7-ba64-013027fe1747" />


Code Program MahasiswaDemo08:

<img width="697" height="544" alt="image" src="https://github.com/user-attachments/assets/57166c17-505c-4b33-bfa6-d4b64f2ce54b" />

<img width="743" height="420" alt="image" src="https://github.com/user-attachments/assets/e8df4ac0-b786-46c0-8543-046bbbcd9296" />

Output:

<img width="621" height="719" alt="image" src="https://github.com/user-attachments/assets/08ab73f9-d9ef-45e3-8818-163d1b8c127d" />

### Pertanyaan Percobaan 2

#### 1.Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program pada langkah no 3.

Jawab: 
berikut code program  Mahasiswa08 modifikasi percobaan 2:

<img width="835" height="533" alt="image" src="https://github.com/user-attachments/assets/3b7576a0-32d6-4b83-bc06-fabfb53f4d1a" />


berikut code program  MahasiswaDemo08 modifikasi percobaan 2:

<img width="861" height="724" alt="image" src="https://github.com/user-attachments/assets/4f454907-aafa-4aec-bf3c-d4da2e7833c7" />


Output:

<img width="556" height="703" alt="image" src="https://github.com/user-attachments/assets/7eb54232-a1fa-4f19-b0cf-b24ae68ef1c2" />

 
#### 2.Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?

<img width="536" height="155" alt="image" src="https://github.com/user-attachments/assets/b40088f0-20e7-420d-8f6f-55d6fdd77a1a" />

Jawab: dikarenakan tidak adanya instansiasi objek sehingga attribute myArrayOfMahasiswa tidak ada acuan.

## Percobaan 3: Constructor Berparameter
Code Program MataKuliah08;

<img width="679" height="432" alt="image" src="https://github.com/user-attachments/assets/a0676617-4871-4efc-b89e-f0864f725e57" />


Code Program  MataKuliahDemo08;

<img width="786" height="707" alt="image" src="https://github.com/user-attachments/assets/90367386-1904-4c7d-871d-f8198427ea2c" />


output :

<img width="592" height="655" alt="image" src="https://github.com/user-attachments/assets/0cf19578-2ca1-4d8b-b2f7-e70586f37016" />


### Pertanyaan Percobaan 3
#### 1.Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya

jawab: ya, dengan membuat syntax seperti ini;

<img width="497" height="136" alt="image" src="https://github.com/user-attachments/assets/8973b98a-f79a-4a4e-9f27-5d2b1c7fdb5e" />

dan dapat dibuat berkali kali.


#### 2. Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menambahkan data Matakul iah

jawab:
Code Program Matakuliah08;

<img width="774" height="635" alt="image" src="https://github.com/user-attachments/assets/b6e04a72-05ac-4c2d-bf53-08b1fc43a1ab" />

Code Program MataKuliahDemo08;

<img width="836" height="708" alt="image" src="https://github.com/user-attachments/assets/017adfb6-fa86-418c-9275-a9a6446813b4" />

Output :

<img width="446" height="683" alt="image" src="https://github.com/user-attachments/assets/c17c689b-2fb1-45b6-94cb-16a7cbbfd024" />


#### 3. Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menampilkan data hasil inputan di layar
jawab:

Code Program Matakuliah08;

<img width="661" height="507" alt="image" src="https://github.com/user-attachments/assets/b61c02b6-d9db-4d8f-890d-426f5c47f7c7" />


Code Program MataKuliahDemo08;

<img width="819" height="607" alt="image" src="https://github.com/user-attachments/assets/c1a771ac-f131-4cb6-bb4e-5842f6c172f0" />

Output :

<img width="564" height="640" alt="image" src="https://github.com/user-attachments/assets/885634c2-e667-487e-af60-9e453d1c6e2d" />

#### 4.Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari array of object Matakuliah ditentukan oleh user melalui input dengan Scanner
Code Program MataKuliahDemo08:

<img width="610" height="595" alt="image" src="https://github.com/user-attachments/assets/0b8d0830-4e1c-445a-a113-cd8358c43ba6" />


Code Program MataKuliah08:

<img width="749" height="725" alt="image" src="https://github.com/user-attachments/assets/4d714b21-47a6-459a-a70e-9308ff918c0f" />

Output:

<img width="539" height="525" alt="image" src="https://github.com/user-attachments/assets/5f66bb08-1be1-416f-9d2e-1f634c710060" />





### Latihan Praktikum
## Latihan 1
1. Buatlah program untuk menampilkan informasi tentang dosen. Program dapat menerima input 
semua informasi terkait dosen dan menampilkanya kembali ke layar. Program ini terdiri dari class 
Dosen<NoPresensi> dengan attribute/property sebagai berikut;  
##### String kode 
##### String nama 
##### Boolean jenisKelamin 
##### int usia  
dengan method constructor sebagai berikut; 
##### public dosen(String kode, String nama, Boolean jenisKelamin, int usia) { 
##### …………….; 
##### …………….; 
##### } 
Kemudian buatlah class DosenDemo<NoPresensi> untuk proses input dan menampilkan data 
beberapa dosen. Gunakan looping dengan FOR untuk pembuatan array of object. Gunakan 
looping dengan FOREACH untuk menampilkan data ke layar.  

Code Program Dosen08:

<img width="667" height="372" alt="image" src="https://github.com/user-attachments/assets/c75d9185-ec2d-401e-bc5d-d88ae2bc8888" />

Code Program DosenDemo08:

<img width="421" height="730" alt="image" src="https://github.com/user-attachments/assets/4154d9ec-c0ea-4af4-80e4-be7b07820e0d" />



Output :

<img width="562" height="634" alt="image" src="https://github.com/user-attachments/assets/35f089a1-71a3-4963-9caf-d3d92176250f" />


