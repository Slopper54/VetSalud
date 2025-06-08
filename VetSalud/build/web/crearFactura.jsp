<%-- 
    Document   : crearFactura
    Created on : 07-jun-2025, 14:33:41
    Author     : danie
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
    <head>
        <meta charset="UTF-8" />
        <title>Registrar Factura</title>
        <link rel="stylesheet" href="styles.css" />
    </head>
    <body>

        <!-- Fondo y capa semitransparente -->
        <div class="fondo"></div>
        <div class="overlay"></div>

        <!-- Contenido principal -->
        <div class="contenido">
            <div class="encabezado">
                <h2 class="titulo">Registrar Nueva Factura</h2>
            </div>

            <div class="panel">
                <div class="card">
                    <s:form action="crearFactura" method="post" cssClass="sform">
                        <s:textfield name="fechaInput" label="Fecha de emision(yyyy-mm-dd)"/>
                        <s:textfield name="total" label="Total"/>
                        <s:textfield name="identificadorCita" label="Id de la cita"/>
                        <s:radio name="metodoPago" label="Metodo de pago" list="{'Efectivo','Tarjeta','Transferencia'}" />
                        <s:submit value="Registrar Factura" cssClass="btn"/>
                    </s:form>


                </div>
            </div>
            <p><s:property value="mensaje" /></p>   
        </div>
        <s:form action="listarFacturas" method="post" cssClass="volver-form">
            <s:submit value="volver" cssClass="btn btn-volver"/>
        </s:form>
      <footer class="footer">
        © 2025 Clínica Veterinaria. Todos los derechos reservados.
    </footer>
    </body>
</html>