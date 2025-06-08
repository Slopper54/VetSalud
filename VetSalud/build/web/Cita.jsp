<%-- 
    Document   : Cita
    Created on : 07-jun-2025, 20:31:02
    Author     : jorda
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Citas</title>
    </head>
    <body>
        <link rel="stylesheet" href="styles.css?v=2" />
        <button class="btn-lateral" onclick="document.querySelector('.sidebar').classList.add('visible')">
            Buscar
        </button>
        <div class="contenido">
            <h2 class="titulo-seccion">Gestión de Citas</h2>

            <div class="tabla-contenedor">
                <table class="tabla">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Fecha</th>
                            <th>Motivo</th>
                            <th>IdMascota</th>
                            <th>IdVeterinario</th>
                            <th>Actualizar</th>
                            <th>Borrar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <s:iterator value="listaCitas" var="m">
                            <tr>
                                <td><s:property value="#m.id" /></td>
                                <td><s:property value="#m.fecha" /></td>
                                <td><s:property value="#m.motivo" /></td>
                                <td><s:property value="#m.idMascota.id" /></td>
                                <td><s:property value="#m.idVeterinario.id" /></td>
                                <td>
                                    <button class="btn-accion" onclick="window.location.href = 'actualizarCita.jsp?id=<s:property value="#m.id" />'">Actualizar</button>
                                </td>
                                <td>
                                    <button class="btn-accion btn-borrar" onclick="window.location.href = 'eliminarCita.jsp?id=<s:property value="#m.id" />'">Borrar</button>
                                </td>
                            </tr>
                        </s:iterator>
                    </tbody>
                </table>
            </div>
            <div class="botones-acciones">
                <s:form action="listarCitas" method="post">
                    <s:submit value="Mostrar todas las citas" cssClass="btn" />
                </s:form>

                <button class="btn" onclick="window.location.href = 'crearCita.jsp'" >Nueva</button>
            </div>
            <!-- Panel lateral -->
            <div class="sidebar">
                <div class="sidebar-header">
                    <h3>Buscar Cita</h3>
                    <button class="cerrar-btn" onclick="document.querySelector('.sidebar').classList.remove('visible')">×</button>
                </div>

                <s:form action="buscarCita" method="post" cssClass="formulario">
                    <s:textfield name="id" label="Id de la cita"/>
                    <s:submit value="Buscar" cssClass="btn" />
                </s:form>
            </div>
            <p><s:property value="mensaje" /></p>
        </div>
        <form action="index.jsp" method="get" class="volver-form">
            <button type="submit" class="btn btn-volver">Volver</button>
        </form>
        <p><s:property value="mensaje" /></p>
    </body>
</html>
