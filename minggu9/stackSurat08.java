package minggu9;

public class stackSurat08 {
    surat08[] stack;
    int top;
    int size;

    public stackSurat08(int size) { //konstruktor untuk stack
        this.size = size;
        stack = new surat08[size];
        top = -1;
    }

    public boolean isEmpty() { //method untuk kondisi stack empty
        return top == -1;
    }

    public boolean isFull() { //method untuk kondisi stack full
        return top == size - 1;
    }

    public void push(surat08 s) { // method untuk memasukan object kedalam stack
        if (!isFull()) {
            top++;
            stack[top] = s;
        } else {
            System.out.println("ERROR: Stack Penuh!!");
        }

    }

    public surat08 pop() { // method untuk mengeluarkan object dari stack untuk diproses di main
        if (!isEmpty()) {
            surat08 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("ERROR: Stack kosong!!");
            return null;
        }

    }

    public surat08 peekakhir() { //method untuk melihat isi stack terakhir (top)
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("ERROR: Stack Kosong! tidak ada surat yang dikumpulkan");
            return null;
        }
    }

    public void search(String name) { // method sequential search dan print hasil search
        surat08[] searchin = new surat08[stack.length];
        int idx = 0;
        for (int i = 0; i < top; i++) {
            if (stack[i].namaMHS.equalsIgnoreCase(name)) {
                searchin[idx] = stack[i];
                idx++;
            }
        }
        for (int i = 0; i < idx; i++) {
            System.out.println();
            System.out.println("Id Surat    : " + searchin[i].id_Surat);
            System.out.println("Nama        : " + searchin[i].namaMHS);
            System.out.println("Kelas       : "+ searchin[i].kelas);
            System.out.println("Jenis Izin  : "+ searchin[i].jenisIzin);
            System.out.println("Durasi Izin : "+ searchin[i].durasi);
            System.out.println("----------------------------");
        }

        if (idx != 0) {
            System.out.println("Surat yang dicari ada : "+idx);
        } else {
            System.out.println("Surat yang dicari tidak ada");
        }
    }

}