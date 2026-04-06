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

#### 4. Pada Insertion sort, apakah tujuan dari perintah
Jawab:

<img width="146" height="41" alt="image" src="https://github.com/user-attachments/assets/4e026b5f-a0c4-40ea-87cc-27c2f3569f46" />

## Praktikum 2: Sorting Menggunakan Array of Object
Code Program Mahasiswa08:

<img width="744" height="671" alt="image" src="https://github.com/user-attachments/assets/8fc851b6-ba82-466f-b39b-421b0612411d" />


Code Program Mahasiswaberprestasi08:

<img width="674" height="666" alt="image" src="https://github.com/user-attachments/assets/7c638030-769f-4fee-9444-ca78e7de242b" />


Code Program MahasiswaDemo08:

<img width="814" height="627" alt="image" src="https://github.com/user-attachments/assets/7be20bec-ad54-4ef4-845b-016f014f9c10" />


Output:

<img width="379" height="695" alt="image" src="https://github.com/user-attachments/assets/fb4ee643-41f9-4757-abc4-7dca2b0c4611" />


### Pertanyaan Praktikum 2

#### 1. Perhatikan perulangan di dalam bubbleSort() di bawah ini:

<img width="646" height="201" alt="image" src="https://github.com/user-attachments/assets/ef8d797b-63b6-426c-b1f7-0c4133875a93" />

Jawab: 

##### A
karena elemen terakhir otomatis tersortir sehingga tidak efisien menggunakan seluruh index dan dalam kasus array bisa terjadi outofBound.

##### B
agar perulangan j tidak perlu mengecek dan membandingkan lagi data yang sudah di sorting / sudah diurutkan menjadi terbesar atau terkecil, sehingga mengurutkan sisa data tidak membuang waktu untuk membandingkan keseluruhan data.

##### C
perulangan i berlangsung dan tahap yang ditempuh adalah 49 kali


#### 2.Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!
Jawab:

Code Program Mahasiswa08:

<img width="716" height="488" alt="image" src="https://github.com/user-attachments/assets/7e455d07-1d50-431c-9cb4-f5f1d123ba77" />


Code Program MahasiswaBerprestasi08:

<img width="778" height="497" alt="image" src="https://github.com/user-attachments/assets/f2132a69-46be-47b9-bd68-5b7c5b8a070c" />


Code Program MahasiswaDemo08:

<img width="846" height="645" alt="image" src="https://github.com/user-attachments/assets/f361ec2e-302a-4f15-a37a-b3233e5023ac" />


Output:

<img width="391" height="574" alt="image" src="https://github.com/user-attachments/assets/1c90c08d-f2a4-41ff-90ad-8b059668a773" />

<img width="345" height="572" alt="image" src="https://github.com/user-attachments/assets/071ac6fd-5034-46cb-a511-79a544b76ba2" />




## Praktikum 3: Mengurutkan Data Mahasiswa Berdasarkan IPK (Selection Sort)

Code Program Mahasiswa08:

<img width="830" height="667" alt="image" src="https://github.com/user-attachments/assets/bb3cd26d-2156-4501-890f-e97fd4010edb" />


Code Program Mahasiswaberprestasi08:

<img width="632" height="694" alt="image" src="https://github.com/user-attachments/assets/7d6dd671-f90f-4bc0-b930-d44516b359ad" />


Code Program MahasiswaDemo08:

<img width="658" height="665" alt="image" src="https://github.com/user-attachments/assets/032038bc-d5c3-437c-aef9-8a30a6e009c0" />


Output :

<img width="352" height="689" alt="image" src="https://github.com/user-attachments/assets/ccc32de5-1f1c-4711-be18-763799b0ddd5" />

### Pertanyaan Praktikum 3
#### 1. Di dalam method selection sort, terdapat baris program seperti di bawah ini:

<img width="382" height="116" alt="image" src="https://github.com/user-attachments/assets/ccd9984d-337e-4efc-ad16-8825de4800bb" />

#### Untuk apakah proses tersebut, jelaskan!

jawab:

proses tersebut untuk dilakukan check kondisi untuk sorting SELECTION SORT.
idxMin sebagai placeholder untuk menyimpan posisi awal index[i] pada perulangan i dan untuk menyimpan nilai terkecil yang akan ditemukan dalam perulangan j.

Dalam perulangan j, j+1 sebagai index selanjutnya yang nantinya di compare dengan idxMin.
bila kondisi Listmhs[j] lebih kecil dari listMhs[idxMin], akan dilakukan pergantian data index idxMin = j;

dan akan diulang sampai perulangan j habis, sehingga data idxMin menyimpan data dengan nilai terkecil yang nantinya akan dilakukan swap.

## Praktikum 4: Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort 

Code program Mahasiswa08:

<img width="772" height="638" alt="image" src="https://github.com/user-attachments/assets/2a75edba-aab3-472e-bd6b-b0b37188536e" />


Code program MahasiswaBerprestasi08:

<img width="505" height="710" alt="image" src="https://github.com/user-attachments/assets/212a2c62-12b2-4e2b-a49d-856c0a43592d" />


Code Program MahasiswaDemo08:

<img width="694" height="734" alt="image" src="https://github.com/user-attachments/assets/d3d19409-3b88-4a35-8129-8ccab3b2513f" />


Output:

<img width="341" height="702" alt="image" src="https://github.com/user-attachments/assets/39f66e48-5e98-42ba-8e73-0080ae01c0e6" />



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
