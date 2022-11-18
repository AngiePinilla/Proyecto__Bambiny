<%-- 
    Document   : actuFamiliar
    Created on : 11/09/2022, 08:32:14 PM
    Author     : solan
--%>

<%@page import="ModeloVO.familiarVO"%>
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
        
     <section class="home">
    <h1>Acudiente</h1><br><br>
    <a href="listarFamiliar.jsp">Volver</a>
        
        <%
            familiarVO famiVO = (familiarVO) request.getAttribute("datosConsultados");
            if (famiVO != null) {
        %>
        
        <div class="container">
                <header>Registration</header>
                <form method="post" action="Familiar">
                    <div class="form first">
                        <div class="details personal">
                            <span class="title">Datos Personales</span>

                            <div class="fields">
                                <div class="input-field">
                                    <label>Primer Nombre</label>
                                    <input type="text" name="textnom1_fami" value="<%= famiVO.getNom1_fami() %>" >
                                </div>

                                <div class="input-field">
                                    <label>Primer Apellido</label>
                                    <input type="text" name="textapel1_fami" value="<%= famiVO.getApel1_fami() %>" >
                                </div>

                                <div class="input-field">
                                    <label>Fecha de nacimiento</label>
                                    <input type="date" name="textfechnaci_fami" value="<%= famiVO.getFechnaci_fami() %>" >
                                </div>

                                <div class="input-field">
                                    <label>Segundo Nombre</label>
                                    <input type="text" name="textnom2_fami" value="<%= famiVO.getNom2_fami() %>" >
                                </div>

                                <div class="input-field">
                                    <label>Segundo Apellido</label>
                                    <input type="text" name="textapel2_fami" value="<%= famiVO.getApel2_fami() %>" >
                                </div>

                                <div class="input-field">
                                    <label>Numero de cedula</label>
                                    <input type="number" name="textnumdocu_fami" value="<%= famiVO.getNumdocu_fami() %>" >
                                </div>

                                <div class="input-field">
                                    <label>Numero de celular</label>
                                    <input type="tel" name="texttelecel_fami" value="<%= famiVO.getTelecel_fami() %>" >
                                </div>

                            </div>
                        </div>

                        <div class="details personal">
                            <span class="title">Sobre ti</span>

                            <div class="fields">

                                                               
                                <div class="input-field">
                                    <label>Parentesto</label>
                                    <input type="tel" name="textparent_fami" value="<%= famiVO.getParent_fami() %>" readonly="" >
                                </div>



                                <div class="input-field">
                                    <label>ocupacion</label>
                                    <input type="text" name="textocupac_fami" value="<%= famiVO.getOcupac_fami() %>" >
                                </div>

                                <div class="input-field">
                                    <label>lugar de trabajo</label>
                                    <input type="text" name="textlugatrab_fami" value="<%= famiVO.getLugatrab_fami() %>" >
                                </div>

                                <div class="input-field">
                                    <label>Numero de contacto de tu trabajo</label>
                                    <input type="tel" name="textteletrab_fami" value="<%= famiVO.getTeletrab_fami() %>" >
                                </div>




                            </div>
                        </div>

                        


                            <input type="hidden" name="textid_fami" value="<%= famiVO.getId_fami() %>">
                            <button class="sumbit">
                                <span class="btnText">Enviar</span>
                                <i class="uil uil-navigator"></i>
                            </button>
                            <input type="hidden" value="2" name="opcion">
                        </div> 

                    </div>


                </form>

            </div>

        
        <%}%>


        <%
            if (request.getAttribute("mensajeError") != null) { %>
        ${mensajeError}

        <%} else {%>
        ${mensajeExito}        
        <%}%>


    </body>
</html>
