import java.util.Scanner;

public class main {
    private int NilaiProgdas;
    private int NilaiKalkulus;
    private int NilaiOrkom;
    private double hasil;

    Scanner input = new Scanner(System.in);
    
    public void setNilaiProgdas(){
        System.out.println("==========================================");
        System.out.print("Masukkan nilai Pemrograman dasar : ");
        this.NilaiProgdas = input.nextInt();
    }

    public void setNilaiKalkulus(){
        System.out.print("Masukkan nilai kalkulus          : ");
        this.NilaiKalkulus = input.nextInt();
    }

    public void setNilaiOrkom(){
        System.out.print("Masukkan nilai Orkom             : ");
        this.NilaiOrkom = input.nextInt();
    }

    public int getNilaiProgdas(){
        return NilaiProgdas;
    }

    public int getNilaiKalkulus() {
        return NilaiKalkulus;
    }
    
    public int getNilaiOrkom() {
        return NilaiOrkom;
    }

    public double hasil (double progdas, double orkom, double kalkulus) {
        double rumus = (progdas + orkom + kalkulus) / 3;
        return hasil = rumus; 
    }

    public void cekNilai(double hasil){
        if(hasil < 70){
            System.out.println("Maaf, Anda gagal");
        }
        else{
            System.out.println("Selamat, Anda lulus");
        }
    }

    public static void main (String[] args) {
        main user = new main();
        user.setNilaiProgdas();
        user.setNilaiKalkulus();
        user.setNilaiOrkom();

        System.out.println("==========================================");
        System.out.println("Nilai Progdas   Anda : " + user.getNilaiProgdas());
        System.out.println("Nilai Kalkulus  Anda : " + user.getNilaiKalkulus());
        System.out.println("Nilai Orkom     Anda : " + user.getNilaiOrkom());
        System.out.println("==========================================");
        System.out.println("Rata-rata : " + user.hasil(user.getNilaiProgdas(), user.getNilaiOrkom(), user.getNilaiKalkulus()));
        System.out.println("==========================================");
        double hasilFinal = user.hasil(user.getNilaiProgdas(), user.getNilaiOrkom(), user.getNilaiKalkulus());
        System.out.print("Status    : ");
        user.cekNilai(hasilFinal);
        System.out.println("==========================================");
    }
}
