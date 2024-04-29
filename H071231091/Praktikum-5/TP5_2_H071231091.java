import java.util.Scanner;
import java.util.ArrayList;

class Product {
    String brand;
    int seriesNumber;
    double price;

    public String getBrand() {
        return brand;
    }

    public int getSeriesNumber() {
        return seriesNumber;
    }

    public double getPrice() {
        return price;
    }

    void displayInfo() {
        System.out.println("\nbrand               : " + this.brand);
        System.out.println("series number       : " + this.seriesNumber);
        System.out.println("price               : $" + this.price);
    }
}

class SmartPhone extends Product {
    double screenSize;
    int storageCapacity;

    public SmartPhone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("screen size         : " + this.screenSize + " inches");
        System.out.println("storage capacity    : " + this.storageCapacity);
    }
}

class Camera extends Product {
    int resolution;
    String lensType;

    public Camera(String brand, int seriesNumber, double price, int resolution, String lenstype) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
        this.resolution = resolution;
        this.lensType = lenstype;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("resolution          : " + this.resolution + "MP");
        System.out.println("lens type           : " + this.lensType);
    }
}

class Laptop extends Product {
    int ramSize;
    String processorType;

    public Laptop(String brand, int seriesNumber, double price, int ramSize, String processosrType) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
        this.ramSize = ramSize;
        this.processorType = processosrType;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("ram size            : " + this.ramSize + "gb");
        System.out.println("processor type      : " + this.processorType);
    }
}

public class TP5_2_H071231091 {
    private static ArrayList<Product> listProducts = new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. Tambah produk");
            System.out.println("2. Tampilkan semua produk");
            System.out.println("3. Beli produk");
            System.out.println("4. keluar");
            System.out.print("\nselect menu > ");
            try {
                int menu = scan.nextInt();
                System.out.println("------------------------------");
                switch (menu) {
                    case 1:
                        addProduct();
                        break;
                    case 2:
                        showProduct();
                        break;
                    case 3:
                        buyProduct();
                        break;
                    case 4:
                        System.out.println("TERIMAKASIH");
                        System.exit(0);

                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("invalid input, must be a number!!!");
                scan.nextLine(); // consume invalid input
            }
        }
    }

    public static void addProduct() {
        scan.nextLine(); // consume newline
        String brand;
        while (true) {
            System.out.print("input brand         : ");
            brand = scan.nextLine();
            if (!brand.isEmpty()) {
                break;
            } else {    
                System.out.println("invalid input, must fill the line");
            }
        }

        int seriesNum;
        while (true) {
            try {
                System.out.print("input nomor seri    : ");
                seriesNum = scan.nextInt();
                scan.nextLine(); // consume newline
                break;
            } catch (Exception e) {
                System.out.println("invalid input, must be a number!!!");
                scan.nextLine(); // consume invalid input
            }
        }

        double price;
        while (true) {
            try {
                System.out.print("input harga         : ");
                price = scan.nextDouble();
                scan.nextLine(); // consume newline
                break;
            } catch (Exception e) {
                System.out.println("invalid input, must be a number");
                scan.nextLine(); // consume invalid input
            }
        }

        while (true) {
            System.out.println("------------------------------------");
            System.out.println("pilih tipe produk :");
            System.out.println("1. Smartphone");
            System.out.println("2. Camera");
            System.out.print("3. Laptop\n>");
            try {
                int type = scan.nextInt();
                scan.nextLine(); // consume newline
                switch (type) {
                    case 1:
                        double screenSize;
                        while (true) {
                            try {
                                System.out.print("input screen size   : ");
                                screenSize = scan.nextDouble();
                                scan.nextLine(); // consume newline
                                break;
                            } catch (Exception e) {
                                System.out.println("invalid input, must be a number!!!");
                                scan.nextLine(); // consume invalid input
                            }
                        }

                        int storageCapacity;
                        while (true) {
                            try {
                                System.out.print("input storage capacity  : ");
                                storageCapacity = scan.nextInt();
                                scan.nextLine(); // consume newline
                                break;
                            } catch (Exception e) {
                                System.out.println("invalid input, must be a number!!!");
                                scan.nextLine(); // consume invalid input
                            }
                        }

                        SmartPhone handPhone = new SmartPhone(brand, seriesNum, price, screenSize, storageCapacity);
                        listProducts.add(handPhone);
                        menu();
                        break;

                    case 2:
                        int resolution;
                        while (true) {
                            try {
                                System.out.print("input resolution    : ");
                                resolution = scan.nextInt();
                                scan.nextLine(); // consume newline
                                break;
                            } catch (Exception e) {
                                System.out.println("invalid input, must be a number!!!");
                                scan.nextLine(); // consume invalid input
                            }
                        }

                        String lensetype;
                        while (true) {
                            System.out.print("input lensetype     : ");
                            lensetype = scan.nextLine();
                            if (!lensetype.isEmpty()) {
                                break;
                            } else {
                                System.out.println("invalid input, must fill the line!!!");
                            }
                        }

                        Camera cam = new Camera(brand, seriesNum, price, resolution, lensetype);
                        listProducts.add(cam);
                        menu();
                        break;

                    case 3:
                        int ram;
                        while (true) {
                            try {
                                System.out.print("input ram   : ");
                                ram = scan.nextInt();
                                scan.nextLine(); // consume newline
                                break;
                            } catch (Exception e) {
                                System.out.println("invalid input, must be a number!!!");
                                scan.nextLine(); // consume invalid input
                            }
                        }

                        String processor;
                        while (true) {
                            System.out.print("input processor   : ");
                            processor = scan.nextLine();
                            if (!processor.isEmpty()) {
                                break;
                            } else {
                                System.out.println("invalid input, must fill the line!!!");
                            }
                        }

                        Laptop laptop = new Laptop(brand, seriesNum, price, ram, processor);
                        listProducts.add(laptop);
                        menu();
                        break;

                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("invalid input, must be a number!!!");
                scan.nextLine(); // consume invalid input
            }
        }
    }

    private static void showProduct() {
        if (listProducts.isEmpty()) {
            System.out.println("there's no product, please add first!!!");
        } else {
            for (Product product : listProducts) {
                product.displayInfo();
            }
        }
    }

    private static void buyProduct() {
        int input;
        try {
            System.out.print("input nomor seri    : ");
            input = scan.nextInt();
            scan.nextLine(); // consume newline

            int index = -1;
            for (Product product : listProducts) {
                if (product.getSeriesNumber() == input) {
                    index = listProducts.indexOf(product);
                    break;
                }
            }

            if (index != -1) {
                System.out.println("\nanda telah membeli produk   : ");
                listProducts.get(index).displayInfo();
                listProducts.remove(listProducts.get(index));
                menu();
            } else {
                System.out.println("series number : " + input + " not found!!!");
                menu();
            }

        } catch (Exception e) {
            System.out.println("invalid input, must be a number!!!");
            scan.nextLine(); // consume invalid input
        }
    }
}