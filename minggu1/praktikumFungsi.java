
public class praktikumFungsi {

static double pendapatan (int stockhabis [][],double harga[],double totalcabang[])[]{
for (int i = 0; i < stockhabis.length; i++) {
    for (int j = 0; j < stockhabis[i].length; j++) {
        totalcabang[i] += (stockhabis[i][j]*harga[j]);
    }
}
return totalcabang;
        }
    public static void main(String[] args) {
        String cabang[] = { "RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4" };
        String bunga[] = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
        double hargabunga[] = { 75000, 50000, 60000, 10000 };
        double totalpercabang[] = new double[cabang.length];
        int stock08[][] = { { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 } };
        totalpercabang = pendapatan(stock08, hargabunga, totalpercabang);
        
        for (int i = 0; i < cabang.length; i++) {
            System.out.println("pendapatan cabang "+cabang[i]+" : "+totalpercabang[i]);
            if (totalpercabang[i] > 1500000) {
                System.out.println("STATUS cabang "+cabang[i]+" : Sangat Baik");
            } else{
                 System.out.println("STATUS cabang "+cabang[i]+" : Perlu Evaluasi");
          
                }
                System.out.println("---------------------------");
            }

    }
}