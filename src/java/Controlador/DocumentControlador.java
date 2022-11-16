/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.docuDAO;
import ModeloVO.docuVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author solan
 */
@WebServlet(name = "DocumentControlador", urlPatterns = {"/Document"})
public class DocumentControlador extends HttpServlet {

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
        
        
        
        String id_docu  = request.getParameter("textid_docu");
         String id_alum  = request.getParameter("textid_alum");
         String tipo_docu  = request.getParameter("texttipo_docu");
         String  fechcreac_docu = request.getParameter("textfechcreac_docu");
         String  archivo_docu = request.getParameter("textarchivo_docu");
     
        
         
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //2. el VO tiene los datos seguros
        docuVO doVO = new docuVO(id_docu,id_alum, tipo_docu, fechcreac_docu, archivo_docu);

//3. ¿Quién hace las operaciones? DAO
        docuDAO doDAO = new docuDAO(doVO);
        
          
        
       //4. dministrar Operaciones
          switch (opcion) {

            case 1:
                if (doDAO.agregarRegistro()) {
                    request.setAttribute("MensajeExito", "Documento cargado correctamente");
                } else {
                    request.setAttribute("MensajeError", "El documento no se cargo correctamente");
                }
                request.getRequestDispatcher("documento.jsp").forward(request, response);
                break;
                
            case 2:
                if (doDAO.actualizarRegistro()) {
                    request.setAttribute("mensajeExito", "se actualizo correctamente");
                    request.getRequestDispatcher("listarDocumentos.jsp").forward(request, response);
                    
                } else {
                    request.setAttribute("mensajeError", "NO se actualizo correctamente");
                    
                }
                request.getRequestDispatcher("actuDocu.jsp").forward(request, response);
                break;
                
                
            case 3:
                doVO =doDAO.consultarDocu(id_docu);
                 
                if (doVO != null) {
                    
                    request.setAttribute("datosConsultados", doVO);
                    request.getRequestDispatcher("actuDocu.jsp").forward(request, response);
                    request.setAttribute("mensajeError", "no se pudo encontrar");
                    
                }else{
                    request.setAttribute("mensajeError", "no se pudo encontrar");
                    request.getRequestDispatcher("listarDocumentos.jsp").forward(request, response);

                }
                break;
                
            
           
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

