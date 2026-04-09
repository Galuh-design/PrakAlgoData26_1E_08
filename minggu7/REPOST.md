# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 5 SEARCHING

<h4>Nama : Galuh Pramudya Ananta<h4>
<h4>NIM : 254107020127<h4>
<h4>Kelas : TI-1E<h4>



## Praktikum 1 Searching/ Pencarian Menggunakan Algoritma Sequential Search

Code program Mahasiswa08 :

<img width="815" height="636" alt="image" src="https://github.com/user-attachments/assets/493f4988-4680-415f-988c-039f16cc6b6c" />


Code program MahasiswaBerprestasi08 :

<img width="456" height="674" alt="image" src="https://github.com/user-attachments/assets/f77eceae-220d-48ca-83ba-c7c2120f5c63" />


Code Program MahasiswaDemo08:

<img width="632" height="683" alt="image" src="https://github.com/user-attachments/assets/603b8d4c-fc2c-4b56-8b35-6a39ade1a7c0" />


Output :

<img width="365" height="667" alt="image" src="https://github.com/user-attachments/assets/3541d782-5dc7-4cd2-be2a-bbb6e4774fb8" />


### Pertanyaan praktikum 1
#### 1. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!
Jawab:
Tampilposisi digunakan untuk memberikan informasi indeks di mana data ditemukan saat search, sedangkan tampildataSearch menampilkan seluruh objek yang memiliki nilai IPK yang telah diinput

#### 2. Jelaskan fungsi break pada kode program di bawah ini! 

<img width="292" height="105" alt="image" src="https://github.com/user-attachments/assets/ffb1777c-ec72-4e1b-b3b2-5e99836d181f" />

Jawab:
Fungsi break adalah untuk menghentikan perulangan for segera setelah data yang dicari ditemukan agar perulangan tidak perlu memeriksa keseluruhan data.

#### 3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?
jawab:
Fungsi variabel pos adalah sebagai penanda data ditemukan atau tidak. Bila pos tetap -1 maka data yang dicari tidak ditemukan , dan jika berubah maka nilai tersebut sebagai acuan untuk mengambil data berdasarkan indeks dari array.

#### 4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan menampilkan data ke berapa? Jelaskan.
Jawab:
Program akan menampilkan data yang pertama kali ditemukan pada indeks terkecil sehingga tidak ditampilkan data ganda karena terdapat syntax break untuk stop perulangan pencarian data.

#### 5.  Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari kode di atas?
Jawab:
jika break dihapus, pencarian akan terus berlanjut sampai akhir array, sehingga bila terdapat data ganda ,m maka variabel pos akan terus memperbarui, sehingga data variabel pos adalah data terakhir yang ditemukan.


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
