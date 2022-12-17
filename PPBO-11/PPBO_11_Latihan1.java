//  Nama    : Helmi Hananto Desandra
//  NIM     : M0521029

class MyThread extends Thread {
    int length;
    String marker;

    public MyThread(int length, String marker){
        this.length = length;
        this.marker = marker;

        var mainThread = Thread.currentThread().getName();
        System.out.println(this.getName() + " is created on " + mainThread);
    }

    @Override
    public void run(){
        int count = 0;
        while(count < length){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            count++;
            var progressString = getProgress(count, marker);
            System.out.println(this.getName() + ": " + progressString);
        }
    }

    private String getProgress(int count, String marker){
        var result = "";
        for(int i=0; i<count; i++){
            result+=marker;
        }

        return result;
    }
}

public class PPBO_11_Latihan1 {
    public static void main(String[] args) {
        System.out.println("Hello from thread '" + Thread.currentThread().getName() + "'\n");

        var thread1 = new MyThread(10, "#");
        var thread2 = new MyThread(5, ">");

        thread1.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
    }
}

/* 
 * Jawablah pertanyaan berikut
 * 1. Jelaskan mengapa program di atas tidak bisa dijalankan (memiliki error/exception)
 *    Jawab : Program tidak bisa dijalankan karena tidak adanya IntterruptedException pada saat menggunakan fungsi sleep().
 * 
 * 
 * 2. Jelaskan dan terapkan bagaimana cara mengatasinya. Kemudian, kumpulkan program dalam keadaan sudah bisa dijalankan
 *    Jawab : Kita dapat menggunakan try & catch untuk menghandle InterruptedException.
 * 
 * 
 * 3. Jelaskan secara singkat algoritma program di atas
 *    Jawab : 
 *    Program ini membuat 2 thread yaitu thread-0 dan thread-1.
 *    Thread-0 mencetak # mulai dari i=1 sampai i=10 kali, dengan mencetak # sebanyak i pada setiap perulangan.
 *    Thread-1 mencetak > mulai dari i=1 sampai i=5 kali, dengan mencetak > sebanyak i pada setiap perulangan.
*/