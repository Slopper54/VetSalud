<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Crear nuevo Dueño</title>
</head>
<body>
    <h2>Formulario para crear nuevo Dueño</h2>

    <s:form action="crearDueno" method="post">
        <s:label value="Nombre:"/>
        <s:textfield name="nombre" required="true"/>

        <s:label value="Email:"/>
        <s:textfield name="email" />

        <s:label value="Teléfono:"/>
        <s:textfield name="telefono" />

        <s:label value="DNI:"/>
        <s:textfield name="dni" />

        <s:submit value="Crear Dueño"/>
    </s:form>
</body>
</html>

