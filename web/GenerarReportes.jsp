<%-- 
    Document   : GenerarReportes
    Created on : 12-nov-2022, 16:25:37
    Author     : yoang
--%>

<%@page import="net.sf.jasperreports.engine.JasperRunManager"%>

<%@page import="java.sql.Connection"%>
<%@page import="util.ConexionBd"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String nreporte = request.getParameter("nomreporte");
            
        File reporte = new File(application.getRealPath(nreporte)); 

        Map<String,Object> Parametros = new HashMap<String,Object>();
        
        
        ConexionBd conexionbd = new ConexionBd();
        
        Connection conexion = conexionbd.obtenerConexion();
        
        byte[] bytes = JasperRunManager.runReportToPdf(reporte.getPath(), Parametros, conexion);
        
        response.setContentType("application/pdf");
        response.setContentLength(bytes.length);
        
        ServletOutputStream salida = response.getOutputStream();
        
        salida.write(bytes,0,bytes.length);
        
        salida.flush();
        salida.close();
        
        %>
    </body>
</html>
