import java.util.Scanner;

public class Menu {
     private ManagerSV o;

    public Menu(ManagerSV o) {
        this.o = o;
    }

    public ManagerSV getO() {
        return o;
    }

    public void setO(ManagerSV o) {
        this.o = o;
    }
    public void menu(){
        while (true){
            System.out.println(" Nhấn 1: nếu bạn muốn thêm sinh viên:\n Nhấn 2: nếu bạn muốn xoá Sinh viên:\n Nhấn 3: nếu bạn muốn sửa tông tin sinh viên:\n Nhấn 4: nếu bạn muốn xem thông tin tất cả sinh viên:\n Nhấn 5: nếu bạn muốn xem thông tin của một sinh viên:  ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    o.addSv();
                    break;
                case 2:
                    o.deleteSV();
                    break;

                case 3:
                    o.editSinhviens(scanner);
                    break;
                case 4:
                    o.showInfor();
                    break;
                case 5:
                    o.showInforSv();
                    break;
                default:
                    break;
            }
        }
    }
}
