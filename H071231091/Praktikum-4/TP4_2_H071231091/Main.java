package TP4_2_H071231091;

class AcaraOlahraga{
    private String nama;
    private int durasi;
    private String penyiar;
    private String jenisolahraga;
    private String deskripsi;
    public AcaraOlahraga(){};

    public AcaraOlahraga(String nama, int durasi, String penyiar, String jenisolahraga, String deskripsi){
        this.nama = nama;
        this.durasi = durasi;
        this.penyiar = penyiar;
        this.jenisolahraga = jenisolahraga;
        this.deskripsi = deskripsi;

    }

    public String getnama(){
        return nama;
    }
    public void setnama(String nama){
        this.nama = nama;
    }
    public int getdurasi(){
        return durasi;
    }
    public void setdurasi(int durasi){
        this.durasi = durasi;
    }
    public String getpenyiar(){
        return penyiar;
    }
    public void setpenyiar(String penyiar){
        this.penyiar = penyiar;
    }
    public String getjenisolahraga(){
        return jenisolahraga;
    }
    public void setjenisolahraga(String jenisolahraga){
        this.jenisolahraga = jenisolahraga;
    }
    public String getdeskripsi(){
        return deskripsi;
    }
    public void setdeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }

    public void displayinfo(){
        System.out.println("nama =" + getnama());
        System.out.println("durasi = " + getdurasi());
        System.out.println("penyiar = " + getpenyiar());
        System.out.println("jenis olahraga = " + getjenisolahraga());
        System.out.println("deskripsi = " + getdeskripsi());
    }

}

public class Main{
    public static void main(String[] args) {
        AcaraOlahraga n = new AcaraOlahraga("Alwan", 12, "orang", "berenang", "jangan menyelam");
        n.displayinfo();
        AcaraOlahraga m = new AcaraOlahraga();
        m.setnama("Alwam");
        m.setdurasi(12);
        m.setpenyiar("orang");
        m.setjenisolahraga("basket");
        m.setdeskripsi("lompatan");

        System.out.println("nama =" + m.getnama());
        System.out.println("durasi = " + m.getdurasi());
        System.out.println("penyiar = " + m.getpenyiar());
        System.out.println("jenis olahraga = " + m.getjenisolahraga());
        System.out.println("deskripsi = " + m.getdeskripsi());

        selfutils.displayselfdata();


        
       
    }

}