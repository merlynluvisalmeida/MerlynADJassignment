<%@ page import="java.sql.*" %>
<%
    int empno = Integer.parseInt(request.getParameter("empno"));
    String empname = request.getParameter("empname");
    double basicsalary = Double.parseDouble(request.getParameter("basicsalary"));

    String url = "jdbc:mysql://localhost:3306/Employee12";
    String user = "root";          // change if needed
    String password = "";          // set your MySQL password

    Connection conn = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;
    double grandTotal = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);

        // Insert new employee
        String sqlInsert = "INSERT INTO Emp (empno, empname, basicsalary) VALUES (?, ?, ?)";
        pstmt = conn.prepareStatement(sqlInsert);
        pstmt.setInt(1, empno);
        pstmt.setString(2, empname);
        pstmt.setDouble(3, basicsalary);
        pstmt.executeUpdate();

        // Generate salary report
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");

%>
<html>
<head><title>Salary Report</title></head>
<body>
    <h2>Salary Report</h2>
    <pre>
<%
        while(rs.next()) {
            int eno = rs.getInt("empno");
            String ename = rs.getString("empname");
            double sal = rs.getDouble("basicsalary");
            grandTotal += sal;
%>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No   : <%= eno %>
Emp_Name : <%= ename %>
Basic    : <%= sal %>
<%
        }
%>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Grand Salary : <%= grandTotal %>
    </pre>
</body>
</html>
<%
    } catch(Exception e) {
        out.println("<p>Error: " + e.getMessage() + "</p>");
    } finally {
        try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
        try { if (stmt != null) stmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }
%>
