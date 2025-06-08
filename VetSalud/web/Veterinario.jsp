<%-- 
    Document   : Veterinario
    Created on : 07-jun-2025, 18:37:32
    Author     : Samuel
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Veterinario</title>
    </head>
    <body>
        <link rel="stylesheet" href="styles.css?v=2" />
        <button class="btn-lateral" onclick="document.querySelector('.sidebar').classList.add('visible')">
            Filtrar
        </button>
        <div class="contenido">
            <h2 class="titulo-seccion">Gestión de Veterinario</h2>

            <div class="tabla-contenedor">
                <table class="tabla">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Especialidad</th>
                            <th>Email</th>
                            <th>Actualizar</th>
                            <th>Borrar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <s:iterator value="listaVeterinario" var="v">
                            <tr>
                                <td><s:property value="#v.id" /></td>
                                <td><s:property value="#v.nombre" /></td>
                                <td><s:property value="#v.especialidad" /></td>
                                <td><s:property value="#v.email" /></td>
                                <td>
                                    <button class="btn-accion" onclick="window.location.href = 'actualizarVeterinario.jsp?id=<s:property value="#v.id" />'">Actualizar</button>
                                </td>
                                <td>
                                    <button class="btn-accion btn-borrar" onclick="window.location.href = 'eliminarVeterinario.jsp?id=<s:property value="#v.id" />'">Borrar</button>
                                </td>
                            </tr>
                        </s:iterator>
                    </tbody>
                </table>
            </div>
            <div class="botones-acciones">
                <s:form action="listVeterinario" method="post">
                    <s:submit value="Mostrar todos los veterinarios" cssClass="btn" />
                </s:form>

                <button class="btn" onclick="window.location.href = 'crearVeterinario.jsp'" >Nueva</button>
            </div>
            <!-- Panel lateral -->
            <div class="sidebar">
                <div class="sidebar-header">
                    <h3>Filtrar Veterinario</h3>
                    <button class="cerrar-btn" onclick="document.querySelector('.sidebar').classList.remove('visible')">×</button>
                </div>

                <s:form action="filtrarVeterinario" method="post" cssClass="formulario">
                    <s:textfield name="nombre" label="Nombre" />
                    <s:textfield name="especialidad" label="Especialidad" />
                    <s:textfield name="email" label="Email" />
                    <s:textfield name="id" label="Id del veterinario" />
                    <s:submit value="Filtrar" cssClass="btn" />
                </s:form>
            </div>
            <p><s:property value="mensaje" /></p>
        </div>
        <form action="index.jsp" method="get" class="volver-form">
            <button type="submit" class="btn btn-volver">Volver</button>
        </form>
    </body>
      <footer class="footer">
            © 2025 Clínica Veterinaria. Todos los derechos reservados.
        </footer>
</html>
