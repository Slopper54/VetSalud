<%-- 
    Document   : Veterinario
    Created on : 05-jun-2025, 13:56:28
    Author     : samuel
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Veterinario</title>
    </head>
    <body>

        <h2>Veterinario</h2>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Especialidad</th>
                    <th>Email</th>
                    <th>Actualizar</th>
                    <th>Eliminar</th>
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
                            <button onclick="window.location.href = 'actualizarVeterinario.jsp?id=<s:property value="#v.id" />'">ActualizarVeterinario</button>
                        </td>
                        <td>
                            <button onclick="window.location.href = 'eliminarVeterinario.jsp?id=<s:property value="#v.id" />'">EliminarVeterinario</button>
                        </td>
                    </tr>
                </s:iterator>
            </tbody>
        </table>

        <button onclick="window.location.href = 'crearVeterinario.jsp'">CrearVeterinario</button>
        <s:form action="filtrarVeterinario" method="post">
            <s:textfield name="nombre" label="Nombre"/>
            <s:textfield name="especialidad" label="Especialidad"/>
            <s:textfield name="email" label="Email"/>
            <s:textfield name="id" label="Id del veterinario"/>

            <s:submit value="filtrar Veterinario"/>
        </s:form>

    </body>
</html>
