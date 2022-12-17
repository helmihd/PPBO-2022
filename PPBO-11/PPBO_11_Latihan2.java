//  Nama    : Helmi Hananto Desandra
//  NIM     : M0521029

class Car extends Thread{
    String name;

    public Car(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " starts moving");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class PPBO_11_Latihan2 {
    public static void main(String[] args) {
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");

        car1.start();
        car2.start();
    }
}

/*
 * Jawablah pertanyaan berikut
 * 1.   Jalankan source code ini sebanyak 10x, hitung berapa kali car1 dan car2 
 *      sampai ke garis finish pertama kali (dilihat dari output terminal)!
 *      Jawab:
 *      car1 = 4 kali
 *      car2 = 6 kali
 * 
 *      
 * 2.   Mengapa setiap run, program bisa menghasilkan output yang berbeda padahal kode diimplementasi secara adil (setiap car "bergerak"
 *      selama 3 detik) dan kode tidak ada yg diubah? Jelaskan!
 *      Jawab: Karena tidak adanya sinkronisasi dan komunikasi antar Thread.
 * 
 * 
 * 3.   Anggap source code akan dimodifikasi menjadi:
 *      print "{car} reaches finish line" (pada line 22) hanya dilakukan sekali dan hanya untuk car pertama yang mencapai garis finish 
 *      Tanpa melakukan coding, berikan idemu supaya modifikasi di atas dapat dilakukan! 
 *      Jawab: dengan menggunakan variabel static dengan tipe data boolean misalnya Winner. 
 *      Nilai dawal dari variabel ini di set false.
 *      Ketika ada ada yang menang maka nilai diganti menjadi true.
 *      Untuk menentukan siapa yang mencapai finish terlebih dahulu dapat menggunakan percabangan if else.
 */