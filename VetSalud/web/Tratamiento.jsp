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
                <s:iterator value="listaTratamientos" var="t">
                    <tr>
                        <td><s:property value="#t.id" /></td>
                        <td><s:property value="#t.descripcion" /></td>
                        <td><s:property value="#t.medicamento" /></td>
                        <td><s:property value="#t.fechaInicio" /></td>
                        <td><s:property value="#t.fechaFin" /></td>
                        <td><s:property value="#t.idMascota.id" /></td>
                        <td>
                            <button onclick="window.location.href='actualizarTratamiento.jsp?id=<s:property value="#t.id" />'">ActualizarTratamiento</button>
                        </td>
                    </tr>
                </s:iterator>
            </tbody>
        </table>
        <s:form action="listTratamiento" method="post">


            <s:submit value="listarTratamiento"/>
        </s:form>
        <s:form action="obtenerTratamiento" method="post">
            <s:textfield name="id" label="Id del tratamiento"/>

            <s:submit value="obtenerTratamiento"/>
        </s:form>

    </body>
</html>

