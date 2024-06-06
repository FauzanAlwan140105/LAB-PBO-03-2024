import java.util.Scanner;

public class Pendididkan {
    Scanner input = new Scanner(System.in);
    private String pendidikan;

    public Pendididkan(){}

    public String getPendidikan(){
        return pendidikan;
    }

    public void pendidikan(){
        boolean loop = true;
        while(loop){
            System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
            this.pendidikan = input.nextLine();
            switch (pendidikan) {
                case "SD":
                    loop = false;
                    break;
                case "SMP":
                    loop = false;
                    break;
                case "SMA":
                    loop = false;
                    break;
                case "SMK":
                    loop = false;
                    break;
                case "S1":
                    loop = false;
                    break;
                case "S2":
                    loop = false;
                    break;
                case "S3":
                    loop = false;
                    break;
                default:
                    System.out.println("Tolong pilih Pendidikan yang benar");
                    break;
            }
        }
    }
}