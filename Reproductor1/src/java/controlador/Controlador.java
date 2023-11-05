/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Persona;
import modelo.PersonaDAO;

/**
 *
 * @author ASUS
 */
public class Controlador extends HttpServlet {
    String listar="listar.jsp";
    String add="add.jsp";
    String edit="editar.jsp";
    PersonaDAO dao = new PersonaDAO();
    PersonaDAO dao1 = new PersonaDAO();
    Persona p=new Persona();
    Persona p1=new Persona();
    int r;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        if(accion.equals("Ingresar")){
            String nom=request.getParameter("usuario");
            String contras=request.getParameter("pass");
            p1.setUsu(nom);
            p1.setContra(contras);
            r=dao1.validar(p1);
            if(r==1){
                request.getSession().setAttribute("nom", nom);
                request.getRequestDispatcher("Main.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }else{
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }*/
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
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");      
        String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){  
            acceso = listar;          
        }else if(action.equalsIgnoreCase("add")){
            acceso = add;
        }
        else if(action.equalsIgnoreCase("Agregar")){
             String usua=request.getParameter("usuarioR");
             String con=request.getParameter("passR");
             p.setUsu(usua);
             p.setContra(con);
             dao.add(p);
             acceso = listar;
        }
        
        else if(action.equalsIgnoreCase("editar")){
             request.setAttribute("idper", request.getParameter("id"));
             acceso=edit;
        }
        else if(action.equalsIgnoreCase("Actualizar")){
             int id = Integer.parseInt(request.getParameter("txtid"));
             String usua=request.getParameter("usuarioR");
             String con=request.getParameter("passR");
             p.setId(id);
             p.setUsu(usua);
             p.setContra(con);
             dao.edit(p);
             acceso=listar;
        }
        else if(action.equalsIgnoreCase("eliminar")){
            int id=Integer.parseInt(request.getParameter("id"));
            p.setId(id);
            dao.eliminar(id);
            acceso=listar;
        }
        else if(accion.equalsIgnoreCase("Ingresar")){
            String nom=request.getParameter("usuario");
            String contras=request.getParameter("pass");
            p.setUsu(nom);
            p.setContra(contras);
            r=dao.validar(p);
            if(r==1){
                request.getSession().setAttribute("nom", nom);
                request.getRequestDispatcher("Main.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
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
