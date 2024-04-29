import java.util.Scanner;

class BangunRuang {
    static Scanner scan = new Scanner(System.in);
    static int a, b, c, t;
    static double pi = 3.14;
    static double volume, luas;

    static void input(String bentuk) {
        if (bentuk == "kubus") {
            System.out.print("input panjang sisi " + bentuk + ": ");
            a = scan.nextInt();
        } else if (bentuk == "balok") {
            System.out.print("input panjang sisi 1 " + bentuk + ": "); 
            a = scan.nextInt();
            System.out.print("input panjang sisi 2 " + bentuk + ": ");
            b = scan.nextInt();
            System.out.print("input panjang sisi 3 " + bentuk + ": ");
            c = scan.nextInt();
        } else {
            System.out.print("input jari-jari lingkaran: ");
            a = scan.nextInt();
            if (bentuk == "tabung") {
                System.out.print("input tinggi " + bentuk + ": ");
                t = scan.nextInt();
            }
        }
    }

    static void info(double volume, double luas, String bentuk) {
        System.out.println("volume " + bentuk + ": " + volume);
        System.out.println("luas permukaan " + bentuk + ": " + luas);
    }

}

class Kubus extends BangunRuang {
    static void run() { 
        input("kubus");
        volume = a * a * a;
        luas = 6 * a * a;
        info(volume, luas, "kubus");

    }
}

class Balok extends BangunRuang {
    static void run() {
        input("balok");
        volume = a * b * c;
        luas = 2 * ((a * b) + (a * c) + (b * c));
        info(volume, luas, "balok");
    }
}

class Bola extends BangunRuang {
    static void run() {
        input("bola");
        volume = (1.33) * pi * a * a * a;
        luas = 4 * pi * a * a;
        info(volume, luas, "bola");
    }
}

class Tabung extends BangunRuang {
    static void run() {
        input("tabung");
        volume = pi * a * a * t;
        luas = 2 * pi * a * (a + t);
        info(volume, luas, "tabung");
    }
}

class BangunDatar {
    static Scanner scan = new Scanner(System.in);
    static int a, b, c, d, t;
    static double pi = 3.14;
    static double luas, keliling;

    static void input(String bentuk) {
        if (bentuk == "lingkaran") {
            System.out.print("input jari-jari " + bentuk + ": ");
            a = scan.nextInt();
        } else if (bentuk == "persegi") {
            System.out.print("input panjang sisi " + bentuk + ": ");
            a = scan.nextInt();
        } else {
            System.out.print("input sisi 1 " + bentuk + ": ");
            a = scan.nextInt();
            System.out.print("input sisi 2 " + bentuk + ": ");
            b = scan.nextInt();
            System.out.print("input sisi 3 " + bentuk + ": ");
            c = scan.nextInt();
            System.out.print("input sisi 4 " + bentuk + ": ");
            d = scan.nextInt();

            if (bentuk == "trapesium") {
                System.out.print("input tinggi " + bentuk + ": ");
                t = scan.nextInt();
            }
        }
    }

    static double luas() {
        if (a != b) {
            luas = a * b;
        } else {
            luas = a * c;
        }
        return luas;
    }

    static double keliling() {
        keliling = a + b + c + d;
        return keliling;
    }

    static void info(double luas, double keliling, String bentuk) {
        System.out.println("luas " + bentuk + ": " + luas);
        System.out.println("keliling " + bentuk + ": " + keliling);
    }
}

class Persegi extends BangunDatar {
    static void run() {
        input("persegi");
        info(luas(), keliling(), "persegi");
    }
}

class PersegiPanjang extends BangunDatar {
    static void run() {
        input("persegi panjang");
        info(luas(), keliling(), "persegi panjang");
    }
}

class Lingkaran extends BangunDatar {
    static void run() {
        input("lingkaran");
        luas = pi * a * a;
        keliling = 2 * pi * a;
        info(luas, keliling, "lingkaran");
    }
}

class Trapesium extends BangunDatar {
    static void run() {
        input("trapesium");
        luas = (1 / 2) * (a + b) * t;
        info(luas, keliling(), "trapesium");
    }
}

public class TP5_1_H071231091 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("\n----------------------------------------");
        System.out.println("   ====== BANGUN RUANG =====");
        System.out.println("1. KUBUS\n2. BALOK\n3. BOLA\n4. TABUNG");
        System.out.println("\n   ====== BANGUN DATAR =====");
        System.out.println("5. PERSEGI\n6. PERSEGI PANJANG\n7. LINGKARAN\n8. TRAPESIUM");
        System.out.println("----------------------------------------");
        System.out.println("9. keluar");
        System.out.println("----------------------------------------");
        System.out.print("> ");
        int input = scan.nextInt();
        System.out.println("----------------------------------------");

        switch (input) {
            case 1:
                Kubus.run();
                menu();
                break;
            case 2:
                Balok.run();
                menu();
                break;
            case 3:
                Bola.run();
                menu();
                break;
            case 4:
                Tabung.run();
                menu();
                break;
            case 5:
                Persegi.run();
                menu();
                break;
            case 6:
                PersegiPanjang.run();
                menu();
                break;
            case 7:
                Lingkaran.run();
                menu();
                break;
            case 8:
                Trapesium.run();
                menu();
                break;
            case 9:
                System.out.println("=============== GOOD BYE ===============");
                break;
            default:
                break;
        }
    }
}
