# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 16 Collection

<h4>Nama : Galuh Pramudya Ananta<h4>
<h4>NIM : 254107020127<h4>
<h4>Kelas : TI-1E<h4>



## Praktikum 1  

Code program ContohList08 :
###

<img width="764" height="678" alt="image" src="https://github.com/user-attachments/assets/3711eb28-675f-4cb1-befe-d15754af6a77" />

###

Output :
###

<img width="460" height="222" alt="image" src="https://github.com/user-attachments/assets/817fd28b-99a8-4d1c-b4e0-2affbe4b755a" />

###

### Pertanyaan Praktikum 1

1, Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist?
#### Jawab:

karena instansiasi objek l pada kode List l = new ArrayList(); tidak mendefinisikan tipe data


2, Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu!
#### Jawab:

#### modifikasi ContohList08
<img width="739" height="388" alt="image" src="https://github.com/user-attachments/assets/2dbdd472-745c-4f60-93b9-9cff4c4f0ea3" />

Output:
###

<img width="459" height="185" alt="image" src="https://github.com/user-attachments/assets/c4f32a7b-f22e-4abf-858e-3e18db9bc38d" />

###

3, Ubah kode pada baris kode 38 menjadi seperti ini

<img width="405" height="39" alt="image" src="https://github.com/user-attachments/assets/ec9758df-9c44-4ce7-bda9-b0d00e293a22" />

#### Jawab:

#### modifikasi ContohList08
<img width="432" height="77" alt="image" src="https://github.com/user-attachments/assets/00e2810e-533a-4b0e-bfb9-c12a3c3154f9" />

Output:
###

<img width="452" height="128" alt="image" src="https://github.com/user-attachments/assets/9b4217da-1ff3-42f2-803d-48684b2f28d5" />


###

4, Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya

<img width="610" height="83" alt="image" src="https://github.com/user-attachments/assets/e4176e06-0140-48ce-9d5e-ff2d9aac91ba" />

#### Jawab:

#### modifikasi ContohList08
<img width="672" height="196" alt="image" src="https://github.com/user-attachments/assets/ff50d920-c963-4995-82f6-8090f5230726" />


Output:
###

<img width="546" height="154" alt="image" src="https://github.com/user-attachments/assets/d21f94a0-cb33-4256-a06e-f436ed6678d6" />



###

5, Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!
#### Jawab:

Fungsi push() adalah operasi Stack. 
Ketika names.push("Mei-mei") dipanggil, elemen "Mei-mei" akan dimasukkan ke indeks ke-0 dan menjadi head. saat names.getFirst() dipanggil, elemen yang keluar adalah "Mei-mei".

## Praktikum 2

Code program LoopCollection08 :
###

<img width="522" height="681" alt="image" src="https://github.com/user-attachments/assets/e4f10b4c-6011-4a48-b532-c993ba800216" />

###

Output :
###

<img width="416" height="159" alt="image" src="https://github.com/user-attachments/assets/438981e1-e237-4213-8860-e526857d0a7b" />

###

### Pertanyaan Praktikum 2

1, Apakah perbedaan fungsi push() dan add() pada objek fruits?
#### Jawab:
push() method Stack yang digunakan untuk memasukkan elemen ke posisi top. Method return nilai elemen yang dimasukkan.  
add() menyisipkan elemen ke top Stack , return boolean 

2, Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian?
#### Jawab:
###

<img width="682" height="652" alt="image" src="https://github.com/user-attachments/assets/b26b4f27-a3d8-4a3e-9c59-010344c73000" />
<img width="301" height="88" alt="image" src="https://github.com/user-attachments/assets/7c356f15-fb55-44f1-8662-5fbe8d61ef50" />

###

(fruits.push("Melon"); dan fruits.push("Durian");) dihilangkan. 
perulangan Iterator, Stream, dan For-loop tidak akan kosong dikarenakan kode sebelumnya terdapat proses while (!fruits.empty()) { fruits.pop(); } yang mengeluarkan dan menghapus seluruh elemen di dalam objek fruits hingga kosong total.


3, Jelaskan fungsi dari baris 46-49?
#### Jawab:

(for (Iterator<String> it = fruits.iterator(); it.hasNext();)) 
###

berfungsi untuk melakukan traversal perulangan untuk menampilkan seluruh elemen di dalam fruits menggunakan objek Iterator. Method hasNext() cek apakah masih ada elemen selanjutnya , dan it.next() mengambil nilai elemen tersebut untuk dicetak

4, Silakan ganti baris kode 25, Stack String menjadi List String dan apakah yang terjadi? Mengapa bisa demikian?
#### Jawab:

<img width="571" height="687" alt="image" src="https://github.com/user-attachments/assets/ac109c3d-1161-458c-8097-2c0b1986a631" />

###

error kompilasi pada program. Arraylist List tidak memiliki method push(), empty(), dan pop().

5, Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!
#### Jawab:

<img width="422" height="308" alt="image" src="https://github.com/user-attachments/assets/2530d556-3a08-468b-b73a-b3efa87d404f" />
<img width="361" height="227" alt="image" src="https://github.com/user-attachments/assets/b2868ee8-a488-4b2a-982d-d0f2fc4041a9" />

###

6, Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!
#### jawab:

<img width="433" height="467" alt="image" src="https://github.com/user-attachments/assets/9b994a88-03b1-43a7-bad5-5b4046c8079a" />
<img width="346" height="125" alt="image" src="https://github.com/user-attachments/assets/58a08e5b-3b75-4e74-bf17-4abb32a44456" />

###

###
Output tanpa sort

<img width="245" height="94" alt="image" src="https://github.com/user-attachments/assets/cd5b398d-5615-4460-905c-953a16d2c16a" />

###

## Praktikum 3

Code Program Mahasiswa08:

###

<img width="841" height="502" alt="image" src="https://github.com/user-attachments/assets/0d946b6d-09e0-4061-83c6-391631a240a0" />

###

Code Program ListMahasiswa08 :

###

<img width="484" height="650" alt="image" src="https://github.com/user-attachments/assets/6004c5da-8242-4907-ab6a-4f8ac858b8f4" />

###

Output:

###

<img width="369" height="190" alt="image" src="https://github.com/user-attachments/assets/f540e6d9-9aa4-4c08-a5ee-a28a9a94bcce" />

###

### Pertanyaan Praktikum 3

1, Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa? Dan kelebihannya apa?
#### Jawab:

konsep Varargs, ditandai dengan sintaks (...) setelah tipe data parameter. Kelebihan dapat memasukkan data seluruh mahasiswa sekaligus daripada memasukkannnya satu persatu.


2, Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection!
#### Jawab:
