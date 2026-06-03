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


