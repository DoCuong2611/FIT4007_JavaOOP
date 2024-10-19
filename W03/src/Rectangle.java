public class Rectangle {
    float length;
    float width;
    int ID;

    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }

    public float getWith() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float Area () {
        return length * width;
    }
    public float Perimeter () {
        return 2 * (length + width);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void showInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + Area());
        System.out.println("Perimeter: " + Perimeter());
    }
}
