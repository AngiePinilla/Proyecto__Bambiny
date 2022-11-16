package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.AcudienteDAO2;
import ModeloVO.AcudienteVO2;
import ModeloDAO.AlumnoDAO;
import ModeloVO.AlumnoVO;
import java.util.ArrayList;
import ModeloVO.RolVO;
import ModeloDAO.RolDAO;
import ModeloVO.UsuarioVO;

public final class listarAcudientes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            String id = "";
        
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
        }
    
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.3/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css\">\n");
      out.write("        <title>Acudientes</title>\n");
      out.write("        <link href=\"estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <a href=\"consultarAlumno.jsp\">Volver</a>\n");
      out.write("        <br>\n");
      out.write("        <h2>Acudientes</h2>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
           
            AcudienteVO2 AcuVO2 = (AcudienteVO2) request.getAttribute("datosConsultados");
            id = AcuVO2.getID_ALUM();
            if (AcuVO2 != null) {
        
      out.write("\n");
      out.write("        <form method=\"post\" action=\"Acudientes\">\n");
      out.write("            <table id=\"example\" class=\"table table-striped\" style=\"width: 100%\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Id_acud</th>\n");
      out.write("                        <th>Nombre1</th>\n");
      out.write("                        <th>Nombre2</th>\n");
      out.write("                        <th>Apellido1</th>\n");
      out.write("                        <th>Apellido2</th>\n");
      out.write("                        <th>Numero documento</th>\n");
      out.write("                        <th>Telefono celular</th>\n");
      out.write("                        <th>Direccion</th>  \n");
      out.write("                        <th>Estado</th> \n");
      out.write("                        <th>Fecha de nacimiento</th> \n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        AcudienteVO2 acuVO2 = new AcudienteVO2();
                        AcudienteDAO2 acuDAO2 = new AcudienteDAO2();
                        ArrayList< AcudienteVO2> lista = acuDAO2.lista(id);
                        for (int i = 0; i < lista.size(); i++) {

                            acuVO2 = lista.get(i);
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(acuVO2.getID_ACUD());
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <td>");
      out.print(acuVO2.getNOM_ACUD1());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(acuVO2.getNOM_ACUD2());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(acuVO2.getAPEL_ACUD1());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(acuVO2.getAPEL_ACUD2());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(acuVO2.getNUMDOCU_ACID());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(acuVO2.getTELE_ACUD());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(acuVO2.getDIREC_ACUD());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(acuVO2.getESTADOAUTO_ACUD());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(acuVO2.getFECHNACI_ACUD());
      out.write("</td>  \n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("                ");
}
      out.write(" \n");
      out.write("            </table>\n");
      out.write("            ");
}
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
      out.write("            <br><br>\n");
      out.write("        </form>\n");
      out.write("    </form>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"js/modal.js\"></script>\n");
      out.write("<script src=\"js/script.js\"></script>\n");
      out.write("</body>\n");
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
