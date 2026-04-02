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
Code program Sum08:

<img width="874" height="675" alt="image" src="https://github.com/user-attachments/assets/68977117-a398-4825-ac57-1386fb7c92ff" />

Code program MainSum08:

<img width="1111" height="650" alt="image" src="https://github.com/user-attachments/assets/cb8be110-a151-43b4-89d6-ab806afab773" />

Output:

<img width="560" height="314" alt="image" src="https://github.com/user-attachments/assets/cf9b036d-73c7-464a-abc8-8d485f2a1390" />

### Pertanyaan Percobaan 3

#### 1. Kenapa dibutuhkan variable mid pada method TotalDC()?
jawab: sebagai atribut pengoperasian rekursif untuk memecah nilai dari int r dan int l agar dapat memenuhi kondisi if (l==r) dan me return arr[l].

#### 2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC()?

<img width="318" height="52" alt="image" src="https://github.com/user-attachments/assets/c5fd125b-f893-4980-a3e9-67727cb2783f" />

jawab: statement tersebut untuk memecah nilai atribut l dan r , dan membuat rekursif method totalDC memanggil dirinya sendiri. 
double lsum untuk mengakses index terakhir  dengan mengubah r dengan (mid).
double rsum untuk mengakses indeks awal dengan mengubah l dengan (mid+1)

#### 3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini? 

<img width="189" height="38" alt="image" src="https://github.com/user-attachments/assets/17614ba9-5030-4e49-919d-699f5c54519f" />

jawab: sebagai combine dari statement double lsum dan rsum yang telah mendapat return arr[l]

#### 4. Apakah base case dari totalDC()?

jawab: base case adalah kondisi if (l==r) return arr[l].

#### 5. Tarik Kesimpulan tentang cara kerja totalDC() 

jawab: totalDC() menerima parameter dari mainsum08. totalDC() melakukan pemanggilan ulang dirinya sendiri dan memecah atribut l alias index awal dan r alias index terakhir. melakukan operasi hingga mencapai base case l == r dan mereturn arr[l]. setelah mendapat semua isi dari arr, melakukan combine lsum +rsum untuk mendapat total.

## Latihan 1
1. Sebuah kampus memiliki daftar nilai mahasiswa dengan data sesuai tabel di bawah ini

<img width="624" height="378" alt="image" src="https://github.com/user-attachments/assets/25adea07-ac80-4935-bce8-e3732bfb74ed" />

Code Program NilaiMhs08 :

<img width="575" height="732" alt="image" src="https://github.com/user-attachments/assets/4ab41699-31ac-41b8-90e3-0c15d89249e9" />

<img width="668" height="448" alt="image" src="https://github.com/user-attachments/assets/dd7aae18-78bb-4ff1-9da8-820040bc55dd" />

Code Program MainNilaiMhs08:

<img width="449" height="486" alt="image" src="https://github.com/user-attachments/assets/bbd924bf-3434-4eae-958e-ee1e290618f1" />

<img width="833" height="441" alt="image" src="https://github.com/user-attachments/assets/84d81e22-477f-44cb-93f8-6fa8aa79e794" />

Output:

<img width="541" height="701" alt="image" src="https://github.com/user-attachments/assets/ca880d52-522d-42f3-9a2b-5e84346b355c" />
####

<img width="435" height="466" alt="image" src="https://github.com/user-attachments/assets/5185b515-2210-4196-ae10-058492096225" />


<img width="740" height="369" alt="image" src="https://github.com/user-attachments/assets/193eba1a-dcdd-4ecf-acdc-83b70127b4b1" />

