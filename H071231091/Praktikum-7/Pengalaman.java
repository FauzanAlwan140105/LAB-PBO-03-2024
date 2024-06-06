import java.util.Scanner;

public class Pengalaman extends kehidupan{
    Scanner input = new Scanner(System.in);
    private int pengalamanKerja = 4;
    private char organisasi;
    private String KerjaSebelumnya;
    private int gajiSebelumnya;

    public Pengalaman(){}

    public int getPengalamanKerja(){
        return pengalamanKerja;
    }

    public char getOrganisasi(){
        return organisasi;
    }

    public void setGajiSebelumnya(int gajiSebelumnya){
        this.gajiSebelumnya = gajiSebelumnya;
    }

    public int getGajiSebelumnya(){
        return gajiSebelumnya;
    }
    

    public String getKerjaSebelumnya(){
        if(pengalamanKerja == 1){
            KerjaSebelumnya = "Freelancer";
        }else if(pengalamanKerja == 2){
            KerjaSebelumnya = "Magang";
        }else if(pengalamanKerja == 3){
            KerjaSebelumnya = "Pekerja tetap";
        }else if(pengalamanKerja == 4){
            KerjaSebelumnya = "Tidak ada";
        }
        return KerjaSebelumnya;
    }

    public void prosesKehidupan(){
        boolean loop = true;
        while(loop){
            try {
                System.out.println("Pengalaman sebelumnya:");
                System.out.println("1. Freelancer");
                System.out.println("2. Magang");
                System.out.println("3. Pekerja Tetap");
                System.out.println("4. Tidak ada");
                System.out.print("Input: ");
                this.pengalamanKerja = input.nextInt();
                switch (pengalamanKerja) {
                    case 1:
                        loop = false;
                        break;
                    case 2:
                        loop = false;
                        break;
                    case 3:
                        loop = false;
                        break;
                    case 4:
                        loop = false;
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Tolong pilih 1-4");
            }
        }
    }

    public void cekOrganisasi(){
        boolean loop = true;
        while(loop){
            try {
                System.out.print("Apakah pernah mengikuti Organisasi?(Y/T): ");
                this.organisasi = input.next().charAt(0);
                switch (organisasi) {
                    case 'Y':
                        loop = false;
                        break;
                    case 'T':
                        loop = false;
                        break;
                    default:
                        System.out.println("Tolong hanya pilih Y/T");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Tolong hanya pilih Y/T");
            }
        }
    }

}