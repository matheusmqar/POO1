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
@WebServlet(name = "HomeServlet", urlPatterns = {"/home.html"})
public class HomeServlet extends HttpServlet {

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
            out.println("<title>Juros Simples e Juros Compostos</title>");
            out.println(" <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\" integrity=\"sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu\" crossorigin=\"anonymous\">");
            out.println("</head>");
            out.println("<body>");
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
            out.println("<li><a href=\"juros-simples.html\">Juros Simples</a></li>");
            out.println("<li><a href=\"juros-composto.html\">Juros Composto</a></li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("</div>");
            out.println("</nav>");
            
            out.println("<div class=\"container-fluid\">");
            out.println("<h1 class=\"text-center\">BEM VINDO</h1>");
            out.println("<p class=\"text-center\">Aqui você encontra nossas ferramentas de cálculo de juros simples e juros composto de maneira fácil e rápida</p>");
           
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-md-6\">");
            out.println("<div class=\"panel panel-default\">");
            out.println("<div class=\"panel-heading\">Juros Simples</div>");
            out.println("<div class=\"panel-body\">");
            out.println("O juros será simples quando o percentual de juros incidir apenas sobre o valor principal. Sobre os juros gerados a cada período não incidirão novos juros. Valor Principal ou simplesmente principal é o valor inicial emprestado ou aplicado, antes de somarmos os juros.");
            out.println("</div>");
            out.println("<div class=\"panel-footer\"><a href=\"juros-simples.html\" class=\"btn btn-primary\" href=\"#\" role=\"button\">CALCULAR</a></div>");
            out.println("</div>");
            out.println("</div>");
            
            out.println("<div class=\"col-md-6\">");
            out.println("<div class=\"panel panel-default\">");
            out.println("<div class=\"panel-heading\">Juros Composto</div>");
            out.println("<div class=\"panel-body\">");
            out.println("Os juros compostos são a prática de juros sobre juros. Eles são muito utilizados pelo sistema financeiro, pois oferecem maior rentabilidade se comparados ao juro simples.");
            out.println("</div>");
            out.println("<div class=\"panel-footer\"><a href=\"juros-composto.html\" class=\"btn btn-primary\" href=\"#\" role=\"button\">CALCULAR</a></div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            
            out.println("<h2 class=\"text-center\">NOSSO TIME</h2>");
            out.println("<div class=\"row\" style='display:flex; justify-content:center'>");
            out.println("<div class=\"col-xs-6 col-md-2\">");
            out.println("<div class=\"panel panel-default\">");
            out.println("<div class=\"panel-body\" style='padding:0'>");
            out.println("<img src='images/1.jpg' style='width:100%'");
            out.println("</div>");
            out.println("</div>");
            out.println("<div class=\"panel-footer text-center\">ANDRÉ LUIZ</div>");
            out.println("</div>");
            out.println("</div>");
            
            out.println("<div class=\"col-xs-6 col-md-2\">");
            out.println("<div class=\"panel panel-default\">");
            out.println("<div class=\"panel-body\" style='padding:0'>");
            out.println("<img src='images/3.jpg' style='width:100%'");
            out.println("</div>");
            out.println("</div>");
            out.println("<div class=\"panel-footer text-center\">MATHEUS CORTEZ</div>");
            out.println("</div>");
            out.println("</div>");
            
            out.println("<div class=\"col-xs-6 col-md-2\">");
            out.println("<div class=\"panel panel-default\">");
            out.println("<div class=\"panel-body\" style='padding:0'>");
            out.println("<img src='images/2.jpg' style='width:100%'");
            out.println("</div>");
            out.println("</div>");
            out.println("<div class=\"panel-footer text-center\">MATHEUS MARQUES</div>");
            out.println("</div>");
            out.println("</div>");
            
            out.println("<div class=\"col-xs-6 col-md-2\">");
            out.println("<div class=\"panel panel-default\">");
            out.println("<div class=\"panel-body\" style='padding:0'>");
            out.println("<img src='images/4.jpg' style='width:100%'");
            out.println("</div>");
            out.println("</div>");
            out.println("<div class=\"panel-footer text-center\">RAFAEL TEIXEIRA</div>");
            out.println("</div>");
            out.println("</div>");
            
            out.println("<div class=\"col-xs-6 col-md-2\">");
            out.println("<div class=\"panel panel-default\">");
            out.println("<div class=\"panel-body\" style='padding:0'>");
            out.println("<img src='images/5.png' style='width:100%'");
            out.println("</div>");
            out.println("</div>");
            out.println("<div class=\"panel-footer text-center\">ALAN DA SILVA</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            
            out.println("<script src=\"https://code.jquery.com/jquery-1.12.4.min.js\" integrity=\"sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ\" crossorigin=\"anonymous\"></script>");
            out.println("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\" integrity=\"sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd\" crossorigin=\"anonymous\"></script>");
            out.println("</div>");
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
