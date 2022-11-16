<%-- 
    Document   : Acudiente
    Created on : 3/09/2022, 10:31:08 AM
    Author     : chris
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.AcudienteDAO2"%>
<%@page import="ModeloVO.AcudienteVO2"%>
<%@include file="Sesiones.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.3/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css">
        <title>Acudientes</title>
        <link href="estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
    <center>
        <a href="consultarAlumno.jsp">Volver</a>
        <br>
        <h2>Acudientes</h2>


        <%           
            AcudienteVO2 AcuVO2 = (AcudienteVO2) request.getAttribute("datosConsultados");
            if (AcuVO2 != null) {
        %>
        <form method="post" action="Acudientes">
            <table id="example" class="table table-striped" style="width: 100%">
                <thead>
                    <tr>
                        <th>Id_acud</th>
                        <th>Nombre1</th>
                        <th>Nombre2</th>
                        <th>Apellido1</th>
                        <th>Apellido2</th>
                        <th>Numero documento</th>
                        <th>Telefono celular</th>
                        <th>Direccion</th>  
                        <th>Estado</th> 
                        <th>Fecha de nacimiento</th> 

                    </tr>   
                </thead>
                <tbody>
                    <%
                        AcudienteVO2 acuVO2 = new AcudienteVO2();
                        AcudienteDAO2 acuDAO2 = new AcudienteDAO2();
                        ArrayList< AcudienteVO2> consultarAcudientes = acuDAO2.consultarAcudientes("datosConsultados");
                        for (int i = 0; i < consultarAcudientes.size(); i++) {

                            acuVO2 = consultarAcudientes.get(i);
                    %>
                    <tr>
                        <td><%=acuVO2.getID_ACUD()%></td>

                        <td><%=acuVO2.getNOM_ACUD1()%></td>
                        <td><%=acuVO2.getNOM_ACUD2()%></td>
                        <td><%=acuVO2.getAPEL_ACUD1()%></td>
                        <td><%=acuVO2.getAPEL_ACUD2()%></td>
                        <td><%=acuVO2.getNUMDOCU_ACID()%></td>
                        <td><%=acuVO2.getTELE_ACUD()%></td>
                        <td><%=acuVO2.getDIREC_ACUD()%></td>
                        <td><%=acuVO2.getESTADOAUTO_ACUD()%></td>
                        <td><%=acuVO2.getFECHNACI_ACUD()%></td>  

                    </tr>
                </tbody>
                <%}%> 
            </table>
            <%}%>
            <%
                if (request.getAttribute("mensajeError") != null) { %>
            ${mensajeError}

            <%} else {%>
            ${mensajeExito}        
            <%}%>

            <br><br>
        </form>
    </form>
</center>



<script src="js/modal.js"></script>
<script src="js/script.js"></script>
</body>
</html>

