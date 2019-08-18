/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.projeto1;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cortez
 */
@WebServlet(name = "JurossimplesServlet", urlPatterns = {"/juros-simples.html"})
public class JurossimplesServlet extends HttpServlet {

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
            out.println("<title>Juros Simples</title>");
            out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\" integrity=\"sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu\" crossorigin=\"anonymous\">");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"estilo.css\">");
            out.println("</head>");
            out.println("<body>");
            
            
               float c = 0;
                try{ c = Float.parseFloat(request.getParameter("c"));
                }catch(Exception ex){}
                
               float t = 0;
                try{ t = Float.parseFloat(request.getParameter("t"));
                }catch(Exception ex){}
               
               DecimalFormat cj = new DecimalFormat("#.00"); 
               DecimalFormat cm = new DecimalFormat("#.00");
               
               int n = 0;
                try{ n = Integer.parseInt(request.getParameter("n"));
                }catch(Exception ex){}
                Float j = c*( +(t*n));
                Float m = j/100 + c;
                
            out.println("<div class=\"container-fluid\">");
            out.println("<h2 align=\"center\">JUROS SIMPLES</h2>");
            out.println("</br>");
            
           
           out.println("<form>");
           
           out.println("<div class=\"form-group col-md-4\">");
           out.println("<label for=\"capitalLabel\">Capital (R$)</label>");
           out.println("<input type=\"number\" name=\"c\" class=\"form-control\" id=\"capitalLabel\" placeholder=\"Digite o capital aplicado.\">");
           out.println("</div>");
           
           out.println("<div class=\"form-group col-md-4\">");
           out.println("<label for=\"jurosLabel\">Taxa de Juros (%)</label>");
           out.println("<input type=\"number\" name=\"t\" class=\"form-control\" id=\"jurosLabel\" placeholder=\"Digite a quantidade de juros.\">");
           out.println("</div>");
           
           out.println("<div class=\"form-group col-md-4\">");
           out.println("<label for=\"mesesLabel\">Quantidade de meses</label>");
           out.println("<input type=\"number\" name=\"n\" class=\"form-control\" id=\"mesesLabel\"  placeholder=\"Digite a quantidade de meses.\">");
           out.println("</div>");
           
           out.println("<div margin-left:30px;");
           

           out.println("<p><input class=\"btn btn-primary\" type='submit' value='CALCULAR'/>");
           
           out.println("</div>");
           
           out.println("</form>");
           
           
           
            
            out.println("<div/>");
            out.println("<script src=\"https://code.jquery.com/jquery-1.12.4.min.js\" integrity=\"sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ\" crossorigin=\"anonymous\"></script>");
            out.println("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\" integrity=\"sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd\" crossorigin=\"anonymous\"></script>");
            out.println("<div/>");
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
