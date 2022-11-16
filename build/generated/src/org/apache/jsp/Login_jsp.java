package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("\n");
      out.write("        <title>Login</title>\n");
      out.write("\n");
      out.write("        <!-- Google font -->\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Playfair+Display:900\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Alice:400,700\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\n");
      out.write("         <!-- <link rel=\"icon\" type=\"image/x-icon\" href=\"img/ciervo.png\" />-->\n");
      out.write("\n");
      out.write("        <!-- Custom stlylesheet -->\n");
      out.write("        <link href=\"Estilos/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"booking\" class=\"section\">\n");
      out.write("            <div class=\"section-center\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                        <div class=\"booking-form\">\n");
      out.write("                            <div class=\"logo\">\n");
      out.write("                                <img src=\"img/logo-osc.png\" alt=\"\" id=\"logo\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"booking-bg\">\n");
      out.write("\n");
      out.write("                                <div class=\"form-header\">\n");
      out.write("\n");
      out.write("                                    <img src=\"img/icon.png\" id=\"icono\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <form method=\"post\" action=\"Usuario\">\n");
      out.write("                                <div id=\"formulario\">\n");
      out.write("                                    <h1>Iniciar Sesión</h1>\n");
      out.write("\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <div class=\"form-ugrop\">\n");
      out.write("                                                <span class=\"form-label\">Usuario</span>\n");
      out.write("\n");
      out.write("                                                <input class=\"form-control\" type=\"text\" name=\"textLogin\" placeholder=\"Nombre\" required>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <span class=\"form-label\">Contraseña</span>\n");
      out.write("\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" name=\"textPassword\" placeholder=\"***\" required>\n");
      out.write("\n");
      out.write("                                                <span class=\"select-arrow\"></span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <button id=\"btnpass\" class=\"btn submits\">Olvido su contraseña</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-btn\">\n");
      out.write("                                    <button class=\"submit-btn\">Ingresar</button>\n");
      out.write("                                    <input type=\"hidden\" value=\"4\" name=\"opcion\"><br>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <br>\n");
      out.write("                                ");

                                if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("\n");
      out.write("                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                ");
} else {
      out.write("\n");
      out.write("                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                ");
}
                                
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
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
