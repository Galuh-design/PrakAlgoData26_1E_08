# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 5 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

<h4>Nama : Galuh Pramudya Ananta<h4>
<h4>NIM : 254107020127<h4>
<h4>Kelas : TI-1E<h4>



## Praktikum 1 - Mengimplementasikan Sorting menggunakan object

Code program Sorting08 :

<img width="361" height="681" alt="image" src="https://github.com/user-attachments/assets/737b32ab-c2cf-49d1-af97-da4c5120851c" />

<img width="327" height="260" alt="image" src="https://github.com/user-attachments/assets/3b03c2d6-2d19-43f4-b4c0-cf383d86da47" />

Code program SortingMain08 :

<img width="507" height="515" alt="image" src="https://github.com/user-attachments/assets/a300426a-4c86-4669-afc3-c2a30c8b1368" />


Output :

<img width="546" height="377" alt="image" src="https://github.com/user-attachments/assets/8b50721e-5875-4c45-a82d-0c026ededb41" />



### Pertanyaan praktikum 1
#### 1. Jelaskan fungsi kode program berikut

<img width="266" height="141" alt="image" src="https://github.com/user-attachments/assets/4cd0ec62-cdaf-4fd0-a655-04ba776fbb7c" />

jawab:
syntax tersebut berfungsi untuk kondisi Selection sort pada array data dengan cara memproses index dengan index sebelumnya, bila index sebelumnya lebih besar dari index itu, 
akan dilakukan swapping dari index sebelumnya dan index tersebut.

#### 2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!
Jawab:

<img width="349" height="98" alt="image" src="https://github.com/user-attachments/assets/a50da6e1-2317-4cd4-b814-afe1d0c37337" />

#### 3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan 

<img width="262" height="52" alt="image" src="https://github.com/user-attachments/assets/8e7d3a15-2dfc-49ba-9bdb-4d91cc82a047" />

jawab:

sebagai kondisi untuk swap dalam metode INSERTION SORT. dalam syntax, fungsi j adalah sebagai index ke 0 yang dibandingkan oleh temp (data index setelah j) bila lebih besar index j maka dilakukan sorting ke kiri hingga menemukan nilai yang j yang tidak lebih kecil dari temp dan berhenti dari perulangan bila index di kiri dari index j lebih kecil dari temp atau tidak ada index lagi / index 0 (berhenti baik kondisi false > temp atau iterasi j-- dalam kondisi j>=0 && data[j]>temp) 

#### 4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
Jawab:
berikut modifikasi percobaan 1 pertanyaan 4; 

<img width="781" height="273" alt="image" src="https://github.com/user-attachments/assets/fc51be61-65fa-4f53-8846-17dbf4019385" />


#### 5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa, kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
Jawab:
nilaiKinerja bekerja dengan cara kondisi nilai ipk yang telah di input pada method updateipk. dalam kondisi nilaikinerja terdapat berbagai kondisi if - else if - else yang meliputi syarat kondisi nilai true berupa jumlah ipk >=. bila salah satu kondisi if maupun else if bernilai true maka akan di return string sesuai dengan isi dari kondisi yang bernilai true tersebut. bila tidak ada kondisi yang true maka di returnkan isi dari else.


## Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method
Code Program:

<img width="485" height="486" alt="image" src="https://github.com/user-attachments/assets/26714005-bed5-44fe-8d36-7996d119822f" />

Output:

<img width="454" height="314" alt="image" src="https://github.com/user-attachments/assets/c9553be4-9238-44ed-8e48-8ce716e0a857" />

### Pertanyaan Percobaan 2

#### 1.Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
Jawab: 
pada baris ini;
<img width="301" height="31" alt="image" src="https://github.com/user-attachments/assets/79bbe0a0-835d-4beb-b39e-5db6ec8419e2" />
nama object yang dihasilkan adalah mhs1
#### 2. Bagaimana cara mengakses atribut dan method dari suatu objek?
Jawab:
dengan cara memanggil menggunakan objek mhs1 seperti yang dicontohkan pada kode program mahasiswa main, contohnya sebagai berikut; 
<img width="300" height="46" alt="image" src="https://github.com/user-attachments/assets/c6c410c5-d13d-4f6e-947e-8fb00c2af6b0" />

#### 3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?
jawab: karena output pertama belum dilakukan pemanggilan method sehingga belum ada komputasi dari method, sedangkan output tampilkaninformasi kedua setelah method ubahkelas dan updateipk dipanggil sehingga nilai attribut berubah karena telah di proses pada method.


## Percobaan 3: Membuat Konstruktor
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
