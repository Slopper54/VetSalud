<%-- 
    Document   : actualizarHistoriaClinica
    Created on : 07-jun-2025, 13:07:53
    Author     : danie
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
    <head>
        <meta charset="UTF-8" />
        <title>Actualizar Historia Clínica</title>
        <link rel="stylesheet" href="styles.css" />
    </head>
    <body>

        <!-- Fondo y capa semitransparente -->
        <div class="fondo"></div>
        <div class="overlay"></div>

        <!-- Contenido principal -->
        <div class="contenido">
            <div class="encabezado">
                <h2 class="titulo">Actualizar Historia Clínica con ID ${param.id}</h2>
            </div>

            <div class="panel">
                <div class="card">
                    <s:form action="actualizarHistoriaClinica" method="post" cssClass="sform">
                        <s:hidden name="id" value="%{#parameters.id}"/>
                        <s:textfield name="fechaInput" label="Fecha (yyyy-mm-dd)"/>
                        <s:textarea name="resumen" label="Resumen"/>
                        <s:textfield name="identificadorMascota" label="Id de la mascota"/>
                        <s:submit value="Actualizar" cssClass="btn"/>
                    </s:form>


                </div>
            </div>
            <p><s:property value="mensaje" /></p>
        </div>
        <s:form action="listarHistoriasClinicas" method="post" cssClass="volver-form">
            <s:submit value="volver" cssClass="btn btn-volver"/>
        </s:form>
        <footer class="footer">
            © 2025 Tu Aplicación de Mascotas
        </footer>

    </body>
</html>

