package LuyenTapAccessModifier;

public class Student {

    private String name = "John";
    private String lop = "C02";

    public Student() {

    }

    public void setName (String name) {
        this.name = name;
    }

    public void setLop (String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lop='" + lop + '\'' +
                '}';
    }
}
