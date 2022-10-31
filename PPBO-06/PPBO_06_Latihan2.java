// Nama : Helmi Hananto Desandra
// NIM  : M0521029

import java.util.ArrayList;
import java.util.HashMap;
// import java.util.Map; // uncomment jika menggunakan entry set

public class PPBO_06_Latihan2 {
    public static void main(String[] args) {
        // pembuatan ArrayList mahasiswa
        ArrayList<Mahasiswa> mahasiswaArr = new ArrayList<Mahasiswa>();
        mahasiswaArr.add(new Mahasiswa("ABDI SANTYATMOKO", "M0521001", 2021));
        mahasiswaArr.add(new Mahasiswa("ADELINE FELLITA MARWA", "M0521002", 2021));
        mahasiswaArr.add(new Mahasiswa("ADI PRASETYA", "M0521003", 2021));
        mahasiswaArr.add(new Mahasiswa("ADITIA PRASETYA NUGRAHA", "M0521004", 2021));
        mahasiswaArr.add(new Mahasiswa("ADITYA TEGAR KARUNIA PUTRA TARRA'", "M0521005", 2021));

        // Tulis kode kalian di sini
        HashMap<String,Mahasiswa> HashMapMHS = new HashMap<String, Mahasiswa>();
        for (Mahasiswa mahasiswa : mahasiswaArr) {
            HashMapMHS.put(mahasiswa.NIM, mahasiswa);
        }

        for (HashMap.Entry<String, Mahasiswa> set : HashMapMHS.entrySet()) {
            System.out.printf("key: %s => data mahasiswa: %s, %s, %d\n", 
            set.getKey(),
            set.getValue().nama,
            set.getValue().NIM,
            set.getValue().angkatan);
        }
    }
}

class Mahasiswa {
    public String nama;
    public String NIM;
    public int angkatan;

    Mahasiswa(String nama, String NIM, int angkatan){
        this.nama = nama;
        this.NIM = NIM;
        this.angkatan = angkatan;
    }
}
// Buatlah HashMap dari data mahasiswaArr dengan NIM sebagai key
// Lalu, print setiap pair pada HashMap tersebut dengan format
// "key: {key} => data mahasiswa: {nama}, {nim}, {angkatan}"

// Hint:    
//  cara men-traverse HashMap dapat menggunakan metode entry set seperti
//  pada sourcecode HashMapDemo, atau kalian dapat menggunakan metode lainnya         

// Output yang diharapkan:
// key: M0521005 => data mahasiswa: ADITYA TEGAR KARUNIA PUTRA TARRA', M0521005, 2021
// key: M0521003 => data mahasiswa: ADI PRASETYA, M0521003, 2021
// key: M0521004 => data mahasiswa: ADITIA PRASETYA NUGRAHA, M0521004, 2021
// key: M0521001 => data mahasiswa: ABDI SANTYATMOKO, M0521001, 2021       
// key: M0521002 => data mahasiswa: ADELINE FELLITA MARWA, M0521002, 2021