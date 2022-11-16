/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import ModeloDAO.ProfesorDAO;

import ModeloVO.ProfesorVO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sena
 */
@WebServlet(name = "ProfesorControlador", urlPatterns = {"/Profesor"})
public class ProfesorControlador extends HttpServlet {

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
        String ID_ALUM = request.getParameter("textID_alum");
        String ID_USUA = request.getParameter("textId_usua");
        String NOM_ALUM1 = request.getParameter("textNom_alum1");
        String NOM_ALUM2 = request.getParameter("textNom_alum2");
        String APEL_ALUM1 = request.getParameter("textApel_alum1");
        String APEL_ALUM2 = request.getParameter("textApel_alum2");
        String NUIP_ALUM = request.getParameter("textNuip_alum");
        String FECHANACI_ALUM =request.getParameter("textFecha_na");
        String LUGARNACI_ALUM =request.getParameter("textLugar_na");
        String GRUPOSANGUI_ALUM =request.getParameter("textGrupo_sa");
        String NUMHERMA_ALUM=request.getParameter("textNum_alum");
        String DIREC_ALUM=request.getParameter("textDirec");
        String TELECELURAR_ALUM=request.getParameter("textTele_celu");
        String TELEFIJO_ALUM=request.getParameter("textTele_fijo");
        String EPS_ALUM=request.getParameter("textEps");
        String ALERGIAS_ALUM=request.getParameter("textAlergias");
        String MEDICA_ALUM=request.getParameter("textMedica");
        String PESO_ALUM=request.getParameter("textPeso");
        String ALTURA_ALUM=request.getParameter("textAltu");
        String ENFERM_ALUM=request.getParameter("textEnfer");
        String DESCENFER_ALUM=request.getParameter("textDesce");
        String datos = request.getParameter("datos");

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //2. ¿Quién tiene los datos de forma segura? VO
        ProfesorVO proVO = new ProfesorVO(ID_ALUM, ID_USUA, NOM_ALUM1, NOM_ALUM2, APEL_ALUM1, APEL_ALUM2, NUIP_ALUM, FECHANACI_ALUM, LUGARNACI_ALUM, GRUPOSANGUI_ALUM, NUMHERMA_ALUM, DIREC_ALUM, TELECELURAR_ALUM, TELEFIJO_ALUM, EPS_ALUM, ALERGIAS_ALUM, MEDICA_ALUM, PESO_ALUM, ALTURA_ALUM, ENFERM_ALUM, DESCENFER_ALUM);
        //3. ¿Quién hace las operaciones? DAO
        ProfesorDAO proDAO = new ProfesorDAO(proVO);

        //4. dministrar Operaciones
        switch (opcion) {
            case 1: // consular alumno
                String ID=request.getParameter("Id");
                proVO = proDAO.consultarEstudiante(ID);

                if (proVO != null) {
                    request.setAttribute("datosConsultados", proVO);
                    request.getRequestDispatcher("Acudiente.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeError", "No se encuentra el alumno");
                    request.getRequestDispatcher("consultarAlumno.jsp").forward(request, response);
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
