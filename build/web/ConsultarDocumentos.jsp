<%-- 
    Document   : ConsultarDocumentos
    Created on : 08-nov-2022, 12:07:51
    Author     : yoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            AlumnoVO aluVO = (AlumnoVO) request.getAttribute("datosConsultados");
            if (aluVO != null) {
        %>
        
        <form method="post" action="Alumno" class="rusu"> 

            <table>

                

                <br> Eps<br>
                <select name="textid_eps" class="browser-default"
                        size="1" aria-label="size 1 select example">

                    
                    <%
                        EpsDAO epsDAO = new EpsDAO();
                        for (EpsVO epsVO : epsDAO.listar()) {
                    %>
                    
                    <option value="<%= epsVO.getId_eps() %>"> <%= epsVO.getNom_eps()%></option>
                    <%}%>
                </select><br> 

                <br>Lugar de Nacimiento<br>
                <select name="textid_luganaci" class="browser-default" size="1" aria-label="size 1 select example">

                    
                    <%
                        lunacDAO lunacDAO = new lunacDAO();
                        for (lunacVO lunacVO : lunacDAO.listarn()) {
                    %>
                    <option value="<%= lunacVO.getId_luganaci()%>"> <%= lunacVO.getNom_luganaci()%></option>
                    <%}%>
                </select><br>

                <br>Primer nombre <br>
                <input type="text" name="textnom1_alum" value="<%= aluVO.getNom1_alum() %>"><br> 

                <br>Segundo nombre<br>
                <input type="text" name="textnom2_alum" value="<%= aluVO.getNom2_alum() %>"><br> 

                <br>Primer Apellido <br>
                <input type="text" name="textapel1_alum" value="<%= aluVO.getApel1_alum() %>"><br> 

                <br>Segundo Apellido<br>
                <input type="text" name="textapel2_alum" value="<%= aluVO.getApel2_alum() %>"><br> 

                <br>Numero Nuip<br>
                <input type="text" name="textnuip_alumn" value="<%= aluVO.getNuip_alumn() %>"><br>

                <br>Fecha de nacimiento<br>
                <input type="date" id="start" name="textfechnaci_alum" value="<%= aluVO.getFechnaci_alum() %>" ><br>

                <br>Grupo Sanguineo<br>
                <input type="text" name="textgrupsangui_alum" value="<%= aluVO.getGrupsangui_alum() %>"><br> 

                <br>Numero de Hermanos <br>
                <input type="text" name="textnumherma_alum" value="<%= aluVO.getNumherma_alum() %>"><br>

                <br>Direccion Domicilio <br>
                <input type="text" name="textdirec_alum" value="<%= aluVO.getDirec_alum() %>"><br> 



                <br>Telefono fijo<br>
                <input type="text" name="texttelefijo_alum" value="<%= aluVO.getTelefijo_alum() %>"><br>  

                <br>Celular <br>
                <input type="text" name="texttelecelu_alum" value="<%= aluVO.getTelecelu_alum() %>" ><br> 

                <br>Alergias <br>
                <input type="text" name="textalerg_alum" value="<%= aluVO.getAlerg_alum() %>"><br>

                <br>Medicamentos <br>
                <input type="text" name="textmedica_alumd" value="<%= aluVO.getMedica_alum() %>"><br> 

                <br>Peso  <br>
                <input type="text" name="textpeso_alum" value="<%= aluVO.getPeso_alum() %>"><br>

                <br>Altura <br>
                <input type="text" name="textaltura_alum" value="<%= aluVO.getAltura_alum() %>"><br>

                <br>Enfermedades <br>
                <input type="text" name="textenferm_alum" value="<%= aluVO.getEnferm_alum() %>"><br>

                <br>Describa la enfermedad <br>
                <input type="text" name="textdescenferm_alum" value="<%= aluVO.getDescenferm_alum() %>"><br>

             

            </table><br>
            <button>actualizar</button>
            <input type="hidden" value="3" name="opcion">
            <input type="hidden" name="textid_alum" value="<%= aluVO.getId_alum()%>"><br>
        
        </form>

        <%}%>
        
    </body>
</html>
