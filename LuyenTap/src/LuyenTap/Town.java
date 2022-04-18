package LuyenTap;

import java.util.ArrayList;

public class Town {
    ArrayList<Family> list2 = new ArrayList<>();

    public void add(Family family) {
        list2.add(family);
    }

    public void delete(int index) {
        list2.remove(index - 1);
    }

    public void edit(String address, Family family) {
        list2.set(findByAddress(address), family);
    }

    public int findByAddress(String address) {
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i).getAddress().equals(address)){
                return i;
            }
        }
        return -1;
    }

    public void display() {
        for (int i = 0; i < list2.size(); i++) {
            list2.get(i).display();
        }
    }
}
