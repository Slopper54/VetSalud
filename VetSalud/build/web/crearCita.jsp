<%-- 
    Document   : crearCita
    Created on : 07-jun-2025, 20:56:47
    Author     : jorda
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
    <head>
        <meta charset="UTF-8" />
        <title>Registrar Cita</title>
        <link rel="stylesheet" href="styles.css" />
    </head>
    <body>

        <!-- Fondo y capa semitransparente -->
        <div class="fondo"></div>
        <div class="overlay"></div>

        <!-- Contenido principal -->
        <div class="contenido">
            <div class="encabezado">
                <h2 class="titulo">Registrar Nueva Cita</h2>
            </div>

            <div class="panel">
                <div class="card">
                    <s:form action="crearCita" method="post" cssClass="sform">
                        <s:textfield name="fecha" label="Fecha de la cita" type="datetime-local" required="true"/>
                        <s:textfield name="motivo" label="Motivo de la cita" required="true"/>
                        <s:textfield name="idMascota" label="Id de la mascota" required="true"/>
                        <s:textfield name="idVeterinario" label="Id del veterinario" required="true"/>
                        <s:submit value="Registrar Cita" cssClass="btn"/>
                    </s:form>


                </div>
            </div>
            <p><s:property value="mensaje" /></p>   
        </div>
        <s:form action="listarCitas" method="post" cssClass="volver-form">
            <s:submit value="volver" cssClass="btn btn-volver"/>
        </s:form>
<footer class="footer">
        © 2025 Clínica Veterinaria. Todos los derechos reservados.
    </footer>

    </body>
</html>