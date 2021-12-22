package cruddemo;

import java.sql.SQLException;
import java.util.Scanner;

public class CallALL {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println("Select opetation");

			System.out.println("1] Insert Data");
			System.out.println("2] Get Data");
			System.out.println("3] update data");
			System.out.println("4] delete data");
			System.out.println("5] Get single Student data");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				test t1 = new test();
				t1.AddData();
				break;
			case 2:
				getDataof t2 = new getDataof();
				t2.getData();
				break;
			case 3:
				Update t3 = new Update();
				t3.UpdateData();
				break;
			case 4:
				Delete t4 = new Delete();
				t4.deleteData();
				break;
			case 5:
				GetSingleStudent t5 = new GetSingleStudent();
				t5.getStudentData();
				break;
			default:
				System.out.println("invalid ");
				break;
			}
			System.out.println("Do you want to continue y/n");
			ch = sc.next().charAt(0);
		} while (ch == 'y');
		System.out.println("Thank You for Using this Application");
	}

}
