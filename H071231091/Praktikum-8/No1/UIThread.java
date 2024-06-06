package No1;

class UiThread extends Thread {
    // Jumlah total data yang harus dimuat
    private final int numData;
    // Jumlah data yang berhasil dimuat
    private int loadedData = 0;
    // Jumlah data yang gagal dimuat
    private int failedData = 0;
    // Waktu mulai pemuatan data
    private long startTime;

    // Konstruktor 
    public UiThread(int numData) {
        this.numData = numData;
    }

    
    public void run() {
        System.out.println("Start load " + numData + " Data.");
        // Mencatat waktu mulai
        startTime = System.currentTimeMillis();

        // Loop sampai semua data baik berhasil atau gagal dimuat
        while (loadedData + failedData < numData) {
            // Menghitung waktu yang telah berlalu dalam detik
            long elapsedTime = (System.currentTimeMillis() - startTime) / 1000 + 1;
            System.out.println("Loading... (" + elapsedTime + "s)");
            try {
                // Menunda eksekusi thread selama 1 detik
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Menghitung total waktu eksekusi
        long executionTime = System.currentTimeMillis() - startTime;
        System.out.println("Task Finish.");
        System.out.println("Time Execution : " + executionTime / 1000 + "s");

        // Menampilkan hasil akhir
        if (failedData == 0) {
            System.out.println("All data is successfully loaded");
        } else {
            System.out.println(loadedData + " Data Successfully loaded & " + failedData + " Data failed to load");
        }
    }

    // Method untuk menambah jumlah data yang berhasil dimuat
    public synchronized void incrementLoadedData() {
        loadedData++;
    }

    // Method untuk menambah jumlah data yang gagal dimuat 
    public synchronized void incrementFailedData() {
        failedData++;
    }
}
