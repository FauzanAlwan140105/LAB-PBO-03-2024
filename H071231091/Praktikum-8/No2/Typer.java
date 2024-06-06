// File: Typer.java
package No2;

public class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }

    // Setter untuk nama bot
    public void setBotName(String botName) {
        this.botName = botName;
    }

    // Setter untuk WPM (Words Per Minute)
    public void setWpm(int wpm) {
        this.wpm = wpm;
    }

    // Method untuk menambahkan kata yang sudah diketik
    public void addWordsTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    // Getter untuk kata yang sudah diketik
    public String getWordsTyped() {
        return wordsTyped;
    }

    // Getter untuk nama bot
    public String getBotName() {
        return botName;
    }

    // Getter untuk WPM
    public double getWpm() {
        return wpm;
    }

    @Override
    public void run() {
        // Mendapatkan kata-kata yang harus diketik dari objek TypeRacer
        String[] wordsToType = typeRacer.getWordsToType().split(" ");

        // TODO 1: Buatlah variable howLongToType yang memuat waktu yang diperlukan typer untuk menulis 1 kata dalam milisecond
        long startTime = System.currentTimeMillis();
        
        // Menghitung waktu yang diperlukan untuk mengetik satu kata dalam milidetik
        double howLongToType = 60000 / wpm;

        // TODO 2: Buatlah perulangan untuk menambahkan kata dengan method addWordToTyped setelah interval waktu sebanyak howLongToType
        for (String word : wordsToType) {
            // Menambahkan kata yang sudah diketik
            addWordsTyped(word);
            try {
                // Menunggu selama howLongToType milidetik sebelum mengetik kata berikutnya
                Thread.sleep((long) howLongToType);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Menambahkan indikator bahwa pengetikan selesai
        this.addWordsTyped("(selesai)");
        
        // TODO 3: Tambahkan typer yang telah selesai mengetik semua kata ke list typeRaceTabel yang ada di class typeRacer
        long finishTime = System.currentTimeMillis();
        
        // Menghitung waktu total yang dibutuhkan untuk mengetik semua kata dalam detik
        int elapsedTime = (int) ((finishTime - startTime) / 1000);
        
        // Menambahkan hasil ke TypeRacer
        typeRacer.addResult(new Result(botName, elapsedTime));
    }
}
