<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Crear Tratamiento</title>
    </head>
    <body>

        <h2>Registrar Nueva Tratamiento</h2>

        <s:form action="createTratamiento" method="post">

            <s:textfield name="descripcion" label="Descripcion" required="true"/>
            <s:textfield name="medicamento" label="Medicamento" required="true"/>
            <s:textfield name="fechaInicioInput" label="Fecha de inicio (yyyy-MM-dd)" required="true"/>
            <s:textfield name="fechaFinInput" label="Fecha de fin (yyyy-MM-dd)" required="true"/>
            <s:textfield name="idMascota" label="id de la Mascota" required="true"/>
            <s:submit value="Registrar Tratamiento"/>
        </s:form>

    </body>
</html>
