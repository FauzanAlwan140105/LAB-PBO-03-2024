package No2;

import java.util.ArrayList;
import java.util.Random;

public class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    // Daftar kata-kata yang akan digunakan dalam balapan
    private String[] wordsToTypeList = {
        "Menuju tak terbatas dan melampauinya",
        "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
        "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",
        "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
        "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
        "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna",
        "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
        "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
        "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
        "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai"
    };

    // Method untuk mengatur kata-kata yang akan diketik dalam balapan
    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    // TODO 4 : Buat method addResult yang mana digunakan untuk menambahkan typer yang telah selesai (mengetik semua kata), ke dalam list race standing.
    public synchronized void addResult(Result result) {
        raceStanding.add(result);
    }

    // Method untuk mencetak hasil akhir dari balapan
    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("============================\n");

        // TODO 5 : Tampilkan klasemen akhir dari kompetisi, dengan format : {posisi}. {nama} = {waktu penyelesaian dalam detik} detik
        int position = 1;
        for (Result result : raceStanding) {
            System.out.println(position + ". " + result.getName() + "\t= " + result.getFinishTime() + " detik");
            position++;
        }
    }

    // TODO 7 : selama semua peserta belum selesai, maka tampilkan setiap 2 detik:
    /* 
     * Typing Progress ...
     * ===================
     * - {Nama kontestan}   => {teks yang telah diketik}
     * - {Nama kontestan}   => {teks yang telah diketik}
     * - {Nama kontestan}   => {teks yang telah diketik}
    */
    public void startRace() {
        // Memulai balapan dengan menjalankan thread setiap peserta
        for (Typer typer : raceContestant) {
            typer.start();
        }

        // Looping selama semua peserta belum selesai mengetik
        while (raceStanding.size() < raceContestant.size()) {
            try {
                Thread.sleep(2000); // Menggunakan 2000 ms (2 detik) sesuai TODO
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Typing Progress ...");
            System.out.println("===================");

            // Menampilkan progres setiap peserta
            for (Typer typer : raceContestant) {
                System.out.println("- " + typer.getBotName() + "\t=> " + typer.getWordsTyped());
            }
        }

        // TODO 8 : Tampilkan race standing setelah semua typer selesai.
        printRaceStanding();
    }
}
