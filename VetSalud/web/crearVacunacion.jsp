<%-- 
    Document   : crearVacunacion
    Created on : 07-jun-2025, 20:23:55
    Author     : domin
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
  <meta charset="UTF-8" />
  <title>Registrar Vacunación</title>
  <link rel="stylesheet" href="styles.css?v=2" />
</head>
<body>
  <div class="contenido">
    <h2 class="titulo-seccion">Registrar Nueva Vacunación</h2>
    <div class="card">
      <s:form action="crearVacunacion" method="post" cssClass="sform">
        <s:textfield name="tipoVacuna" label="Tipo de Vacuna" required="true"/>
        <s:textfield name="fechaInput" label="Fecha (yyyy-MM-dd)" required="true"/>
        <s:textfield name="dosis" label="Dosis" required="true"/>
        <s:textfield name="idMascota" label="ID de la Mascota" required="true"/>
        <s:submit value="Registrar" cssClass="btn"/>
      </s:form>
    </div>
    <p><s:property value="mensaje"/></p>
    <s:form action="listarVacunaciones" method="post" class="volver-form"><s:submit value="Volver" cssClass="btn btn-volver"/></s:form>
  </div>
  <footer class="footer">
        © 2025 Clínica Veterinaria. Todos los derechos reservados.
    </footer>
</body>
</html>
