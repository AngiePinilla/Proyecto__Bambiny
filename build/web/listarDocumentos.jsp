<%-- 
    Document   : prueba
    Created on : 21-sep-2022, 18:27:22
    Author     : yoang
--%>

<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.RolVO"%>
<%@page import="ModeloDAO.docuDAO"%>
<%@page import="ModeloVO.docuVO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <%@include file="NavBar.jsp" %>
         <%            
            String id_usua = rolVO.getRolId();

            AlumnoVO alumVO = new AlumnoVO();
            AlumnoDAO alumDAO = new AlumnoDAO(alumVO);

            alumVO = alumDAO.consultarAlumno(id_usua);

            String id_alumn = alumVO.getId_alum();

        %>
        <section class="home">
        <%            if (request.getAttribute("mensajeError") != null) {%>

        ${mensajeError}
        <%} else {%>
        ${mensajeExito}
        <%}
        %>
        
        <br>
        <h2>Documentos</h2>
        <br><br>
        <form method="post" action="Document">

            <table border="1px">
                <tr>
                    <th>n</th>
                    <th>alumno</th>
                    <th>documento</th>
                    <th>fecha</th>
                    <th>archivo</th>
                    <th>opciones</th>
                </tr>

                <%
                    docuVO doVO = new docuVO();
                    docuDAO doDAO = new docuDAO();

                    ArrayList<docuVO> ListarAcu = doDAO.listarDoc(id_alumn);
                    for (int i = 0; i < ListarAcu.size(); i++) {
                        doVO = ListarAcu.get(i);

                %>

                <tr>
                    <td><%= doVO.getId_docu() %></td>
                    <td><%= doVO.getId_alum()%></td>
                    <td><%= doVO.getTipo_docu()%></td>
                    <td><%= doVO.getFechcreac_docu()%></td>
                    <td><%= doVO.getArchivo_docu() %></td>

                    <td>
                        <form method="post" action="Document">
                            

                            <button name="textid_docu" value="<%= doVO.getId_docu() %>" >Actualizar</button>

                            <input type="hidden" value="3" name="opcion"> 
                        </form>
                    </td>
                </tr>
                <%}%>
                
                
        
        
            </table>
        </form>
    </section>
    </body>
</html>
