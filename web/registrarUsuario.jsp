<%-- 
    Document   : registrarUsuario
    Created on : 9/05/2022, 09:18:14 AM
    Author     : Sena
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.RolVO"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="Estilos/index.css">
        <title>Registrar</title>

    </head>
    <body>   
        <%@include file="NavBar.jsp" %>
        <section class="home">
            <div class="login-box">
                <h2>Registrar Usuario</h2>
                <form method="post" action="Usuario">
                    <div class="user-box">
                        <input type="text" name="textLogin" required="">
                        <label>Usuario</label>
                    </div>
                    <div class="user-box">
                        <input type="password" name="textPassword" required="">
                        <label>Contraseña</label>
                    </div>
                    <div class="user-box">
                        <button>Registrar</button> <br>
                        <input type="hidden" value="1" name="opcion"><br>
                    </div>
                </form>
                <%                if (request.getAttribute("mensajeError") != null) { %>
                ${mensajeError}

                <%} else {%>
                ${mensajeExito}        
                <%}%>
            </div>
        </section>
    </body>
</html>
