<%-- 
    Document   : Factura
    Created on : 07-jun-2025, 12:40:07
    Author     : danie
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Facturas</title>
    </head>
    <body>
        <link rel="stylesheet" href="styles.css?v=2" />
        <button class="btn-lateral" onclick="document.querySelector('.sidebar').classList.add('visible')">
            Buscar
        </button>
        <div class="contenido">
            <h2 class="titulo-seccion">Gestión de Facturas</h2>

            <div class="tabla-contenedor">
                <table class="tabla">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Fecha de emisión</th>
                            <th>Total</th>
                            <th>Metodo de pago</th>
                            <th>Cita</th>
                            <th>Editar</th>
                            <th>Borrar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <s:iterator value="listaFacturas" var="m">
                            <tr>
                                <td><s:property value="#m.id" /></td>
                                <td><s:property value="#m.fechaEmision" /></td>
                                <td><s:property value="#m.total" /></td>
                                <td><s:property value="#m.metodoPago" /></td>
                                <td><s:property value="#m.idCita.id" /></td>
                                <td>
                                    <button class="btn-accion" onclick="window.location.href = 'actualizarFactura.jsp?id=<s:property value="#m.id" />'">Actualizar</button>
                                </td>
                                <td>
                                    <button class="btn-accion btn-borrar" onclick="window.location.href = 'eliminarFactura.jsp?id=<s:property value="#m.id" />'">Borrar</button>
                                </td>
                            </tr>
                        </s:iterator>
                    </tbody>
                </table>
            </div>
            <div class="botones-acciones">
                <s:form action="listarFacturas" method="post">
                    <s:submit value="Mostrar todas las facturas" cssClass="btn" />
                </s:form>

                <button class="btn" onclick="window.location.href = 'crearFactura.jsp'" >Nueva</button>
            </div>
            <!-- Panel lateral -->
            <div class="sidebar">
                <div class="sidebar-header">
                    <h3>Filtrar Facturas</h3>
                    <button class="cerrar-btn" onclick="document.querySelector('.sidebar').classList.remove('visible')">×</button>
                </div>

                <s:form action="obtenerFactura" method="post" cssClass="formulario">
                    <s:textfield name="id" label="Id de la factura" />
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
