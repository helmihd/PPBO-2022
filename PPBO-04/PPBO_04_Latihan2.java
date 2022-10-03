// Nama : Helmi Hananto Desandra
// NIM  : M0521029

import java.util.InputMismatchException;
import java.util.Scanner;

public class PPBO_04_Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2;
        boolean lanjut = true;
        while (lanjut) {
            try {
                System.out.print("Ketik bilangan pertama : ");
                bil1 = sc.nextInt();
                System.out.print("Ketik bilangan kedua : ");
                bil2 = sc.nextInt();
                double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);

                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            }
        }

        sc.close();
    }
}

// Ketik huruf untuk digunakan sebagai input bilangan pertama kemudian klik ENTER. 
// Jelaskan perbedaannya dengan source code sebelumnya (Latihan1)!
/* Jawab:
   -> Pada source code ini terdapat input match exception menggunakan try {...} catch {...} dalam perulangan while.
      Di mana program akan menangkap exception kemudian mengulangan code yang ada di dalam try {...}.
      Pada source code sebelumnya program akan mengalami error karena tidak adanya exception yang menghandle input mismatch.
*/