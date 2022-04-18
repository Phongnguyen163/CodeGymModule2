package LuyenTap;

import java.util.ArrayList;

public class Family implements Comparable<Family>{
    ArrayList<Person> list = new ArrayList<>();
    private String address;
    private int members = 0;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMembers() {
        return members;
    }

    public void add(Person person) {
        list.add(person);
        members++;
    }

    public void delete(int id) {
        list.remove(findByID(id));
        members--;
    }

    public void edit(int id, Person person) {
        list.set(findByID(id), person);
    }

    public int findByName(String name) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public int findByID(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()== id) {
                return i;
            }
        }
        return -1;
    }

    public void display() {
        boolean check = false;
        for (Person e : list) {
            System.out.println(e);
            check = true;
        }
        if (check){
            System.out.println("Address: " + getAddress() + ", members: " + getMembers());
        }
        else {
            System.out.println("Chua co thanh vien nao");
        }
    }

    public void displayMinAge() {
        int min = list.get(0).getAge();
        for (Person person : list) {
            if (person.getAge() < min) {
                min = person.getAge();
            }
        }
        System.out.println(min);
    }

    @Override
    public int compareTo(Family o) {
        return this.getMembers() - o.getMembers();
    }
}
