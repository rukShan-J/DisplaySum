package MyPackage;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DisplaySumServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        String number01 = req.getParameter("num1");
        int number1 = Integer.parseInt(number01);
        
        int number2 = Integer.parseInt(req.getParameter("num2"));
        
        int summation = number1 + number2;
        
        int multiplication =  number1 * number2;
        
        PrintWriter out = res.getWriter();
        
        out.print(summation);   //not showing this outout because of the "RequestDispatcher"
       
                        // key(req), value
        req.setAttribute("multiplication", multiplication);
        req.setAttribute("summation", summation);
        
        //call servlet from this servlet
        RequestDispatcher rd = req.getRequestDispatcher("sq");
        rd.forward(req, res);
        
    }


}
