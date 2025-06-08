<%-- 
    Document   : Mascota
    Created on : 04-jun-2025, 13:40:20
    Author     : samuel
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Mascotas</title>
    </head>
    <body>
        <link rel="stylesheet" href="styles.css?v=2" />
        <button class="btn-lateral" onclick="document.querySelector('.sidebar').classList.add('visible')">
            Filtrar
        </button>
        <div class="contenido">
            <h2 class="titulo-seccion">Gestión de Mascotas</h2>

            <div class="tabla-contenedor">
                <table class="tabla">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Especie</th>
                            <th>Raza</th>
                            <th>Fecha Nacimiento</th>
                            <th>Dueño</th>
                            <th>Actualizar</th>
                            <th>Borrar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <s:iterator value="listaMascota" var="m">
                            <tr>
                                <td><s:property value="#m.id" /></td>
                                <td><s:property value="#m.nombre" /></td>
                                <td><s:property value="#m.especie" /></td>
                                <td><s:property value="#m.raza" /></td>
                                <td><s:property value="#m.fechaNacimiento" /></td>
                                <td><s:property value="#m.idDueno.nombre" /></td>
                                <td>
                                    <button class="btn-accion" onclick="window.location.href = 'actualizarMascota.jsp?id=<s:property value="#m.id" />'">Actualizar</button>
                                </td>
                                <td>
                                    <button class="btn-accion btn-borrar" onclick="window.location.href = 'eliminarMascota.jsp?id=<s:property value="#m.id" />'">Borrar</button>
                                </td>
                            </tr>
                        </s:iterator>
                    </tbody>
                </table>
            </div>
            <div class="botones-acciones">
                <s:form action="listMascota" method="post">
                    <s:submit value="Mostrar todas las mascotas" cssClass="btn" />
                </s:form>

                <button class="btn" onclick="window.location.href = 'crearMascota.jsp'" >Nueva</button>
            </div>
            <!-- Panel lateral -->
            <div class="sidebar">
                <div class="sidebar-header">
                    <h3>Filtrar Mascotas</h3>
                    <button class="cerrar-btn" onclick="document.querySelector('.sidebar').classList.remove('visible')">×</button>
                </div>

                <s:form action="filtrarMascota" method="post" cssClass="formulario">
                    <s:textfield name="nombreMascota" label="Nombre" />
                    <s:textfield name="raza" label="Raza" />
                    <s:textfield name="especie" label="Especie" />
                    <s:textfield name="id" label="Id de la mascota" />
                    <s:submit value="Filtrar" cssClass="btn" />
                </s:form>
            </div>
            <p><s:property value="mensaje" /></p>
        </div>
        <form action="index.jsp" method="get" class="volver-form">
            <button type="submit" class="btn btn-volver">Volver</button>
        </form>
<<<<<<< HEAD
        <p><s:property value="mensaje" /></p>
    </body>
=======
    </body>
      <footer class="footer">
            © 2025 Clínica Veterinaria. Todos los derechos reservados.
        </footer>
>>>>>>> 55e1046 (Vista veterinario)
</html>

