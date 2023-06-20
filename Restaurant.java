
package com.mycompany.restaurant;

import java.util.Scanner;

abstract class Makanan {
    String  namaMam;
     int harga;

    public Makanan(String namaMam, int harga) {
        this.namaMam = namaMam;
        this.harga = harga;
    }

    public abstract void info();
}

abstract class Minuman {
    String namaMinuman;
    int harga;
    String jenis;

    public Minuman(String namaMinuman, int harga, String jenis) {
        this.namaMinuman = namaMinuman;
        this.harga = harga;
        this.jenis = jenis;
    }

    public abstract void info();
}

class Soto extends Makanan {
    public Soto() {
        super("Soto", 15000);
    }

    public void info() {
        System.out.println("Nama Makanan: " + namaMam);
        System.out.println("Harga: Rp " + harga);
    }
}

class Mie extends Makanan {
    public Mie() {
        super("Mie", 12000);
    }

    public void info() {
        System.out.println("Nama Makanan: " + namaMam);
        System.out.println("Harga: Rp " + harga);
    }
}

class Teh extends Minuman {
    public Teh(String jenis) {
        super("Teh", 5000, jenis);
    }

    public void info() {
        System.out.println("Nama Minuman: " + namaMinuman);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Jenis: " + jenis);
    }
}

class Milktea extends Minuman {
    public Milktea(String jenis) {
        super("Milktea", 7000, jenis);
    }

    public void info() {
        System.out.println("Nama Minuman: " + namaMinuman);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Jenis: " + jenis);
    }
}
//output
public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("LIA'S DINER");
        System.out.println("Menu:");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("Pilih jenis menu (1/2): ");
        int menuChoice = scanner.nextInt();

        if (menuChoice == 1) {
            System.out.println("\nMakanan:");
            System.out.println("1. Soto");
            System.out.println("2. Mie");
            System.out.print("Pilih makanan (1/2): ");
            int foodChoice = scanner.nextInt();

            if (foodChoice == 1) {
                Makanan soto = new Soto();
                soto.info();
            } else if (foodChoice == 2) {
                Makanan mie = new Mie();
                mie.info();
            } else {
                System.out.println("Pilihan makanan tidak valid.");
            }

            System.out.print("Apakah Anda ingin memesan minuman? (ya/tidak): ");
            String orderDrinkChoice = scanner.next();
            if (orderDrinkChoice.equalsIgnoreCase("ya")) {
                System.out.println("\nMinuman:");
                System.out.println("1. Tea");
                System.out.println("2. Milktea");
                System.out.print("Pilih minuman (1/2): ");
                int drinkChoice = scanner.nextInt();

                if (drinkChoice == 1) {
                    System.out.print("Pilih jenis minuman (hot/dold): ");
                    String drinkType = scanner.next();
                    Minuman teh = new Teh(drinkType);
                    teh.info();
                } else if (drinkChoice == 2) {
                    System.out.print("Pilih jenis minuman (hot/cold): ");
                    String drinkType = scanner.next();
                    Minuman kopi = new Milktea(drinkType);
                    kopi.info();
                } else {
                    System.out.println("Pilihan minuman tidak valid.");
                }
            }
        } else if (menuChoice == 2) {
            System.out.println("\nMinuman:");
            System.out.println("1. Teh");
            System.out.println("2. Milktea");
            System.out.print("Pilih minuman (1/2): ");
            int drinkChoice = scanner.nextInt();

            if (drinkChoice == 1) {
                System.out.print("Pilih jenis minuman (hot/cold): ");
                String drinkType = scanner.next();
                Minuman teh = new Teh(drinkType);
                teh.info();
            } else if (drinkChoice == 2) {
                System.out.print("Pilih jenis minuman (hot/cold): ");
                String drinkType = scanner.next();
                Minuman kopi = new Milktea(drinkType);
                kopi.info();
            } else {
                System.out.println("Pilihan minuman tidak valid.");
            }
        } else {
            System.out.println("Pilihan menu tidak valid.");
        }
    }
}