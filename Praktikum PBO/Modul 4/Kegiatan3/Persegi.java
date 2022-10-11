package Kegiatan3;
import java.util.Scanner;

public class Persegi implements BangunDatar {
    Scanner input = new Scanner(System.in);
    public int sisi;

    public void setSisi() {
        System.out.printf("\n");
        System.out.println("=======================================");
        System.out.println("          Penghitung Persegi");
        System.out.println("=======================================");
        System.out.print("Masukkan sisi : ");
        sisi = input.nextInt();
    }

    public int getSisi() {
        return sisi;
    }

    @Override
    public double luas() {
        return (sisi * sisi);
    }

    @Override
    public double keliling() {
        return (4 * sisi);
    }

    void display(){
        System.out.println("---------------------------------------");
        System.out.println("Luas Persegi adalah : "+luas());
        System.out.println("Keliling Persegi adalah : "+keliling());
        System.out.println("---------------------------------------");
    }
}