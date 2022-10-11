class keluarga{
    String name;
    String alamat;

    void display(){
        System.out.println("Nama          : "+this.name);
        System.out.println("Alamat rumah  : "+this.alamat);
    }
}

class sulung extends keluarga {
    String istri = "Siska";
    int anak = 3;

    void display(){
        System.out.println("\nNama         : "+this.name);
        System.out.println("Alamat rumah : "+this.alamat);
        System.out.println("Nama Istri   : "+this.istri);
        System.out.println("Mempunyai "+this.anak+" anak");
    }
}

class tengah extends keluarga{
    String suami = "Jokowi";
    int anak = 2;
    void display(){
        System.out.println("\nNama         : "+this.name);
        System.out.println("Alamat rumah : "+this.alamat);
        System.out.println("Nama suami   : "+this.suami);
        System.out.println("Mempunyai "+this.anak+" anak");
    }
}

class bungsu extends keluarga{
    String istri = "Wati";
    int anak = 1;
    void display(){
        System.out.println("\nNama         : "+this.name);
        System.out.println("Alamat rumah : "+this.alamat);
        System.out.println("Nama istri   : "+this.istri);
        System.out.println("Mempunyai "+this.anak+" anak");
    }
}



public class main {
    public static void main(String[] args) {
        main bapak = new main();
        
        keluarga cemara = new keluarga();
        cemara.name = "Prabowo";
        cemara.alamat = "Perumahan Sukodono Permai";
        cemara.display();

        sulung pertama = new sulung();
        pertama.name = "Luhut";
        pertama.alamat = "Perumahan Green Hasana";
        pertama.display();

        tengah tengah1 = new tengah();
        tengah1.name = "Asri";
        tengah1.alamat = "Perumahan Bukit Cemara";
        tengah1.display();

        bungsu akhir = new bungsu();
        akhir.name = "Gatot";
        akhir.alamat = "Perumahan Bukit Hijau";
        akhir.display();
    }
}