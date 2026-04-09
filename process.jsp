<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Process Registration</title>
</head>
<body>
<%
    try {
        // Load PostgreSQL driver
        Class.forName("org.postgresql.Driver");

        // Connect to database
        Connection con = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/march",
            "postgres",
            "admin"
        );

        // Insert data from form fields t1..t6
        String sql = "INSERT INTO student (sname, semail, sphone, spass, scpass, scourse) " +
                     "VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, request.getParameter("t1"));
        ps.setString(2, request.getParameter("t2"));
        ps.setString(3, request.getParameter("t3"));
        ps.setString(4, request.getParameter("t4"));
        ps.setString(5, request.getParameter("t5"));
        ps.setString(6, request.getParameter("t6"));

        int rows = ps.executeUpdate();

        if (rows > 0) {
            out.println("Registration Successful");

            // Show alert and redirect
            out.println("<script>");
            out.println("alert('Registration Successful');");
            out.println("window.location='index.html';");
            out.println("</script>");
        } else {
            out.println("Registration Failed");
        }

        ps.close();
        con.close();
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    }
%>
</body>
</html>
