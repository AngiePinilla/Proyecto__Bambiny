<%-- 
    Document   : admin
    Created on : 19/07/2022, 03:26:30 PM
    Author     : ranyerino
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
        <link rel="stylesheet" href="Estilos/director.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.3/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="NavBar.jsp" %>

        <section class="home">
            <div class="text">Dashboard Sidebar</div>

            <div class="contenido">
                <table id="example" class="table table-striped" style="width:100%">
                    <thead>
                        <tr>
                            <th>Usuario</th>
                            <th>Estado</th>
                            <th>Roles</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%                    UsuarioVO usuVO = new UsuarioVO();
                            UsuarioDAO usuDAO = new UsuarioDAO(usuVO);
                            ArrayList<UsuarioVO> listarUsuarios = usuDAO.listar();
                            for (int i = 0; i < listarUsuarios.size(); i++) {

                                usuVO = listarUsuarios.get(i);
                        %>
                        <tr>
                            <td><%=usuVO.getUsuLogin()%></td>
                            <td><%=usuVO.getEstado()%></td>

                            <td>
                                <form method="post" action="Usuario">
                                    <button>Asignar rol</button>
                                    <input type="hidden" value="<%=usuVO.getUsuId()%>" name="idUsuario">
                                    <input type="hidden" value="<%=usuVO.getUsuLogin()%>" name="loginUsuario">
                                    <input type="hidden" value="<%=usuVO.getEstado()%>" name="estadoUsuario">
                                    <input type="hidden" value="8" name="opcion">
                                </form>
                            </td>
                            <td>
                                <%
                            if (usuVO.getEstado().equals("Activo")) {%>
                                <form method="post" action="Usuario">
                                    <button name="estadoInhabilitado" value="<%=usuVO.getUsuId()%>">Inhabilitar</button>
                                    <input type="hidden" value="6" name="opcion">
                                </form>
                                <%} else if (usuVO.getEstado().equals("Inhabilitado")) {%>
                                <form method="post" action="Usuario">
                                    <button name="estadoInhabilitado" value="<%=usuVO.getUsuId()%>">habilitar</button></td>
                    <input type="hidden" value="7" name="opcion">
                    </form>
                    <%}
                    %>
                    </tr>
                    </tbody>
                    <%}%>
                </table>
            </div>
            <%
            if (request.getAttribute("mensajeError") != null) { %>
            ${mensajeError}

            <%} else {%>
            ${mensajeExito}        
            <%}%>
        </section>

    </body>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap5.min.js"></script>

    <script src="js/script.js"></script>
</html>
