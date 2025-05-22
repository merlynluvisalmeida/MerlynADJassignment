
<%@ page import="java.sql.*" %>
<%
    double grandSalary = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");
%>

<h2>Salary Report</h2>
<pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
    while (rs.next()) {
        int eno = rs.getInt("Emp_No");
        String ename = rs.getString("Emp_Name");
        double salary = rs.getDouble("BasicSalary");
        grandSalary += salary;
%>
Emp_No     : <%= eno %>
Emp_Name   : <%= ename %>
Basic      : <%= salary %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
    }
%>
Grand Salary   : <%= grandSalary %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>

<%
        con.close();
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    }
%>
