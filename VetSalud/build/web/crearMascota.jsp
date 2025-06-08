<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
    <head>
        <meta charset="UTF-8" />
        <title>Registrar Mascota</title>
        <link rel="stylesheet" href="styles.css" />
    </head>
    <body>

        <!-- Fondo y capa semitransparente -->
        <div class="fondo"></div>
        <div class="overlay"></div>

        <!-- Contenido principal -->
        <div class="contenido">
            <div class="encabezado">
                <h2 class="titulo">Registrar Nueva Mascota</h2>
            </div>

            <div class="panel">
                <div class="card">
                    <s:form action="createMascota" method="post" cssClass="sform">
                        <s:textfield name="nombreMascota" label="Nombre de la Mascota" required="true"/>
                        <s:textfield name="raza" label="Raza" required="true"/>
                        <s:textfield name="especie" label="Especie" required="true"/>
                        <s:textfield name="fechaNacimientoStr" label="Fecha de Nacimiento (yyyy-MM-dd)" required="true"/>
                        <s:textfield name="dni" label="DNI del Dueño" required="true"/>
                        <s:submit value="Registrar Mascota" cssClass="btn"/>
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
>>>>>>> origin/main
        </footer>

    </body>
</html>