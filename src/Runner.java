import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        ArrayList<SinhVien> sinhViens = new ArrayList<>();
        ManagerSV o = new ManagerSV(sinhViens);
        Menu menu = new Menu(o);
        menu.menu();
    }
}
