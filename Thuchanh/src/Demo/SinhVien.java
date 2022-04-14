package Demo;

public class SinhVien {
    private String id;
    private String name;
    private int tuoi;

    public SinhVien() {}

    public SinhVien(String id, String name, int tuoi) {
        this.id = id;
        this.name = name;
        this.tuoi = tuoi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
