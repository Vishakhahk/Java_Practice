package blue;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class book extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        
        // Fetching parameters using the 'name' attribute from registration form
        String fname = req.getParameter("fname");
        String sname = req.getParameter("sname");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");
        String day = req.getParameter("day");
        String month = req.getParameter("month");
        String year = req.getParameter("year");

        // Printing to Console
        System.out.println("--- New User Registered ---");
        System.out.println("First Name: " + fname);
        System.out.println("Surname: " + sname);
        System.out.println("Email/Mobile: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("DOB: " + day + "-" + month + "-" + year);
        System.out.println("---------------------------");
        
        // Optional: Send a simple response to the browser so the page doesn't stay blank
        res.setContentType("text/html");
        res.getWriter().println("<h2>Registration Successful! Check your Eclipse/Console.</h2>");
    }
}