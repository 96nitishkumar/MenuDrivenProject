package com.students.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudenDao {
	public static boolean inserStudentIntoDb(Student st){
		boolean f = false;
		try {
			Connection con = ConnectionProvide.createConnection();
			String q = "insert into student(name,mobno,age) values(?,?,?)";
			PreparedStatement psmt = con.prepareStatement(q);
			psmt.setString(1, st.getName());
			psmt.setString(2, st.getMobno());
			psmt.setInt(3, st.getAge());
			psmt.executeUpdate();
				f = true;	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		return f;
	}
}
