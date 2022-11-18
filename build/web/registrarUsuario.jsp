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
        <link href="Estilos/generales.css" rel="stylesheet" type="text/css"/>
       <!----======== CSS ======== -->
        <link href="Estilos/form1.css" rel="stylesheet" type="text/css"/>

        <!----===== Iconscout CSS ===== -->
        <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">

        <title>Registrar</title>

    </head>
    <body>   
        <%@include file="NavBar.jsp" %>
         <%
                if (request.getAttribute("mensajeError") != null) { %>
            
                <h5 class="msgError" >${mensajeError}</h5>  

            <%} else {%>
            <h5 class="msgSucces" >${mensajeExito}</h5>  
            <script>
                alert("Hello world!");
                window.swal("holi");
                swal("${mensajeExito}");
                
            </script>
            <%}%>
        <section class="home">
            <div class="contenido">
            
                <div class="container">
                <header>Registrar Usuario</header>
                <form method="post" action="Usuario">
                    <div class="form first">
                        <div class="details personal">
                            <span class="title">Datos Personales</span>

                            <div class="fields">
                                <div class="input-field">
                                    <label>Correo Electronico</label>
                                    <input type="email" name="textLogin" placeholder="Corro@email.com" >
                                </div>

                                <div class="input-field">
                                    <label>Contraseña</label>
                                    <input type="password" name="textPassword" placeholder="******" >
                                </div>
                                
                                <div class="input-field">
                                    
                                    <input type="hidden" name="textPassword" placeholder="******" >
                                </div>

                            </div>
                        </div>

                        <button class="sumbit">
                            <span class="btnText">Enviar</span>
                            <i class="uil uil-navigator"></i>
                        </button>
                        <input type="hidden" value="1" name="opcion">
                    </div> 
                </form>
            </div>
                
            </div>
        </section>
    </body>
</html>
