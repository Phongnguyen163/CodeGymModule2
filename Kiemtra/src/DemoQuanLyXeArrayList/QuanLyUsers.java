package DemoQuanLyXeArrayList;

import java.util.ArrayList;
import java.util.List;

public class QuanLyUsers {
    List<User> list = new ArrayList<>();

    public boolean kiemTraDangNhap(String username, String pass) {
        for (User e : list) {
            if (e.getUserName().equals(username) && e.getPassWord().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    public boolean kiemTraDangKy(String username, String pass) {
        for (User e : list) {
            if (e.getUserName().equals(username)) {
                return false;
            }
        }
        list.add(new User(username, pass));
        return true;
    }
}
