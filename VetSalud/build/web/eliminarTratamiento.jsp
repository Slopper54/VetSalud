<%-- 
    Document   : eliminarMascota
    Created on : 04-jun-2025, 10:00:15
    Author     : samuel
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Tratamiento</title>
    </head>
    <body>
        <h2>Eliminar Mascota</h2>
        <s:form action="eliminarTratamiento" method="post">
            <s:textfield name="id" label="Id de la Tratamiento" required="true"/>

            <s:submit value="Eliminar Tratamiento"/>
        </s:form>
    </body>
</html>
