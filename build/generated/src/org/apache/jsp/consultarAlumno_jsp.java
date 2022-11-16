package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.ProfesorDAO;
import ModeloVO.ProfesorVO;

public final class consultarAlumno_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!-- CSS only -->\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.3/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css\">\n");
      out.write("        <title>Alumnos</title>\n");
      out.write("        <link href=\"estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h2>Alumnos</h2>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
            if (request.getAttribute("mensajeError") != null) { 
      out.write("\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("        ");
} else {
      out.write("\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("        \n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <form method=\"post\" action=\"Acudientes\">\n");
      out.write("            <table id=\"example\" class=\"table table-striped\" style=\"width: 100%\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Eps</th> \n");
      out.write("                        <th>Lugar nacimiento</th>\n");
      out.write("                        <th>Nombre1</th>\n");
      out.write("                        <th>Nombre2</th>\n");
      out.write("                        <th>Apellido1</th>\n");
      out.write("                        <th>Apellido2</th>\n");
      out.write("                        <th>Nuip</th>\n");
      out.write("                        <th>Fecha nacimiento</th> \n");
      out.write("                        <th>Grupo sanguineo</th> \n");
      out.write("                        <th>Numero de hermanos</th> \n");
      out.write("                        <th>Dirección</th> \n");
      out.write("                        <th>Telefono fijo</th> \n");
      out.write("                        <th>Telefono celular</th> \n");
      out.write("                        <th>Alergias</th> \n");
      out.write("                        <th>Medicina</th> \n");
      out.write("                        <th>Peso</th> \n");
      out.write("                        <th>Altura</th> \n");
      out.write("                        <th>Enfermedades</th>\n");
      out.write("                        <th>Descripcion</th>\n");
      out.write("                        <th>Acudiente</th> \n");
      out.write("                        <th>Familiar</th> \n");
      out.write("                    </tr\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        ProfesorVO proVO = new ProfesorVO();
                        ProfesorDAO proDAO = new ProfesorDAO();
                        ArrayList<ProfesorVO> listaAlumnos = proDAO.listar();
                        for (int i = 0; i < listaAlumnos.size(); i++) {

                            proVO = listaAlumnos.get(i);
                    
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(proVO.getNOM_ALUM1());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(proVO.getNOM_ALUM2());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(proVO.getAPEL_ALUM1());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(proVO.getAPEL_ALUM2());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(proVO.getNUIP_ALUM());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(proVO.getFECHANACI_ALUM());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(proVO.getLUGARNACI_ALUM());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(proVO.getGRUPOSANGUI_ALUM());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(proVO.getNUMHERMA_ALUM());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(proVO.getDIREC_ALUM());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(proVO.getTELECELURAR_ALUM());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(proVO.getTELEFIJO_ALUM());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(proVO.getEPS_ALUM());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(proVO.getALERGIAS_ALUM());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(proVO.getMEDICA_ALUM());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(proVO.getPESO_ALUM());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(proVO.getALTURA_ALUM());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(proVO.getENFERM_ALUM());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(proVO.getDESCENFER_ALUM());
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <td> \n");
      out.write("                            <form method=\"post\" action=\"Acudientes\">\n");
      out.write("                                <button class=\"btn-est\" name=\"Id\" value=\"");
      out.print(proVO.getID_ALUM());
      out.write("\">Consultar</button>\n");
      out.write("                        </td>\n");
      out.write("                <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("                </form>\n");
      out.write("                </tr>\n");
      out.write("                </tbody>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            <br><br>\n");
      out.write("\n");
      out.write("            </center>\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\n");
      out.write("            <script src=\"https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js\"></script>\n");
      out.write("            <script src=\"https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap5.min.js\"></script>\n");
      out.write("            <script src=\"https://kit.fontawesome.com/6131ecdde6.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <script src=\"js/modal.js\"></script>\n");
      out.write("            <script src=\"js/script.js\"></script>\n");
      out.write("            </body>\n");
      out.write("            </html>\n");
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
