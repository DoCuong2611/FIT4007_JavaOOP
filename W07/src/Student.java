public class Student {
    private int id;
    private String fullname;
    private String address;

    public Student(int id, String fullname, String address) {
        this.id = id;
        this.fullname = fullname;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display() {
        System.out.println("Id: " + id + " FullName: " + fullname + " Address: " + address);
    }
}
