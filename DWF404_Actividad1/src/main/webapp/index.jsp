<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insumos Médicos</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
<header>
    <h1> Insumos Médicos</h1>
    <nav>
        <ul>
            <li><a href="#inicio">Inicio</a></li>
            <li><a href="#productos">Productos</a></li>
            <li><a href="#contacto">Contacto</a></li>
        </ul>
    </nav>
</header>

<main>
    <section id="inicio">
        <h2>Bienvenidos a nuestra tienda de insumos médicos</h2>
        <p>Ofrecemos una amplia gama de productos de alta calidad para profesionales de la salud.</p>
    </section>

    <section id="productos">
        <h2>Nuestros Productos</h2>
        <input type="text" id="search-input" placeholder="Buscar productos...">
        <div id="grid-productos">
        </div>
    </section>

    <section id="contacto">
        <h2>Contacto</h2>
        <p>Si tienes alguna pregunta, no dudes en contactarnos:</p>
        <form id="contact-form">
            <label for="name">Nombre:</label>
            <input type="text" id="name" name="name" required>

            <label for="email">Correo electrónico:</label>
            <input type="email" id="email" name="email" required>

            <label for="message">Mensaje:</label>
            <textarea id="message" name="message" rows="4" required></textarea>

            <button type="submit">Enviar</button>
        </form>
    </section>

    <button id="btn-api-json">Acceder API JSON</button>
</main>

<footer>
    <p>&copy; <%= java.time.Year.now() %> Contoso Insumos Médicos. Todos los derechos reservados.</p>
</footer>

<script src="js/script.js"></script>
</body>
</html>
