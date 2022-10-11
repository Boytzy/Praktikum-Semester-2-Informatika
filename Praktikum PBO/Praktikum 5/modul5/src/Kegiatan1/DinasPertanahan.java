package Kegiatan1;
import java.util.InputMismatchException;
import java.util.Scanner;


public class DinasPertanahan {

    private String alamat;
    private int PanjangTanah;
    private int LuasTanah;
   
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setPanjangTanah(int PanjangTanah){
        this.PanjangTanah = PanjangTanah;
    }

    public int getPanjangTanah(){
        return PanjangTanah;
    }

    public void setLuasTanah(int LuasTanah){
        this.LuasTanah = LuasTanah;
    }

    public int getLuasTanah(){
        return LuasTanah;
    }

    


    public static void main(String[] args) throws Exception {
        DinasPertanahan d = new DinasPertanahan();
        Scanner input = new Scanner(System.in);

        try {
                       
            boolean running = true;
            while (running){
            
                System.out.print("\nInput Alamat: ");
                String alamat = input.nextLine();
                d.setAlamat(alamat);

                
                System.out.print("\nInput Luas Tanah: ");
                int luasTanah = input.nextInt();
                d.setLuasTanah(luasTanah);

                
                System.out.print("\nInput Panjang Tanah: ");
                int panjangTanah = input.nextInt();
                d.setPanjangTanah(panjangTanah);

                System.out.println("\nLanjutkan Program? (n/y)");
                char a = input.next().charAt(0);
                input.nextLine();

                if (a == 'n') {
                    running = false;
                }
            }
            input.close();
            
        } catch (InputMismatchException e) {
            //TODO: handle exception
            System.out.println("\nError, int yang berarti harus input angka!");
        }
        
        
        System.out.println("\nProgram berakhir");

        
    }
    
}
