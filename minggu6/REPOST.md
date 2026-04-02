# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 1 Konsep Dasar Pemrograman

<h4>Nama : Galuh Pramudya Ananta<h4>
<h4>NIM : 254107020127<h4>
<h4>Kelas : TI-1E<h4>



## 2.2.1 Praktikum Pemilihan


### Pertanyaan Praktikum 1
1. Buatlah program untuk menghitung nilai akhir dari mahasiswa dengan ketentuan 20% nilai
tugas, 20% dari nilai kuis, 30% nilai UTS, dan 40% nilai UAS. Setiap nilai yang dimasukkan
mempunyai batas nilai 0 ‐ 100. Ketika pengguna memasukkan di luar rentang tersebut maka
akan keluar output “nilai tidak valid”. Ketika nilai akhir sudah didapatkan selanjutnya lakukan
konversi nilai dengan ketentuan sebagai berikut:

<img width="460" height="236" alt="image" src="https://github.com/user-attachments/assets/3f8a376c-4513-4f33-aea7-8e155ba0c570" />

Jika Nilai Huruf yang didapatkan adalah A, B+, B, C+, C maka LULUS, jika nilai huruf D dan E
maka TIDAK LULUS.

##### • Input dari program berupa komponen nilai tugas, kuis, UTS, UAS
##### • Output dari program “nilai tidak valid” jika nilai yang dimasukkan diluar ketentuan
##### • Output dari program berupa hasil nilai akhir, nilai huruf, dan keterangan LULUS / TIDAK LULUS

#### Code Program
<img width="891" height="674" alt="image" src="https://github.com/user-attachments/assets/a68b9eb7-6347-4778-b722-8887e2b58098" />

<img width="1049" height="717" alt="image" src="https://github.com/user-attachments/assets/da2078e5-f2ff-4503-9b30-584a74ba8e5f" />

<img width="687" height="417" alt="image" src="https://github.com/user-attachments/assets/cbc2ffbc-b2bf-4b68-8093-f2294b98248d" />

#### Output
<img width="500" height="373" alt="image" src="https://github.com/user-attachments/assets/6ce1eba1-9572-4eaa-9674-269f9f7282ba" />

<img width="579" height="368" alt="image" src="https://github.com/user-attachments/assets/ac2ef7f9-32df-4e8e-a993-b2fe38e9ceaa" />

## 2.3.1 Praktikum Perulangan


### Pertanyaan Praktikum 2
1. Buatlah program yang dapat menampilkan deretan bilangan dari angka 1 sampai n, dengan
n = 2-digit terakhir NIM Anda. Berikut Adalah ketentuan untuk mencetak deretnya;
##### a. Bilangan kelipatan 3 dicetak dengan simbol #
##### b. Bilangan genap selain kelipatan 3 dicetak sesuai angkanya
##### c. Bilangan ganjil dicetak dengan simbol *
##### d. Bilangan 10 dan 15 tidak dicetak
*bila n<10 maka tambahkan 10 (n+=10)
##### Contoh 1: Input NIM: 2541720102 maka n=12
Output: * 2 # 4 * # * 8 # * #
##### Contoh 2: Input NIM: 2541720120 maka n=20
Output: * 2 # 4 * # * 8 # * # * 14 16 * # * 20

#### Code Program
<img width="768" height="724" alt="image" src="https://github.com/user-attachments/assets/b9e25f6b-49cf-4800-9bdb-2f44196496c0" />

<img width="777" height="430" alt="image" src="https://github.com/user-attachments/assets/f1e5320e-658a-49f5-b3ed-f034cadcd7c4" />

#### Output
<img width="621" height="188" alt="image" src="https://github.com/user-attachments/assets/b7d01937-c6c6-4dc7-96ee-e5025ee680d5" />

## 2.4.1 Praktikum Array



### Pertanyaan Praktikum 3
1. Buatlah program untuk menghitung IP Semester dari mata kuliah yang Anda tempuh
semester lalu. Formula untuk menghitung IP semester sebagai berikut:

<img width="481" height="312" alt="image" src="https://github.com/user-attachments/assets/9fcdde12-8ada-4868-b1f9-037a2c45b08e" />

Input dari program berupa nama mata kuliah, bobot SKS, serta nilai huruf dari mata kuliah
tersebut.
Contoh hasil running program:

<img width="559" height="319" alt="image" src="https://github.com/user-attachments/assets/2478411a-0f64-4a83-8ca1-783ec36454b1" />





#### Code Program
<img width="918" height="732" alt="image" src="https://github.com/user-attachments/assets/95cb2143-a5e5-4ae3-a7b4-80322fea5a9f" />

<img width="699" height="739" alt="image" src="https://github.com/user-attachments/assets/8fc3210a-9219-4e7c-9ddf-8ba70a0b159e" />

<img width="718" height="359" alt="image" src="https://github.com/user-attachments/assets/efb137e1-4f63-48a3-b2c2-1413b1aff5be" />

<img width="815" height="711" alt="image" src="https://github.com/user-attachments/assets/79cfc155-4fdd-4adf-b195-693686a94fb7" />

#### Output
<img width="748" height="645" alt="image" src="https://github.com/user-attachments/assets/ec18293d-d3e1-4a67-b149-481d9ce9329e" />

## 2.5.1 Praktikum Fungsi

### Pertanyaan Praktikum 4
RoyalGarden adalah toko bunga yang memiliki banyak cabang. Setiap hari Stock Bunga dan bungabunga yang dijual selalu dicatat dengan rincian seperti berikut ini:

<img width="634" height="189" alt="image" src="https://github.com/user-attachments/assets/bd089375-4704-4704-bf36-cfb3cadfa247" />

#### 1. Buatlah fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis terjual.
#### 2. Tampilkan status dari setiap cabang dengan ketentuan sebagai berikut ini :
##### a. Jika pendapatan cabang > Rp1.500.000, maka cabang tersebut mendapat status “Sangat Baik”
##### b. Jika pendapatan ≤ Rp1.500.000, status “Perlu Evaluasi”.



#### Code Program
<img width="859" height="713" alt="image" src="https://github.com/user-attachments/assets/65a1cafa-3d5a-447f-ac3d-2d6feb88caf4" />

#### Output
<img width="547" height="377" alt="image" src="https://github.com/user-attachments/assets/5c33c58d-1172-4001-a8a1-82a163995611" />

## Tugas
### Tugas 1
1. Susun program untuk membuat dua buah array berikut isinya sebagai berikut. Array pertama
adalah array satu dimensi char KODE[10], berisi kode plat mobil. Array kedua, array dua
dimensi char KOTA[10][12] berisi nama kota yang berpasangan dengan kode plat mobil.
Ilustrasi tampilan array tersebut adalah sebagai berikut:

<img width="577" height="293" alt="image" src="https://github.com/user-attachments/assets/6b00e7b0-0362-4aa1-9db6-c892b61afd19" />

Ketika pengguna memberikan input kode plat nomor maka program akan mengeluarkan
nama kota dari kode plat nomor tersebut.


#### Code Program
<img width="854" height="732" alt="image" src="https://github.com/user-attachments/assets/ab6f8f9e-a62d-494c-a7dd-334ae15428b2" />

<img width="746" height="314" alt="image" src="https://github.com/user-attachments/assets/6767c15d-3927-488a-8d55-ba2289d60ac4" />

#### Output
<img width="510" height="252" alt="image" src="https://github.com/user-attachments/assets/80bfc476-456f-4e19-900a-d4b7495e7d82" />

### Tugas 2

2. Sebuah program digunakan untuk menyimpan dan mengelola jadwal kuliah mahasiswa.
Data jadwal disimpan dalam array 2 dimensi bertipe string, dengan ketentuan
#### • Baris menyatakan jadwal ke-i
#### • Kolom menyatakan informasi jadwal: Nama Mata Kuliah, Ruang, Hari Kuliah, , Jam
Kuliah. Contoh :
##### jadwal[0][0] = "Pemrograman Dasar"
##### jadwal[0][1] = "Lab Komputasi 1"
##### jadwal[0][2] = "Senin"
##### jadwal[0][3] = "08.00–10.00"
#### • Jumlah jadwal kuliah sebanyak n, diinputkan oleh pengguna.
Buatkan fungsi untuk
##### a. Menginput data jadwal kuliah ke dalam array 2 dimensi
##### b. Menampilkan seluruh jadwal kuliah dalam bentuk tabel
##### c. Menampilkan jadwal kuliah berdasarkan hari tertentu
##### d. Menampilkan jadwal kuliah berdasarkan nama mata kuliah tertentu

#### Code Program
<img width="810" height="735" alt="image" src="https://github.com/user-attachments/assets/e606a6fe-351e-437e-88b7-9fd4a86e5881" />

<img width="953" height="736" alt="image" src="https://github.com/user-attachments/assets/68124a71-111a-4c94-b915-4f0d70fc2a50" />

<img width="976" height="738" alt="image" src="https://github.com/user-attachments/assets/bf94d394-610a-45c2-b318-1318aab19b6e" />

<img width="668" height="382" alt="image" src="https://github.com/user-attachments/assets/833aa73a-b817-4d74-a61a-bc547bec787c" />

#### Output
<img width="535" height="537" alt="image" src="https://github.com/user-attachments/assets/b0dcdc20-1931-42dd-8308-d82bcde91053" />

<img width="735" height="686" alt="image" src="https://github.com/user-attachments/assets/5acefdfb-0512-48ae-899c-f364ed2f9025" />

<img width="738" height="633" alt="image" src="https://github.com/user-attachments/assets/2fa0ae0a-b702-4b24-a88a-04544f20ccf9" />
