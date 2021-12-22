package cruddemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class test {
	public void AddData() throws ClassNotFoundException, SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "12345678");

		PreparedStatement pstmt = con.prepareStatement("insert into Student values(?,?,?,?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student No");
		int no = sc.nextInt();
		System.out.println("Enter Student name");
		String name = sc.next();
		System.out.println("Enter Student DOB");
		String dob = sc.next();
		System.out.println("Enter Student DOJ");
		String doj = sc.next();

		pstmt.setInt(1, no);
		pstmt.setString(2, name);
		pstmt.setString(3, dob);
		pstmt.setString(4, doj);

		int p = pstmt.executeUpdate();
		if (p > 0) {
			System.out.println("data inserted succesfully");
		} else {
			System.out.println("Not Inserted");
		}
	}

}
