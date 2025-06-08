<%-- 
    Document   : Vacunacion
    Created on : 07-jun-2025, 20:23:35
    Author     : domin
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
  <meta charset="UTF-8" />
  <title>Vacunaciones</title>
  <link rel="stylesheet" href="styles.css?v=2" />
</head>
<body>
  <div class="contenido">
    <h2 class="titulo-seccion">Gestión de Vacunaciones</h2>
    <div class="tabla-contenedor">
      <table class="tabla">
        <thead>
          <tr>
            <th>ID</th>
            <th>Tipo Vacuna</th>
            <th>Fecha</th>
            <th>Dosis</th>
            <th>Mascota</th>
            <th>Actualizar</th>
            <th>Eliminar</th>
          </tr>
        </thead>
        <tbody>
          <s:iterator value="listaVacunaciones" var="v">
            <tr>
              <td><s:property value="#v.id"/></td>
              <td><s:property value="#v.tipoVacuna"/></td>
              <td><s:property value="#v.fecha"/></td>
              <td><s:property value="#v.dosis"/></td>
              <td><s:property value="#v.idMascota.nombre"/></td>
              <td>
                <button class="btn-accion"
                        onclick="window.location.href='actualizarVacunacion.jsp?id=<s:property value='#v.id'/>'">
                  Actualizar
                </button>
              </td>
              <td>
                <button class="btn-accion btn-borrar"
                        onclick="window.location.href='eliminarVacunacion.jsp?id=<s:property value='#v.id'/>'">
                  Eliminar
                </button>
              </td>
            </tr>
          </s:iterator>
        </tbody>
      </table>
    </div>
    <div class="botones-acciones">
      <s:form action="listarVacunaciones" method="post">
        <s:submit value="Mostrar Todas" cssClass="btn"/>
      </s:form>
      <button class="btn" onclick="window.location.href='crearVacunacion.jsp'">
        Nueva Vacunación
      </button>
    </div>
    <p><s:property value="mensaje"/></p>
    <s:form action="index.jsp" method="get" class="volver-form">
      <button type="submit" class="btn btn-volver">Volver</button>
    </s:form>
  </div>
    <footer class="footer">
        © 2025 Clínica Veterinaria. Todos los derechos reservados.
    </footer>
</body>
</html>
