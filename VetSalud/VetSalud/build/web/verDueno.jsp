<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head><title>Dueño encontrado</title></head>
<body>
    <h2>Dueño encontrado</h2>

    <s:if test="dueno != null">
        <table border="1">
            <tr><th>ID</th><td><s:property value="dueno.id"/></td></tr>
            <tr><th>Nombre</th><td><s:property value="dueno.nombre"/></td></tr>
            <tr><th>Email</th><td><s:property value="dueno.email"/></td></tr>
            <tr><th>Teléfono</th><td><s:property value="dueno.telefono"/></td></tr>
            <tr><th>DNI</th><td><s:property value="dueno.dni"/></td></tr>
        </table>
    </s:if>

    <br><a href="listarDuenos.action">Volver a la lista</a>
</body>
</html>
