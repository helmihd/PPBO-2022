// Nama : Helmi Hananto Desandra
// NIM  : M0521029
import java.text.DecimalFormat;

public class PPBO_02_Latihan1 {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.0;
        float c = 4.3f;

        double KonversiA = Double.valueOf(a);
        double KonversiC = Double.valueOf(c);

        double d = KonversiA + b + KonversiC;

        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("Hasil a + b + c = " +df.format(d));
    }
}

// ubah variabel a dan c ke tipe data double
// jumlahkan variabel a, b, dan c
// tampilkan hasil penjumlahan ketiga variabel

/*
 * Output yang diharapkan:
    17.3
 */
