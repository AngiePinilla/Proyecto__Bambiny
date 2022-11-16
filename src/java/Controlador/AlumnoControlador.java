/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.AlumnoDAO;
import ModeloVO.AlumnoVO;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author solan
 */
@WebServlet(name = "AlumnoControlador", urlPatterns = {"/Alumno"})
public class AlumnoControlador extends HttpServlet {

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

        //1. recibir datos de las vistas
        String id_alum = request.getParameter("textid_alum");
        String id_usua = request.getParameter("textid_usua");
        String id_eps = request.getParameter("textid_eps");
        String id_luganaci = request.getParameter("textid_luganaci");
        String nom1_alum = request.getParameter("textnom1_alum");
        String nom2_alum = request.getParameter("textnom2_alum");
        String apel1_alum = request.getParameter("textapel1_alum");
        String apel2_alum = request.getParameter("textapel2_alum");
        String nuip_alumn = request.getParameter("textnuip_alumn"); //cambiar y hacer los mismo que con eps
        String fechnaci_alum = request.getParameter("textfechnaci_alum"); //cambiar y hacer los mismo que con eps
        String grupsangui_alum = request.getParameter("textgrupsangui_alum"); //cambiar y hacer los mismo que con eps
        String numherma_alum = request.getParameter("textnumherma_alum");
        String direc_alum = request.getParameter("textdirec_alum");
        String telefijo_alum = request.getParameter("texttelefijo_alum");// eps con id 
        String telecelu_alum = request.getParameter("texttelecelu_alum");
        String alerg_alum = request.getParameter("textalerg_alum");
        String medica_alum = request.getParameter("textmedica_alumd");
        String peso_alum = request.getParameter("textpeso_alum");
        String altura_alum = request.getParameter("textaltura_alum");
        String enferm_alum = request.getParameter("textenferm_alum");
        String descenferm_alum = request.getParameter("textdescenferm_alum");
        String esta_alum = request.getParameter("textesta_alum");

        //String usuLogin = request.getParameter("textUsuario");
        //String usuPassword = request.getParameter("textClave");
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //2. el VO tiene los datos seguros
        AlumnoVO alumvo = new AlumnoVO(id_alum, id_usua, id_eps, id_luganaci, nom1_alum, nom2_alum, apel1_alum, apel2_alum, nuip_alumn, fechnaci_alum, grupsangui_alum, numherma_alum, direc_alum, telefijo_alum, telecelu_alum, alerg_alum, medica_alum, peso_alum, altura_alum, enferm_alum, descenferm_alum, esta_alum);

//3. ¿Quién hace las operaciones? DAO
        AlumnoDAO alumdao = new AlumnoDAO(alumvo);

        //4. dministrar Operaciones
        switch (opcion) {

            case 1:
                if (alumdao.agregarRegistro()) {
                    request.setAttribute("MensajeExito", "El alumno se registro correctamente");
                } else {
                    request.setAttribute("MensajeError", "El alumno no se registro correctamente");
                }
                request.getRequestDispatcher("regAlumno.jsp").forward(request, response);
                break;

            case 2:
                alumvo = alumdao.consultarDatos(id_alum);

                if (alumvo != null) {

                    request.setAttribute("datosConsultados", alumvo);
                    request.getRequestDispatcher("actuAlumno.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "la matricula  se pudo encontrar");
                    request.getRequestDispatcher("alumno.jsp").forward(request, response);

                }
                break;

            case 3:
                if (alumdao.actualizarRegistro()) {
                    request.setAttribute("mensajeExito", "el alumno se actualizo correctamente");
                    request.getRequestDispatcher("alumno.jsp").forward(request, response);
                    
                } else {request.getRequestDispatcher("actuAlumno.jsp").forward(request, response);
                    request.setAttribute("mensajeError", "el alumno NO se actualizo correctamente");
                    request.getRequestDispatcher("actuAlumno.jsp").forward(request, response);
                    
                }
                
                break;

            case 4:
            /*  if (usudao.inicioSesion(usuLogin, usuPassword)) {
                   request.getRequestDispatcher("dashboard.jsp").forward(request, response);
                }
                else{
                          request.setAttribute("MensajeError", "Verifique sus datos, por favor.");
                        request.getRequestDispatcher("index.jsp").forward(request, response);
          }
                break; */
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
