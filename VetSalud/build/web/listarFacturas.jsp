<%-- 
    Document   : listarFacturas
    Created on : 04-jun-2025, 12:58:29
    Author     : danie
--%>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Listado de Facturas</title>
</head>
<body>

<h2>Listado de Facturas</h2>

<table border="1" cellpadding="5" cellspacing="0">
    <tr>
        <th>ID</th>
        <th>Fecha de emisión</th>
        <th>Total</th>
        <th>Metodo de pago</th>
        <th>Cita</th>
    </tr>
    <s:iterator value="listaFacturas">
        <tr>
            <td><s:property value="id" /></td>
            <td><s:property value="fechaEmision" /></td>
            <td><s:property value="total" /></td>
            <td><s:property value="metodoPago" /></td>
            <td><s:property value="idCita.id" /></td> <!-- Cambia 'nombre' si no existe -->
            <td><s:property value="citaAsignada" /></td>
        </tr>
    </s:iterator>
</table>

<s:form action="inicio">
    <s:submit value="Volver al inicio"/>
</s:form>

</body>
</html>