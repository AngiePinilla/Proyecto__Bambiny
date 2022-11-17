<%-- 
    Document   : ConsultarMat2
    Created on : 04-sep-2022, 20:27:30
    Author     : yoang
--%>


<%@page import="ModeloVO.RolVO"%>
<%@page import="ModeloDAO.RolDAO"%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.MatriculaDAO"%>
<%@page import="ModeloVO.MatriculaVO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Estilos/generales.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" />
        <link href="https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css" rel="stylesheet" />
        <title>Consultar Matricula</title>
    </head>
    <body>
        <%@include file="NavBar.jsp" %>


        <section class="home">

            <div class="contenido">

                <h1>Matriculas por registradas</h1>

                <br>
                <% if (request.getAttribute("mensajeError") != null) { %>
                ${mensajeError}

                <%} else {%>
                ${mensajeExito}        
                <%}%>

                <form method="post" action="GenerarReportes.jsp" target="_black" >
                    <input type="submit" class="bn60" value="Generar Reporte">
                    <input type="hidden" name="nomreporte" value="MatriculasReportes.jasper">
                </form>
                <br>
                
                <table id="example" class="table table-striped" >
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Alumno</th>
                            <th>Director</th>
                            <th>Registro</th>
                            <th>Fecha ultima modificacion</th>
                            <th>Estado</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>

                    <%
                        MatriculaVO matVO = new MatriculaVO();
                        MatriculaDAO matDAO = new MatriculaDAO();
                        ArrayList<MatriculaVO> listaMatrEst = matDAO.listarEst();
                        for (int i = 0; i < listaMatrEst.size(); i++) {
                            matVO = listaMatrEst.get(i);


                    %>
                    <tr>
                        <td><%= matVO.getIdMatr()%></td>
                        <td><%= matVO.getIdUsua()%></td>
                        <td><%= matVO.getIdAlum()%></td>
                        <td><%= matVO.getRegiMatr()%></td>
                        <td><%= matVO.getFechMatr()%></td>
                        <td><%= matVO.getEstaMatr()%></td>

                        <td>
                            <form method="post" action="Matricula">

                                <button class="bn60" name="textAlum" value="<%= matVO.getIdAlum()%>" >Ver</button>

                                <input type="hidden" value="1" name="opcion"> 
                            </form>

                        </td>

                        <%
                            if (matVO.getEstaMatr().equals("activo")) {
                        %>
                        <td>
                            <form method="post" action="Matricula">
                                <input type="hidden" name="textUsua" value="<%=rolVO.getRolId()%>">
                                <button class="bn61" name="textMatr" value="<%= matVO.getIdMatr()%>" >Inactivar</button>



                                <input type="hidden" value="3" name="opcion"> 
                            </form>

                        </td>

                        <% } else if (matVO.getEstaMatr().equals("inactivo")) {%>

                        <td>

                            <form method="post" action="Matricula">
                                <input type="hidden" name="textUsua" value="<%=rolVO.getRolId()%>">

                                <button class="bn62" name="textMatr" value="<%= matVO.getIdMatr()%>" >Activar</button>

                                <input type="hidden" value="5" name="opcion"> 
                            </form>

                        </td>

                        <% }%>
                    </tr>

                    <% }%>
                </table>
                <br>

            </div>
        </section>

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

