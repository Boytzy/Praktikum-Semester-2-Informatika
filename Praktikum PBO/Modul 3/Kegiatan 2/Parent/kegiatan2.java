package Parent;
import Child.Sports;

public class kegiatan2{
public static void main(String[] args) {
    motor mtr = new motor();
    System.out.println("merk motor "+mtr.merk);
    System.out.println("harga motor "+mtr.harga);

    Sports kwsk = new Sports();
    kwsk.data(250, "Motor Sport");
    kwsk.data("BMW", 4);
}
}