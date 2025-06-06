<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Crear Mascota</title>
</head>
<body>

<h2>Registrar Nueva Mascota</h2>

<s:form action="create" method="post">
    <s:textfield name="nombreMascota" label="Nombre de la Mascota" required="true"/>
    <s:textfield name="raza" label="Raza" required="true"/>
    <s:textfield name="especie" label="Especie" required="true"/>
    <s:textfield name="fechaNacimientoStr" label="Fecha de Nacimiento (yyyy-MM-dd)" required="true"/>
    <s:textfield name="dni" label="Nombre del Dueño" required="true"/>

    <s:submit value="Registrar Mascota"/>
</s:form>

</body>
</html>
