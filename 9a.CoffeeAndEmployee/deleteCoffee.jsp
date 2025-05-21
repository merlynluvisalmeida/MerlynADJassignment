
/*
Read all the existing records from the table coffee which is from the database test and delete
an existing coffee product from the table with its id and display the rest of the records using
HTML and JSP to get the field and display the results respectively
*/



<%@ page import="java.sql.*" %>
<%
    String idParam = request.getParameter("coffeeId");
    int deleteId = (idParam != null && !idParam.isEmpty()) ? Integer.parseInt(idParam) : -1;

    String url = "jdbc:mysql://localhost:3306/test123";
    String user = "root";
    String password = ""; // Replace with your actual password

    Connection con = null;
    PreparedStatement deleteStmt = null;
    Statement selectStmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, user, password);

        if (deleteId != -1) {
            String deleteSql = "DELETE FROM coffee WHERE id = ?";
            deleteStmt = con.prepareStatement(deleteSql);
            deleteStmt.setInt(1, deleteId);
            deleteStmt.executeUpdate();
            out.println("<p style='color:green;'>Coffee with ID " + deleteId + " deleted (if existed).</p>");
        }

        // Display remaining records
        out.println("<h2>Remaining Coffee Products</h2>");
        out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Price</th></tr>");

        String selectSql = "SELECT * FROM coffee";
        selectStmt = con.createStatement();
        rs = selectStmt.executeQuery(selectSql);

        while (rs.next()) {
            int id = rs.getInt("id");

            // Safely try to retrieve 'name' and 'price', handle missing columns
            String name = "";
            double price = 0.0;

            try { name = rs.getString("name"); } 
            catch (SQLException ex) { name = "N/A"; }

            try { price = rs.getDouble("price"); } 
            catch (SQLException ex) { price = 0.0; }

            out.println("<tr>");
            out.println("<td>" + id + "</td>");
            out.println("<td>" + name + "</td>");
            out.println("<td>" + price + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception ignore) {}
        try { if (deleteStmt != null) deleteStmt.close(); } catch (Exception ignore) {}
        try { if (selectStmt != null) selectStmt.close(); } catch (Exception ignore) {}
        try { if (con != null) con.close(); } catch (Exception ignore) {}
    }
%>
