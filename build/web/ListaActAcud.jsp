<%-- 
    Document   : ListaActAcud
    Created on : 28-oct-2022, 14:57:24
    Author     : yoang
--%>

<%@page import="ModeloDAO.AcudienteDAO2"%>
<%@page import="ModeloVO.AcudienteVO2"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.RolVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="Estilos/director.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Acudientes</title>
    </head>
    <body>
        <%@include file="NavBar.jsp" %>




        <%            String id_usua = rolVO.getRolId();

            AlumnoVO alumVO = new AlumnoVO();
            AlumnoDAO alumDAO = new AlumnoDAO(alumVO);

            alumVO = alumDAO.consultarAlumno(id_usua);

            String id_alumn = alumVO.getId_alum();

        %>
        <section class="home">
            <div class="contenido">
                <br><br>
                <h1>Tus Acudientes</h1>

                <%            if (request.getAttribute("mensajeError") != null) {%>

                ${mensajeError}
                <%} else {%>
                ${mensajeExito}
                <%}
                %>
                <br>
                <form method="post" action="Acudientes">

                    <table border="1px">
                        <tr>
                            <th>Id_acud</th>
                            <th>Alumno</th>
                            <th>Nombre1</th>
                            <th>Nombre2</th>
                            <th>Apellido1</th>
                            <th>Apellido2</th>
                            <th>Numero documento</th>
                            <th>Telefono celular</th>
                            <th>Direccion</th>  
                            <th>Estado</th> 
                            <th>Fecha de nacimiento</th>
                            <th>opciones</th>
                        </tr>

                        <%
                            AcudienteVO2 AcuVO = new AcudienteVO2();
                            AcudienteDAO2 AcuDAO = new AcudienteDAO2();

                            ArrayList<AcudienteVO2> ListarAcu = AcuDAO.listarAcu(id_alumn);
                            for (int i = 0; i < ListarAcu.size(); i++) {
                                AcuVO = ListarAcu.get(i);

                        %>

                        <tr>
                            <td><%= AcuVO.getID_ACUD()%></td>
                            <td><%= AcuVO.getID_ALUM()%></td>
                            <td><%= AcuVO.getNOM_ACUD1()%></td>
                            <td><%= AcuVO.getNOM_ACUD2()%></td>
                            <td><%= AcuVO.getAPEL_ACUD1()%></td>
                            <td><%= AcuVO.getAPEL_ACUD2()%></td>
                            <td><%= AcuVO.getNUMDOCU_ACUD()%></td>
                            <td><%= AcuVO.getTELE_ACUD()%></td>
                            <td><%= AcuVO.getDIREC_ACUD()%></td>
                            <td><%= AcuVO.getESTADOAUTO_ACUD()%></td>
                            <td><%= AcuVO.getFECHNACI_ACUD()%></td>

                            <td>
                                <form method="post" action="Acudientes">

                                    <button name="textID_acud" value="<%= AcuVO.getID_ACUD()%>" >Actualizar</button>
                                    <input name="opcion" value="3" type="hidden">

                                </form>
                            </td>
                        </tr>
                        <%}%>




                    </table>
                </form>

            </div>
        </section>
    </body>
</html>
