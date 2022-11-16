<%-- 
    Document   : actuDocu
    Created on : 11/09/2022, 11:30:56 PM
    Author     : solan
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.RolVO"%>
<%@page import="ModeloVO.docuVO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!----======== CSS ======== -->
        <link href="Estilos/form1.css" rel="stylesheet" type="text/css"/>

        <!----===== Iconscout CSS ===== -->
        <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="NavBar.jsp" %>
        <a href="alumno.jsp">Volver</a>
        <section class="home">
            <h1>Documentos</h1>

            <%            docuVO doVO = (docuVO) request.getAttribute("datosConsultados");
                if (doVO != null) {

            %>

            <div class="container">
                <header>Registration</header>
                <form method="post" action="Document">
                    <div class="form first">
                        <div class="details personal">
                            <span class="title">Datos Personales</span>

                            <div class="fields">

                                <div class="input-field">
                                    <label>Nombre del Archivo</label>
                                    <input type="text" name="texttipo_docu" value="<%= doVO.getTipo_docu()%>" readonly  >
                                </div>

                                <div class="input-field">
                                    <label>Cargar Archivo</label>
                                    <input type="file" name="textarchivo_docu" value=" <%= doVO.getArchivo_docu()%>" >
                                </div>

                                <div class="input-field">
                                    <input type="hidden" name="textarchivo_docu"  >
                                </div>

                                <div class="input-field">
                                    <input type="hidden" name="textarchivo_docu"  >
                                </div>

                                <div class="input-field">
                                    <input type="hidden" name="textarchivo_docu"  >
                                </div>

                            </div>
                        </div>

                        <button class="sumbit">
                            <span class="btnText">Enviar</span>
                            <i class="uil uil-navigator"></i>
                        </button>
                        <input type="hidden" value="2" name="opcion">
                        <input type="hidden" name="textid_docu" value="<%= doVO.getId_docu()%>">
                    </div> 
                </form>
            </div>

            <%} %>

            <%
            if (request.getAttribute("mensajeError") != null) { %>
            ${mensajeError}

            <%} else {%>
            ${mensajeExito}        
            <%}%>


        </section>




    </body>
</html>
