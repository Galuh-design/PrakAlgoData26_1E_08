# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 9 STACK

<h4>Nama : Galuh Pramudya Ananta<h4>
<h4>NIM : 254107020127<h4>
<h4>Kelas : TI-1E<h4>



## Praktikum 1 Mahasiswa Mengumpulkan Tugas

Code program Mahasiswa08 :

<img width="712" height="478" alt="image" src="https://github.com/user-attachments/assets/05efe2bc-4590-4396-813d-13d64e080297" />



Code program StackTugasMahasiswa08 :


<img width="430" height="662" alt="image" src="https://github.com/user-attachments/assets/75723676-f9df-40f4-92ff-4daa2d92642c" />


Code Program MahasiswaDemo08:

<img width="466" height="624" alt="image" src="https://github.com/user-attachments/assets/66bc0601-29a5-440e-9692-8518b068e055" />



Output :

<img width="266" height="696" alt="image" src="https://github.com/user-attachments/assets/a49b496f-5c97-4e94-bfae-625e8623fd1a" />


<img width="247" height="614" alt="image" src="https://github.com/user-attachments/assets/8dbfecb2-f6cb-48f2-a1d7-e6c9d685c407" />









### Pertanyaan praktikum 1
#### 1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki?

Jawab:
yang perlu diperbaiki adalah Output dari sorting  Melihat Daftar tugas berbeda dari verifikasi hasil percobaan.

<img width="137" height="89" alt="image" src="https://github.com/user-attachments/assets/5a22f6c6-d3de-4872-a2d4-9c06a76e5efe" />

<img width="240" height="141" alt="image" src="https://github.com/user-attachments/assets/40aec5c9-3ff4-4bdd-a459-4773e4bc1abd" />

Code Program modifikasi StackTugasMahasiswa08 :

<img width="600" height="167" alt="image" src="https://github.com/user-attachments/assets/cf76cbb1-634f-41af-a42a-c2e072d893e5" />


Output:

<img width="266" height="625" alt="image" src="https://github.com/user-attachments/assets/ee4881c4-360d-4261-a525-b8fe8381ce23" />

<img width="156" height="418" alt="image" src="https://github.com/user-attachments/assets/3cfe4bad-b283-4df1-806c-9d63c2a7500b" />

#### 2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya!

Jawab:

data tugas mahasiswa yang dapat ditampung didalam stack adalah 5, berikut adalah kode programnya;

<img width="437" height="49" alt="image" src="https://github.com/user-attachments/assets/77e6a998-e33b-40a1-84a0-ae41bfded411" />


#### 3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut dihapus, apa dampaknya?
jawab:
kondisi !isfull() diperlukan untuk membatasi agar top tidak melebihi index dari array of object mahasiswa08 stack. Bila if - else dihapus dalam method isfull() maka berpotensi error outofbound

#### 4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah!

Jawab:

Modifikasi MahasiswaDemo08:

<img width="829" height="313" alt="image" src="https://github.com/user-attachments/assets/30d7b492-0c01-4569-80d8-a8b112948d97" />


Modifikasi StackTugasMahasiswa08:

<img width="825" height="387" alt="image" src="https://github.com/user-attachments/assets/76450b14-3180-46d3-816b-3b26ad4be0bf" />


Output:

<img width="556" height="654" alt="image" src="https://github.com/user-attachments/assets/2d495b6c-8b73-481c-bf80-d49eaeae3169" />


#### 5.  Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, serta tambahkan operasi menunya!

Jawab:

Modifikasi MahasiswaDemo08:

<img width="673" height="110" alt="image" src="https://github.com/user-attachments/assets/20801397-c247-4414-a4a2-d194a003315f" />


Output :

<img width="218" height="635" alt="image" src="https://github.com/user-attachments/assets/04f6b04a-db2c-48fe-b032-e14aa3c52c4d" />


## Praktikum 2 Konversi Nilai Tugas ke Biner  

Code program StackTugasMahasiswa08 :

<img width="693" height="727" alt="image" src="https://github.com/user-attachments/assets/f9d9e4b3-ddc8-45a4-b804-aa3d7d3eb6e5" />

<img width="663" height="676" alt="image" src="https://github.com/user-attachments/assets/cb3f8015-5beb-4ad9-afb5-2ab3e2ca2f87" />


Code Program MahasiswaDemo08:

<img width="662" height="666" alt="image" src="https://github.com/user-attachments/assets/93a8eff4-2f7f-47be-a673-8e563fa43038" />

<img width="777" height="612" alt="image" src="https://github.com/user-attachments/assets/825a6fbe-f19d-4637-9dc8-2e19b702626c" />

Code Program stackKonversi08:

<img width="558" height="637" alt="image" src="https://github.com/user-attachments/assets/ae4db745-7f53-46e0-93d7-bd49b4b3b9b6" />


Output:

<img width="359" height="277" alt="image" src="https://github.com/user-attachments/assets/3c3c00f2-cb1f-4c5c-8c0c-b3b7913ab845" />

### Pertanyaan praktikum 1

#### 1. Jelaskan alur kerja dari method konversiDesimalKeBiner! 
Jawab:

<img width="418" height="278" alt="image" src="https://github.com/user-attachments/assets/61d4c0a2-90dd-4752-ad8b-48528f665c4f" />

Dimulai dari dipanggilnya fungsi konversiDesimalKeBiner dengan membawa parameter data Int nilai. setelah fungsi dipanggil dibuatkan objek baru dari stackKonversi08 stack.
memulai perulangan while bila nilai lebih dari 0. int sisa mengambil sisa pembagian (modulo) 2 dari nilai. bila genap maka sisa bagi = 0 bila ganjil sisa bagi = 1. memanggil fungsi push dengan objek guna untuk memasukkan sisa kedalam stack. melakukan pembagian nilai dengan 2 sesuai dengan cara menghitung biner. setelah keluar dari perulangan, membuat string biner. Masuk kedalam perulangan while bila kondisi stack tidak kosong, melakukan biner + stack.pop() (nilai biner yang disimpan dalam stack) yang dimana fungsinya mengurangi data top sehingga dapat menjadi syarat keluar perulangan while. Setelah keluar dari perulangan, dilakukan return String biner sebagai nilai return dari fungsi konversiDesimalKeBiner.

#### 2. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya! 

modifikasi kode program StackTugasMahasiswa08:

<img width="581" height="312" alt="image" src="https://github.com/user-attachments/assets/0d31733e-7268-40f3-bb79-cbd59c845bfe" />

Output: 

<img width="372" height="192" alt="image" src="https://github.com/user-attachments/assets/6d47ae2d-854a-46e4-bb2e-0df89be7d573" />

Hasilnya adalah tidak ada yang berubah, dikarenakan struktur nilai != 0 dan nilai > 0 hampir sama dikarenakan stack iterasi positif sehingga nilai != 0 berfungsi dengan baik.
