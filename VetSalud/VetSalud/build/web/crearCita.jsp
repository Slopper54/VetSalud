<%-- 
    Document   : crearCita
    Created on : 03-jun-2025, 19:39:34
    Author     : jorda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Crear nueva Cita</title>
</head>
<body>
    <h2>Formulario para crear nueva cita</h2>

    <s:form action="crearCita" method="post">
        <!-- Campo fecha -->
        <s:label value="Fecha (aaaa-mm-ddThh:mm):" />
        <s:textfield name="fecha" type="datetime-local" required="true"/>

        <!-- Campo motivo -->
        <s:label value="Motivo de la cita:" />
        <s:textfield name="motivo" required="true"/>

        <!-- Campo id de mascota -->
        <s:label value="ID Mascota:" />
        <s:textfield name="idMascota" required="true"/>

        <!-- Campo id de veterinario -->
        <s:label value="ID Veterinario:" />
        <s:textfield name="idVeterinario" required="true"/>

        <!-- Botón de envío -->
        <s:submit value="Crear Cita"/>
    </s:form>
</body>
</html>

