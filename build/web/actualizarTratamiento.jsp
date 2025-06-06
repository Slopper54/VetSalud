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

    <s:form action="actualizarTratamiento" method="post">
        <s:hidden name="id" value="%{#parameters.id}"/>
        <s:textfield name="descripcion" label="Descripcion"/>
        <s:textfield name="medicamento" label="Medicamento"/>
        <s:textfield name="fechaInicioInput" label="Fecha de inicio (yyyy-MM-dd)"/>
        <s:textfield name="fechaFinInput" label="Fecha de fin (yyyy-MM-dd)"/>
        <s:textfield name="idMascota" label="id de la Mascota"/>

        <s:submit value="Actualizar"/>
    </s:form>
</body>
</html>
