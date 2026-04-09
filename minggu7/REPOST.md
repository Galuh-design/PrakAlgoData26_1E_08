# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 6 SEARCHING

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


## Praktikum 2: Searching/ Pencarian Menggunakan Algoritma Binary Search

Code Program Mahasiswa08:

<img width="757" height="615" alt="image" src="https://github.com/user-attachments/assets/9ee50620-2ddd-426d-9d5b-af72b4ee8cc4" />


Code Program Mahasiswaberprestasi08:

<img width="507" height="709" alt="image" src="https://github.com/user-attachments/assets/ed271210-2567-4c14-a292-0285ced4e09b" />



Code Program MahasiswaDemo08:

<img width="639" height="723" alt="image" src="https://github.com/user-attachments/assets/26b62d63-3645-497d-844f-919d3cf8f076" />


Output:

<img width="377" height="711" alt="image" src="https://github.com/user-attachments/assets/11a55127-f509-4cdd-b1bb-d88a05a42273" />


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



