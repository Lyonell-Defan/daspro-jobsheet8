import java.util.Scanner;

public class Tugas3_14{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1){
            System.out.println("Jumlah toko minimal 1");
            return;
        }
        int totalbarangSeluruhToko = 0;
        int tokoTerbanyakNomor = 1;
        int barangMaksimal = -1;

        String ringkasanPerToko = "";

        for (int i = 1; i <= jumlahToko; i++){
            System.out.print("Masukan jumlah pelanggan untuk Toko " + i +": ");
            int jumlahPelanggan = sc.nextInt();

            while (jumlahPelanggan < 0) {
                System.out.print("Jumlah pelanggan tidak boleh negatif! input kembali: ");
                jumlahPelanggan = sc.nextInt();
            }

            int totalBarangTokoIni = 0;

            for (int j = 1; j <= jumlahPelanggan; j++){
                System.out.print("Masukan jumlah barang pelanggan ke-" + j + ": ");
                int jumlahBarang = sc.nextInt();

                while (jumlahBarang < 0 ){
                    System.out.print("Jumlah barang tidak boleh negatif! input kembali: ");
                    jumlahBarang = sc.nextInt();
                }

                totalBarangTokoIni += jumlahBarang;
            }

            ringkasanPerToko += "Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangTokoIni + "\n";
            
            if (totalBarangTokoIni > barangMaksimal){
                barangMaksimal = totalBarangTokoIni;
                tokoTerbanyakNomor = 1;
            }
        }

        System.out.println("--- Ringkasan Penjualan ---");
        System.out.println(ringkasanPerToko);
        System.out.println("Total barang seluruh toko: " + totalbarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyakNomor);

    }
}