<%-- 
    Document   : director
    Created on : 21/07/2022, 07:05:51 AM
    Author     : ranyerino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Estilos/director.css">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="NavBar.jsp" %>

        <section class="home">
            
            <h1>DIRECTOR</h1>
           
            <div class="contenido">
                
                <form method="post" action="GenerarReportes.jsp" target="_black" >
                    <input type="submit" value="Alumnos Registrados">
                    <input type="hidden" name="nomreporte" value="AlumnosReportes.jasper">
                </form><br>
                
                <form method="post" action="GenerarReportesParametros.jsp" target="_black" >
                   
                    <input type="hidden" name="nomreporte" value="ReporteEmpleados.jasper">
                    
                    <select name="parametro" required>
                        <option value="Director">Director</option>
                        <option value="Profesor">Profesor</option>
                    </select>
                     <input type="submit" value="Alumnos Registrados">
                </form>
                
            </div>


        </section>

    </body>
</html>
