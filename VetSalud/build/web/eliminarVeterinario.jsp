<%-- 
    Document   : eliminarVeterinario
    Created on : 06-jun-2025, 10:17:20
    Author     : samuel
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Veterinario</title>
    </head>
    <body>
        <h2>Eliminar Veterinario</h2>
        <s:form action="eliminarVeterinario" method="post">
            <s:hidden name="id" value="%{#parameters.id}"/>

            <s:submit value="Eliminar Veterinario"/>
        </s:form>
    </body>
</html>
