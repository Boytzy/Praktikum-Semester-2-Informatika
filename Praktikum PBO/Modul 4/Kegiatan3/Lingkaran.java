package Kegiatan3;
import java.util.Scanner;

public class Lingkaran implements BangunDatar {
    Scanner input = new Scanner(System.in);
    public int jari;

    public void setJari() {
        System.out.println("\n");
        System.out.println("=======================================");
        System.out.println("         Penghitung Lingkaran");
        System.out.println("=======================================");
        System.out.print("Masukkan jari jari : ");
        jari = input.nextInt();
    }

    public int getJari() {
        return jari;
    }

    

    @Override
    public double luas() {
        return (phi * jari * jari);
    }

    @Override
    public double keliling() {
        return (2 * phi * jari);
    }

    void display(){
        System.out.println("---------------------------------------");
        System.out.println("Luas lingkaran adalah : "+luas());
        System.out.println("Keliling lingkaran adalah : "+keliling());
        System.out.println("---------------------------------------");
    }

}