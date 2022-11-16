<%-- 
    Document   : actuFamiliar
    Created on : 11/09/2022, 08:32:14 PM
    Author     : solan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
        RolDAO rolDAO = new RolDAO();
        RolVO rolVO = new RolVO();

        ArrayList<RolVO> listaRol = rolDAO.listar(usuario);
        for (int i = 0; i < listaRol.size(); i++) {
            rolVO = listaRol.get(i);
        }
        String id_usua = rolVO.getRolId();

        AlumnoVO alumVO = new AlumnoVO();
        AlumnoDAO alumDAO = new AlumnoDAO(alumVO);
        
        alumVO = alumDAO.consultarAlumno(id_usua);
        
        String id_alumn = alumVO.getId_alum();

    %>
         <h1>Familiar</h1>
        
        
        <form method="post" action="Familiar" class="fami">

            <table>      
                <br>Primer Nombre <br>
                <input type="text" name="textnom1_fami"><br>
                
                <br>Segundo Nombre <br>
                <input type="text" name="textnom2_fami"><br>
                
                <br>Primer Apellido <br>
                <input type="text" name="textapel1_fami"><br>
                
                <br> Segundo Apellido <br>
                <input type="text" name="textapel2_fami"><br>
                
                <br> Parentesco  <br>
                <input type="text" name="textparent_fami"><br>
                
                <br>Numero de documento  <br>
                <input type="text" name="textnumdocu_fami"><br>
                
                <br>ocupacion  <br>
                <input type="text" name="textocupac_fami"><br>
                
                <br> lugar de trabajo <br>
                <input type="text" name="textlugatrab_fami"><br>
                
                <br>numero de contacto empresarial <br>
                <input type="text" name="textteletrab_fami"><br>
                <br>
                
                <br> telefono celular <br>
                <input type="text" name="texttelecel_fami"><br>
                
                <br>Fecha de Nacimiento <br>
                <input type="date" id="acu" name="textfechnaci_fami" 
                       value="fecha" ><br>
                
                
                
                <br> id usuario <br>
                <input type="text" name="textid_fami"><br>
                
                <br> estado <br>
                <input type="text" name="textesta_fami"><br>
                
            </table><br>
            <button>Registar</button>
            <input type="hidden" value="2" name="famiopcion">
            
            <a href="alumno.jsp">Volver</a>
        </form>


        <%
            if (request.getAttribute("MensajeError") != null) { %>
        ${MensajeError}

        <%} else {%>
        ${MensajeExito}        
        <%}%>


        
        

    </body>
</html>
