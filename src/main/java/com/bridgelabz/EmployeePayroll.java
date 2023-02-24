package com.bridgelabz;

import java.sql.*;
import java.util.Enumeration;

public class EmployeePayroll {
    public static void preparedStatement(String name, double salary) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root",
                    "Root");
            String s = "update employee_payroll set Salary = ? where Name=?";
            PreparedStatement ps = conn.prepareStatement(s);
            ps.setDouble(1, salary);
            ps.setString(2, name);
            ps.executeUpdate();
            boolean result = true;

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws SQLException {
        preparedStatement("Supriya",  300000.000);

    }
}