/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.AcudienteDAO2;

import ModeloVO.AcudienteVO2;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chris
 */
@WebServlet(name = "AcudienteControlador", urlPatterns = {"/Acudientes"})
public class AcudienteControlador2 extends HttpServlet {

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
        
        // 1. Recibir datos de las vistas
        String ID_ACUD = request.getParameter("textID_acud");
        String ID_ALUM = request.getParameter("textId_alum");
        String NOM_ACUD1 = request.getParameter("textNom_acud1");
        String NOM_ACUD2 = request.getParameter("textNom_acud2");
        String APEL_ACUD1 = request.getParameter("textApel_acud1");
        String APEL_ACUD2 = request.getParameter("textApel_acud2");
        String NUMDOCU_ACUD = request.getParameter("textNumdocu_acud");
        String TELE_ACUD = request.getParameter("textTele_acud");
        String DIREC_ACUD = request.getParameter("textDirec_acud");
        String PARENT_ACUD = request.getParameter("textParect_acud");
        String ESTADOAUTO_ACUD = request.getParameter("textEstadoauto_acud");
        String FECHNACI_ACUD = request.getParameter("textFechnaci_acud");
        String ESTA_ACUD = request.getParameter("textEsta_acud");
        String datos = request.getParameter("datos");

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //2. ¿Quién tiene los datos de forma segura? VO
        AcudienteVO2 AcuVO2 = new AcudienteVO2(ID_ACUD, ID_ALUM, NOM_ACUD1, NOM_ACUD2, APEL_ACUD1, APEL_ACUD2, NUMDOCU_ACUD, TELE_ACUD, DIREC_ACUD, ESTADOAUTO_ACUD, FECHNACI_ACUD, PARENT_ACUD, ESTA_ACUD);
        //3. ¿Quién hace las operaciones? DAO
        AcudienteDAO2 AcuDAO2 = new AcudienteDAO2(AcuVO2);

        //4. dministrar Operaciones
        switch (opcion) {

            case 1: // consular acudiente
                String alum_id = request.getParameter("Id");
                AcuVO2 = AcuDAO2.consultarAcudientes(alum_id);

                if (AcuVO2 != null) {
                    request.setAttribute("datosConsultados", AcuVO2);
                    request.getRequestDispatcher("listarAcudientes.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeError", "El acudiente no se encontro");
                    request.getRequestDispatcher("consultarAlumno.jsp").forward(request, response);
                }
                break;

            case 2:
                if (AcuDAO2.agregarRegistro()) {
                    request.setAttribute("mensajeExito", "Se registro");

                } else {
                    request.setAttribute("mensajeError", "No se registro");

                }
                request.getRequestDispatcher("Acudiente.jsp").forward(request, response);

                break;
            case 3:
                AcuVO2 = AcuDAO2.consultarDatos(ID_ACUD);

                if (AcuVO2 != null) {

                    request.setAttribute("datosConsultados", AcuVO2);
                    request.getRequestDispatcher("actuAcudiente.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "El acudiente no se pudo encontrar");
                    request.getRequestDispatcher("ListaActAcud.jsp").forward(request, response);

                }
                break;

            case 4:
                if (AcuDAO2.actualizarRegistro()) {
                    request.setAttribute("mensajeExito", "el Acudiente se actualizo correctamente");
                    request.getRequestDispatcher("ListaActAcud.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeError", "el Acudiente no se actualizo correctamente");
                    request.getRequestDispatcher("actuAcudiente.jsp").forward(request, response);
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
