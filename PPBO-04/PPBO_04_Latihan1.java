// Nama : Helmi Hananto Desandra
// NIM  : M0521029

import java.util.Scanner;

public class PPBO_04_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ketik bilangan pertama : ");
        int bil1 = sc.nextInt();
        System.out.print("Ketik bilangan kedua : ");
        int bil2 = sc.nextInt();
        double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
        System.out.println(bil1 + " / " + bil2 + " = " + hasil);
        sc.close();
    }
}

/* a. Ketik huruf misalnya f untuk input bilangan pertama kemudian tekan ENTER
 - Apakah program masih dapat dijalankan setelah user memasukkan f sebagai input untuk bilangan pertama?
   -> Tidak
 - Tulis output yang muncul!
   -> Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        at PPBO_04_Latihan1.main(PPBO_04_Latihan1.java:10)
 - Jelaskan maksud dari output tersebut!
   -> Terjadi input mismatch karena tipe data yang dimasukkan user tidak sesuai dengan tipe data yang 
*/

/* b. Pilih salah satu angka sebagai bilangan pertama misal 5, kemudian ketik angka 0 untuk input bilangan kedua. 
    Jelaskan output yang muncul!
 - Tulis output yang muncul!
   -> 5 / 0 = Infinity
 - Jelaskan maksud dari output tersebut!
   -> Karena tipe data variabel hasil adalah double, maka dimungkinkan pembagian oleh 0. Pembagian 0 pada tipe data ini akan menghasilkan ouput Infinity.
      Apabila tipe data hasil adalah integer, maka akan terjadi error by division by zero.
*/