<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head><title>Lista de Dueños</title></head>
    <body>
        <h2>Listado de Dueños</h2>
        <p>Tamaño de lista: <s:property value="listaDuenos.size"/></p>

        <s:form action="listarDuenos" method="post">
            <s:submit value="Listar Dueños"/>
        </s:form>

        <table border="1">
            <tr>
                <th>ID</th><th>Nombre</th><th>Email</th><th>Teléfono</th><th>DNI</th><th>Acciones</th>
            </tr>
            <s:iterator value="listaDuenos" var="d">
                <tr>
                    <td><s:property value="#d.id"/></td>
                    <td><s:property value="#d.nombre"/></td>
                    <td><s:property value="#d.email"/></td>
                    <td><s:property value="#d.telefono"/></td>
                    <td><s:property value="#d.dni"/></td>
                    <td>
                        <a href="editarDueno.jsp?dni=<s:property value='#d.dni'/>">Editar</a> |
                        <a href="eliminarDueno.action?dni=<s:property value='#d.dni'/>">Eliminar</a>
                    </td>
                </tr>
            </s:iterator>
        </table>

        <a href="crearDueno.jsp">Crear nuevo dueño</a>
        
        <h3>Buscar Dueño por DNI</h3>
        <s:form action="buscarDueno" method="post">
            <s:textfield name="dni" label="DNI del dueño"/>
            <s:submit value="Buscar"/>
        </s:form>
    </body>
</html>
