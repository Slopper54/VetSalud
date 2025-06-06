<%-- 
    Document   : crearVeterinario
    Created on : 06-jun-2025, 10:17:04
    Author     : samuel
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Crear Mascota</title>
</head>
<body>

<h2>Registrar Nueva Mascota</h2>

<s:form action="createVeterinario" method="post">
    <s:textfield name="nombre" label="Nombre del Veterinario" required="true"/>
    <s:textfield name="especialidad" label="Especialidad" required="true"/>
    <s:textfield name="email" label="Email" required="true"/>


    <s:submit value="Registrar Veterinario"/>
</s:form>

</body>
</html>