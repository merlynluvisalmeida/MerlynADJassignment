<%@ page import="java.sql.*" %>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    String newName = request.getParameter("coffee_name");
    double newPrice = Double.parseDouble(request.getParameter("price"));

    String url = "jdbc:mysql://localhost:3306/test123";
    String user = "root";         // change if needed
    String password = "";         // set your MySQL password

    Connection conn = null;
    PreparedStatement updateStmt = null;
    Statement selectStmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);

        // Update the record
        String updateSQL = "UPDATE coffee SET coffee_name = ?, price = ? WHERE id = ?";
        updateStmt = conn.prepareStatement(updateSQL);
        updateStmt.setString(1, newName);
        updateStmt.setDouble(2, newPrice);
        updateStmt.setInt(3, id);

        int rows = updateStmt.executeUpdate();

        if (rows > 0) {
            out.println("<h3>Coffee with ID " + id + " updated successfully.</h3>");
        } else {
            out.println("<h3>No record found with ID " + id + ".</h3>");
        }

        // Display all records
        selectStmt = conn.createStatement();
        rs = selectStmt.executeQuery("SELECT * FROM coffee");

%>
        <h3>All Coffee Products:</h3>
        <table border="1">
            <tr><th>ID</th><th>Coffee Name</th><th>Price</th></tr>
            <%
                while(rs.next()) {
            %>
                <tr>
                    <td><%= rs.getInt("id") %></td>
                    <td><%= rs.getString("coffee_name") %></td>
                    <td><%= rs.getDouble("price") %></td>
                </tr>
            <%
                }
            %>
        </table>
<%
    } catch(Exception e) {
        out.println("<p>Error: " + e.getMessage() + "</p>");
    } finally {
        try { if(updateStmt != null) updateStmt.close(); } catch(Exception e) {}
        try { if(selectStmt != null) selectStmt.close(); } catch(Exception e) {}
        try { if(conn != null) conn.close(); } catch(Exception e) {}
    }
%>
