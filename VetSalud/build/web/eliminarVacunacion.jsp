<%-- 
    Document   : eliminarVacunacion
    Created on : 07-jun-2025, 20:24:40
    Author     : domin
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
  <meta charset="UTF-8" />
  <title>Eliminar Vacunación</title>
  <link rel="stylesheet" href="styles.css?v=2" />
</head>
<body>
  <div class="contenido">
    <h2 class="titulo-seccion">¿Eliminar Vacunación ID ${param.id}?</h2>
    <div class="botones-acciones">
      <s:form action="eliminarVacunacion" method="post">
        <s:hidden name="id" value="%{#parameters.id}"/>
        <s:submit value="Sí" cssClass="btn btn-accion btn-borrar"/>
      </s:form>
      <s:form action="listarVacunaciones" method="post">
        <s:submit value="No" cssClass="btn btn-accion"/>
      </s:form>
    </div>
    <p><s:property value="mensaje"/></p>
    <s:form action="listarVacunaciones" method="post" class="volver-form"><s:submit value="Volver" cssClass="btn btn-volver"/></s:form>
  </div>
</body>
</html>
