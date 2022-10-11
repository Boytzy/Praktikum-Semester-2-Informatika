package Kegiatan2;

public class Wayang 
{
    public String name;
    public int Power;
    private WayangStrength strength;
    
    public Wayang(WayangStrength strength, String name, int Power){
        this.name = name;
        this.Power = Power;
        this.strength = strength;
    }

    public WayangStrength getWayangStrength(){
        return strength;
    }

    public String getName(){
        return name;
    }

    public int getPower(){
        return Power;
    }

    void display(){
        System.out.println("Nama : "+ this.name);
        System.out.println("Kekuatan  : "+ this.Power);
    }    
}
