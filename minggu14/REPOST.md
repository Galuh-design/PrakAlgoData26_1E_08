# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 14 Tree

<h4>Nama : Galuh Pramudya Ananta<h4>
<h4>NIM : 254107020127<h4>
<h4>Kelas : TI-1E<h4>



## Praktikum 1  Implementasi Binary Search Tree menggunakan Linked List

Code program Mahasiswa08 :
###

<img width="873" height="452" alt="image" src="https://github.com/user-attachments/assets/d5100c5a-f51a-4de6-be51-2480b6c51576" />

###

Code program Node08 :
###

<img width="704" height="343" alt="image" src="https://github.com/user-attachments/assets/6a31a778-d641-43e8-8677-9da86017a484" />

###

Code program BinaryTree08 :
###

<img width="488" height="683" alt="image" src="https://github.com/user-attachments/assets/9f658576-2f5d-44ca-8997-50c4ee6eaa55" />


<img width="475" height="600" alt="image" src="https://github.com/user-attachments/assets/eb9e6443-ec8c-49bf-ad1a-6d04ec17807b" />


<img width="568" height="531" alt="image" src="https://github.com/user-attachments/assets/78afc9d3-9f58-4265-ac74-1a1697510f3a" />


<img width="599" height="565" alt="image" src="https://github.com/user-attachments/assets/9b91d509-b5ea-4445-aace-9bf114c5f2b5" />


###

Code program BinaryTreeMain08 :
###

<img width="735" height="650" alt="image" src="https://github.com/user-attachments/assets/28d31eb2-1b20-4687-9bdd-79c041754112" />

###

Output :
###

<img width="472" height="669" alt="image" src="https://github.com/user-attachments/assets/dbeee769-7d94-4c7d-b9bf-cce7cd7ca12b" />


<img width="567" height="214" alt="image" src="https://github.com/user-attachments/assets/b091ef10-7667-4c7e-b630-ccdd6d62b35b" />

###

### Pertanyaan Praktikum 1

1.Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?
#### Jawab:

Binary search tree dibuat untuk mengatasi kelemahan pada binary tree biasa, yaitu kesulitan dalam searching/pencarian node tertentu dalam binary tree. Menggunakan prinsip Divide and Conquer, setiap memeriksa node bila nilainya tidak cocok, mengeliminasi setengah bagian tree lainnya. 
        
2.Untuk apakah di class Node, kegunaan dari atribut left dan right?
#### Jawab:

left: Digunakan untuk menyimpan referensi ke node left child yang berisi data dengan nilai lebih kecil dari node tersebut.

right: Digunakan untuk menyimpan referensi ke node right child yang berisi data dengan nilai lebih besar / sama dengan node tersebut.

###

3, 
###
a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
###

b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?

#### Jawab:

a, Atribut root sebagai titik awal dari seluruh struktur binary tree. Karena struktur tree diakses secara hierarki, diperlukan untuk mengetahui letak root tree terlebih dahulu sebelum bisa melakukan operasi.

###

b, nilai root adalah null, karena saat instansiasi dalam keadaan kosong dan belum memiliki node.

###

4, Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
#### Jawab:

node baru tersebut langsung ditunjuk dan ditetapkan sebagai root pada method add.

5, Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?

<img width="410" height="228" alt="image" src="https://github.com/user-attachments/assets/31a1aa7e-4874-4811-9e3a-ab2f9edd9991" />

#### Jawab:

parent = current; 
###

Menyimpan referensi node current ke dalam variabel parent agar tidak kehilangan jejak calon node parent ketika current bergeser turun ke bawah.

if (mahasiswa.ipk < current.mahasiswa.ipk)
###

Melakukan pengecekan if nilai IPK dari mahasiswa baru lebih kecil daripada IPK di node current saat ini.

current = current.left; 
###
Jika lebih kecil, maka pencarian bergeser ke current sebelah kiri.

if (current == null) { parent.left = newNode; return; } 
###
Jika setelah bergeser ke kiri menjadi null, tempat peletakan yang tepat ditemukan. newNode dipasang sebagai anak kiri dari parent, lalu method return / dihentikan

else { current = current.right; if (current == null) { parent.right = newNode; return; } } 
###
terjadi else jika IPK mahasiswa baru lebih besar atau sama dengan IPK di node current. Pencarian bergeser ke current.right. Jika menemukan posisi yang kosong / null, node baru dipasang sebagai anak kanan dari parent, lalu method return.

6, Jelaskan langkah-langkah pada method delete() saat menghapus sebuah node yang memiliki dua anak. Bagaimana method getSuccessor() membantu dalam proses ini?
#### Jawab:

a) Mencari node pengganti menggunakan method getSuccessor()
###
b) Menghubungkan parent dari node yang dihapus agar mengarah ke node successor
###
c) Menghubungkan anak kiri dari node yang dihapus ke anak kiri milik node successor pada syntax successor.left = current.left;

Method getSuccessor() berfungsi untuk mencari pengganti tepat di dalam tree agar sifat urutan Binary search tree tidak rusak setelah penghapusan.


## Praktikum 2  Implementasi Binary Tree dengan Array 

Code program BinaryTreeArray08 :
###

<img width="664" height="491" alt="image" src="https://github.com/user-attachments/assets/5198a00c-85c5-4d10-b696-9627ef96b3e2" />


###

Code program BinaryTreeArrayMain08 :
###

<img width="848" height="443" alt="image" src="https://github.com/user-attachments/assets/b72c1e0f-7c0b-4f27-a5a9-6641da475d49" />


###

Output :
###

<img width="466" height="258" alt="image" src="https://github.com/user-attachments/assets/e529f20d-edf0-4691-82d1-bc7a6e3783b4" />

###


### Pertanyaan Praktikum 2

1, Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
#### Jawab:

dataMahasiswa[] berfungsi sebagai media penyimpanan untuk menampung node binary tree.
###

idxLast berfungsi untuk mencatat indeks posisi node paling terakhir yang terisi di dalam array.

2, Apakah kegunaan dari method populateData()?
#### Jawab:
untuk memasukkan data node array objek secara langsung ke dalam atribut array class BinaryTreeArray08, menentukan batas indeks terakhir (idxLast), mempermudah inisialisasi data binary tree tanpa harus memasukkan satu per satu secara manual lewat operasi insert.

3, Apakah kegunaan dari method traverseInOrder()?
#### Jawab:
untuk menelusuri dan menampilkan informasi data seluruh objek mahasiswa yang tersimpan di dalam binary tree. Urutan penelusuran secara In-Order dari kiri -> root -> kanan dan diproses secara rekursif.

4, Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan right child masing-masing?
#### Jawab:

<img width="389" height="146" alt="image" src="https://github.com/user-attachments/assets/b4f64991-41fe-48a0-a9d9-cc152c9828d4" />

tersimpan pada index 2 (idxstart == 2)
###
left child 2 x 2 + 1 = idx 5 | right child 2 x 2 + 2 = idx 6

5, Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?
#### Jawab:
untuk menandai bahwa data mahasiswa terakhir terletak pada indeks ke-6 di dalam array sebagai indikator batas akhir pembacaan tree, sehingga fungsi rekursif tahu kapan harus berhenti memproses data.

6, Mengapa indeks 2*idxStart+1 dan 2*idxStart+2 digunakan dalam pemanggilan rekursif, dan apa kaitannya dengan struktur pohon biner yang disusun dalam array?
#### Jawab:
Indeks 2*idxStart+1 dan 2*idxStart+2 untuk merepresentasikan hierarki binary tree ke dalam array tanpa perlu pointer. 2*idxstart+1 mengarah untuk left child dan 2*idxstart+1 mengara ke right child didalam array.

### Tugas Praktikum

1. Buat method di dalam class BinaryTree00 yang akan menambahkan node dengan cara rekursif (addRekursif()).
#### Jawab:

Modifikasi BinaryTree08:
###

<img width="856" height="204" alt="image" src="https://github.com/user-attachments/assets/dd2b7ed0-cd89-441d-bd1e-22ee23b7c341" />

###
Modifikasi BinaryTreeMain08:
###

<img width="781" height="185" alt="image" src="https://github.com/user-attachments/assets/225e877e-c70b-49ad-9a37-2c77995f9611" />

###
Output:
###

<img width="517" height="296" alt="image" src="https://github.com/user-attachments/assets/b963677d-0255-45c4-aa8e-cffe50141599" />

###
