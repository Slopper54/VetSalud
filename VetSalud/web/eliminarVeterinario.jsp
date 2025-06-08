<%-- 
    Document   : eliminarVeterinario
    Created on : 07-jun-2025, 20:00:00
    Author     : Samuel
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="es">
<head>
    <meta charset="UTF-8" />
    <title>Eliminar Veterinario</title>
    <link rel="stylesheet" href="styles.css" />
</head>
<body>
    <div class="fondo"></div>
    <div class="overlay"></div>

    <div class="contenido">
        <div class="encabezado">
            <h2 class="titulo">¿Seguro que quiere eliminar el veterinario con ID ${param.id}?</h2>
        </div>

                <div class="botones-acciones">
                    <s:form action="eliminarVeterinario" method="post">
                        <s:hidden name="id" value="%{#parameters.id}"/>
                        <s:submit value="Sí" cssClass="btn btn-accion btn-borrar"/>
                    </s:form>

                    <s:form action="listVeterinario" method="post">
                        <s:submit value="No" cssClass="btn btn-accion"/>
                    </s:form>
        </div>
        <p><s:property value="mensaje" /></p>
    </div>

    <s:form action="listVeterinario" method="post" cssClass="volver-form">
        <s:submit value="volver" cssClass="btn btn-volver"/>
    </s:form>

    <footer class="footer">
        © 2025 Clínica Veterinaria. Todos los derechos reservados.
    </footer>
</body>
</html>

