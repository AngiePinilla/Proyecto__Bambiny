<%-- 
    Document   : actuAlumno
    Created on : 11/09/2022, 05:50:47 PM
    Author     : solan
--%>

<%@page import="ModeloVO.AlumnoVO"%>
<%@page import="ModeloVO.EpsVO"%>
<%@page import="ModeloVO.lunacVO"%>
<%@page import="ModeloDAO.lunacDAO"%>
<%@page import="ModeloDAO.EpsDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!----======== CSS ======== -->
        <link href="Estilos/form1.css" rel="stylesheet" type="text/css"/>

        <!----===== Iconscout CSS ===== -->
        <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>actualizar alumno</title>
    </head>
    <body>
        <%@include file="NavBar.jsp" %>




        <section class="home">

            <%
                if (request.getAttribute("mensajeError") != null) { %>
            ${mensajeError}

            <%} else {%>
            ${mensajeExito}        
            <%}%>

            <%            AlumnoVO aluVO = (AlumnoVO) request.getAttribute("datosConsultados");
                if (aluVO != null) {
            %>
            
            <div class="container">
                <header>Registration</header>
                <form method="post" action="Alumno">
                    <div class="form first">
                        <div class="details personal">
                            <span class="title">Datos Personales</span>

                            <div class="fields">
                                <div class="input-field">
                                    <label>Primer Nombre</label>
                                    <input type="text" name="textnom1_alum" value="<%= aluVO.getNom1_alum()%>" >
                                </div>

                                <div class="input-field">
                                    <label>Primer Apellido</label>
                                    <input type="text" name="textapel1_alum" value="<%= aluVO.getApel1_alum()%>" >
                                </div>

                                <div class="input-field">
                                    <label>Fecha de nacimiento</label>
                                    <input type="date" name="textfechnaci_alum"  value="<%= aluVO.getFechnaci_alum()%>" >
                                </div>

                                <div class="input-field">
                                    <label>Segundo Nombre</label>
                                    <input type="text" name="textnom2_alum" value="<%= aluVO.getNom2_alum()%>" >
                                </div>

                                <div class="input-field">
                                    <label>Segundo Apellido</label>
                                    <input type="text" name="textapel2_alum" value="<%= aluVO.getApel2_alum()%>" >
                                </div>

                                <div class="input-field">
                                    <label>Numero Nuip</label>
                                    <input type="number" name="textnuip_alumn" value="<%= aluVO.getNuip_alumn()%>" >
                                </div>

                            </div>
                        </div>

                        <div class="details personal">
                            <span class="title">Sobre ti</span>

                            <div class="fields">

                                <div class="input-field">
                                    <label>Eps</label>
                                    <select name="textid_eps">

                                        <option>Seleccione la eps</option>
                                        <%                        EpsDAO epsDAO = new EpsDAO();
                                            for (EpsVO epsVO : epsDAO.listar()) {
                                        %>
                                        <option value="<%= epsVO.getId_eps()%>"> <%= epsVO.getNom_eps()%></option>
                                        <%}%>
                                    </select>
                                </div>

                                <div class="input-field">
                                    <label>Lugar de Nacimiento</label>
                                    <select name="textid_luganaci">

                                        <option>Seleccione lugar de nacimiento</option>
                                        <%
                                            lunacDAO lunacDAO = new lunacDAO();
                                            for (lunacVO lunacVO : lunacDAO.listarn()) {
                                        %>
                                        <option value="<%= lunacVO.getId_luganaci()%>"> <%= lunacVO.getNom_luganaci()%></option>
                                        <%}%>
                                    </select>
                                </div>

                                <div class="input-field">
                                    <label>Numero de Hermanos</label>
                                    <input type="number" name="textnumherma_alum" value="<%= aluVO.getNumherma_alum()%>" >
                                </div>

                                <div class="input-field">
                                    <label>Grupo Sanguineo</label>
                                    <input type="text" name="textgrupsangui_alum" value="<%= aluVO.getGrupsangui_alum()%>" >
                                </div>


                            </div>
                        </div>

                        <div class="details personal">
                            <span class="title">Informacion de Contacto</span>

                            <div class="fields">

                                <div class="input-field">
                                    <label>Direccion de Domicilio</label>
                                    <input type="text" name="textdirec_alum" value="<%= aluVO.getDirec_alum()%>" >
                                </div>

                                <div class="input-field">
                                    <label>Telefono fijo</label>
                                    <input type="number" name="texttelefijo_alum" value="<%= aluVO.getTelefijo_alum()%>" >
                                </div>

                                <div class="input-field">
                                    <label>Telefono Celular</label>
                                    <input type="number" name="texttelecelu_alum" value="<%= aluVO.getTelecelu_alum()%>" >
                                </div>



                            </div>
                        </div>


                        <div class="details ID">
                            <span class="title">Sobre tu Salud</span>

                            <div class="fields">
                                <div class="input-field">
                                    <label>Alergias</label>
                                    <input type="text" name="textalerg_alum" value="<%= aluVO.getAlerg_alum()%>" >
                                </div>

                                <div class="input-field">
                                    <label>Medicamentos</label>
                                    <input type="text" name="textmedica_alumd" value="<%= aluVO.getMedica_alum()%>" >
                                </div>

                                <div class="input-field">
                                    <label>Peso al nacer</label>
                                    <input type="text" name="textpeso_alum" value="<%= aluVO.getPeso_alum()%>" >
                                </div>

                                <div class="input-field">
                                    <label>Altura al nacer</label>
                                    <input type="text" name="textaltura_alum" value="<%= aluVO.getAltura_alum()%>" >
                                </div>

                                <div class="input-field">
                                    <label>Enfermedades</label>
                                    <input type="text" name="textenferm_alum" value="<%= aluVO.getEnferm_alum()%>" >
                                </div>

                                <div class="input-field">
                                    <label>Descripcion de la enfermedad</label>
                                    <input name="textdescenferm_alum" value="<%= aluVO.getDescenferm_alum()%>" >
                                </div>


                            </div>



                            <input type="hidden" name="textid_alum" value="<%= aluVO.getId_alum()%>">
                            <button class="sumbit">
                                <span class="btnText">Enviar</span>
                                <i class="uil uil-navigator"></i>
                            </button>
                            <input type="hidden" value="3" name="opcion">
                        </div> 

                    </div>


                </form>

            </div>
        </section>

        <%}%>




    </body>
</html>
