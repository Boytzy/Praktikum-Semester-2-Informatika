package Kegiatan1.BangunRuang;
import java.util.Scanner;

public class kerucut extends BangunRuang 
{
    public int jari;
    public int pelukis;
    public int tinggi;
    
    Scanner input = new Scanner(System.in);

    public void setJari()
    {
        System.out.println("\n=======================================");
        System.out.println("         Perhitungan kerucut");
        System.out.println("=======================================");
        System.out.print("Masukkan jari jari kerucut : ");
        jari = input.nextInt();
    }
    public void setPelukis()
    {
        System.out.println("---------------------------------------");
        System.out.print("Masukkan nilai garis pelukis : ");
        pelukis = input.nextInt();
    }
    public void setTinggi()
    {
        System.out.println("---------------------------------------");
        System.out.print("Masukkan tinggi kerucut : ");
        tinggi = input.nextInt();
    }

    public int getJari()
    {
        return jari;
    }

    public int getPelukis()
    {
        return pelukis;
    }

    public int getTinggi()
    {
        return tinggi;
    }
    
    @Override
    double getLuasPermukaan() 
    {
        return ((phi * jari  * pelukis) + (phi* jari* jari));
    };

    @Override
    double getVolume()
    {
        return((phi * jari * jari * tinggi)/3) ;        
    }

    public void display()
    {
        System.out.println("---------------------------------------");
        System.out.println("Hasil : ");
        System.out.println("Luas permukaan kerucut : "+getLuasPermukaan());
        System.out.println("Volume kerucut : "+getVolume());
        System.out.println("---------------------------------------");
        System.out.println("\n");
    }
}
