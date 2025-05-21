<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Coffees Starting with 'D'</title>
</head>
<body>
    <h2>List of Coffees Starting with 'D'</h2>
    <%
        // JDBC connection info
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = ""; // Replace with your actual password

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            String query = "SELECT * FROM coffee WHERE coffee_name LIKE 'D%'";
            rs = stmt.executeQuery(query);
    %>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Coffee Name</th>
            <th>Price</th> <!-- Add other columns if needed -->
        </tr>
        <%
            while (rs.next()) {
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
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) {}
            if (stmt != null) try { stmt.close(); } catch (SQLException e) {}
            if (conn != null) try { conn.close(); } catch (SQLException e) {}
        }
    %>
</body>
</html>
