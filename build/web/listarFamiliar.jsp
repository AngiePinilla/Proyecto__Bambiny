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
        <link href="Estilos/generales.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" />
        <link href="https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="sweetalert2.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="NavBar.jsp" %>
        <%             String id_usua = rolVO.getRolId();

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
            <input type="text" value="<%= id_alumn%>" > 
            <form method="post" action="Familiar">

                <table id="example" class="table table-striped">
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>Nombre</th>
                            <th>Apellidp</th>
                            <th>Num documento</th>                    
                        </tr>
                    </thead>
                    <%
                        familiarVO famivo = new familiarVO();

                        FamiliarDAO famiDAO = new FamiliarDAO();

                        ArrayList<familiarVO> listarfa = famiDAO.listarFami(id_alumn);
                        for (int i = 0; i < listarfa.size(); i++) {
                            famivo = listarfa.get(i);


                    %>

                    <tr>
                        <td><%= famivo.getId_fami()%></td>



                        <td>
                            <form method="post" action="Document">


                                <button name="textid_docu" value="<%= famivo.getId_fami()%>" >Actualizar</button>

                                <input type="hidden" value="3" name="opcion"> 
                            </form>
                        </td>
                    </tr>
                    <%}%>




                </table>
            </form>
        </section>
                    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap5.min.js"></script>
    
    <script>
            $(document).ready(function () {
                $('#example').DataTable({
                    language: {
                        url: '//cdn.datatables.net/plug-ins/1.12.1/i18n/es-ES.json'
                    }
                });
            });
        </script>
    </body>
</html>
