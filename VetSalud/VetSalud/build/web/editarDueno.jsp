<%@page import="entidad.Dueno"%>
<%@page import="WS.duenoWS"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Editar Dueño</title>
</head>
<body>
    <h2>Editar Dueño</h2>

    <%
        String dni = request.getParameter("dni");
    %>

    <form action="editarDueno.action" method="post">
        <input type="hidden" name="dni" value="<%= dni %>"/>

        Nombre: <input type="text" name="nombre" required><br/>
        Email: <input type="email" name="email" required><br/>
        Teléfono: <input type="text" name="telefono" required><br/>

        <input type="submit" value="Editar Dueño">
    </form>
</body>
</html>

