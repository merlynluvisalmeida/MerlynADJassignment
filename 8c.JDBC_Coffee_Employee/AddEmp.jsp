
/*
Develop a JDBC project using JSP to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and
Generate the report as follows for the TABLE Emp (Emp_NO , Emp_Name, Basicsalary ) using
HTML and JSP to get the fields and display the results respectively

Salary Report

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 101
Emp_Name: Ramesh'
Basic : 25000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 102
Emp_Name: Ravi
Basic : 20000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
....
...
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~````
Grand Salary : 45000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/

<%@ page import="java.sql.*" %>
<%
    String jdbcURL = "jdbc:mysql://localhost:3306/Employee";
    String dbUser = "root";  // Change if needed
    String dbPassword = "";  // Change if needed

    String empnoStr = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String basicsalaryStr = request.getParameter("basicsalary");

    if (empnoStr != null && empname != null && basicsalaryStr != null) {
        int empno = Integer.parseInt(empnoStr);
        double basicsalary = Double.parseDouble(basicsalaryStr);

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            String sql = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, empno);
            pstmt.setString(2, empname);
            pstmt.setDouble(3, basicsalary);

            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0) {
                out.println("<h3>Employee Added Successfully</h3>");
            } else {
                out.println("<h3>Failed to add employee</h3>");
            }

        } catch (Exception e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        } finally {
            if (pstmt != null) try { pstmt.close(); } catch(Exception e) {}
            if (conn != null) try { conn.close(); } catch(Exception e) {}
        }

        out.println("<p><a href='addEmp.html'>Add Another Employee</a></p>");
        out.println("<p><a href='ReportEmp.jsp'>View Salary Report</a></p>");
    } else {
        out.println("Invalid input");
    }
%>
    
