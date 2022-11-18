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
            <div class="contenido">
                <br><br>
                <h1>Tus Acudientes</h1>

                <%            if (request.getAttribute("mensajeError") != null) {%>

                ${mensajeError}
                <%} else {%>
                ${mensajeExito}
                <%}
                %>
                <br>
                <form class="acu" method="post" action="Familiar">

                    <table id="example" class="table table-striped">
                        <thead>
                            <tr>
                                                               
                                <th>Nombre</th>
                                <th>Apellido</th>                                
                                <th>Numero documento</th>
                                <th>Parentesco</th>
                                <th>Celular</th>
                                <th>Fecha de nacimiento</th>
                                <th>Ocupacion</th>
                                <th>Lug. Trabajo</th>
                                <th>Telefono Trabajo</th>
                                <th>opciones</th>
                            </tr>
                        </thead>
                        <%
                            familiarVO FamiVO = new familiarVO();
                            FamiliarDAO FamiDAO = new FamiliarDAO();

                            ArrayList<familiarVO> ListarFami = FamiDAO.listarFami(id_alumn);
                            for (int i = 0; i < ListarFami.size(); i++) {
                                FamiVO = ListarFami.get(i);

                        %>

                        <tr>
                            
                            <td><%= FamiVO.getNom1_fami() %> <%= FamiVO.getNom2_fami() %></td> 
                            <td><%= FamiVO.getApel1_fami() %> <%= FamiVO.getApel2_fami() %></td> 
                            <td><%= FamiVO.getNumdocu_fami() %></td> 
                            <td><%= FamiVO.getParent_fami() %></td> 
                            <td><%= FamiVO.getTelecel_fami() %></td> 
                            <td><%= FamiVO.getFechnaci_fami() %></td> 
                            <td><%= FamiVO.getOcupac_fami() %></td> 
                            <td><%= FamiVO.getLugatrab_fami() %></td> 
                            <td><%= FamiVO.getTeletrab_fami() %></td> 

                            <td>
                                <form method="post" action="Familiar">

                                    <button class="bn60" name="textid_fami" value="<%= FamiVO.getId_fami() %>" >Actualizar</button>
                                    <input name="opcion" value="3" type="hidden">

                                </form>
                            </td>
                        </tr>
                        <%}%>




                    </table>
                </form>

            </div>
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
