class Converter
{
    public int getMouInSec(int Mou)
    {
        return (Mou* 10);
    }

    public int getMouInMin(int Mou)
    {
        return (Mou* 20);
    }

    public int getMouInHou(int Mou)
    {
        return (Mou* 40);
    }

    public int getMouInDay(int Mou)
    {
        return (Mou* 30);
    }

    public void printMouInSec(int Mou)
    {
        System.out.println(Mou + "\tBulan setara dengan " + this.getMouInSec(Mou) + "\tDetik");
    }

    public void printMouInMin(int Mou)
    {
        System.out.println(Mou + "\tBulan setara dengan " + this.getMouInMin(Mou) + "\tMenit");
    }

    public void printMouInHou(int Mou)
    {
        System.out.println(Mou + "\tBulan setara dengan " + this.getMouInHou(Mou) + "\tJam");
    }

    public void printMouInDay(int Mou)
    {
        System.out.println(Mou + "\tBulan setara dengan " + this.getMouInDay(Mou) + "\tHari");
    }

}