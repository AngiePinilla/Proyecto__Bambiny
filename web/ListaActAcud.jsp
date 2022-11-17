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
        <link href="Estilos/generales.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" />
        <link href="https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="sweetalert2.min.css">
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
                <form class="acu" method="post" action="Acudientes">

                    <table id="example" class="table table-striped">
                        <thead>
                            <tr>
                                <th>#</th>                               
                                <th>Nombre</th>
                                <th>Apellido</th>                                
                                <th>Numero documento</th>
                                <th>Telefono celular</th>
                                <th>Direccion</th>  
                                <th>Estado</th> 
                                <th>Fecha de nacimiento</th>
                                <th>opciones</th>
                            </tr>
                        </thead>
                        <%
                            AcudienteVO2 AcuVO = new AcudienteVO2();
                            AcudienteDAO2 AcuDAO = new AcudienteDAO2();

                            ArrayList<AcudienteVO2> ListarAcu = AcuDAO.listarAcu(id_alumn);
                            for (int i = 0; i < ListarAcu.size(); i++) {
                                AcuVO = ListarAcu.get(i);

                        %>

                        <tr>
                            <td><%= AcuVO.getID_ACUD()%></td>
                            <td><%= AcuVO.getNOM_ACUD1()%> <%= AcuVO.getNOM_ACUD2()%></td>                           
                            <td><%= AcuVO.getAPEL_ACUD1()%> <%= AcuVO.getAPEL_ACUD2()%></td>                            
                            <td><%= AcuVO.getNUMDOCU_ACUD()%></td>
                            <td><%= AcuVO.getTELE_ACUD()%></td>
                            <td><%= AcuVO.getDIREC_ACUD()%></td>
                            <td><%= AcuVO.getESTADOAUTO_ACUD()%></td>
                            <td><%= AcuVO.getFECHNACI_ACUD()%></td>

                            <td>
                                <form method="post" action="Acudientes">

                                    <button class="bn60" name="textID_acud" value="<%= AcuVO.getID_ACUD()%>" >Actualizar</button>
                                    <input name="opcion" value="3" type="hidden">

                                </form>
                            </td>
                        </tr>
                        <%}%>




                    </table>
                </form>

            </div>
        </section>
                         <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap5.min.js"></script>
    
    <script>
            $(document).ready(function () {
                $('#example').DataTable({
                    language: {
                        url: '//cdn.datatables.net/plug-ins/1.12.1/i18n/es-ES.json'
                    }
                });
            });
        </script>
    </body>
</html>
