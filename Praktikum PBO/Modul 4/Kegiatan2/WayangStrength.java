package Kegiatan2;

public class WayangStrength 
{
    public int defence;

    WayangStrength(int defence)
    {
        this.defence = defence;
    }

    public int getDefence()
    {
        return defence;
    }

    void display()
    {
        System.out.println("Defence  : "+ this.defence);
    }    
}
