<%-- 
    Document   : documento
    Created on : 11/09/2022, 11:30:38 PM
    Author     : solan
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.RolVO"%>

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
        <% 
            String id_usua = rolVO.getRolId();

            AlumnoVO alumVO = new AlumnoVO();
            AlumnoDAO alumDAO = new AlumnoDAO(alumVO);

            alumVO = alumDAO.consultarAlumno(id_usua);

            String id_alumn = alumVO.getId_alum();

        %>
        
         
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

                        <input type="hidden" name="textid_alum" value="<%= id_alumn %>"><br> 

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
