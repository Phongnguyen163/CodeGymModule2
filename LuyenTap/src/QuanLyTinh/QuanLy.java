package QuanLyTinh;

public interface QuanLy <E> {
    void add(E var1);

    void display();

    int search(String var1);

    void edit(String var1, E var2);

    void delete(String var1);
}
