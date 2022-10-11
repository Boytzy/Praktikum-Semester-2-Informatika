public class KonversiMataUang {

    public static void main(String[] args)
    {
        int bulan = 1;
        int detik;
        int menit;
        int jam; 
        int hari;
    
        detik = bulan * 60;
        menit = bulan * 120;
        jam = bulan * 24;
        hari = bulan * 30;
        
        System.out.println("--------------------------------");
        System.out.println("Berikut hasil konversi waktu :");
        System.out.println("--------------------------------");
        System.out.println(bulan + "\tBulan = " + detik + "\tdetik");
        System.out.println(bulan + "\tBulan = " + menit + "\tmenit");
        System.out.println(bulan + "\tBulan = " + jam + "\tJam");
        System.out.println(bulan + "\tBulan = " + hari + "\tHari");

    }
}