<%-- 
    Document   : alumno
    Created on : 21/07/2022, 07:06:29 AM
    Author     : ranyerino
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.RolVO"%>
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

        <%            String id_usua = rolVO.getRolId();

            AlumnoVO alumVO = new AlumnoVO();
            AlumnoDAO alumDAO = new AlumnoDAO(alumVO);

            alumVO = alumDAO.consultarAlumno(id_usua);

            String id_alumn = alumVO.getId_alum();

        %>


        <section class="home">
            <div class="contenido">
                <h1>ALUMNO</h1>
                <a href="regAlumno.jsp">Registrar alumno</a><br>

                <a href="familiar.jsp">Registrar familiar</a><br>
                <a href="Acudiente.jsp">Registrar Acudiente</a><br>
                <a href="documento.jsp">Registrar documento</a><br>
                <hr>
           
                <form action="Alumno" method="post">

                    <button name="textid_alum" value="<%= id_alumn%>"  >Actualizar Alumno</button>
                    <input name="opcion" value="2" type="hidden">
                </form>




                <br>
                <a href="listarDocumentos.jsp">actualizar documento</a><br>
                <a href="ListaActAcud.jsp">actualizar Acudiente</a><br>
                <a href="listarFamiliar.jsp">actualizar Familiar</a><br>

                <a href="form.jsp">form </a><br>
                <a href="Archivo.jsp">ARCHIVO </a><br>
                <br>

                <br>


            </div>


            <%
                if (request.getAttribute("mensajeError") != null) { %>
            ${mensajeError}

            <%} else {%>
            ${mensajeExito}        
            <%}%>


        </section>
    </body>
</html>
