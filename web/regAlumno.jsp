<%-- 
    Document   : regAlumno
    Created on : 3/08/2022, 04:48:50 PM
    Author     : solan
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.RolVO"%>
<%@page import="ModeloVO.lunacVO"%>
<%@page import="ModeloDAO.lunacDAO"%>
<%@page import="ModeloDAO.EpsDAO"%>
<%@page import="ModeloVO.EpsVO"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <!----======== CSS ======== -->
        <link href="Estilos/form1.css" rel="stylesheet" type="text/css"/>

        <!----===== Iconscout CSS ===== -->
        <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Alumno</title>
    </head>
    <body>
            
        <%@include file="NavBar.jsp" %>
        <%            String id_usua = rolVO.getRolId();

            AlumnoVO alumVO = new AlumnoVO();
            AlumnoDAO alumDAO = new AlumnoDAO(alumVO);

            alumVO = alumDAO.consultarAlumno(id_usua);

            String id_alumn = alumVO.getId_alum();

            for (int i = 0; i < listaDatos.size(); i++) {

                rolVO = listaDatos.get(i);
            }
        %>
      
        
        
        <section class="home">
            <% if (request.getAttribute("MensajeError") != null) { %>
                ${MensajeError}

                <%} else {%>
                ${MensajeExito}        
                <%}%>
            <div class="container">
                <header>Registration</header>
                <form method="post" action="Alumno">
                    <div class="form first">
                        <div class="details personal">
                            <span class="title">Datos Personales</span>

                            <div class="fields">
                                <div class="input-field">
                                    <label>Primer Nombre</label>
                                    <input type="text" name="textnom1_alum" placeholder="Escribe tu nombre" >
                                </div>

                                <div class="input-field">
                                    <label>Primer Apellido</label>
                                    <input type="text" name="textapel1_alum" placeholder="Escribe tu apellido" >
                                </div>

                                <div class="input-field">
                                    <label>Fecha de nacimiento</label>
                                    <input type="date" name="textfechnaci_alum" placeholder="Tu fecha de nacimiento" >
                                </div>

                                <div class="input-field">
                                    <label>Segundo Nombre</label>
                                    <input type="text" name="textnom2_alum" placeholder="Escribe tu nombre" >
                                </div>

                                <div class="input-field">
                                    <label>Segundo Apellido</label>
                                    <input type="text" name="textapel2_alum" placeholder="Escribe tu apellido" >
                                </div>

                                <div class="input-field">
                                    <label>Numero Nuip</label>
                                    <input type="number" name="textnuip_alumn" placeholder="Tu registro civil" >
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
                                    <input type="number" name="textnumherma_alum" placeholder="Cuantos hermanos tienes?" >
                                </div>

                                <div class="input-field">
                                    <label>Grupo Sanguineo</label>
                                    <input type="text" name="textgrupsangui_alum" placeholder="Grupo Sanguineo" >
                                </div>


                            </div>
                        </div>
                                    
                        <div class="details personal">
                            <span class="title">Informacion de Contacto</span>

                            <div class="fields">
                              
                                <div class="input-field">
                                    <label>Direccion de Domicilio</label>
                                    <input type="text" name="textdirec_alum" placeholder="Cuantos hermanos tienes?" >
                                </div>

                                <div class="input-field">
                                    <label>Telefono fijo</label>
                                    <input type="number" name="texttelefijo_alum" placeholder="Grupo Sanguineo" >
                                </div>
                                
                                <div class="input-field">
                                    <label>Telefono Celular</label>
                                    <input type="number" name="texttelecelu_alum" placeholder="Grupo Sanguineo" >
                                </div>



                            </div>
                        </div>


                        <div class="details ID">
                            <span class="title">Sobre tu Salud</span>

                            <div class="fields">
                                <div class="input-field">
                                    <label>Alergias</label>
                                    <input type="text" name="textalerg_alum" placeholder="Tus alergias" >
                                </div>
                                
                                <div class="input-field">
                                    <label>Medicamentos</label>
                                    <input type="text" name="textmedica_alumd" placeholder="Tomas alguna Pastilla?" >
                                </div>
                                
                                <div class="input-field">
                                    <label>Peso al nacer</label>
                                    <input type="text" name="textpeso_alum" placeholder="50 Gramos" >
                                </div>
                                
                                <div class="input-field">
                                    <label>Altura al nacer</label>
                                    <input type="text" name="textaltura_alum" placeholder="50 cm" >
                                </div>
                                
                                <div class="input-field">
                                    <label>Enfermedades</label>
                                    <input type="text" name="textenferm_alum" placeholder="Enfermedades" >
                                </div>
                                
                                <div class="input-field">
                                    <label>Descripcion de la enfermedad</label>
                                    <input name="textdescenferm_alum" placeholder="Decribe es que lo que tu enfermedad te proboca" >
                                </div>

                                
                            </div>


                            <input type="hidden" name="textid_alum" value="<%= id_alumn %>">
                            <button class="sumbit">
                                <span class="btnText">Enviar</span>
                                <i class="uil uil-navigator"></i>
                            </button>
                            <input type="hidden" value="1" name="opcion">
                        </div> 

                    </div>


                </form>

            </div>
        </section>





    

</body>
</html>
