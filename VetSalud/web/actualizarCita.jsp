<%-- 
    Document   : actualizarCita
    Created on : 07-jun-2025, 20:41:33
    Author     : jorda
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
    <head>
        <meta charset="UTF-8" />
        <title>Actualizar Mascota</title>
        <link rel="stylesheet" href="styles.css" />
    </head>
    <body>

        <!-- Fondo y capa semitransparente -->
        <div class="fondo"></div>
        <div class="overlay"></div>

        <!-- Contenido principal -->
        <div class="contenido">
            <div class="encabezado">
                <h2 class="titulo">Actualizar Cita con ID ${param.id}d</h2>
            </div>

            <div class="panel">
                <div class="card">
                    <s:form action="editarCita" method="post" cssClass="sform">
                        <s:hidden name="id" value="%{#parameters.id}"/>
                        <s:textfield name="fecha" label="Fecha" type="datetime-local"/>
                        <s:textfield name="motivo" label="Motivo de la cita"/>
                        <s:textfield name="idMascota" label="Id de la mascota"/>
                        <s:textfield name="idVeterinario" label="Id del veterinario"/>

                        <s:submit value="Actualizar" cssClass="btn"/>
                    </s:form>


                </div>
            </div>
            <p><s:property value="mensaje" /></p>
        </div>
        <s:form action="listarCitas" method="post" cssClass="volver-form">
            <s:submit value="volver" cssClass="btn btn-volver"/>
        </s:form>
        <footer class="footer">
            © 2025 Tu Aplicación de Citas
        </footer>

    </body>
</html>
