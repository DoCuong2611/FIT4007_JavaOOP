public class Vehincle {
    private int capacity;
    private float tax;
    private String vehicleType;
    private float worth;

    public Vehincle(int capacity, float tax, String vehicleType, float worth) {
        this.capacity = capacity;
        this.vehicleType = vehicleType;
        this.worth = worth;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public float getWorth() {
        return worth;
    }

    public void setWorth(float worth) {
        this.worth = worth;
    }

    public float getRegistrationTax() {
        if(capacity < 100) {
            return worth * 0,01;
        } else if (capacity >=100 && capacity <= 200) {
            return worth * 0,03;
        }
        else {
            return worth * 0,05;
        }
    }

    public void showInfo() {
        System.out.println("Loại xe: " + vehicleType);
        System.out.println("Dung tích:  " + capacity);
        System.out.println("Trị giá xe: : " + worth);
        System.out.println("Thuế: " + getRegistrationTax());
    }
}
