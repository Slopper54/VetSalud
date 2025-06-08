<%-- 
    Document   : actualizarDueno
    Created on : 08-jun-2025, 12:13:44
    Author     : jorda
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
    <head>
        <meta charset="UTF-8" />
        <title>Actualizar Dueño</title>
        <link rel="stylesheet" href="styles.css" />
    </head>
    <body>

        <!-- Fondo y capa semitransparente -->
        <div class="fondo"></div>
        <div class="overlay"></div>

        <!-- Contenido principal -->
        <div class="contenido">
            <div class="encabezado">
                <h2 class="titulo">Actualizar Dueño con ID ${param.id}</h2>
            </div>

            <div class="panel">
                <div class="card">
                    <s:form action="editarDueno" method="post" cssClass="sform">
                        <s:hidden name="id" value="%{#parameters.id}"/>
                        <s:textfield name="nombre" label="Nombre"/>
                        <s:textfield name="email" label="Email"/>
                        <s:textfield name="telefono" label="Telefono"/>

                        <s:submit value="Actualizar" cssClass="btn"/>
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
