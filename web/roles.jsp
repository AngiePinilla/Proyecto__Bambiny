<%-- 
    Document   : roles.jsp
    Created on : 14/09/2022, 08:05:17 AM
    Author     : ranyerino
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.RolVO"%>
<%@include file="Sesiones.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Estilos/index.css">

        <!----======== CSS ======== -->
        <link href="Estilos/SliderNav.css" rel="stylesheet" type="text/css"/>

        <!----===== Boxicons CSS ===== -->
        <link href="https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css" rel="stylesheet">

        <link rel="icon" type="image/x-icon" href="assets/jardin/IconoNegro.ico">
        <title>JSP Page</title>
    </head>
    <body>

        <nav class="sidebar close">
            <header>
                <div class="image-text">
                    <span class="image">
                        <img src="img/iconnav.png" alt="">
                    </span>

                    <div class="text logo-text">
                        <span class="name">Bambiny</span>
                        <span class="profession"><%= usuario%></span>
                    </div>
                </div>

                <i class="bx bx-chevron-right toggle"></i>
            </header>

            <div class="menu-bar">
                <div class="menu">

                    <li class="search-box li">
                        <i class="bx bx-search icon"></i>
                        <input type="text" placeholder="Search...">
                    </li>

                    <ul class="menu-links">

                        <li class="nav-links">
                            <a href="admin.jsp">
                                <i class="bx bx-home-alt icon" ></i>
                                <span class="text nav-text">Inicio</span>
                            </a>
                        </li>
                        <li class="nav-links">
                            <a href="perfil.jsp">
                                <i class='bx bx-user icon'></i>
                                <span class="text nav-text">Perfil</span>
                            </a>
                        </li>
                        <li class="nav-links">
                            <a href="registrarUsuario.jsp">
                                <i class='bx bxs-user-plus icon'></i>
                                <span class="text nav-text">Nuevos Usuarios</span>
                            </a>
                        </li>

                    </ul>
                </div>

                <div class="bottom-content">
                    <li class="">

                        <form method="post" action="Sesiones">

                            <a href="#">
                                <i class="bx bx-log-out icon" ></i>
                                <input class="text nav-text" type="submit" value="Cerrar Sesion" >
                            </a>
                        </form>
                    </li>


                    <li class="mode">
                        <div class="sun-moon">
                            <i class="bx bx-moon icon moon"></i>
                            <i class="bx bx-sun icon sun"></i>
                        </div>
                        <span class="mode-text text">Dark mode</span>

                        <div class="toggle-switch">
                            <span class="switch"></span>
                        </div>
                    </li>

                </div>
            </div>

        </nav>


        <section class="home">
            <div class="login-box">
                <h2>Asginar roles a Usuario</h2>
                <form method="post" action="Usuario">

                    <div class="user-box">
                        <h2><%=request.getAttribute("loginUsuario")%></h2><br>
                    </div>

                    <div class="user-box">
                        <h2><%=request.getAttribute("estadoUsuario")%></h2><br>
                    </div>

                    <h3>roles</h3>

                    <select name="rol">
                        <option>Elija el rol</option>
                        <%
                            RolVO rolVO = new RolVO();
                            RolDAO rolDAO = new RolDAO();
                            ArrayList<RolVO> listarRoles = rolDAO.listarRoles();
                            for (int i = 0; i < listarRoles.size(); i++) {

                                rolVO = listarRoles.get(i);

                        %>
                        <option value="<%=rolVO.getRolId()%>"><%=rolVO.getRolTiPo()%></option>
                        <%
                            }
                        %>
                    </select>

                    <br>
                    <div class="user-box">
                        <button>asignar</button> <br>
                        <input type="hidden" value="<%=request.getAttribute("idUsuario")%>" name="usuarioID">
                        <input type="hidden" value="9" name="opcion">
                    </div>

                </form>

                <%
                    if (request.getAttribute("mensajeError") != null) { %>
                ${mensajeError}

                <%} else {%>
                ${mensajeExito}        
                <%}%>
            </div>

        </section>

        <script src="js/navbar.js" type="text/javascript"></script>
    </body>
</html>
