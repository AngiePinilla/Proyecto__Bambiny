<%-- 
    Document   : consultarVehiculo
    Created on : 16/05/2022, 09:09:08 AM
    Author     : Sena
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.ProfesorDAO"%>
<%@page import="ModeloVO.ProfesorVO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.3/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css">
        <title>Alumnos</title>

    </head>
    <body>
        <%@include file="NavBar.jsp" %>
        <section class="home">
            <center>

                <br>
                <h2>Alumnos</h2>

                <br>
                <br>


                <%            if (request.getAttribute("mensajeError") != null) { %>
                ${mensajeError}

                <%} else {%>
                ${mensajeExito}        
                <%}%>

                <table id="example" class="table table-striped" style="width: 100%">
                    <thead>
                        <tr>
                            <th>Eps</th> 
                            <th>Lugar nacimiento</th>
                            <th>Nombre1</th>
                            <th>Nombre2</th>
                            <th>Apellido1</th>
                            <th>Apellido2</th>
                            <th>Nuip</th>
                            <th>Fecha nacimiento</th> 
                            <th>Grupo sanguineo</th> 
                            <th>Numero de hermanos</th> 
                            <th>Dirección</th> 
                            <th>Telefono fijo</th> 
                            <th>Telefono celular</th> 
                            <th>Alergias</th> 
                            <th>Medicina</th> 
                            <th>Peso</th> 
                            <th>Altura</th> 
                            <th>Enfermedades</th>
                            <th>Descripcion</th>
                            <th>Acudiente</th> 
                            <th>Familiar</th> 
                        </tr
                    </thead>
                    <tbody>
                        <%
                            ProfesorVO proVO = new ProfesorVO();
                            ProfesorDAO proDAO = new ProfesorDAO();
                            ArrayList<ProfesorVO> listaAlumnos = proDAO.listar();
                            for (int i = 0; i < listaAlumnos.size(); i++) {

                                proVO = listaAlumnos.get(i);
                        %>

                        <tr>
                            <td><%=proVO.getNOM_ALUM1()%></td>
                            <td><%=proVO.getNOM_ALUM2()%></td>
                            <td><%=proVO.getAPEL_ALUM1()%></td>
                            <td><%=proVO.getAPEL_ALUM2()%></td>
                            <td><%=proVO.getNUIP_ALUM()%></td>
                            <td><%=proVO.getFECHANACI_ALUM()%></td>
                            <td><%=proVO.getLUGARNACI_ALUM()%></td>
                            <td><%=proVO.getGRUPOSANGUI_ALUM()%></td>
                            <td><%=proVO.getNUMHERMA_ALUM()%></td>
                            <td><%=proVO.getDIREC_ALUM()%></td>
                            <td><%=proVO.getTELECELURAR_ALUM()%></td>
                            <td><%=proVO.getTELEFIJO_ALUM()%></td>
                            <td><%=proVO.getEPS_ALUM()%></td>
                            <td><%=proVO.getALERGIAS_ALUM()%></td>
                            <td><%=proVO.getMEDICA_ALUM()%></td>
                            <td><%=proVO.getPESO_ALUM()%></td>
                            <td><%=proVO.getALTURA_ALUM()%></td>
                            <td><%=proVO.getENFERM_ALUM()%></td>
                            <td><%=proVO.getDESCENFER_ALUM()%></td>

                            <td> 
                                <form method="post" action="Acudientes">
                                    <button class="btn-est" name="Id" value="<%=proVO.getID_ALUM()%>">Consultar</button>
                                    <input type="hidden" value="1" name="opcion">

                                    <input type="text" name="Id" value="<%=proVO.getID_ALUM()%>">
                                </form>
                            </td>


                        </tr>
                    </tbody>
                    <%}%>
                </table>

                <br><br>

            </center>

        </section>



        <script src="js/modal.js"></script>
        <script src="js/script.js"></script>
    </body>
</html>
