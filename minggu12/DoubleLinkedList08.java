package minggu12;

public class DoubleLinkedList08 {
    Node08 head;
    Node08 tail;
    int size;

    public DoubleLinkedList08() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa08 data) {
        Node08 newNode = new Node08(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++; 
    }

    public void addLast(Mahasiswa08 data) {
        Node08 newNode = new Node08(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++; 
    }

    public void insertAfter(String keyNim, Mahasiswa08 data) {
        Node08 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        Node08 newNode = new Node08(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else { 
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++; 
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node08 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node08 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        Mahasiswa08 deletedData = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--; 
        System.out.println("Data berhasil dihapus.");
        deletedData.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        Mahasiswa08 deletedData = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--; 
        System.out.println("Data berhasil dihapus.");
        deletedData.tampil();
    }

    // Tugas 1: Menambahkan node pada indeks tertentu
    public void add(int index, Mahasiswa08 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks di luar batas.");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node08 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node08 newNode = new Node08(data);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    // Tugas 2: Menghapus node setelah node yang memiliki data key NIM tertentu
    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        Node08 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        if (current.next == null) {
            System.out.println("Tidak ada data setelah NIM " + keyNim + " untuk dihapus.");
            return;
        }
        
        Node08 target = current.next;
        Mahasiswa08 deletedData = target.data;

        if (target == tail) {
            current.next = null;
            tail = current;
        } else {
            current.next = target.next;
            target.next.prev = current;
        }
        size--;
        System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus:");
        deletedData.tampil();
    }

    // Tugas 3: Menghapus node pada indeks tertentu
    public void remove(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Indeks di luar batas atau list kosong.");
            return;
        }
        
        Mahasiswa08 deletedData;
        if (index == 0) {
            deletedData = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        } else if (index == size - 1) {
            deletedData = tail.data;
            tail = tail.prev;
            tail.next = null;
        } else {
            Node08 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            deletedData = current.data;
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
        System.out.println("Data pada indeks ke-" + index + " berhasil dihapus:");
        deletedData.tampil();
    }

    // Tugas 4a: Menampilkan data pada node pertama
    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        System.out.println("Data Pertama:");
        head.data.tampil();
    }

    // Tugas 4b: Menampilkan data pada node terakhir
    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        System.out.println("Data Terakhir:");
        tail.data.tampil();
    }

    // Tugas 4c: Menampilkan data pada node pada indeks tertentu
    public void getIndex(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Indeks tidak valid atau list kosong.");
            return;
        }
        Node08 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Data pada indeks ke-" + index + ":");
        current.data.tampil();
    }

    // Tugas 5: Mengembalikan jumlah data (size) pada Double Linked List
    public int getSize() {
        return this.size;
    }
}