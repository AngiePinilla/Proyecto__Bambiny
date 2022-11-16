/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.FamiliarDAO;
import ModeloVO.AlumFamiVO;
import ModeloVO.familiarVO;
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
@WebServlet(name = "FamiliarControlador", urlPatterns = {"/Familiar"})
public class FamiliarControlador extends HttpServlet {

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

            //1. recibir datos de las vistas
            String id_fami = request.getParameter("textid_fami");
            String nom1_fami = request.getParameter("textnom1_fami");
            String nom2_fami = request.getParameter("textnom2_fami");
            String apel1_fami = request.getParameter("textapel1_fami");
            String apel2_fami = request.getParameter("textapel2_fami");
            String parent_fami = request.getParameter("textparent_fami");
            String numdocu_fami = request.getParameter("textnumdocu_fami");
            String ocupac_fami = request.getParameter("textocupac_fami");
            String lugatrab_fami = request.getParameter("textlugatrab_fami"); //cambiar y hacer los mismo que con eps
            String teletrab_fami = request.getParameter("textteletrab_fami"); //cambiar y hacer los mismo que con eps
            String telecel_fami = request.getParameter("texttelecel_fami"); //cambiar y hacer los mismo que con eps
            String fechnaci_fami = request.getParameter("textfechnaci_fami");
            String esta_fami = request.getParameter("textesta_fami");
            
            String id_alum = request.getParameter("textid_alum");

            //String usuLogin = request.getParameter("textUsuario");
            //String usuPassword = request.getParameter("textClave");
            int opcion = Integer.parseInt(request.getParameter("opcion"));

            //2. el VO tiene los datos seguros
            familiarVO famivo = new familiarVO(id_fami, nom1_fami, nom2_fami, apel1_fami, apel2_fami, parent_fami, numdocu_fami, ocupac_fami, lugatrab_fami, teletrab_fami, telecel_fami, fechnaci_fami, esta_fami);
           
            AlumFamiVO alVO = new AlumFamiVO(id_alum, id_fami);
            //3. ¿Quién hace las operaciones? DAO
            FamiliarDAO famidao = new FamiliarDAO(famivo);
            
             FamiliarDAO fami = new FamiliarDAO(alVO);

            //4. dministrar Operaciones
            switch (opcion) {

                case 1:
                   
                    
                    if (famidao.agregarRegistro() ) {
                        request.setAttribute("MensajeExito", "El familiar se registro correctamente");
                    } else {
                        request.setAttribute("MensajeError", "El familiar no se registro correctamente");
                    }
                    request.getRequestDispatcher("familiar.jsp").forward(request, response);
                    break;

                case 2:
                    if (famidao.actualizarRegistro()) {
                        request.setAttribute("MensajeExito", "El usuario se actualizo correctamente.");
                    } else {
                        request.setAttribute("MensajeError", "El usuario no se actualizo correctamente.");
                    }
                    request.getRequestDispatcher("actuFamiliar.jsp").forward(request, response);
                    break;
                    
                case 3:
                    famivo = famidao.consultarDatos(numdocu_fami);

                    if (famivo != null) {

                        request.setAttribute("datosConsultados", famivo);
                        request.getRequestDispatcher("familiar.jsp").forward(request, response);

                    } else {
                        request.setAttribute("mensajeError", "la familiar no se pudo encontrar");
                        request.getRequestDispatcher("familiar.jsp").forward(request, response);

                    }
                    break;

            }

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
