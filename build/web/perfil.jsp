<%-- 
    Document   : perfil
    Created on : 14/08/2022, 10:48:06 AM
    Author     : ranyerino
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.RolVO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
        <link href="Estilos/perfil.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
       
    </head>
    <body>
        <%@include file="NavBar.jsp" %>
         <%             
            String id_usua = rolVO.getRolId();

        %>
        <section class="home">
            <center>
                <div class="titulo">
                    <h2>Complete sus datos</h2>
                </div>
            </center>
            <form method="post" action="Usuario">
                <div class="formulario">
                    <div class="col">

                        <label class="form-label" >Primer nombre</label>
                        <input class="form-control" type="text" name="nombre1" required><br>

                        <label class="form-label" >Segundo Nombre</label>
                        <input class="form-control" type="text" name="nombre2"><br>

                        <label class="form-label" >Primer apellido</label>
                        <input class="form-control" type="text" name="apellido1"required><br>

                        <label class="form-label" >Segundo apellido</label>
                        <input class="form-control" type="text" name="apellido2"><br>

                        <label class="form-label" >Numero de documento</label>
                        <input class="form-control" type="int" name="numDocu"required><br>
                    </div>
                    <div class="col">
                        <label class="form-label" >Tipos de documento</label>
                        <select class="form-select" name="tipoDocu"required>
                            <option>Seleccione su tipo de documento</option>
                            <option value="Cedula">Cedula de ciudadania</option>
                            <option value="T.I">Tarjeta de indentidad</option>
                            <option value="otro">Otro</option>
                        </select><br>


                        <label class="form-label" >Numero de telefono</label>
                        <input class="form-control" type="int" name="numTel"required><br>

                        <label class="form-label" >Direccion</label>
                        <input class="form-control" type="text" name="direcUsua"required><br>

                        

                        <label class="form-label" >fecha de nacimiento</label>
                        <input class="form-control" type="date" name="fecha"required>
                    </div>
                </div>
                <center>
                    <div class="btn">
                        <button class="btn btn-info">Ingresar</button>
                        <input type="hidden" value="5" name="opcion">
                        <input type="hidden" name="textId" value="<%= id_usua %>"><br>
                    </div>
                
                </center>
            </form>

            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"
                    integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8"
            crossorigin="anonymous"></script>
            <%        if (request.getAttribute("mensajeError") != null) { %>
            ${mensajeError}

            <%} else {%>
            ${mensajeExito}        
            <%}%>
        </section>


    </body>
</html>
