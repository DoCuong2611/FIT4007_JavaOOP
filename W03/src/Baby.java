public class Baby {
    public String name;
    private int age;
    float weight;
    float height;

    // Methods(Phương thuc)
    // 1.Constructor
    public Baby(String name, int age, float weight, float height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Baby(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //2.getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    //Other methods (Khác)
    public void showInfo() {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Weight: "+ weight);
        System.out.println("Height: "+ height);
    }
}




