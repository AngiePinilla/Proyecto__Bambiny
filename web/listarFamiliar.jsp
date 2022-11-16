<%-- 
    Document   : listarFamiliar
    Created on : 11-nov-2022, 13:46:04
    Author     : yoang
--%>
<%@page import="ModeloDAO.FamiliarDAO"%>
<%@page import="ModeloVO.familiarVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.RolVO"%>

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
        <a href="alumno.jsp">Volver</a>
        <br>
        <h2>Femiliar</h2>
        <br><br>
        <input type="text" value="<%= id_alumn  %>" > 
        <form method="post" action="Familiar">

            <table border="1px">
                <tr>
                    
                    <th>id</th>
                    
                </tr>

                <%
                    familiarVO famivo = new familiarVO();
            
                    FamiliarDAO famiDAO = new FamiliarDAO();

                    ArrayList<familiarVO> Listarfa = famiDAO.listarFami(id_alumn);
                    for (int i = 0; i < Listarfa.size(); i++) {
                        famivo = Listarfa.get(i);
                       

                %>

                <tr>
                    <td><%= famivo.getId_fami() %></td>
                    
                

                    <td>
                        <form method="post" action="Document">
                            

                            <button name="textid_docu" value="<%= famivo.getId_fami() %>" >Actualizar</button>

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
