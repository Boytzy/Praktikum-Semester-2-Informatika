package Kegiatan1.BangunRuang;
import Kegiatan1.BangunRuang.bola;
import Kegiatan1.BangunRuang.kerucut;

public class Main 
{
    public static void main(String[] args) 
    {
        bola bl = new bola();
        bl.setJari();
        bl.display();

        kerucut kct = new kerucut();
        kct.setJari();
        kct.setPelukis();
        kct.setTinggi();
        kct.display();
    }    
}
