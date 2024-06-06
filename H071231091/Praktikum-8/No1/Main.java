package No1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        int numData = 4; // Jumlah data yang ingin diload

        // Membuat UI Thread
        UiThread uiThread = new UiThread(numData);
        uiThread.start();

        // Membuat thread pool untuk BackgroundThread
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Membuat daftar BackgroundThread
        List<BackgroundThread> backgroundThreads = new ArrayList<>();
        List<Future<?>> futures = new ArrayList<>();
        for (int i = 0; i < numData; i++) {
            BackgroundThread backgroundThread = new BackgroundThread(uiThread);
            backgroundThreads.add(backgroundThread);
            futures.add(executorService.submit(backgroundThread));
        }

        // Menunggu semua BackgroundThread selesai
        for (Future<?> future : futures) {
            try {
                future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Menutup thread pool
        executorService.shutdown();
    }
}