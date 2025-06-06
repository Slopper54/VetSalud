<%-- 
    Document   : datosHistoriaClinica
    Created on : 03-jun-2025, 17:34:29
    Author     : danie
--%>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title>Detalles de Historia Clínica</title>
    </head>
    <body>
        <h2>Detalles de la Historia Clínica</h2>

        <table border="1" cellpadding="5" cellspacing="0">
            <tr>
                <th>ID</th>
                <td><s:property value="historiaClinica.id" /></td>
            </tr>
            <tr>
                <th>Fecha</th>
                <td><s:property value="historiaClinica.fecha" /></td>
            </tr>
            <tr>
                <th>Resumen</th>
                <td><s:property value="historiaClinica.resumen" /></td>
            </tr>
            <tr>
                <th>Nombre de la Mascota</th>
                <td><s:property value="historiaClinica.idMascota.nombre" /></td>
            </tr>
        </table>

        <br>
        <s:form action="inicio">
            <s:submit value="Volver al inicio"/>
        </s:form>
    </body>
</html>