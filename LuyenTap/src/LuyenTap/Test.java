package LuyenTap;

public class Test {
    public static void main(String[] args) {
        Family family = new Family();
        family.display();
        System.out.println("----------------------------");
        family.setAddress("Ha Noi");
        Person tv1 = new Person(1, "phong", 23, "Student");
        Person tv2 = new Person(2, "linh", 15, "Student");
        Person tv3 = new Person(3, "anh", 23, "Student");

        family.add(tv1);
        family.add(tv2);
        family.add(tv3);

        family.display();
        System.out.println("----------------------------");

        Person tv4 = new Person(1, "hien", 23, "Student");
        family.edit(1, tv4);

        family.delete(2);

        family.display();
        System.out.println("----------------------------");

        Town town = new Town();

        Family fml1 = new Family();
        fml1.setAddress("so 1 Ha Noi");
        Person ng1 = new Person(1, "phong", 23, "Student");
        Person ng2 = new Person(2, "linh", 15, "Student");
        Person ng3 = new Person(3, "anh", 23, "Student");
        Person ng4= new Person(3, "anh", 23, "Student");
        Person ng5 = new Person(3, "anh", 23, "Student");
        Person ng6 = new Person(3, "anh", 23, "Student");
        Person ng7 = new Person(3, "anh", 23, "Student");
        Person ng8 = new Person(3, "anh", 23, "Student");
        fml1.add(ng1);
        fml1.add(ng2);
        fml1.add(ng3);
        fml1.add(ng4);
        fml1.add(ng5);
        fml1.add(ng6);
        fml1.add(ng7);
        fml1.add(ng8);

        Family fml2 = new Family();
        fml2.setAddress("so 2 Ha Noi");
        Person ng9 = new Person(1, "phong", 23, "Student");
        Person ng10= new Person(2, "linh", 15, "Student");
        Person ng11 = new Person(3, "anh", 23, "Student");
        fml2.add(ng9);
        fml2.add(ng10);
        fml2.add(ng11);

        Family fml3 = new Family();
        fml3.setAddress("so 3 Ha Noi");
        Person ng12 = new Person(1, "phong", 23, "Student");
        Person ng13 = new Person(2, "linh", 15, "Student");
        fml3.add(ng12);
        fml3.add(ng13);

        town.add(fml1);
        town.add(fml2);
        town.add(fml3);
        town.display();
        System.out.println("---------------------------");

        Family fml4 = new Family();
        fml3.setAddress("so 2 Ha Noi");
        Person ng14 = new Person(1, "phong", 10, "Student");
        Person ng15 = new Person(2, "adwd", 10, "Student");
        Person ng16 = new Person(3, "aadsfc", 10, "Student");
        fml4.add(ng14);
        fml4.add(ng15);
        fml4.add(ng16);
        town.edit("so 2 Ha Noi", fml4);
        town.display();
        System.out.println("---------------------------");

        town.delete(2);
        town.sortByMembers();
        town.display();
    }
}
