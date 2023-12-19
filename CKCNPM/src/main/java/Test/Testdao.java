package Test;

import java.util.ArrayList;

import Dao.PatientDao;
import Model.Patient;

public class Testdao {
	public static void main(String[] args) {
//		Patient pt3 = new Patient("P04", "Nguyen Thanh Kim", "Dau dau", "093211234", "Cam Le");
//		PatientDaogetInstance().insert(pt3);
//			Patient pt6 = new Patient("Hoang Huy" , "Masda" , "123" , "Gia Lai" , "P03");
//			PatientDao.getInstance().update(pt6);
		ArrayList<Patient> list = PatientDao.getInstance().selectAll();
		for (Patient pt1 : list) {
			System.out.println(pt1.toString());
		}
		
	
	}
}
