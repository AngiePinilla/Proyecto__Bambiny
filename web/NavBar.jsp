<%-- 
    Document   : NavBar
    Created on : 29-oct-2022, 20:41:44
    Author     : yoang
--%>
<%@include file="Sesiones.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <!----======== CSS ======== -->
    <link href="Estilos/NavBar.css" rel="stylesheet" type="text/css"/>
    
    <!----===== Boxicons CSS ===== -->
    <link href="https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css" rel="stylesheet">
    
    
    
 
</head>
<body>
    <% RolVO rolVO = new RolVO();
            RolDAO rolDAO = new RolDAO();
            ArrayList<RolVO> listaDatos = rolDAO.listar(usuario);

            for (int i = 0; i < listaDatos.size(); i++) {

                rolVO = listaDatos.get(i);
            }
        %>
    <nav class="sidebar close">
        <header>
            <div class="image-text">
                <span class="image">
                    <img src="img/iconnav.png" alt="">
                </span>

                <div class="text logo-text">
                    <span class="name">Bambiny</span>
                    <span class="profession"><%= usuario %></span>
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
                    <%if (rolVO.getRolTiPo().equals("admin")) {

                %>
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
                    
                    <%} else if (rolVO.getRolTiPo().equals("director")) {
                    %>

                    <li class="nav-links">
                        <a href="director.jsp">
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
                        <a href="ConsultarMat2.jsp">
                            <i class='bx bx-folder-plus icon'></i>
                            <span class="text nav-text">Nuevas Matriculas</span>
                        </a>
                    </li>
                    <%} else if (rolVO.getRolTiPo().equals("profesor")) {
                    %>

                    <li class="nav-links ">
                        <a href="profesor.jsp">
                            <i class="bx bx-home-alt icon" ></i>
                            <span class="text nav-text">Inicio</span>
                        </a>
                    </li>
                    <li class="nav-links ">
                        <a href="perfil.jsp">
                            <i class='bx bx-user icon'></i>
                            <span class="text nav-text">Perfil</span>
                        </a>
                    </li>
                    <li class="nav-links ">
                        <a href="consultarAlumno.jsp">
                            <i class='bx bx-child icon'></i>
                            <span class="text nav-text">Consultar Alumnos</span>
                        </a>
                    </li>
                    <%} else if (rolVO.getRolTiPo().equals("alumno")) {
                    %>

                    <li class="nav-link">
                        <a href="alumno.jsp">
                            <i class="bx bx-home-alt icon" ></i>
                            <span class="text nav-text">Inicio</span>
                        </a>
                        
                    </li>
                    <% }
                    %>

                   

                </ul>
            </div>

            <div class="bottom-content">
                <li class="">
                    
                    <a>
                        <form method="post" action="Sesiones">
                        
                            <button type="submit" class="out-btn">
                            <i class="bx bx-log-out icon"></i>
                            <span class="text nav-text">Cerrar Sesion</span>
                        </button>
                        </form>
                    </a>
                        
                    
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

    

    
    <script src="js/navbar.js" type="text/javascript"></script>
</body>
</html>
