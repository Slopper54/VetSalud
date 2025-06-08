<%-- 
    Document   : Tratamiento
    Created on : 07-jun-2025, 20:16:42
    Author     : domin
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
  <meta charset="UTF-8" />
  <title>Tratamientos</title>
  <link rel="stylesheet" href="styles.css?v=2" />
</head>
<body>
  <div class="contenido">
    <h2 class="titulo-seccion">Gestión de Tratamientos</h2>
    <div class="tabla-contenedor">
      <table class="tabla">
        <thead>
          <tr>
            <th>ID</th>
            <th>Descripción</th>
            <th>Medicamento</th>
            <th>Fecha Inicio</th>
            <th>Fecha Fin</th>
            <th>Mascota</th>
            <th>Actualizar</th>
            <th>Eliminar</th>
          </tr>
        </thead>
        <tbody>
          <s:iterator value="listaTratamientos" var="t">
            <tr>
              <td><s:property value="#t.id"/></td>
              <td><s:property value="#t.descripcion"/></td>
              <td><s:property value="#t.medicamento"/></td>
              <td><s:property value="#t.fechaInicio"/></td>
              <td><s:property value="#t.fechaFin"/></td>
              <td><s:property value="#t.idMascota.nombre"/></td>
              <td>
                <button class="btn-accion"
                        onclick="window.location.href='actualizarTratamiento.jsp?id=<s:property value='#t.id'/>'">
                  Actualizar
                </button>
              </td>
              <td>
                <button class="btn-accion btn-borrar"
                        onclick="window.location.href='eliminarTratamiento.jsp?id=<s:property value='#t.id'/>'">
                  Eliminar
                </button>
              </td>
            </tr>
          </s:iterator>
        </tbody>
      </table>
    </div>
    <div class="botones-acciones">
      <s:form action="listarTratamientos" method="post">
        <s:submit value="Mostrar Todos" cssClass="btn"/>
      </s:form>
      <button class="btn" onclick="window.location.href='crearTratamiento.jsp'">
        Nuevo Tratamiento
      </button>
    </div>
    <p><s:property value="mensaje"/></p>
    <form action="index.jsp" method="get" class="volver-form">
            <button type="submit" class="btn btn-volver">Volver</button>
        </form>
  </div>
    <footer class="footer">
        © 2025 Clínica Veterinaria. Todos los derechos reservados.
    </footer>
</body>
</html>
