// Nama : Helmi Hananto Desandra
// NIM  : M0521029

public class PPBO_03_Latihan3 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        for (int i = 1; i < 6; i++) {
            System.out.println("elemen ke-" + i + " = " + arr[i]);

        /* (Perbaikan perulangan for)
         * for (int i = 0; i < 6; i ++) {
         *     System.out.println("elemen ke-" + i + " = " + arr[i]);
         * }
        */
        }
    }
}

// Berikut ini adalah code untuk menampilkan elemen (anggota) sebuah array yang berupa bilangan
// integer, mulai dari elemen pertama hingga terakhir.

// Eksekusi source code tersebut dan jelaskan apakah penulisan kode perulangan dengan for pada code
// tersebut sudah tepat dan tuliskan perbaikan apabila diperlukan!

// Jawab: penulisan kode perulangan for pada source code tersebut belum tepat, karena pengaksesan
// indeks dimulai dari indeks ke-1. Padahal, dalam array nomor indeks dimulai dari 0. Seharusnya, program
// mengakses array mulai dari indeks ke-0