package No2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Membuat instance dari TypeRacer
        TypeRacer typeRacer = new TypeRacer();

        // Mengatur kata-kata baru yang akan diketik dalam balapan
        typeRacer.setNewWordsToType();
        // Menampilkan kata-kata yang harus diketik
        System.out.println(" || Text to type || ");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        // Membuat array Typer dengan 3 peserta
        Typer[] typers = new Typer[3];
        typers[0] = new Typer("Bot Mansur", 80, typeRacer);
        typers[1] = new Typer("Bot ToKu", 72, typeRacer);
        typers[2] = new Typer("Bot Yukiao", 70, typeRacer);

        // Menambahkan peserta ke daftar kontestan balapan di TypeRacer
        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        // Memulai balapan
        typeRacer.startRace(); 
    }
}
