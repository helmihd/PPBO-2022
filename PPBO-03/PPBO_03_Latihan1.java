// Nama : Helmi Hananto Desandra
// NIM  : M0521029

import java.util.Scanner;

public class PPBO_03_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_pembelian;
        double diskon;
        System.out.println("Total pembelian : ");

        // tambahkan code untuk menyimpan nominal total pembelian
        total_pembelian = sc.nextInt();

        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        if (total_pembelian < 50000) {
            diskon = 0;
        } else if (total_pembelian < 75000) {
            diskon = Double.valueOf(total_pembelian) * 0.05;
        } else if (total_pembelian < 125000) {
            diskon = Double.valueOf(total_pembelian) * 0.15;
        } else {
            diskon = Double.valueOf(total_pembelian) * 0.2;
        }

        // tambahkan code untuk menampilkan nominal yang harus dibayar 
        // sesuai dengan ketentuan diskon yang diberikan
        System.out.println("Total pembelian anda: " + total_pembelian);
        System.out.println("Total diskon yang anda dapat: " + diskon);
        System.out.println("Total yang harus anda bayar: " + (total_pembelian - diskon));
        
        sc.close();
    }
}

// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan diskon kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000