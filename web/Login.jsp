<%-- 
    Document   : Login
    Created on : 08-nov-2022, 14:28:03
    Author     : yoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <title>Login</title>

        <!-- Google font -->
        <link href="http://fonts.googleapis.com/css?family=Playfair+Display:900" rel="stylesheet" type="text/css" />
        <link href="http://fonts.googleapis.com/css?family=Alice:400,700" rel="stylesheet" type="text/css" />

        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />
         <!-- <link rel="icon" type="image/x-icon" href="img/ciervo.png" />-->

        <!-- Custom stlylesheet -->
        <link href="Estilos/Logins.css" rel="stylesheet" type="text/css"/>
        
        <link rel="icon" type="image/x-icon" href="assets/jardin/IconoNegro.ico">


    </head>

    <body>
        <div id="booking" class="section">
            <div class="section-center">
                <div class="container">
                    <div class="row">

                        <div class="booking-form">
                            <div class="logo">
                                <img src="img/logo-osc.png" alt="" id="logo">
                            </div>

                            <div class="booking-bg">

                                <div class="form-header">

                                    <img src="assets/jardin/IconoNegro.svg" id="icono" alt="">
                                </div>
                            </div>
                            <form method="post" action="Usuario">
                                <div id="formulario">
                                    <h1>Iniciar Sesión</h1>

                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="form-ugrop">
                                                <span class="form-label">Usuario</span>

                                                <input class="form-control" type="text" name="textLogin" placeholder="Nombre" required>
                                            </div>
                                        </div>

                                    </div>
                                    <div class="row">

                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <span class="form-label">Contraseña</span>

                                                <input type="password" class="form-control" name="textPassword" placeholder="***" required>

                                                <span class="select-arrow"></span>
                                            </div>
                                        </div>
                                    </div>

                                    <button id="btnpass" class="btn submits">Olvido su contraseña</button>


                                </div>

                                <div class="form-btn">
                                    <button class="submit-btn">Ingresar</button>
                                    <input type="hidden" value="4" name="opcion"><br>
                                </div>

                                <br>
                                <%
                                if (request.getAttribute("mensajeError") != null) {%>

                                ${mensajeError}
                                <%} else {%>
                                ${mensajeExito}
                                <%}
                                %>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>

</html>
