<%-- 
    Document   : datosFactura
    Created on : 04-jun-2025, 12:58:41
    Author     : danie
--%>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title>Detalles de Factura</title>
    </head>
    <body>
        <h2>Detalles de la Factura</h2>

        <table border="1" cellpadding="5" cellspacing="0">
            <tr>
                <th>ID</th>
                <td><s:property value="factura.id" /></td>
            </tr>
            <tr>
                <th>Fecha</th>
                <td><s:property value="factura.fechaEmision" /></td>
            </tr>
            <tr>
                <th>Total</th>
                <td><s:property value="factura.total" /></td>
            </tr>
            <tr>
                <th>Metodo de pago</th>
                <td><s:property value="factura.metodoPago" /></td>
            </tr>
            <tr>
                <th>Cita</th>
                <td><s:property value="factura.idCita.id" /></td>
            </tr>
        </table>

        <br>
        <s:form action="inicio">
            <s:submit value="Volver al inicio"/>
        </s:form>
    </body>
</html>
