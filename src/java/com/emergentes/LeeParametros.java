
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "LeeParametros", urlPatterns = {"/LeeParametros"})
public class LeeParametros extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
             out.println("<html>");
            out.println("<body>");
            out.println("<head>");
            out.println("<title>Servlet LeeParametros POST(Formulario)</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Lee Parametros</h1>");
            out.println("<br><br>");
            out.println("<form action='' method='post'>");
            out.println("Nombre:");
            out.println("<input type='text' name='nombre' required>");
            out.println("<br>");
            out.println("Apellido:");
            out.println("<input type='text' name='apellido' required>");
            out.println("<br>");
            out.println("<input type=submit>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }
   


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<body>");
            out.println("<head>");
            out.println("<title>Servlet LeeParametros</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Los datos ricibidos son :</h1>");
                if(nombre != null || apellido != null){
                    out.println("Sus datos son : <br>");
                    out.println("Nombre :"+ nombre +" <br>");
                    out.println("Apellido :"+ apellido +" <br>");
                }
                else{
                    out.println("No hay datos para mostrar !");
                }
            out.println("</body>");
            out.println("</html>");
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
