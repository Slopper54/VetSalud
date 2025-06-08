<%-- 
    Document   : crearDueno
    Created on : 08-jun-2025, 12:14:49
    Author     : jorda
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
    <head>
        <meta charset="UTF-8" />
        <title>Registrar Dueño</title>
        <link rel="stylesheet" href="styles.css" />
    </head>
    <body>

        <!-- Fondo y capa semitransparente -->
        <div class="fondo"></div>
        <div class="overlay"></div>

        <!-- Contenido principal -->
        <div class="contenido">
            <div class="encabezado">
                <h2 class="titulo">Registrar Nuevo Dueño</h2>
            </div>

            <div class="panel">
                <div class="card">
                    <s:form action="crearDueno" method="post" cssClass="sform">
                        <s:textfield name="nombre" label="Nombre del dueño" required="true"/>
                        <s:textfield name="email" label="Email" required="true"/>
                        <s:textfield name="telefono" label="Teléfono" required="true"/>
                        <s:textfield name="dni" label="DNI" required="true"/>
                        <s:submit value="Registrar Dueño" cssClass="btn"/>
                    </s:form>


                </div>
            </div>
            <p><s:property value="mensaje" /></p>   
        </div>
        <s:form action="listarDuenos" method="post" cssClass="volver-form">
            <s:submit value="volver" cssClass="btn btn-volver"/>
        </s:form>
        <footer class="footer">
            © 2025 Tu Aplicación de Mascotas
        </footer>

    </body>
</html>
