package cruddemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
	public void UpdateData() throws ClassNotFoundException, SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "12345678");

		PreparedStatement pstmt = con.prepareStatement(
				"update Student  set student_name=?, student_dob=?, student_doj=? where student_no =?");
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Student want upadted");
		int i = sc.nextInt();

		System.out.println("Enter updated name");
		String name = sc.next();
		System.out.println("Enter updated DOB");
		String dob = sc.next();
		System.out.println("Enter updated DOJ");
		String doj = sc.next();
		pstmt.setString(1, name);
		pstmt.setString(2, dob);
		pstmt.setString(3, doj);
		pstmt.setInt(4, i);
		int p = pstmt.executeUpdate();
		if (p > 0) {
			System.out.println("upadated");
		}
	}
}
