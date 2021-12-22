package cruddemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

	public void deleteData() throws ClassNotFoundException, SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "12345678");

		PreparedStatement pstmt = con.prepareStatement("delete from Student where student_no=?");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student No want to delete");
		int a = sc.nextInt();
		pstmt.setInt(1, a);
		int x = pstmt.executeUpdate();
		if (x > 0) {
			System.out.println("deleted Successfully");
		}
	}
}
