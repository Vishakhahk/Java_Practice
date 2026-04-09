package Apple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class facebook {

    public static void main(String[] args) throws Exception {

        Class.forName("org.postgresql.Driver"); // package Name

        Connection con = null;
        PreparedStatement ps = null;
        PreparedStatement ps1 = null;
        ResultSet rs = null;
        Scanner s1 = new Scanner(System.in);

        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/first", "postgres", "admin");
            int a, choice;
            String b, c, d;

            System.out.println("enter your choice");
            System.out.println("\n1.Register Here\n2.Login Here\n3.Exit");

            choice = s1.nextInt();

            switch (choice) {
            case 1:
                System.out.println("___________Register Here__________ ");
                System.out.println("enter id");
                a = s1.nextInt();

                System.out.println("enter username");
                b = s1.next();

                System.out.println("enter ur password");
                c = s1.next();

                System.out.println("confirm ur password");
                d = s1.next();

                System.out.println("DB connected");
                // Use parameterized insert to avoid SQL concatenation
                ps = con.prepareStatement("insert into facebook values(?,?,?,?)");

                if (c.equals(d)) {
                    ps.setInt(1, a);
                    ps.setString(2, b);
                    ps.setString(3, c);
                    ps.setString(4, d);
                    int rows = ps.executeUpdate();
                    System.out.println("Registration Successful (rows affected: " + rows + ")");
                } else {
                    System.out.println("password not match");
                }
                break;

            case 2:
                String x, y;
                System.out.println("____LOGIN FORM___");
                System.out.println("enter username \n");
                x = s1.next();
                System.out.println("enter password");
                y = s1.next();

                ps1 = con.prepareStatement("select * from facebook where fname = ? and fpass = ?");
                ps1.setString(1, x);
                ps1.setString(2, y);
                rs = ps1.executeQuery();
                if (rs.next()) {
                    System.out.println("Login Successful");
                } else {
                    System.out.println("login fail");
                }

                break;

            case 3:
                System.out.println("Exiting");
                break;

            default:
                System.out.println("Invalid choice");
            }
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception ignore) {
                }
            }
            if (ps1 != null) {
                try {
                    ps1.close();
                } catch (Exception ignore) {
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (Exception ignore) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (Exception ignore) {
                }
            }
            if (s1 != null) {
                try {
                    s1.close();
                } catch (Exception ignore) {
                }
            }
        }
    }
}