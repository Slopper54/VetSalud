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
                <h2 class="titulo">Actualizar Mascota con ID ${param.id}d</h2>
            </div>

            <div class="panel">
                <div class="card">
                    <s:form action="actualizarMascota" method="post" cssClass="sform">
                        <s:hidden name="id" value="%{#parameters.id}"/>
                        <s:textfield name="nombreMascota" label="Nombre"/>
                        <s:textfield name="raza" label="Raza"/>
                        <s:textfield name="especie" label="Especie"/>
                        <s:textfield name="fechaNacimientoStr" label="Fecha de Nacimiento (yyyy-MM-dd)"/>
                        <s:textfield name="dni" label="DNI del Dueño"/>

                        <s:submit value="Actualizar" cssClass="btn"/>
                    </s:form>


                </div>
            </div>
            <p><s:property value="mensaje" /></p>
        </div>
        <s:form action="listMascota" method="post" cssClass="volver-form">
            <s:submit value="volver" cssClass="btn btn-volver"/>
        </s:form>
        <footer class="footer">
<<<<<<< HEAD
            © 2025 Tu Aplicación de Mascotas
=======
            © 2025 Clínica Veterinaria. Todos los derechos reservados.
>>>>>>> 55e1046 (Vista veterinario)
        </footer>

    </body>
</html>
