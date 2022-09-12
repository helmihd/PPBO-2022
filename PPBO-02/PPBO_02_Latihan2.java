// Nama : Helmi Hananto Desandra
// NIM  : M0521029
public class PPBO_02_Latihan2 {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";
    public static void main(String args[]) {
        KURS_DOLLAR = 13500;
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}
// Apa yang salah dengan source code tersebut?
// Jawaban : Pada line ke 8 terdapat perintah untuk mengubah nilai dari variabel KURS_DOLLAR, hal ini mengakibatkan error
//           karena deklarasi dari variabel KURS_DOLLAR didahului oleh keyword final yang menyebabkan nilai dari variabel
//           ini tidak dapat diubah sehingga perubahan dari variabel ini akan menyebabkan error.

// Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
// Jawaban : keyword static adalah perintah khusus yang memungkinkan sebuah property atau method dapat diakses langsung
//           tanpa melalui object, cukup menulis nama class saja.