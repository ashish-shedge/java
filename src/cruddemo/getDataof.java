package cruddemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class getDataof {
	public static void getData() throws ClassNotFoundException, SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "12345678");

		PreparedStatement pstmt = con.prepareStatement("Select * from Student");
		ResultSet rse = pstmt.executeQuery();
		while (rse.next()) {
			System.out.print(rse.getInt(1) + " ");
			System.out.print(rse.getString(2) + " ");
			System.out.print(rse.getString(3) + " ");
			System.out.print(rse.getString(4) + "  ");
			System.out.println();
		}

	}

}
