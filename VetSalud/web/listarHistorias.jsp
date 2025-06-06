<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Listado de Historias Clínicas</title>
</head>
<body>

<h2>Listado de Historias Clínicas</h2>

<table border="1" cellpadding="5" cellspacing="0">
    <tr>
        <th>ID</th>
        <th>Fecha</th>
        <th>Resumen</th>
        <th>Mascota</th>
    </tr>
    <s:iterator value="listaHistoriasClinicas">
        <tr>
            <td><s:property value="id" /></td>
            <td><s:property value="fecha" /></td>
            <td><s:property value="resumen" /></td>
            <td><s:property value="idMascota.nombre" /></td> <!-- Cambia 'nombre' si no existe -->
        </tr>
    </s:iterator>
</table>

<s:form action="inicio">
    <s:submit value="Volver al inicio"/>
</s:form>

</body>
</html>