package Kegiatan1.BangunRuang;
import java.util.Scanner;

public class bola extends BangunRuang
{
    public int jari;

    Scanner input = new Scanner(System.in);

    public void setJari()
    {
        System.out.println("=======================================");
        System.out.println("           Perhitungan bola");
        System.out.println("=======================================");
        System.out.print("Masukkan jari jari bola : ");
        jari = input.nextInt();
    }

    public int getJari() 
    {
        return jari;
    }
    
    @Override
    double getLuasPermukaan()
    {
        return(4 * phi * jari *jari);
    }
    @Override
    double getVolume()
    {
        return((phi * jari * jari * jari * 4)/3);
    }

    public void display()
    {
        System.out.println("---------------------------------------");
        System.out.println("Hasil : ");
        System.out.println("Luas Permukaan Bola : "+getLuasPermukaan());
        System.out.println("Volume Bola : "+getVolume());
        System.out.println("---------------------------------------");
    }
}
