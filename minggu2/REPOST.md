# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 2 Konsep Dasar Pemrograman

<h4>Nama : Galuh Pramudya Ananta<h4>
<h4>NIM : 254107020127<h4>
<h4>Kelas : TI-1E<h4>



## Percobaan 1: Deklarasi Class, Atribut dan Method
Code program :

<img width="493" height="690" alt="image" src="https://github.com/user-attachments/assets/b80d7599-d69e-4ac3-9bd3-790ce7a30c4b" />

Output :

<img width="476" height="105" alt="image" src="https://github.com/user-attachments/assets/2940230c-5837-4227-8e2c-e9ad2ffcc488" />


### Pertanyaan Percobaan 1
#### 1. Sebutkan dua karakteristik class atau object!
Jawab:
didalam code tersebut terdapat dua karakteristik object, yaitu
mempunyai sesuatu dan melakukan sesuatu. dalam class Mahasiswa
tersebut terdapat String nama dan lain lain sebagai variabel dan void ubahkelas(string) sebagai method.
#### 2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya!
Jawab:
terdapat 4 attribut yaitu String nama,
    String nim,
    String kelas, dan
    double ipk.

#### 3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
terdapat 4 method yaitu:
##### - void tampilkanInformasi() {}
##### - void ubahKelas(String kelasBaru){}
##### - void updateIpk(double ipkBaru){}
##### - String nilaiKinerja(){}

#### 4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
Jawab:
berikut modifikasi percobaan 1 pertanyaan 4; 

<img width="781" height="273" alt="image" src="https://github.com/user-attachments/assets/fc51be61-65fa-4f53-8846-17dbf4019385" />


#### 5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa, kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
Jawab:
nilaiKinerja bekerja dengan cara kondisi nilai ipk yang telah di input pada method updateipk. dalam kondisi nilaikinerja terdapat berbagai kondisi if - else if - else yang meliputi syarat kondisi nilai true berupa jumlah ipk >=. bila salah satu kondisi if maupun else if bernilai true maka akan di return string sesuai dengan isi dari kondisi yang bernilai true tersebut. bila tidak ada kondisi yang true maka di returnkan isi dari else.




## Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method



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
