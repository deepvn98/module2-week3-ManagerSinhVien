import java.util.ArrayList;
import java.util.Scanner;

public class ManagerSV {
    private ArrayList<SinhVien> sinhViens;

    public ManagerSV(ArrayList<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }
//Thêm sinh viên mới
    public void addSv(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập tên Sinh viên: ");
        String name =scanner.nextLine();
        System.out.print("Mời bạn nhập tuổi Sinh viên: ");
        int age =scanner.nextInt();
        System.out.print("Mời bạn nhập giới tính Sinh viên: ");
        Scanner scanner1 = new Scanner(System.in);
        String gender =scanner1.nextLine();
        System.out.print("Mời bạn nhập Số Điện thoại Sinh viên: ");
        Scanner scanner2 = new Scanner(System.in);
        String telephone =scanner2.nextLine();
        System.out.print("Mời bạn nhập Địa chỉ Sinh viên: ");
        Scanner scanner3 = new Scanner(System.in);
        String adress =scanner3.nextLine();
        SinhVien sinhVien = new SinhVien(name,age,gender,telephone,adress);
        sinhViens.add(sinhVien);
    }
    public void editSinhviens(Scanner scanner){
        System.out.print("Nhập vị trí bạn muốn sửa: ");
        int index = scanner.nextInt();
        System.out.print("Điền tên sinh viên: ");
        Scanner scanner0 = new Scanner(System.in);
        String name =scanner0.nextLine();
        System.out.print("Mời bạn nhập tuổi Sinh viên: ");
        int age =scanner.nextInt();
        System.out.print("Mời bạn nhập giới tính Sinh viên: ");
        Scanner scanner1 = new Scanner(System.in);
        String gender =scanner1.nextLine();
        System.out.print("Mời bạn nhập Số Điện thoại Sinh viên: ");
        Scanner scanner2 = new Scanner(System.in);
        String telephone =scanner2.nextLine();
        System.out.print("Mời bạn nhập Địa chỉ Sinh viên: ");
        Scanner scanner3 = new Scanner(System.in);
        String adress =scanner3.nextLine();
        SinhVien sinhVien = new SinhVien(name,age,gender,telephone,adress);
        sinhViens.set(index,sinhVien);
    }
    public void deleteSV(){
        System.out.println("Mời bạn nhập tên sinh viên muốn xoá: ");
        Scanner scanner =new Scanner(System.in);
        String name = scanner.nextLine();
        for (SinhVien o: sinhViens) {
            if (o.getName().equalsIgnoreCase(name)){
                sinhViens.remove(o);
            }
        }
    }

// Hiển thị thông tin
    public void showInfor(){
        for (SinhVien o: sinhViens) {

            System.out.println(o.toString());
        }

    }
    public void showInforSv(){
        System.out.println("Mời bạn nhập tên sinh viên bạn muốn cung cấp thông tin: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (SinhVien o: sinhViens) {
            if (o.getName().equals(name)){
                System.out.println(o.toString());
            }
        }


    }

}
