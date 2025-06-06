<%@page import="entidad.Cita"%>
<%@page import="WS.citaWS"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<html>
    <head>
        <title>Editar Cita</title>
    </head>
    <body>
        <h2>Editar Cita</h2>

        <%
            String id = request.getParameter("id");
        %>
        <form action="editarCita.action" method="post">
            <input type="hidden" name="id" value="<%= id%>"/>

            Fecha: <input type="datetime-local" name="fecha" required><br/>
            Motivo: <input type="text" name="motivo" required><br/>
            ID Mascota: <input type="number" name="idMascota" required><br/>
            ID Veterinario: <input type="number" name="idVeterinario" required><br/>

            <input type="submit" value="Editar Cita">
        </form>

    </body>
</html>


