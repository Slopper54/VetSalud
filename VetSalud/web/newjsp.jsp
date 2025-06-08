<%-- 
    Document   : newjsp
    Created on : 08-jun-2025, 18:26:50
    Author     : Samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table class="tabla">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Email</th>
                            <th>Teléfono</th>
                            <th>DNI</th>
                            <th>Actualizar</th>
                            <th>Borrar</th>
                        </tr>
                    </thead>
                    <tbody>
                        
                            <tr>
                                <td><s:property value="#dueno.id" /></td>
                                <td><s:property value="#m.nombre" /></td>
                                <td><s:property value="#m.email" /></td>
                                <td><s:property value="#m.telefono" /></td>
                                <td><s:property value="#m.dni" /></td>
                                <td>
                                    <button class="btn-accion" onclick="window.location.href = 'actualizarDueno.jsp?id=<s:property value="#m.id" />'">Actualizar</button>
                                </td>
                                <td>
                                    <button class="btn-accion btn-borrar" onclick="window.location.href = 'eliminarDueno.jsp?id=<s:property value="#m.id" />'">Borrar</button>
                                </td>
                            </tr>
                        
                    </tbody>
                </table>
    </body>
</html>
