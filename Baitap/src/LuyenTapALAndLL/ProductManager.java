package LuyenTapALAndLL;

import java.util.ArrayList;
import java.util.Collections;

public class ProductManager {
    ArrayList<Product> list = new ArrayList<>();

    public void addProduct(Product product) {
        list.add(product);
    }

    public void deleteProduct(int id) {
        list.remove(findById(id));
    }

    public void editProduct(int id, Product product) {
        list.set(findById(id), product);
    }

    public int findById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void findByName(String name) {
        for (Product product : list) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
    }

    public void sortDescending() {
        Collections.sort(list);
    }

    public void sortUpAscending() {
        Collections.reverse(list);
    }

    public void display() {
        System.out.println("Danh sach san pham: ");
        for (Product e : list) {
            System.out.println(e);
        }
    }
}
