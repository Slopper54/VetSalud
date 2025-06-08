<%-- 
    Document   : crearTratamiento
    Created on : 07-jun-2025, 20:17:43
    Author     : domin
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
  <meta charset="UTF-8" />
  <title>Registrar Tratamiento</title>
  <link rel="stylesheet" href="styles.css?v=2" />
</head>
<body>
  <div class="contenido">
    <h2 class="titulo-seccion">Registrar Nuevo Tratamiento</h2>
    <div class="card">
      <s:form action="crearTratamiento" method="post" cssClass="sform">
        <s:textarea name="descripcion" label="Descripción" cols="50" rows="5" required="true"/>
        <s:textfield name="medicamento" label="Medicamento" required="true"/>
        <s:textfield name="fechaInicioInput" label="Fecha Inicio (yyyy-MM-dd)" required="true"/>
        <s:textfield name="fechaFinInput" label="Fecha Fin (yyyy-MM-dd)"/>
        <s:textfield name="idMascota" label="ID de la Mascota" required="true"/>
        <s:submit value="Registrar" cssClass="btn"/>
      </s:form>
    </div>
    <p><s:property value="mensaje"/></p>
    <s:form action="listarTratamientos" method="post" class="volver-form"><s:submit value="Volver" cssClass="btn btn-volver"/></s:form>
  </div>
  <footer class="footer">
        © 2025 Clínica Veterinaria. Todos los derechos reservados.
    </footer>
</body>
</html>
