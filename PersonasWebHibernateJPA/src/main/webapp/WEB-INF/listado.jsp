

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Listado De Personas</title>
    </head>
    <body>
        <h1>Listado De Personas</h1>
        <table>
            <caption>Listado De Personas</caption>
            <tr>
                <th>Id Persona</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Email</th>
                <th>Telefono</th>
                
            </tr>
            <c:forEach var="persona" items="${personas}">
                <tr>
                    <td>${persona.idPersona}</td>
                    <td>${persona.nombre}</td>
                    <td>${persona.apellido}</td>
                    <td>${persona.email}</td>
                    <td>${persona.telefonp}</td>
                </tr>

            </c:forEach>
        </table>
    </body>
</html>
