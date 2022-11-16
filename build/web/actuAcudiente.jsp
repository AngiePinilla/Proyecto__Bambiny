<%-- 
    Document   : actuAcudiente
    Created on : 11/09/2022, 08:31:47 PM
    Author     : solan
--%>

<%@page import="ModeloVO.AcudienteVO2"%>
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
    <h1>Acudiente</h1><br><br>
    <a href="ListaActAcud.jsp">Volver</a>
        
        <%
            AcudienteVO2 acuVO = (AcudienteVO2) request.getAttribute("datosConsultados");
            if (acuVO != null) {
        %>
        
        <div class="container">
                <%
                if (request.getAttribute("mensajeError") != null) {%>

                ${mensajeError}
                <%} else {%>
                ${mensajeExito}
                <%}
                %>
                <header>Registration</header>
                <form method="post" action="Acudientes">
                    <div class="form first">
                        <div class="details personal">
                            <span class="title">Datos Personales</span>

                            <div class="fields">
                                <div class="input-field">
                                    <label>Primer Nombre</label>
                                    <input type="text" name="textNom_acud1" value="<%= acuVO.getNOM_ACUD1() %>" >
                                </div>

                                <div class="input-field">
                                    <label>Primer Apellido</label>
                                    <input type="text" name="textApel_acud1" value="<%= acuVO.getAPEL_ACUD1() %>" >
                                </div>

                                <div class="input-field">
                                    <label>Fecha de nacimiento</label>
                                    <input type="date" name="textFechnaci_acud" value="<%= acuVO.getFECHNACI_ACUD() %>" >
                                </div>

                                <div class="input-field">
                                    <label>Segundo Nombre</label>
                                    <input type="text" name="textNom_acud2"  value="<%= acuVO.getNOM_ACUD2() %>" >
                                </div>

                                <div class="input-field">
                                    <label>Segundo Apellido</label>
                                    <input type="text" name="textApel_acud2" value="<%= acuVO.getAPEL_ACUD2() %>" >
                                </div>

                                <div class="input-field">
                                    <label>Numero de cedula</label>
                                    <input type="number" name="textNumdocu_acud" value="<%= acuVO.getNUMDOCU_ACUD() %>" >
                                </div>

                                <div class="input-field">
                                    <label>Numero de celular</label>
                                    <input type="tel" name="textTele_acud" value="<%= acuVO.getTELE_ACUD() %>" >
                                </div>

                                <div class="input-field">
                                    <label>Direccion de domicilio</label>
                                    <input type="text" name="textDirec_acud" value="<%= acuVO.getDIREC_ACUD() %>" >
                                </div>

                                <div class="input-field">
                                    <label>Parentesco</label>
                                    <input type="text" name="textParect_acud" value="<%= acuVO.getPARENT_ACUD() %>" readonly>
                                </div>
                                
                                <div class="input-field">
                                    <label>Parentesco</label>
                                    <select name="textEstadoauto_acud">
                                        <option value="<%= acuVO.getESTADOAUTO_ACUD() %>">Autorizado</option>
                                        <option value="No autorizado">No Autorizado</option>
                                    </select>
                                    
                                    
                                </div>

                            </div>
                        </div>

                        
                        <button class="sumbit">
                            <span class="btnText">Enviar</span>
                            <i class="uil uil-navigator"></i>
                        </button>
                        <input type="hidden" value="4" name="opcion">
                        <input type="hidden" name="textID_acud" value="<%= acuVO.getID_ACUD() %>">
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

        
     </section>
    </body>
</html>
