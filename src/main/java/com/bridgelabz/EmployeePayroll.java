package com.bridgelabz;

import java.sql.*;
import java.util.Enumeration;

public class EmployeePayroll {
    public static void CreatedConnection() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root",
                    "Root");
            Statement st = conn.createStatement();
            st.execute("select sum(Salary) from employee_payroll");
            st.execute("select avg(Salary) from employee_payroll");
            st.execute("select min(Salary) from employee_payroll");
            st.execute("select count(Salary) from employee_payroll");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        CreatedConnection();
    }
}
