package minggu12;

public class CM02Node08 {
    CM02Pesanan08 data; //data objek pesanan
    CM02Node08 prev;
    CM02Node08 next;

    public CM02Node08(CM02Pesanan08 data) { //pointer
        this.data = data;
        this.prev = null; //pointer previous
        this.next = null; //pointer next
    }
}
