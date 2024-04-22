class Alat{
    String nama;
}

class KUE {
    
    String bahan1;
     String bahan2;
     Alat alat = new Alat();
     String kuee;
    
    public KUE(String bahan1, String bahan2, String alat, String kuee) {
        this.bahan1 = bahan1;
        this.bahan2 = bahan2;
        this.alat = alat;
        this.kuee = kuee;
    }
    
    public String getBahan1() {
        return bahan1;
    }
    
    public void setBahan1(String bahan1) {
        this.bahan1 = bahan1;
    }
    
    // Getter and Setter for bahan2
    public String getBahan2() {
        return bahan2;
    }
    
    public void setBahan2(String bahan2) {
        this.bahan2 = bahan2;
    }
    
    // Getter and Setter for alat
    public String getAlat() {
        return alat;
    }
    
    public void setAlat(String alat) {
        this.alat = alat;
    }
    
    // Getter and Setter for kuee
    public String getkuee() {
        return kuee;
    }
    
    public void setkuee(String kuee) {
        this.kuee = kuee;
    }
    
    // Behaviours
    public void behavior1() {
        // Behaviour pertama
        buatKue();
    }
    
    private void buatKue() {
        System.out.println("Membuat kue dengan bahan " + bahan1 + " dan " + bahan2 + " menggunakan alat " + alat + " maka akan menjadi kue " + kuee);
    }
}

public class livecode {
    public static void main(String[] args) {
        KUE kue1 = new KUE("Tepung", "Gula", "Oven", "Brownis");
        System.out.println("Bahan 1 kue1: " + kue1.getBahan1());
        System.out.println("Bahan 2 kue1: " + kue1.getBahan2());
        System.out.println("Alat kue1: " + kue1.getAlat());
        System.out.println("Kue: " + kue1.getkuee());

        kue1.setBahan1("Telur");
        kue1.setBahan2("Mentega");
        kue1.setAlat("oven");
        kue1.setkuee("Brownis");
        kue1.behavior1();

}
}
