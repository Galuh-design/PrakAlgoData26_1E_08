package minggu11;

public class QueueLinkedList08 {
    QueueNode08 head, tail;
    int size = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(MahasiswaTugas08 data) { // memasukkan First kedalam queue
        QueueNode08 inQueue = new QueueNode08(data, null);
        if (isEmpty()) {
            head = inQueue;
            tail = inQueue;
        } else {
            tail.next = inQueue;
            tail = inQueue;
        }
        size++;
    }

    public void dequeue() { // mengeluarkan First pada queue
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            System.out.println("Mahasiswa yang keluar antrian: ");
            head.data.tampilData();
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan: ");
            head.data.tampilData();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void peekUjung() {
        if (!isEmpty()) {
            System.out.println("Antrian paling akhir: ");
            tail.data.tampilData();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void remove() { // Clear Queue
        head = null;
        tail = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void displaySize() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            QueueNode08 temp = head;
            System.out.println("Daftar Antrian:");
            while (temp != null) {
                temp.data.tampilData();
                temp = temp.next;
            }
        }
    }
}
