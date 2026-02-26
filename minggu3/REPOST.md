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
Code Program modifikasi Mahasiswa08 Percobaan 3;

<img width="833" height="592" alt="image" src="https://github.com/user-attachments/assets/eab239e0-86ec-42db-b691-3fbbbcf6b95e" />

Code Program modifikasi MahasiswaMain08 Percobaan 3;

<img width="917" height="496" alt="image" src="https://github.com/user-attachments/assets/20914af7-4bd7-411c-a029-aecdfa5fa72e" />

output :

<img width="582" height="318" alt="image" src="https://github.com/user-attachments/assets/9768a4e3-2398-4d78-8f7b-b355ba6fe50c" />

### Pertanyaan Percobaan 3
#### 1. Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!
jawab:
berikut adalah baris program konstruktor berparameter;
<img width="542" height="40" alt="image" src="https://github.com/user-attachments/assets/33899168-f583-496f-968d-f60e95c62da0" />
#### 2. Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut? 
<img width="636" height="40" alt="image" src="https://github.com/user-attachments/assets/c435bf58-bf8f-47be-b1a2-a973f56d6d94" />
jawab:
baris code tersebut adalah untuk menginputkan nilai kedalam konstruktor dengan instansiasi objek baru dengan variabel mhs2.

#### 3. Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
jawab:
berikut adalah output;

<img width="558" height="196" alt="image" src="https://github.com/user-attachments/assets/e5b1d640-7d05-4a64-b7df-8981b95060e7" />

hal tersebut terjadi karena konstruktor default memiliki fungsi untuk membuat konstruktor tanpa parameter. dengan hilangnya konstruktor public default maka class mahasiswamain08 instansiasi mahasiswa08 tanpa parameter tidak dapat mengakses konstruktor ataupun objek pada class mahasiswa08. 

#### 4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara berurutan? Jelaskan alasannya!
jawab: tidak, karena method akan dijalankan berurut dengan cara dipanggil sehingga pada class mahasiswa dapat dipanggil acak method yang ingin dipanggil tetapi pada class mahasiswamain akan dijalan berurutan sesuai syntax.

#### 5. Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor berparameter dari class Mahasiswa!

jawab:
berikut adalah code program modifikasi class mahasiswamain08;

<img width="874" height="187" alt="image" src="https://github.com/user-attachments/assets/5a656c76-8d59-4156-bcda-ee27e23f4363" />

berikut adalah output;

<img width="532" height="415" alt="image" src="https://github.com/user-attachments/assets/e21d6a9a-275d-439b-822c-0bd1d1d9e11d" />

### Latihan Praktikum
## Latihan 1

<img width="455" height="217" alt="image" src="https://github.com/user-attachments/assets/be83b153-939a-4611-a592-630dd45138b9" />

Buat program untuk mengimplementasikan class MataKuliah berdasarkan class diagram di atas,
yang terdiri dari:
#### - Class MataKuliah (MataKuliah<NoAbsen>.java)
#### - Class MataKuliahMain (MataKuliahMain<NoAbsen>.java)
Pada class MataKuliahMain buatlah minimal 2 objek. Gunakan konstruktor default dan
konstruktor berparameter saat mengintansiasi objek. Lalu panggil semua method yang sudah
dibuat pada class MataKuliah.
Penjelasan dari atribut dan method pada class MataKuliah tersebut adalah sebagai berikut:
### a. Atribut
#### • kodeMK (String): kode unik untuk mata kuliah.
#### • nama (String): nama lengkap dari mata kuliah
#### • sks (int): SKS (Satuan Kredit Semester)
#### • jumlahJam (int): jumlah total jam pertemuan per minggu untuk mata kuliah
### b. Method
#### • tampilInformasi(): method ini digunakan untuk menampilkan semua informasi yang berkaitan dengan mata kuliah.

#### • ubahSKS(int sksBaru): method ini memungkinkan pengubahan nilai SKS untuk matakuliah. Setelah mengubah nilai, method ini memberi tahu pengguna bahwa SKS telah diubah.
#### • tambahJam(int jam): method ini menambahkan jumlah jam tambahan ke jumlah jam yang sudah ada untuk mata kuliah.
#### • kurangiJam(int jam): method ini berfungsi untuk mengurangi jumlah jam dari mata kuliah. Sebelum mengurangi, method ini melakukan pengecekan untuk memastikan bahwa jumlah jam yang tersisa cukup untuk dikurangi. Jika jumlah jam tidak mencukupi (jumlah jam awal lebih kecil dari jam pengurang), method ini akan memberi tahu pengguna bahwa pengurangan tidak dapat dilakukan. Jika pengurangan berhasil, method ini mengupdate jumlah jam dan mencetak nilai jumlah jam yang baru.

Code Program : 
class matkulMain

<img width="896" height="542" alt="image" src="https://github.com/user-attachments/assets/842b75db-ec16-46ac-b821-909949528d65" />


class matkul

<img width="767" height="723" alt="image" src="https://github.com/user-attachments/assets/d3b9d5ab-5ce5-41b6-9777-aea426bb82c1" />

<img width="678" height="476" alt="image" src="https://github.com/user-attachments/assets/3c2c1e4f-eeb1-407c-a4af-61e55fec44a3" />

Output :

<img width="487" height="329" alt="image" src="https://github.com/user-attachments/assets/5e99b6b0-414f-4be9-89d3-65804cc9934e" />

## Latihan 2

<img width="425" height="245" alt="image" src="https://github.com/user-attachments/assets/131df15a-7d19-45d9-8438-0f2a82cb7a8c" />

Buat program untuk mengimplementasikan class Dosen berdasarkan class diagram di atas, yang
terdiri dari:
#### - Class Dosen (Dosen<NoAbsen>.java)
#### - Class DosenMain (DosenMain<NoAbsen>.java)
Pada class DosenMain buatlah minimal 2 objek. Gunakan konstruktor default dan konstruktor
berparameter saat mengintansiasi objek. Lalu panggil semua method yang sudah dibuat pada
class Dosen
Penjelasan dari atribut dan method pada class Dosen tersebut adalah sebagai berikut:
### a. Atribut
#### • idDosen (String): id unik untuk setiap dosen.
#### • nama (String): nama lengkap dari dosen.
#### • statusAktif (boolean): menunjukkan apakah dosen tersebut aktif (true) atau tidak aktif (false) dalam menjalankan tugasnya.
#### • tahunBergabung (int): tahun ketika dosen mulai bergabung dengan perguruan tinggi

#### • bidangKeahlian (String): bidang keahlian dosen, yang menjelaskan spesialisasi atau fokus akademik dosen
### b. Method
#### • tampilInformasi(): method ini digunakan untuk menampilkan informasi lengkap tentang dosen
#### • setStatusAktif(status: boolean): method ini digunakan untuk mengatur status aktif dosen. Jika parameter status diatur ke true, berarti dosen tersebut menjadi aktif. Sebaliknya, jika false, dosen tersebut dinyatakan tidak aktif.
#### • hitungMasaKerja(thnSkrg: int): method ini menghitung dan mengembalikan (me-returnkan) masa kerja dosen dalam tahun, berdasarkan tahun bergabung dan tahun saat ini (thnSkrg) yang menjadi parameter input method ini. Hasil perhitungan memberikan informasi tentang lamanya dosen bekerja di perguruan tinggi.
#### • ubahKeahlian(bidang: String): method ini digunakan untuk mengubah bidang keahlian dosen.

Code Program Dosen08 ;

<img width="826" height="727" alt="image" src="https://github.com/user-attachments/assets/e2902968-1539-44f1-a779-238b028b9cb3" />

<img width="999" height="564" alt="image" src="https://github.com/user-attachments/assets/eab0fed4-b557-4fdb-bea7-9f3ce81a6669" />

Code Program DosenMain08 ;

<img width="989" height="573" alt="image" src="https://github.com/user-attachments/assets/bad7c72e-810e-4a0f-9b0f-8850a6242911" />

Output ;

<img width="1094" height="476" alt="image" src="https://github.com/user-attachments/assets/8bcbac1d-0461-44df-ab47-1dcf90bfe30c" />
