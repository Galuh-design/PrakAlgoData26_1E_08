# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 5 BRUTE FORCE DAN DIVIDE CONQUER

<h4>Nama : Galuh Pramudya Ananta<h4>
<h4>NIM : 254107020127<h4>
<h4>Kelas : TI-1E<h4>



## Percobaan 1: Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer

Code program Faktorial08 :

<img width="480" height="498" alt="image" src="https://github.com/user-attachments/assets/d79c6c05-55a4-4383-bf8b-17ed23eb4c9e" />

Code program MainFaktorial :

<img width="590" height="497" alt="image" src="https://github.com/user-attachments/assets/4710b0e6-aac5-4b2a-91d8-099a05810480" />

Output :

<img width="426" height="237" alt="image" src="https://github.com/user-attachments/assets/09d7adcf-0afb-4fbd-925d-362a9b0bceff" />

### Pertanyaan Percobaan 1
#### 1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!
Jawab:
penggunaan kondisi if adalah sebagai break dari perulangan rekursif milik method FaktorialDC bila method sudah memenuhi ketentuan kondisi if setelah dipecah oleh else, sedangkan penggunaan kondisi else adalah sebagai divide Conquer yang memecah parameter method faktorialDC menjadi lebih kecil.

#### 2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!

Jawab:
menggunakan perulangan selain for dapat diubah, seperti menggunakan while atau dowhile, berikut pembuktiannya;

##### Code program Faktorial08;

<img width="555" height="602" alt="image" src="https://github.com/user-attachments/assets/351e6454-7502-4137-9b41-eb2f9e7ac844" />

##### Output;

<img width="459" height="212" alt="image" src="https://github.com/user-attachments/assets/da7428e1-bdf4-4ec3-9c93-4ed0fdcfe9f0" />


#### 3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !

Jawab:
pada method faktorialBF fakto *=1 dengan perulangan sehingga berbentuk 1x2x3x4x5 menggunakan loop yang iteratif, sedangkan faktorialDC fakto = n * faktorialDC(n-1) menggunakan rekursif sehingga berbentuk 5x4x3x2x1, nilai dibagi menjadi bagian lebih kecil. 


#### 4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!

Jawab:

method faktorialBF() menggunakan Break force yang mana menggunakan loop iteratif dengan for while maupun do while, sedangkan faktorialDC() divide conquer yang mana menggunakan loop rekursif dengan kondisi if dan else.

## Percobaan 2: Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer 
Code Program Pangkat08:

<img width="645" height="585" alt="image" src="https://github.com/user-attachments/assets/bbf7b1cd-2d36-4656-9758-ae64e25666bc" />

Code Program MainPangkat08:

<img width="785" height="648" alt="image" src="https://github.com/user-attachments/assets/b722d286-1e39-4b06-9894-f75575ccb2a9" />

Output:

<img width="504" height="425" alt="image" src="https://github.com/user-attachments/assets/d4e2ff2d-15e6-4257-be69-e29c67c49c48" />


### Pertanyaan Percobaan 2

#### 1.Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()! 

Jawab: method pangkatBF() dibuat menggunakan Brute Force yang dimana melakukan looping iteratif, sedangkan method pangkatDC() dibuat menggunakan Divide and Conquer yang dimana memecah masalah menjadi lebih kecil dan me return untuk mendapat nilai.

#### 2. Apakah tahap combine sudah termasuk dalam kode tersebut? Tunjukkan! 

Jawab: 

<img width="661" height="282" alt="image" src="https://github.com/user-attachments/assets/27da2066-3b78-41c6-8c24-e6194825bc3f" />

Sudah termasuk, pada kode program method PangkatDC tersebut pada kondisi else dipanggil lagi method PangkatDC dengan variabel pangkat yang lebih kecil sampai n == 1 dan di return. setiap return menjadi nilai yang nantinya akan kembali menjadi method yang dipanggil di kondisi else sehingga saat pangkatDC * pangkatDC nantinya hasil return kondisi if akan menjadi a * a sehingga combine terjadi.

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


## Latihan 2
2. Tambahkan class baru DataDosen<NoPresensi> dengan beberapa method berikut; 
##### a. dataSemuaDosen(Dosen[] arrayOfDosen)untuk menampilkan data semua dosen   
##### b. jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen) untuk menampilkan data jumlah dosen per jenis kelamin (Pria / Wanita)   
##### c. rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen) untuk menampilkan rata-rata usia dosen per jenis kelamin (Pria / Wanita)   
##### d. infoDosenPalingTua(Dosen[] arrayOfDosen) untuk menampilkan data dosen paling tua   
##### e. infoDosenPalingMuda(Dosen[] arrayOfDosen) untuk menampilkan data dosen paling muda 
Semua method tersebut harus bisa dipanggil/ditest dari class DosenDemo

Code Program Dosen08;

<img width="720" height="429" alt="image" src="https://github.com/user-attachments/assets/58f1676b-ef38-4235-8bc9-d67f27285236" />

Code Program DosenDemo08;

<img width="618" height="704" alt="image" src="https://github.com/user-attachments/assets/432ec3fc-99e4-4e33-92fb-8de841f8ff3f" />

Code Program DataDosen08;

<img width="673" height="587" alt="image" src="https://github.com/user-attachments/assets/41009998-9923-4a9b-a266-f8b05c4ddc1f" />

<img width="523" height="537" alt="image" src="https://github.com/user-attachments/assets/ec882fc0-f182-4e74-83db-7c54a91b0a97" />

<img width="762" height="432" alt="image" src="https://github.com/user-attachments/assets/74a83d85-32f0-40db-8aa9-ea57a53782da" />

Output;

<img width="333" height="664" alt="image" src="https://github.com/user-attachments/assets/006746d8-c169-43a4-8911-f6b0a5e70faa" />
