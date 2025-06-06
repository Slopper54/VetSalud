<%-- 
    Document   : listarCitas
    Created on : 03-jun-2025, 20:07:34
    Author     : jorda
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head><title>Lista de Citas</title></head>
    <body>
        <h2>Listado de Citas</h2>
        <p>Tamaño de lista: <s:property value="listaCitas.size"/></p>
        <s:form action="listarCitas" method="post">


            <s:submit value="listar Citas"/>
        </s:form>
        <table border="1">
            <tr>
                <th>ID</th><th>Fecha</th><th>Motivo</th><th>Mascota</th><th>Veterinario</th><th>Acciones</th>
            </tr>
            <s:iterator value="listaCitas" var="c">
                <tr>
                    <td><s:property value="#c.id"/></td>
                    <td><s:property value="#c.fecha"/></td>
                    <td><s:property value="#c.motivo"/></td>
                    <td><s:property value="#c.idMascota.id"/></td>
                    <td><s:property value="#c.idVeterinario.id"/></td>
                    <td>
                        <a href="editarCita.jsp?id=<s:property value='id'/>">Editar</a> |
                        <a href="eliminarCita.action?id=<s:property value='id'/>">Eliminar</a>
                    </td>
                </tr>
            </s:iterator>
        </table>
        <a href="crearCita.jsp">Crear nueva cita</a>
    </body>
</html>

