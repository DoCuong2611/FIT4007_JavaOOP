public class Student {
    private int id;
    private String fullname;
    private float theoryMark;
    private float praticeMark;

    public Student() {
        this.id = 0;
        this.fullname = " ";
        this.theoryMark = 0;
        this.praticeMark = 0;
    }

    public Student(int id, String fullname, float theoryMark , float praticeMark ) {
        this.id = id;
        this.fullname = fullname;
        this.theoryMark  = theoryMark;
        this.praticeMark  = praticeMark ;
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

    public float getTheoryMark() {
        return theoryMark;
    }

    public void setTheoryMark(float theoryMark) {
        this.theoryMark  = theoryMark;
    }

    public float getPraticeMark() {
        return praticeMark;
    }

    public void setPraticeMark(float praticeMark) {
        this.praticeMark = praticeMark;
    }
    

}
