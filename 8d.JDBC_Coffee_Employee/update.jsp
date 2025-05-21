/*
Develop a JDBC project using JDBC to update the fields empno, empname and basicsalary into
the table Emp of the database Employee using HTML and JSP to get the fields and display the
results respectively
*/




<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%
    // Retrieving form data
    int empno = Integer.parseInt(request.getParameter("empno"));
    String empname = request.getParameter("empname");
    double basicsalary = Double.parseDouble(request.getParameter("basicsalary"));

    // JDBC setup
    String url = "jdbc:mysql://localhost:3306/Employee12";
    String username = "root"; // change as needed
    String password = ""; // change as needed

    Connection con = null;
    PreparedStatement ps = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, username, password);

        // Check if employee exists
        String checkSql = "SELECT * FROM Emp WHERE empno = ?";
        ps = con.prepareStatement(checkSql);
        ps.setInt(1, empno);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            // Update if exists
            String updateSql = "UPDATE Emp SET empname = ?, basicsalary = ? WHERE empno = ?";
            ps = con.prepareStatement(updateSql);
            ps.setString(1, empname);
            ps.setDouble(2, basicsalary);
            ps.setInt(3, empno);
            int updated = ps.executeUpdate();

            if (updated > 0) {
                out.println("<h3>Employee updated successfully.</h3>");
            } else {
                out.println("<h3>Update failed.</h3>");
            }
        } else {
            out.println("<h3>Employee not found. Please check the Employee Number.</h3>");
        }

    } catch (Exception e) {
        out.println("<h3>Error: " + e.getMessage() + "</h3>");
    } finally {
        if (ps != null) ps.close();
        if (con != null) con.close();
    }
%>
