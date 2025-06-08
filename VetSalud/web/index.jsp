<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Clinica Veterinaria</title>
  <link rel="stylesheet" href="styles.css?v=2" />

</head>
<body>

  <!-- Fondo -->
  <div class="fondo"></div>
  <div class="overlay"></div>

  <!-- Contenido -->
  <div class="contenido">
    <header class="encabezado">
      <h1 class="titulo">Clinica Veterinaria</h1>
    </header>

    <main class="panel">
      <s:form action="listarCitas">
        <button type="submit" class="card">
          Citas<br><span>Agendar y gestionar</span>
        </button>
      </s:form>
      <s:form action="listarDuenos">
        <button type="submit" class="card">
          Dueños<br><span>Gestión de propietarios de las mascotas</span>
        </button>
      </s:form>
      <s:form action="listarFacturas">
        <button type="submit" class="card">
          Facturas<br><span>Pagos y cobros</span>
        </button>
      </s:form>
      <s:form action="listarHistoriasClinicas">
        <button type="submit" class="card">
          Historia Clínica<br><span>Historial médico</span>
        </button>
      </s:form>
      <s:form action="listMascota">
        <button type="submit" class="card">
          Mascotas<br><span>Fichas individuales</span>
        </button>
      </s:form>
      <s:form action="listTratamiento">
        <button type="submit" class="card">
          Tratamientos<br><span>Procedimientos</span>
        </button>
      </s:form>
      <s:form action="listVacunacion">
        <button type="submit" class="card">
          Vacunación<br><span>Historial de vacunas</span>
        </button>
      </s:form>
      <s:form action="listVeterinario">
        <button type="submit" class="card">
          Veterinarios<br><span>Equipo médico</span>
        </button>
      </s:form>
    </main>
  </div>

  <footer class="footer">
    © 2025 Clínica Veterinaria Futurista. Todos los derechos reservados.
  </footer>

</body>
</html>