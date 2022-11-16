package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.RolVO;
import ModeloDAO.RolDAO;
import ModeloVO.UsuarioVO;
import java.util.ArrayList;
import ModeloDAO.MatriculaDAO;
import ModeloVO.MatriculaVO;
import ModeloVO.UsuarioVO;

public final class ConsultarMat2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Sesiones.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>sesiones</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-control", "No-cache,no-store,must-revalidate");
        response.setDateHeader("Expirar", 0);


    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
        HttpSession sesion = (HttpSession) request.getSession();
        String usuario = "";
        String usuid = "";

        if (sesion.getAttribute("datosUsuario") == null) {

            request.getRequestDispatcher("index.jsp").forward(request, response);

        } else {
            UsuarioVO usuVO = (UsuarioVO) sesion.getAttribute("datosUsuario");
            usuario = usuVO.getUsuLogin();
            usuid = usuVO.getUsuPassword();
        }

    
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html> \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.3/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"Estilos/director.css\">\n");
      out.write("        <title>Consultar Matricula</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
 RolVO rolVO = new RolVO();
            RolDAO rolDAO = new RolDAO();
            ArrayList<RolVO> listaDatos = rolDAO.listar(usuario);

            for (int i = 0; i < listaDatos.size(); i++) {

                rolVO = listaDatos.get(i);
            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"contenido\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <a href=\"director.jsp\" class=\"btn-est3\">Volver</a>\n");
      out.write("            <h1>Matriculas por registradas</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            ");
            if (request.getAttribute("mensajeError") != null) { 
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("            ");
} else {
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("        \n");
      out.write("            ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <table id=\"example\" class=\"table table-striped\" style=\"width:100%\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Id</th>\n");
      out.write("                        <th>Alumno</th>\n");
      out.write("                        <th>Director</th>\n");
      out.write("                        <th>Registro</th>\n");
      out.write("                        <th>Fecha ultima modificacion</th>\n");
      out.write("                        <th>Estado</th>\n");
      out.write("                        <th>Acciones</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        MatriculaVO matVO = new MatriculaVO();
                        MatriculaDAO matDAO = new MatriculaDAO();
                        ArrayList<MatriculaVO> listaMatrEst = matDAO.listarEst();
                        for (int i = 0; i < listaMatrEst.size(); i++) {
                            matVO = listaMatrEst.get(i);


                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( matVO.getIdMatr());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( matVO.getIdUsua());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( matVO.getIdAlum());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( matVO.getRegiMatr());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( matVO.getFechMatr());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( matVO.getEstaMatr());
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");

                            if (matVO.getEstaMatr().equals("activo")) {
                        
      out.write("\n");
      out.write("                        <td>\n");
      out.write("                            <form method=\"post\" action=\"Matricula\">\n");
      out.write("                                <input type=\"hidden\" name=\"textUsua\" value=\"");
      out.print(rolVO.getRolId());
      out.write("\">\n");
      out.write("                                <button class=\"btn-est2\" name=\"textMatr\" value=\"");
      out.print( matVO.getIdMatr());
      out.write("\" >Inactivar</button>\n");
      out.write("\n");
      out.write("                                \n");
      out.write("\n");
      out.write("                                <input type=\"hidden\" value=\"3\" name=\"opcion\"> \n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");
 } else if (matVO.getEstaMatr().equals("inactivo")) {
      out.write("\n");
      out.write("\n");
      out.write("                        <td>\n");
      out.write("\n");
      out.write("                            <form method=\"post\" action=\"Matricula\">\n");
      out.write("                                <input type=\"hidden\" name=\"textUsua\" value=\"");
      out.print(rolVO.getRolId());
      out.write("\">\n");
      out.write("                                \n");
      out.write("                                <button class=\"btn-est\" name=\"textMatr\" value=\"");
      out.print( matVO.getIdMatr());
      out.write("\" >Activar</button>\n");
      out.write("                             \n");
      out.write("                                <input type=\"hidden\" value=\"5\" name=\"opcion\"> \n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap5.min.js\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/6131ecdde6.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/modal.js\"></script>\n");
      out.write("        <script src=\"js/script.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
