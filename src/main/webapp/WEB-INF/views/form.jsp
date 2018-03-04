<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset = "UTF-8">
        <title>JSP PAGE</title>
        <link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="resources/css/estilos.css"/>
    </head>
    <body>
        <h1>Formulario desde Spring WEB MVC</h1>
        <form:form>
           <p>
              <form:label path="nombre">NOMBRE:</form:label>
              <form:input path="nombre"/>
           </p>
           
           <p>
              <form:label path="correo">CORREO:</form:label>
              <form:input path="correo"/>
           </p>
           
           <p>
              <form:label path="edad">EDAD:</form:label>
              <form:input path="edad"/>
           </p>
           <hr>
           <form:button>Enviar</form:button>

        </form:form>
        
        
        
        <script src="resources/js/jquery-3.3.1.min.js"></script>
        <script src="resources/bootstrap/js/bootstrap.min.js"></script>
    </body>
</html>