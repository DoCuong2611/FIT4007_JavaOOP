import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // VD1:
//        ArrayList<Double> Scores = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        for(int i=0; i<45; i++) {
//            System.out.println("Nhap diem sv thu " +(i+1) + ": ");
//            double score = scanner.nextDouble();
//            Scores.add(score);
//        }
//
//        System.out.println("Danh sach diem cua sinh vien: ");
//        for(int i=0; i<Scores.size(); i++) {
//            System.out.println("Diem cua sinh vien thu " +(i+1) + ": " + Scores.get(i));
//        }

        //VD2
//        ArrayList<Student> students = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        for(int i = 0; i<3; i++) {
//            System.out.println("Nhap id cua sv: ");
//            int id = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("Nhap ho ten cua sinh vien: ");
//            String fullName = scanner.nextLine();
//            System.out.println("Nhap dia chi cua sinh vien: ");
//            String address = scanner.nextLine();
//
//            Student std = new Student(id, fullName, address);
//            students.add(std);
//        }
//
//        for(Student std : students) {
//            std.display();
//        }

        ArrayList<String> NV = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so luong nhan vien: ");
        int NhanVien = scanner.nextInt();

        for(int i=0; i<NhanVien; i++) {
            System.out.println("Nhap ten nhan vien thu: " + (i+1) + ": ");
            String nhan_vien = scanner.nextLine();
            NV.add(nhan_vien);
        }
    }
}