package Kegiatan3;
import java.util.Scanner;;

public class Limas extends Persegi {
    Scanner input = new Scanner(System.in);
    public int tinggi;
    
    public void setSisi() {
        System.out.printf("\n");
        System.out.println("=======================================");
        System.out.println("       Penghitung Limas Persegi");
        System.out.println("=======================================");
        System.out.print("Masukkan sisi : ");
        sisi = input.nextInt();
    }

    public void setTinggi(){
        System.out.print("Masukkan tinggi : ");
        tinggi = input.nextInt();
    }

    public int getSisi() {
        return sisi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double getVolume(){
        return((luas()*tinggi)/3);
    }

    void display(){
        System.out.println("---------------------------------------");
        System.out.println("Volume limas persegi adalah : " + getVolume());
        System.out.println("---------------------------------------");
    }

}