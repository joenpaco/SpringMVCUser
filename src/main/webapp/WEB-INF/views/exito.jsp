<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset = "UTF-8">
        <title>JSP PAGE</title>
        <link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="resources/css/estilos.css"/>
    </head>
    <body>
        <h1>Resultados de formulario</h1>
        <ul>
           <li>NOMBRE: ${nombre}</li>
           <li>CORRREO: ${correo}</li>
           <li>EDAD: ${edad}</li>
        </ul>
        
        
        <script src="resources/js/jquery-3.3.1.min.js"></script>
        <script src="resources/bootstrap/js/bootstrap.min.js"></script>

    </body>
</html>