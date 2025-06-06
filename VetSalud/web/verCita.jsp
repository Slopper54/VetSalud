<%-- 
    Document   : verCita
    Created on : 03-jun-2025, 20:08:32
    Author     : jorda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head><title>Ver Cita</title></head>
    <body>
        <h2>Detalles de la Cita</h2>
        <p>ID: <s:property value="cita.id"/></p>
        <p>Fecha: <s:property value="cita.fecha"/></p>
        <p>Motivo: <s:property value="cita.motivo"/></p>
        <p>Mascota: <s:property value="cita.idMascota.id"/></p>
        <p>Veterinario: <s:property value="cita.idVeterinario.id"/></p>
        <a href="listarCitas.action">Volver al listado</a>
    </body>
</html>

