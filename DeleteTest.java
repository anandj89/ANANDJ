package com.sbi.hsql;
import java.sql.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

import com.sbi.exceptions.ApplicantDetailsNonExistException;

public class DeleteTest {

	public static void main(String[] args) throws SQLException {
		try
		{
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded.../registered....");
		
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected to the db....");
			Statement st=conn.createStatement();
			System.out.println("Enter applicant ID");
			Scanner sc1=new Scanner(System.in);
			int id=sc1.nextInt(); 
			PreparedStatement pst = conn.prepareStatement("delete from BANK_APPLICANT WHERE APPLICANT_ID=?");
			ResultSet rs=st.executeQuery("SELECT * FROM BANK_APPLICANT WHERE APPLICANT_ID="+id);
			if(rs.next()==false) {
				throw new ApplicantDetailsNonExistException("Application ID Already Exist");
				}
			else {
			pst.setInt(1, id);
			System.out.println("prepared statement is created..."+pst);
			
			int row = pst.executeUpdate();
			System.out.println("row deleted ..."+row);
			}
			pst.close();
			conn.close();
			System.out.println("DisConnected from the db....");
			
		}
		catch(ApplicantDetailsNonExistException e) {
			System.out.println("Application does not exist");
		}
		
	}

}


