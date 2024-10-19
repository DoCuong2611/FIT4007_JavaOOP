public class Tuoi0HopLe extends Exception{
    public Tuoi0HopLe(String message) {
        super(message);
    }

    public static void Tuoi0Hople(int Tuoi ) throws Tuoi0HopLe {
        if (Tuoi < 18) {
            throw new Tuoi0HopLe("Tuổi phải lớn hơn hoặc bằng 18");
        }
    }
    public static void main(String[] args) {
            try {
                Tuoi0Hople(15);
            } catch (Tuoi0HopLe e) {
                System.out.println(e.getMessage());
            }
    }
}

