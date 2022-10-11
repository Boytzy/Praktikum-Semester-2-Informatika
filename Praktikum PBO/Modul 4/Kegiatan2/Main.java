package Kegiatan2;

public class Main {
    
    public static void main(String[] args) {
        WayangStrength wayang2 = new WayangStrength(10000);

        Wayang wayang1 = new Wayang(wayang2, "Gatotkaca", 2500);
        wayang1.display();


        System.out.println("Defense wayang adalah : "+wayang1.getWayangStrength().getDefence());
        
    }
}
