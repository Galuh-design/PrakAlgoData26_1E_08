package minggu14;

public class BinaryTreeArray08 {
    Mahasiswa08[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray08() {
        this.dataMahasiswa = new Mahasiswa08[15]; //memperbesar max untuk tugas 4
    }

    void populateData(Mahasiswa08 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
    //a) method add
    void add(Mahasiswa08 data) {
        if (idxLast == -1 || dataMahasiswa[0] == null) {
            dataMahasiswa[0] = data;
            idxLast = 0;
            return;
        }
        int current = 0;
        while (current < dataMahasiswa.length) {
            if (data.ipk < dataMahasiswa[current].ipk) {
                int leftChild = 2 * current + 1;
                if (leftChild >= dataMahasiswa.length) {
                    System.out.println("Array penuh!");
                    break;
                }
                if (dataMahasiswa[leftChild] == null) {
                    dataMahasiswa[leftChild] = data;
                    if (leftChild > idxLast) {
                        idxLast = leftChild;
                    }
                    break;
                }
                current = leftChild;
            } else {
                int rightChild = 2 * current + 2;
                if (rightChild >= dataMahasiswa.length) {
                    System.out.println("Array penuh!");
                    break;
                }
                if (dataMahasiswa[rightChild] == null) {
                    dataMahasiswa[rightChild] = data;
                    if (rightChild > idxLast) {
                        idxLast = rightChild;
                    }
                    break;
                }
                current = rightChild;
            }
        }
    }
    //b) method traversepreorder
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}//pushs
