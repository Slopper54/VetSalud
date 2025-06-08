<%-- 
    Document   : HistoriaClinica
    Created on : 07-jun-2025, 12:40:18
    Author     : danie
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Historias Clínicas</title>
    </head>
    <body>
        <link rel="stylesheet" href="styles.css?v=2" />
        <button class="btn-lateral" onclick="document.querySelector('.sidebar').classList.add('visible')">
            Buscar
        </button>
        <div class="contenido">
            <h2 class="titulo-seccion">Gestión de Historias Clínicas</h2>

            <div class="tabla-contenedor">
                <table class="tabla">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Fecha</th>
                            <th>Resumen</th>
                            <th>Mascota</th>
                            <th>Editar</th>
                            <th>Borrar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <s:iterator value="listaHistoriasClinicas" var="m">
                            <tr>
                                <td><s:property value="#m.id" /></td>
                                <td><s:property value="#m.fecha" /></td>
                                <td><s:property value="#m.resumen" /></td>
                                <td><s:property value="#m.idMascota.nombre" /></td>
                                <td>
                                    <button class="btn-accion" onclick="window.location.href = 'actualizarHistoriaClinica.jsp?id=<s:property value="#m.id" />'">Actualizar</button>
                                </td>
                                <td>
                                    <button class="btn-accion btn-borrar" onclick="window.location.href = 'eliminarHistoriaClinica.jsp?id=<s:property value="#m.id" />'">Borrar</button>
                                </td>
                            </tr>
                        </s:iterator>
                    </tbody>
                </table>
            </div>
            <div class="botones-acciones">
                <s:form action="listarHistoriasClinicas" method="post">
                    <s:submit value="Mostrar todas las historias clínicas" cssClass="btn" />
                </s:form>

                <button class="btn" onclick="window.location.href = 'crearHistoriaClinica.jsp'" >Nueva</button>
            </div>
            <!-- Panel lateral -->
            <div class="sidebar">
                <div class="sidebar-header">
                    <h3>Filtrar Historias Clinicas</h3>
                    <button class="cerrar-btn" onclick="document.querySelector('.sidebar').classList.remove('visible')">×</button>
                </div>

                <s:form action="obtenerHistoriaClinica" method="post" cssClass="formulario">
                    <s:textfield name="id" label="Id de la historia clínica" />
                    <s:submit value="Filtrar" cssClass="btn" />
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
