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

### Pertanyaan Praktikum 4

#### 1. Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending.

Code Program modifikasi MahasiswaBerprestasi08 praktikum 4 pertanyaan 1:

<img width="487" height="694" alt="image" src="https://github.com/user-attachments/assets/29bae99a-1dfb-4bdf-bf99-580de16188f0" />


Code Program modifikasi MahasiswaDemo08 praktikum 4 pertanyaan 1:

<img width="642" height="604" alt="image" src="https://github.com/user-attachments/assets/78068f59-6de9-47ce-9269-9d33b49aaff9" />


Output:

<img width="539" height="612" alt="image" src="https://github.com/user-attachments/assets/d8e32407-3f53-407d-ab85-8b27b0873c16" />


### Latihan Praktikum
## Latihan 1

<img width="516" height="593" alt="image" src="https://github.com/user-attachments/assets/da35b578-7f2f-4567-9532-9935c61fabae" />

Code Program Dosen08:

<img width="726" height="666" alt="image" src="https://github.com/user-attachments/assets/1770a4f0-e380-4d65-aa91-4de6e5f9887f" />


Code Program DataDosen08:

<img width="601" height="672" alt="image" src="https://github.com/user-attachments/assets/983b64a0-4dc4-4a67-af86-02ee2c1594ff" />


Code Program DosenMain08:

<img width="647" height="706" alt="image" src="https://github.com/user-attachments/assets/27f9551b-d897-45d5-a774-bfe692876335" />


Output:

<img width="703" height="656" alt="image" src="https://github.com/user-attachments/assets/d63c42d6-f976-412d-a390-f077cd7414b1" />
