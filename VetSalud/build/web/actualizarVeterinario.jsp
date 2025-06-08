<%-- 
    Document   : actualizarVeterinario
    Created on : 07-jun-2025, 19:53:31
    Author     : Samuel
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
    <head>
        <meta charset="UTF-8" />
        <title>Actualizar Veterinario</title>
        <link rel="stylesheet" href="styles.css" />
    </head>
    <body>

        <!-- Fondo y capa semitransparente -->
        <div class="fondo"></div>
        <div class="overlay"></div>

        <!-- Contenido principal -->
        <div class="contenido">
            <div class="encabezado">
                <h2 class="titulo">Actualizar Veterinario con ID ${param.id}d</h2>
            </div>

            <div class="panel">
                <div class="card">
                    <s:form action="actualizarVeterinario" method="post" cssClass="sform">
                        <s:hidden name="id" value="%{#parameters.id}"/>
                        <s:textfield name="nombre" label="Nombre"/>
                        <s:textfield name="especialidad" label="Especialidad"/>
                        <s:textfield name="email" label="Email"/>

                        <s:submit value="Actualizar" cssClass="btn"/>
                    </s:form>


                </div>
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

