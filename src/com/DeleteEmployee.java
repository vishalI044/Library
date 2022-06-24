package com;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteEmployee {
	public static void deleteUser() {
		Scanner scan = new Scanner(System.in);
		try {
			Connection con = DBConnection.initialise();
			Statement st = con.createStatement();
			System.out.println("enter employee department 1.permanent | 2.partTime | 3.contract");
			int employeeType = scan.nextInt();
			if (employeeType == 1) {
				System.out.println("enter the employee id");
				int employeeID = scan.nextInt();
				String delQuery = "DELETE FROM Permanent_Employee WHERE employeeID =" + employeeID + ";";
				st.executeUpdate(delQuery);
			} else if (employeeType == 2) {
				System.out.println("enter the employee id");
				int employeeID = scan.nextInt();
				String delQuery = "DELETE FROM PartTime_Employee WHERE employeeID =" + employeeID + ";";
				st.executeUpdate(delQuery);
			} else if (employeeType == 3) {
				System.out.println("enter the employee id");
				int employeeID = scan.nextInt();
				String delQuery = "DELETE FROM Contract_Employee WHERE employeeID =" + employeeID + ";";
				st.executeUpdate(delQuery);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		scan.close();
		System.out.println("user deleted");
	}
}
