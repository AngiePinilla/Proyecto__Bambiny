<%-- 
    Document   : form
    Created on : 11-nov-2022, 15:22:30
    Author     : yoang
--%>

<%@page import="ModeloVO.lunacVO"%>
<%@page import="ModeloDAO.lunacDAO"%>
<%@page import="ModeloVO.EpsVO"%>
<%@page import="ModeloDAO.EpsDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--=== Coding by CodingLab | www.codinglabweb.com === -->
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!----======== CSS ======== -->
        <link href="Estilos/form1.css" rel="stylesheet" type="text/css"/>

        <!----===== Iconscout CSS ===== -->
        <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">

        <title>Responsive Regisration Form </title> 
    </head>
    <body>

        <%@include file="NavBar.jsp" %>
        <section class="home">
            <% if (request.getAttribute("MensajeError") != null) { %>
            ${MensajeError}

            <%} else {%>
            ${MensajeExito}        
            <%}%>
            <div class="container">
                <header>Registration</header>
                <form method="post" action="Document">
                    <div class="form first">
                        <div class="details personal">
                            <span class="title">Datos Personales</span>

                            <div class="fields">
                                <div class="input-field">
                                    <label>Primer Nombre</label>
                                    <input type="text" name="textNom_acud1" placeholder="Escribe tu nombre" >
                                </div>

                                <div class="input-field">
                                    <label>Primer Apellido</label>
                                    <input type="text" name="textApel_acud1" placeholder="Escribe tu apellido" >
                                </div>



                                <div class="input-field">
                                    <label>Tipo de documento</label>
                                    <select name="texttipo_docu">
                                        <option>Seleccione</option>
                                        <option value="Registro Civil">Registro Civil</option>
                                        <option value="Carnet Vacuna">Carnet de Vacunas</option>
                                        <option value="Certificado EPS">Certificado EPS</option>
                                        <option value="Vacuna Covid">Vacuna Covid</option>
                                        <option value="Cedula Padres">Cedula Padres</option>
                                    </select>
                                </div>

                                <div class="input-field">
                                    <label>Cargar Archivo</label>
                                    <input type="file" name="textarchivo_docu"  >
                                </div>



                            </div>
                        </div>

                        <div class="details personal">
                            <span class="title">Sobre ti</span>

                            <div class="fields">

                                <div class="input-field">
                                    <label>Parentesto</label>
                                    <select name="textparent_fami">
                                        <option>Seleccione</option>
                                        <option value="Madre">Madre</option>
                                        <option value="Padre">Padre</option>
                                        <option value="Hermano/a">Hermano/a</option>
                                        <option value="Abuelo/a">Abuelo/a</option>
                                        <option value="Otro">Otro</option>
                                    </select>
                                </div>



                                <div class="input-field">
                                    <label>ocupacion</label>
                                    <input type="text" name="textocupac_fami" placeholder="A que te dedicas" >
                                </div>

                                <div class="input-field">
                                    <label>lugar de trabajo</label>
                                    <input type="text" name="textlugatrab_fami" placeholder="Donde trabajas?" >
                                </div>

                                <div class="input-field">
                                    <label>Numero de contacto de tu trabajo</label>
                                    <input type="tel" name="textteletrab_fami" placeholder="Numero Telefonico de tu trabajo" >
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
