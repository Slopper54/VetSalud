<%-- 
    Document   : actualizarVeterinario
    Created on : 06-jun-2025, 10:17:52
    Author     : samuel
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Actualizar Veterinario</title>
</head>
<body>
    <h1>Actualizar Veterinario</h1>

    <s:form action="actualizarVeterinario" method="post">
        <s:hidden name="id" value="%{#parameters.id}"/>
        <s:textfield name="nombre" label="Nombre"/>
        <s:textfield name="especialidad" label="Especialidad"/>
        <s:textfield name="email" label="Email"/>

        <s:submit value="Actualizar"/>
    </s:form>
</body>
</html>
