/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.projeto1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cortez
 */
@WebServlet(name = "JuroscompostoServlet", urlPatterns = {"/juros-composto.html"})
public class JuroscompostoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");  
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
            out.println("<title>Juros Composto</title>");
            out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\" integrity=\"sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu\" crossorigin=\"anonymous\">");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"estilo.css\">");
            out.println("</head>");
            out.println("<body>") ;
            //Navbar
            out.println("<nav class=\"navbar navbar-default\">");
            out.println("<div class=\"container-fluid\">");
            out.println("<div class=\"navbar-header\">");
            out.println("<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">");
            out.println("<span class=\"sr-only\">Toggle navigation</span>");
            out.println("<span class=\"icon-bar\"></span>");
            out.println("<span class=\"icon-bar\"></span>");
            out.println("<span class=\"icon-bar\"></span>");
            out.println("</button>");
            out.println("<a class=\"navbar-brand\" href=\"home.html\">POO</a>");
            out.println("</div>");
            out.println("<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">");
            out.println("<ul class=\"nav navbar-nav\">");
            out.println("<li class=\"active\"><a href=\"juros-simples.html\">Juros Simples</a></li>");
            out.println("<li><a href=\"juros-composto.html\">Juros Composto</a></li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("</div>");
            out.println("</nav>");

            out.println("<div class=\"container-fluid\">");
            out.println("<h2 align=\"center\">JUROS COMPOSTO</h2>");
            out.println("</br>");
            
           
           out.println("<form>");
           
           out.println("<div class=\"form-group col-md-4\">");
           out.println("<label for=\"capitalLabel\">Capital (R$)</label>");
           out.println("<input type=\"number\" name=\"capital\" class=\"form-control\" id=\"capitalLabel\" placeholder=\"Digite o capital aplicado.\">");
           out.println("</div>");
           
           out.println("<div class=\"form-group col-md-4\">");
           out.println("<label for=\"jurosLabel\">Taxa de Juros (%)</label>");
           out.println("<input type=\"number\" name=\"taxa\" class=\"form-control\" id=\"jurosLabel\" placeholder=\"Digite a quantidade de juros.\">");
           out.println("</div>");
           
           out.println("<div class=\"form-group col-md-4\">");
           out.println("<label for=\"mesesLabel\">Quantidade de meses</label>");
           out.println("<input type=\"number\" name=\"tempo\" class=\"form-control\" id=\"mesesLabel\"  placeholder=\"Digite a quantidade de meses.\">");
           out.println("</div>");
           
           out.println("<div margin-left:30px;");
           

           out.println("<p><input class=\"btn btn-primary\" type='submit' value='CALCULAR'/>");
           
           
           
           out.println("</div>");
           
           out.println("<div style='margin-top:5%; margin-left:30%'>");
            try {
                
                double cap,tax,montante,juroscomp, ganho;
                int time,i,control;
          
           
                cap = Double.parseDouble(request.getParameter("capital"));
                tax = Double.parseDouble(request.getParameter("taxa"))/100;
                time = Integer.parseInt(request.getParameter("tempo"));
                control=0;
   
                out.println("<table>");
                out.println("<td>");
                out.println("<font size='5px'>"+"Mês: "+"</font>");
                out.println("</td>");
                out.println("<td>");
                out.println("<font size='5px'>"+"Capital:"+"</font>");
                out.println("</td>");
                out.println("<td>");
                out.println("<font size='5px'>"+"Juros:"+"</font>");
                out.println("</td>");
                out.println("<td>");
                out.println("<font size='5px'>"+"Montante:"+"</font>");
                out.println("</td>");

                
                for ( i = 1; i <= time; i++) {
                    out.println("<tr>");
                    out.println("<td>"+i+"º"+"</td>");
                montante =cap*Math.pow((1+tax),control);
                juroscomp = montante - cap;
                ganho = cap + juroscomp;
                out.println("<td>"+cap+"</td>");
                out.println("<td>"+juroscomp+"</td>");
                out.println("<td>"+ganho+"</td>");
                    out.println("</tr>");
                cap=ganho;
                control = control + 1;
                }
                
                out.println("</table>");

            } catch (Exception e) {
            }

            out.println("</div>");
            
            
            
            out.println("<style>");
            out.println("table,th,td{border:3px solid black;}");
            out.println("</style>");
            
            out.println("</form>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
