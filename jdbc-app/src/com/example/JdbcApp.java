package com.example;

import java.sql.*;
import java.util.Scanner;

public class JdbcApp {

	public static void main(String[] args) {
		try {
		// Create Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_ex_db","root","password");
		System.out.println("Conection Successful");
		//For Oracle - jdbc:orcale:thin:@localhost:1521/xe
		
		
		// Create Statement
		Statement smt=con.createStatement();
		
		// Execute Query
		
//		ResultSet rst = smt.executeQuery("select * from dept");
//		
//		// Process ResultSet
//		
//		while(rst.next()) {
//			System.out.println(rst.getInt("deptno")+"\t"+rst.getString("dname")+"\t"+rst.getString("loc"));
//		}

		
		PreparedStatement pst=con.prepareStatement("insert into dept values(?,?,?)");
		
		Scanner scan=new Scanner(System.in);
		
		int deptNo;
		String deptName;
		String location;
		
		System.out.println("Enter Dept No, Dept Name and Location");
		deptNo=scan.nextInt();
		deptName=scan.next()+scan.nextLine();
		location=scan.next()+scan.nextLine();
		
		pst.setInt(1, deptNo);
		pst.setString(2, deptName);
		pst.setString(3, location);
		
		//int rows=smt.executeUpdate("insert into dept values("+deptNo+",'"+deptName+"','"+location+"')");
		int rows=pst.executeUpdate();
		System.out.println(rows+ " Data Inserted..");
		
		//insert into dept values(100,'Funtions','Delhi');
		
		
		
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
