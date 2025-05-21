/*
 Read all the existing records from the table coffee which is from the database test and insert a
new coffee product into it [Create a table coffee with fields ( id,coffee_name,price)] using HTML and
JSP to get the fields and display the results respectively
*/



<%@ page import="java.sql.*" %>
<%
    // Get form values
    int id = Integer.parseInt(request.getParameter("id"));
    String coffeeName = request.getParameter("coffee_name");
    double price = Double.parseDouble(request.getParameter("price"));

    // JDBC Connection
    String url = "jdbc:mysql://localhost:3306/test123";
    String user = "root"; // Change if you have different user
    String password = ""; // Add your MySQL password

    Connection conn = null;
    PreparedStatement insertStmt = null;
    Statement selectStmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);

        // Insert new coffee
        String insertSQL = "INSERT INTO coffee (id, coffee_name, price) VALUES (?, ?, ?)";
        insertStmt = conn.prepareStatement(insertSQL);
        insertStmt.setInt(1, id);
        insertStmt.setString(2, coffeeName);
        insertStmt.setDouble(3, price);
        insertStmt.executeUpdate();

        // Retrieve all records
        String selectSQL = "SELECT * FROM coffee";
        selectStmt = conn.createStatement();
        rs = selectStmt.executeQuery(selectSQL);
%>

<html>
<head><title>Coffee List</title></head>
<body>
    <h2>Coffee Inserted Successfully!</h2>
    <h3>All Coffee Products:</h3>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Coffee Name</th>
            <th>Price</th>
        </tr>
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
</body>
</html>

<%
    } catch(Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        try { if (insertStmt != null) insertStmt.close(); } catch(Exception e) {}
        try { if (selectStmt != null) selectStmt.close(); } catch(Exception e) {}
        try { if (conn != null) conn.close(); } catch(Exception e) {}
    }
%>
