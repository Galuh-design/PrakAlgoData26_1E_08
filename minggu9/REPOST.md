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

#### 1.Tunjukkan pada kode program yang mana proses divide dijalankan!
Jawab: 

<img width="214" height="57" alt="image" src="https://github.com/user-attachments/assets/b1f45af5-ed77-4a0e-865b-2442e3649e78" />
syntax divide dari rekursif.

#### 2.Tunjukkan pada kode program yang mana proses conquer dijalankan!
Jawab:

<img width="364" height="153" alt="image" src="https://github.com/user-attachments/assets/86087be3-64bb-44a5-a63b-abe951fc5375" />
syntax conquer dari rekursif.

#### 3.Apa fungsi left, right, dan mid?
jawab:
left digunakan sebagai tanda untuk index awal.
mid digunakan untuk menentukan titik tengah index untuk membandingkan nilai dengan data yang dicari.
right digunakan sebagai tanda untuk index akhir.

#### 4.Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan?Mengapa demikian?
Jawab:
Program akan tetap berjalan, namun hasil dari program tidak akurat dikarenakan proses binary search memerlukan sorting untuk bisa mengeliminasi setengah bagian array.

#### 5.jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai
Jawab:
Modifikasi MahasiswaBerprestasi08:

<img width="538" height="402" alt="image" src="https://github.com/user-attachments/assets/2d76562c-d9d0-4cc0-95d0-dfe2003e6b08" />

Output:

<img width="674" height="682" alt="image" src="https://github.com/user-attachments/assets/7126d4e1-6a94-4466-892b-30b9d233e692" />

#### 6.Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam array
Jawab:
binary search menentukan data ketika kondisi if (right>= left) nilai left melampaui right, sehingga fungsi keluar dari rekursi dan return nilai -1

#### 7.Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard.
Jawab:
kode program modifikasi MahasiswaDemo08:

<img width="525" height="715" alt="image" src="https://github.com/user-attachments/assets/65de346a-3182-462a-954c-18a9ebae2052" />


kode program modifikasi MahasiswaBerprestasi08

<img width="414" height="545" alt="image" src="https://github.com/user-attachments/assets/222ea3cb-b1bf-4864-a77f-5188108f6b8a" />


Output:

<img width="1020" height="652" alt="image" src="https://github.com/user-attachments/assets/d129f7db-760a-43ed-a10f-4d563e38d7b3" />


