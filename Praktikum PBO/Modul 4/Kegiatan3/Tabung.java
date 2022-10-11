package Kegiatan3;
import java.util.Scanner;;

public class Tabung extends Lingkaran{
    Scanner input = new Scanner(System.in);
    public int tinggi;

    public void setJari() {
        System.out.println("\n ");
        System.out.println("=======================================");
        System.out.println("           Pjgddjenghitung Tabung");
        System.out.println("=======================================");
        System.out.print("Masukkan jari jari : ");
        jari = input.nextInt();
    }

    public void setTinggi(){
        System.out.print("Masukkan tinggi : ");
        tinggi = input.nextInt();
    }

    public int getJari() {
        return jari;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double getVolume(){
        return(luas()*tinggi);
    }

    void display(){
        System.out.println("---------------------------------------");
        System.out.println("Volume tabung adalah : "+getVolume());
        System.out.println("---------------------------------------");
    }
}