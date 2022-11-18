<%-- 
    Document   : Archivo
    Created on : 17/11/2022, 11:04:12 AM
    Author     : Sena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <form method="POST" action="uploadFile" enctype="multipart/form-data" >  
            File:  
            <input type="file" name="file" id="file" />  
            <br/>  
            <br/>  
            Destination:  
            <input type="file" name="file"/>  
            <br/>  
            <br/>  
            <input type="submit" value="upload" name="upload"/>  
        </form>
        
        <form method="POST" action="uploadFile" enctype="multipart/form-data" >  
            File:  
            <input type="file" name="file" id="file" />  
            <br/>  
            <br/>  
            Destination:  
            <input type="file" name="file"/>  
            <br/>  
            <br/>  
            <input type="submit" value="upload" name="upload"/>  
        </form>
    </body>
</html>
