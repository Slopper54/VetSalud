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

        <h2>Mascotas</h2>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Especie</th>
                    <th>Raza</th>
                    <th>Fecha Nacimiento</th>
                    <th>Dueño</th>
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
                        <td><s:property value="#m.idDueno.id" /></td>
                        <td>
                            <button onclick="window.location.href='actualizarMascota.jsp?id=<s:property value="#m.id" />'">ActualizarMascota</button>
                        </td>
                    </tr>
                </s:iterator>
            </tbody>
        </table>
        <s:form action="filtrarMascota" method="post">
            <s:textfield name="nombreMascota" label="Nombre"/>
            <s:textfield name="raza" label="Raza"/>
            <s:textfield name="especie" label="Especie"/>
            <s:textfield name="id" label="Id de la mascota"/>

            <s:submit value="filtrar Mascotas"/>
        </s:form>

    </body>
</html>

