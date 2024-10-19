public class Student extends Persion {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void showInfo() {
        System.out.println("Studen Id: " + id);
        System.out.println("Fullname: " + this.fullname);
    }
}
