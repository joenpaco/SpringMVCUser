<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset = "UTF-8">
        <title>LOGIN PAGE</title>
        <link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="resources/css/estilos.css"/>
    </head>
    <body>
        <form:form id="loginForm" modelAttribute="login" action="loginProcess" method="post">
            <table align="center">
<tr>
                        <td>
                            <form:label path="username">Username: </form:label>
                        </td>
                        <td>
                            <form:input path="username" name="username" id="username" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="password">Password:</form:label>
                        </td>
                        <td>
                            <form:password path="password" name="password" id="password" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td align="left">
                            <form:button id="login" name="login">Login</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="home.jsp">Home</a>
                        </td>
                    </tr>
            </table>
        </form:form>
        <table align="center">
                <tr>
                    <td style="font-style: italic; color: red;">${message}</td>
                </tr>
        </table>     
        
        
        
        
        <script src="resources/js/jquery-3.3.1.min.js"></script>
        <script src="resources/bootstrap/js/bootstrap.min.js"></script>
    </body>
</html>