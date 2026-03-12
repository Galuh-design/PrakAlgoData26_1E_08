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

#### 3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter? 

jawab: method tersebut tetap relevan karena atribut hasil dikalikan oleh nilai dengan iteratif looping dengan kondisi i kurang dari n. method tersebut dapat dibuat tanpa parameter, berikut adalah code program modifikasi pangkatBF() : 

<img width="502" height="219" alt="image" src="https://github.com/user-attachments/assets/05e8565b-d3d5-49a3-85d7-cf277fc1372f" />

modifikasi code program mainPangkat08 :

<img width="610" height="129" alt="image" src="https://github.com/user-attachments/assets/fecd01c0-8ada-49b5-9c08-8fca74e41285" />

output :

<img width="640" height="371" alt="image" src="https://github.com/user-attachments/assets/1204565d-d4c4-4015-9bc3-5dcbb5dedb3c" />

#### 4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!
jawab :
##### a. cara kerja pangkatBF()

<img width="378" height="181" alt="image" src="https://github.com/user-attachments/assets/04933e9c-9890-4ee1-ad03-44c4854e5b8f" />

dengan cara brute force menggunakan loop for. melakukan iteratif kondisi i kurang dari pangkat di dalam loop melakukan pengoperasian hasil yang dikali variabel nilai sebanyak indeks pangkat. Di akhir setelah loop selesai dilakukan return dengan variabel hasil. 

##### b. cara kerja pangkatDC()

<img width="604" height="290" alt="image" src="https://github.com/user-attachments/assets/48558fb1-aa63-4b71-a643-39513194bbba" />

dengan cara divide and conquer menggunakan rekursif. menggunakan kondisi if dan else dengan memberikan code untuk memanggil method itu sendiri. dalam konisi else, kondisi if berfungsi bila ada nilai ganjil (modulo dibagi 2 tidak 0) sehingga return memanggil method pangkatDC dengan parameter variabel pangkat dibagi 2 sampai n ==1 dan return variabel a dan kembali lagi dengan pengoperasian di kondisi if dikali dengan memanggil method pangkatDC lagi dengan cara yang sama. setelah itu dikali lagi dengan variabel a sehingga menghasilkan operasi a * a * a dikarenakan ganjil, sedangkan kondisi else pada kondisi else hanya mereturnkan dua method tanpa * a dibelakang karena genap sehingga menghasilkan operasi a * a.



## Percobaan 3: Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer 











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
