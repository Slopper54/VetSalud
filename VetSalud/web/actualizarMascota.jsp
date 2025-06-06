<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Actualizar Mascota</title>
</head>
<body>
    <h1>Actualizar Mascota</h1>

    <s:form action="actualizarMascota" method="post">
        <s:hidden name="id" value="%{#parameters.id}"/>
        <s:textfield name="nombreMascota" label="Nombre"/>
        <s:textfield name="raza" label="Raza"/>
        <s:textfield name="especie" label="Especie"/>
        <s:textfield name="fechaNacimientoStr" label="Fecha de Nacimiento (yyyy-MM-dd)"/>
        <s:textfield name="dni" label="DNI del Dueño"/>

        <s:submit value="Actualizar"/>
    </s:form>
</body>
</html>
