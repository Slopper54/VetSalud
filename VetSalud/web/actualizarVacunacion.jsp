<%-- 
    Document   : actualizarVacunacion
    Created on : 07-jun-2025, 20:24:13
    Author     : domin
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
  <meta charset="UTF-8" />
  <title>Actualizar Vacunación</title>
  <link rel="stylesheet" href="styles.css?v=2" />
</head>
<body>
  <div class="contenido">
    <h2 class="titulo-seccion">Actualizar Vacunación ID ${param.id}</h2>
    <div class="card">
      <s:form action="actualizarVacunacion" method="post" cssClass="sform">
        <s:hidden name="id" value="%{#parameters.id}"/>
        <s:textfield name="tipoVacuna" label="Tipo de Vacuna"/>
        <s:textfield name="fechaInput" label="Fecha (yyyy-MM-dd)"/>
        <s:textfield name="dosis" label="Dosis"/>
        <s:textfield name="idMascota" label="ID de la Mascota"/>
        <s:submit value="Actualizar" cssClass="btn"/>
      </s:form>
    </div>
    <p><s:property value="mensaje"/></p>
    <s:form action="listarVacunaciones" method="post" class="volver-form"><s:submit value="Volver" cssClass="btn btn-volver"/></s:form>
  </div>
</body>
</html>
