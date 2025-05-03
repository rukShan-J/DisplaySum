
package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "DisplaySqaretServlet", urlPatterns = {"/sq"})
public class DisplaySqaretServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        PrintWriter out = res.getWriter();
        out.println("The answers\n\n");
        
        //get multiplication and summation values from DisplaySumServlet and convert it to an integers
                                            //key
        int mult = (int)req.getAttribute("multiplication");
        int summ = (int)req.getAttribute("summation");
        
        int square =  squ * squ;
        
        out.println("Multiplication : " + mult);
        out.println("Summation : " + summ);
        out.println("Square : " + square);
        
    }


}
