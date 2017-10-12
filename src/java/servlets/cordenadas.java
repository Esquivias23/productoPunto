/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
@WebServlet(name = "cordenadas", urlPatterns = {"/cordenadas"})
public class cordenadas extends HttpServlet {
    String c1;
    String c2;
    String c3;
    String c4;
    String c5;
    String c6;
    float resultado1;
    float resultado;
    
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        c1 = request.getParameter("C1");
        c2 = request.getParameter("C2");
        c3 = request.getParameter("C3");
        c4 = request.getParameter("C4");
        c5 = request.getParameter("C5");
        c6 = request.getParameter("C6");
        
        resultado = cordero(c1, c2, c3, c4, c5, c6);
        
        
        PrintWriter out = new PrintWriter(response.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Calculado</title></head>");
        out.println("<body>");
        out.println("<p><h1><center>Resultado:<B>" + resultado  + "</B> </center></h1></p>");
        out.println("</body></html>");
        out.close();
    }
    public static float cordero(String c1,String c2,String c3,String c4,String c5,String c6){
        
        float res1;
        float res2;
        float res3;
        int h1 = Integer.parseInt(c1);
        int h2 = Integer.parseInt(c2);
        int h3 = Integer.parseInt(c3);
        int h4 = Integer.parseInt(c4);
        int h5 = Integer.parseInt(c5);
        int h6 = Integer.parseInt(c6);
        
        res1 = (h1*h4)+(h2*h5)+(h3*h6);
        
        return res1;
    }
    
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */

