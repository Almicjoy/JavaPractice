package feb3Practice.SaveToDB;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SaveData {
	
	public static void saveData(Student s) {
		DBConnection db = new DBConnection();
		Connection conn = db.getConnection();
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?)");
			ps.setInt(1, s.getStudentId());
			ps.setString(2, s.getStudentName());
			ps.setString(3, s.getStudentMajor());
			
			int x = ps.executeUpdate();
			if(x != 0) {
				System.out.println("Query Executed");
			} else {
				System.out.println("Issue with query");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	

	public static void main(String[] args) {
		Student s = new Student(23456, "Alessa", "Computer Science");
		saveData(s);
	}

}
