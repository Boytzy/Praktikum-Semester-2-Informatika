public class Main {
    
    public static void main(String[] args) 
    {
        Converter konverter = new Converter();
        int[] Mou = new int[4];

        Mou[0] = (2);
        Mou[1] = (2);
        Mou[2] = (2);
        Mou[3] = (2);

        konverter.printMouInSec(Mou[0]);
        konverter.printMouInMin(Mou[1]);
        konverter.printMouInHou(Mou[2]);
        konverter.printMouInDay(Mou[3]);
    }

}
