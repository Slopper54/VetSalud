<%-- 
    Document   : eliminarTratamiento
    Created on : 07-jun-2025, 20:19:22
    Author     : domin
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
  <meta charset="UTF-8" />
  <title>Eliminar Tratamiento</title>
  <link rel="stylesheet" href="styles.css?v=2" />
</head>
<body>
  <div class="contenido">
    <h2 class="titulo-seccion">¿Eliminar Tratamiento ID ${param.id}?</h2>
    <div class="botones-acciones">
      <s:form action="eliminarTratamiento" method="post">
        <s:hidden name="id" value="%{#parameters.id}"/>
        <s:submit value="Sí" cssClass="btn btn-accion btn-borrar"/>
      </s:form>
      <s:form action="listarTratamientos" method="post">
        <s:submit value="No" cssClass="btn btn-accion"/>
      </s:form>
    </div>
    <p><s:property value="mensaje"/></p>
    <s:form action="listarTratamientos" method="post" class="volver-form"><s:submit value="Volver" cssClass="btn btn-volver"/></s:form>
  </div>
</body>
</html>
