package Kegiatan2;
import Kegiatan2.Dinas;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DinasPertanahan {
    public static void main(String[] args) {
        DinasPertanahan panggil = new DinasPertanahan();
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        int pilih;

        do {
            try {
                System.out.print("==================\nMenu\n==================\n1. Buat Data\n2. Lihat Data\n3. Exit\n------------------\nMasukan Menu Yang di Pilih : ");
                pilih = input.nextInt();
                switch (pilih) {
        
                    case 1:
                        panggil.Create();
                        break;
                    case 2:
                        panggil.read();
                        break;
                    case 3:
                    loop = false;
                    System.out.println("Terima kasih telah menggunakan program ini");
                    break;
                    default:
                        break;
                }
            } catch (InputMismatchException e) {
                loop=false;
                System.out.println("Maaf, jangan inputkan huruf");
            }
        } while (loop);

    }

    void Create() {

        try {

            String file = "Data.txt";
            Scanner input = new Scanner(System.in);
            Dinas add = new Dinas();
            System.out.print("Input Alamat : ");
            add.setAlamat(input.next());
            System.out.print("Input Panjang Tanah : ");
            add.setPanjangTanah(input.nextInt());
            System.out.print("Input Luas Tanah : ");
            add.setLuasTanah(input.nextInt());

            File data = new File(file);
            FileWriter write = new FileWriter(data, true);
            write.write("\n====================\nData :\n--------------------\nAlamat : " + add.getAlamat() + "\nPanjang : " + add.getPanjangTanah()
                    + "\nLuas : " + add.getLuasTanah() + "\n====================\n");
            write.close();
        } catch (IOException e) {
            System.out.println("Error" + e);
        } catch (InputMismatchException e) {
            System.out.println("Error" + e);
        } finally {
            System.out.println("====================");
        }
    
    }

    void read() {
        try {
            String file = "Data.txt";
            File data = new File(file);
            Scanner write = new Scanner(data);

            while (write.hasNextLine()) {
                System.out.println(write.nextLine());
            }
            write.close();
        } catch (IOException e) {
            System.out.println("test");
            // TODO: handle exception
        }

    }
}

