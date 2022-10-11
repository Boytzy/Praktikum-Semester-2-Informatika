import java.util.Scanner;

public class Main {
    private String username;
    private String nim;
    private String password;

    Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        daftar();
    }

    public static void daftar() 
    {
        Main user = new Main();
        user.setUsername();
        user.setNim();
        user.setPassword();
        System.out.println ("------------------------------------------------------");
        System.out.print   ("Selamat " +user.getUsername());
        System.out.println ("\tberhasil mendaftar");
        System.out.println ("------------------------------------------------------");
        System.out.println ("\nBerikut Username, NIM, beserta Password anda :");
        System.out.println ("Username      : "+user.getUsername());
        System.out.println ("NIM           : "+user.getNim());
        System.out.println ("Password      : "+user.getPassword());
    }

    public void setUsername() 
    {
        System.out.println ("|----------------PENDAFTARAN------------------|");
        System.out.print ("Username       : "                            );
        this.username = input.nextLine();
    }
    
    public void setNim()
    {
        do 
        {
        System.out.print ("Masukkan NIM Anda  : ");
        nim = input.nextLine();
        if(nim.length() != 15) 
        {
            System.out.println ("NIM tidak kurang atau tidak lebih dari 15 angka");
        }
        else {this.nim = nim;}
    }
    while(nim.length() != 15);
    }

    public void setPassword()
    {
        do 
        {
        System.out.print ("Masukkan Password  : ");
        password = input.nextLine();
        if(password.length() < 8) 
        {
            System.out.println ("Password paling sedikit 8 karakter");
        }
        else {this.password = password;}
    }
    while(password.length() < 8);
    }

    public String getUsername()
    {
        return username;
    }

    public String getNim()
    {
        return nim;
    }

    public String getPassword()
    {
        return password;
    }
}