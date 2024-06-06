import java.util.Scanner;

public class Karyawan {
    Scanner input = new Scanner(System.in);
    private String nama;
    private int umur;
    private int jabatan;
    private int gaji;

    private String jabatanString;

    public Karyawan(){}

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public String getJabatanString() {
        if(jabatan == 1){
            jabatanString = "Karyawan";
        }else if(jabatan == 2){
            jabatanString = "Manajer";
        }else if(jabatan == 3){
            jabatanString = "Cleaning Services";
        }else if(jabatan == 4){
            jabatanString = "Sales";
        }
        return jabatanString;
    }
    public void setJabatan(int jabatan) {
        this.jabatan = jabatan;
    }
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public void tambahKaryawan(){
        System.out.print("Masukkan nama: ");
        this.nama = input.nextLine();
        while(true){
            try {
                System.out.print("Masukkan umur: ");
                this.umur = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Tolong masukkan umur yang benar(int)");
            }  
        }

        System.out.print("Masukkan Gaji yang diinginkan: ");
        this.gaji = input.nextInt();
        System.out.println("Masukkan jabatan yang diinginkan: ");
        System.out.println("1. Karyawan");
        System.out.println("2. Manajer");
        System.out.println("3. Cleaning Service");
        System.out.println("4. Sales");
        System.out.print("Input: ");
        this.jabatan = input.nextInt();

    }
}
 

