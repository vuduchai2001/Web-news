package Connect;

import java.util.ArrayList;
import java.util.List;
import Connect.loginDao;
import Entity.LienHe;
import Entity.TaiKhoan;
import Entity.TinTuc;

public class Test {
 
	public static void main(String[] args) throws Exception {
		loginDao loginDao = new loginDao();
		TaiKhoan tk = loginDao.check("admina", "admin");
		System.out.print(tk);
	}
}
