package Child;

import Parent.motor;

public class Sports extends motor{
    public String merk = "zx25r";
    public int mesin;
    public int silinder;
    public String kelas;

    public void data(int mesin, String kelas){
        System.out.println("nama motor : "+this.merk+", Daya mesin : "+mesin+", Kelas  : "+kelas);
    }

    public void data(String merk, int silinder){
        System.out.println("merk motor : "+super.merk+", Silinder : "+silinder);
    }
}
