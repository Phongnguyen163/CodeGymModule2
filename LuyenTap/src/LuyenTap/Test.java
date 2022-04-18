package LuyenTap;

public class Test {
    public static void main(String[] args) {
        Family family = new Family();
        family.display();
        family.setAddress("Ha Noi");
        Person tv1 = new Person(1, "phong", 23, "Student");
        Person tv2 = new Person(2, "linh", 15, "Student");
        Person tv3 = new Person(3, "anh", 23, "Student");

        family.add(tv1);
        family.add(tv2);
        family.add(tv3);

        family.display();

        Person tv4 = new Person(1, "hien", 23, "Student");
        family.edit(1, tv4);

        family.delete(2);

        family.display();
    }
}
