<%-- 
    Document   : prueba
    Created on : 03-jun-2025, 14:58:55
    Author     : danie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="obtenerHistoriaClinica" method="post">
            <h2>Obtener historia clínica</h2>
            <s:textfield name="id" label="Id de la historia clinica"/>
            <s:submit value="Obtener historia clínica"/>
        </s:form>
        <s:form action="listarHistoriasClinicas" method="post">
            <h2>Obtener lista completa de historias clínicas</h2>
            <s:submit value="Obtener lista de historias clínicas"/>
        </s:form>
        <s:form action="crearHistoriaClinica" method="post">
            <h2>Crear nueva historia clínica</h2>
            <s:textfield name="fechaInput" label="Fecha (yyyy-mm-dd)"/>
            <s:textarea name="resumen" label="Resumen"/>
            <s:textfield name="identificadorMascota" label="Id de la mascota"/>
            <s:submit value="Crear historia clínica"/>
        </s:form>
        <s:form action="borrarHistoriaClinica" method="post">
            <h2>Borrar historia clínica</h2>
            <s:textfield name="id" label="Id de la historia clínica"/>
            <s:submit value="Borrar historia clínica"/>
        </s:form>
        <s:form action="actualizarHistoriaClinica" method="post">
            <h2>Actualizar historia clínica</h2>
            <s:textfield name="id" label="Id de la historia clinica"/>
            <s:textfield name="fechaInput" label="Fecha (yyyy-mm-dd)"/>
            <s:textarea name="resumen" label="Resumen"/>
            <s:textfield name="identificadorMascota" label="Id de la mascota"/>
            <s:submit value="Actualizar historia clínica"/>
        </s:form>
        <s:form action="obtenerFactura" method="post">
            <h2>Obtener factura</h2>
            <s:textfield name="id" label="Id de la factura"/>
            <s:submit value="Obtener factura"/>
        </s:form>
        <s:form action="listarFacturas" method="post">
            <h2>Obtener lista completa de facturas</h2>
            <s:submit value="Obtener lista de facturas"/>
        </s:form>
        <s:form action="crearFactura" method="post">
            <h2>Crear nueva factura</h2>
            <s:textfield name="fechaInput" label="Fecha de emision(yyyy-mm-dd)"/>
            <s:textfield name="total" label="Total"/>
            <s:textfield name="identificadorCita" label="Id de la cita"/>
            <s:radio name="metodoPago" label="Metodo de pago" list="{'Efectivo','Tarjeta','Transferencia'}" />
            <s:submit value="Crear factura"/>
        </s:form>
        <p><s:property value="citaAsignada" /></p>
        <s:form action="borrarFactura" method="post">
            <h2>Borrar factura</h2>
            <s:textfield name="id" label="Id de la factura"/>
            <s:submit value="Borrar factura"/>
        </s:form>
        <s:form action="actualizarFactura" method="post">
            <h2>Actualizar factura</h2>
            <s:textfield name="id" label="Id de la factura"/>
            <s:textfield name="fechaInput" label="Fecha de emision(yyyy-mm-dd)"/>
            <s:textfield name="total" label="Total"/>
            <s:textfield name="identificadorCita" label="Id de la cita"/>
            <s:radio name="metodoPago" label="Metodo de pago" list="{'Efectivo','Tarjeta','Transferencia'}" />
            <s:submit value="Actualizar factura"/>
        </s:form>
        <p><s:property value="citaAsignada" /></p>
    </body>
</html>
