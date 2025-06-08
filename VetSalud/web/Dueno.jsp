<%-- 
    Document   : Dueno
    Created on : 07-jun-2025, 21:22:16
    Author     : jorda
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Dueños</title>
    </head>
    <body>
        <link rel="stylesheet" href="styles.css?v=2" />
        <button class="btn-lateral" onclick="document.querySelector('.sidebar').classList.add('visible')">
            Buscar
        </button>
        <div class="contenido">
            <h2 class="titulo-seccion">Gestión de Dueños</h2>

            <div class="tabla-contenedor">
                <table class="tabla">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Email</th>
                            <th>Teléfono</th>
                            <th>DNI</th>
                            <th>Actualizar</th>
                            <th>Borrar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <s:iterator value="listaDuenos" var="m">
                            <tr>
                                <td><s:property value="#m.id" /></td>
                                <td><s:property value="#m.nombre" /></td>
                                <td><s:property value="#m.email" /></td>
                                <td><s:property value="#m.telefono" /></td>
                                <td><s:property value="#m.dni" /></td>
                                <td>
                                    <button class="btn-accion" onclick="window.location.href = 'actualizarDueno.jsp?id=<s:property value="#m.id" />'">Actualizar</button>
                                </td>
                                <td>
                                    <button class="btn-accion btn-borrar" onclick="window.location.href = 'eliminarDueno.jsp?id=<s:property value="#m.id" />'">Borrar</button>
                                </td>
                            </tr>
                        </s:iterator>
                    </tbody>
                </table>
            </div>
            <div class="botones-acciones">
                <s:form action="listarDuenos" method="post">
                    <s:submit value="Mostrar todos los dueños" cssClass="btn" />
                </s:form>

                <button class="btn" onclick="window.location.href = 'crearDueno.jsp'" >Nueva</button>
            </div>
            <!-- Panel lateral -->
            <div class="sidebar">
                <div class="sidebar-header">
                    <h3>Buscar dueño</h3>
                    <button class="cerrar-btn" onclick="document.querySelector('.sidebar').classList.remove('visible')">×</button>
                </div>

                <s:form action="buscarDueno" method="post" cssClass="formulario">
                    <s:textfield name="id" label="ID del dueño" />
                    <s:submit value="Buscar" cssClass="btn" />
                </s:form>
            </div>
            <p><s:property value="mensaje" /></p>
        </div>
        <form action="index.jsp" method="get" class="volver-form">
            <button type="submit" class="btn btn-volver">Volver</button>
        </form>
        <footer class="footer">
        © 2025 Clínica Veterinaria. Todos los derechos reservados.
    </footer>
    </body>
</html>
