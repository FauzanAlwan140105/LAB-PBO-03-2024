package No1;
import java.util.concurrent.Future;

// Kelas BackgroundThread yang mengimplementasikan interface Runnable
class BackgroundThread implements Runnable {
    // Referensi ke objek UiThread
    private final UiThread uiThread;
    // Future untuk merepresentasikan status dan hasil dari operasi asynchronous
    public Future<?> future;

    // Konstruktor untuk menginisialisasi objek UiThread
    public BackgroundThread(UiThread uiThread) {
        this.uiThread = uiThread;
    }

    // Method run yang akan dieksekusi saat thread dijalankan
    public void run() {
        // Mendapatkan waktu eksekusi random dari TaskTimeHelper
        int executionTime = TaskTimeHelper.getRandomExecutionTime();

        try {
            // Menunda eksekusi thread selama waktu yang didapatkan, dikonversi ke milidetik
            Thread.sleep(executionTime * 1000L);
        } catch (InterruptedException e) {
            // Menangani interupsi thread
            e.printStackTrace();
        }

        // Jika waktu eksekusi lebih dari 4 detik, maka dianggap request timeout
        if (executionTime > 4) {
            System.out.println("Request Timeout");
            // Menambahkan jumlah data yang gagal di-load pada UiThread
            uiThread.incrementFailedData();
        } else {
            // Menambahkan jumlah data yang berhasil di-load pada UiThread
            uiThread.incrementLoadedData();
        }
    }
}
