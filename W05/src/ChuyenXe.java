import java.util.Scanner;
public class ChuyenXe {
    protected String Macx, NameTX, SoX;
    protected double DoanhThu;
    Scanner in = new Scanner(System.in);

    protected void setMacx(String macx) {
        Macx = macx;
    }

    protected String getMacx() {
        return Macx;
    }

    public String getNameTX() {
        return NameTX;
    }

    public void setNameTX(String nameTX) {
        NameTX = nameTX;
    }

    public String getSoX() {
        return SoX;
    }

    public void setSoX(String soX) {
        SoX = soX;
    }

    public double getDoanhThu() {
        return DoanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        DoanhThu = doanhThu;
    }

    public ChuyenXe() {
        this.Macx = "";
        this.NameTX = "";
        this.SoX = "";
        this.DoanhThu = 0;
    }

    public ChuyenXe(String macx, String nameTX, String soX, double doanhThu) {
        Macx = macx;
        NameTX = nameTX;
        SoX = soX;
        DoanhThu = doanhThu;
    }

    protected void nhap() {
        System.out.println("Nhap MaSo Chuyen: ");
        this.Macx=in.nextLine();
        System.out.println("Ho Ten Tai Xe: ");
        this.NameTX=in.nextLine();
        System.out.println("So Xe: ");
        this.SoX=in.nextLine();
        System.out.println("Doanh Thu: ");
        this.DoanhThu=in.nextDouble();
    }
    public String toString() {
        return "\nMS chuyen: " + this.Macx + "\nName Tai Xe: " + this.NameTX
            + "\nSo Xe: " + this.SoX;
    }
}
