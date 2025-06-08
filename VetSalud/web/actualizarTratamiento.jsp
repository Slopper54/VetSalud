<%-- 
    Document   : actualizarTratamiento
    Created on : 07-jun-2025, 20:18:38
    Author     : domin
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
  <meta charset="UTF-8" />
  <title>Actualizar Tratamiento</title>
  <link rel="stylesheet" href="styles.css?v=2" />
</head>
<body>
  <div class="contenido">
    <h2 class="titulo-seccion">Actualizar Tratamiento ID ${param.id}</h2>
    <div class="card">
      <s:form action="actualizarTratamiento" method="post" cssClass="sform">
        <s:hidden name="id" value="%{#parameters.id}"/>
        <s:textarea name="descripcion" label="Descripción" cols="50" rows="5"/>
        <s:textfield name="medicamento" label="Medicamento"/>
        <s:textfield name="fechaInicioInput" label="Fecha Inicio (yyyy-MM-dd)"/>
        <s:textfield name="fechaFinInput" label="Fecha Fin (yyyy-MM-dd)"/>
        <s:textfield name="idMascota" label="ID de la Mascota"/>
        <s:submit value="Actualizar" cssClass="btn"/>
      </s:form>
    </div>
    <p><s:property value="mensaje"/></p>
    <s:form action="listarTratamientos" method="post" class="volver-form"><s:submit value="Volver" cssClass="btn btn-volver"/></s:form>
  </div>
</body>
</html>
