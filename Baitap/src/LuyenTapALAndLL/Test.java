package LuyenTapALAndLL;


public class Test {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager();

        Product p1 = new Product(1, "book", 20000);
        Product p2 = new Product(2, "notebook", 15000);
        Product p3 = new Product(3, "pen",5000);

        pm.addProduct(p1);
        pm.addProduct(p2);
        pm.addProduct(p3);
        pm.display();
        System.out.println("---------------------");

        Product p4 = new Product(1, "ruler", 10000);
        pm.editProduct(1, p4);
        pm.display();
        System.out.println("------------------------");

        pm.sortDescending();
        pm.display();
        System.out.println("------------------------");

        pm.sortUpAscending();
        pm.display();
        System.out.println("-------------------------");

        pm.findByName("ruler");
        System.out.println("------------------------");

        pm.deleteProduct(2);
        pm.display();
    }
}
