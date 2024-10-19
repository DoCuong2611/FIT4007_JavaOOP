import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            System.out.println("Menu");
            System.out.println("1: Nhập thông tin và tạo các đối tợng xe1, xe2, xe3");
            System.out.println("2: Xuất bảng kê khai tiền thuế trước bạ");
            System.out.println("3: Thoát");
            System.out.println("Nhập lựa chọn: (1-3");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.println("");
            }
        }while(select != 3);
    }

    public static void inputVehicle() {
        
    }
}