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


#### 5.  Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari kode di atas?
Jawab:
jika break dihapus, pencarian akan terus berlanjut sampai akhir array, sehingga bila terdapat data ganda ,m maka variabel pos akan terus memperbarui, sehingga data variabel pos adalah data terakhir yang ditemukan.

