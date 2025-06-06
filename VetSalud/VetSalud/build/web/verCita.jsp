<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head><title>Cita encontrada</title></head>
<body>
    <h2>Cita encontrada</h2>

    <s:if test="cita != null">
        <table border="1">
            <tr><th>ID</th><td><s:property value="cita.id"/></td></tr>
            <tr><th>Nombre</th><td><s:property value="cita.fecha"/></td></tr>
            <tr><th>Motivo</th><td><s:property value="cita.motivo"/></td></tr>
            <tr><th>Id mascota</th><td><s:property value="cita.idMascota.id"/></td></tr>
            <tr><th>Id veterinario</th><td><s:property value="cita.idVeterinario.id"/></td></tr>
        </table>
    </s:if>

    <br><a href="listarCitas.action">Volver a la lista</a>
</body>
</html>

