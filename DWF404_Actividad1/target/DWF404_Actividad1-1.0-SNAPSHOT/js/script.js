document.addEventListener('DOMContentLoaded', function() {
    cargarProductos();

    document.getElementById('btn-api-json').addEventListener('click', function() {
        // Redirige a la URL de la API que proporciona el JSON
        window.open('/DWF404_Actividad1_war_exploded/api/insumos', '_blank');
    });

    document.getElementById('search-input').addEventListener('input', function(event) {
        const searchTerm = event.target.value.toLowerCase();
        const productos = document.querySelectorAll('.producto');

        productos.forEach(producto => {
            const nombre = producto.querySelector('h3').textContent.toLowerCase();
            const descripcion = producto.querySelector('p').textContent.toLowerCase();

            if (nombre.includes(searchTerm) || descripcion.includes(searchTerm)) {
                producto.style.display = 'block';
            } else {
                producto.style.display = 'none';
            }
        });
    });
});

function cargarProductos() {
    fetch('/DWF404_Actividad1_war_exploded/api/insumos')
        .then(response => response.json())
        .then(data => {
            const gridProductos = document.getElementById('grid-productos');
            gridProductos.innerHTML = ''; // Limpiar el contenido existente

            data.insumos.forEach(producto => {
                const productoElement = document.createElement('div');
                productoElement.className = 'producto';
                productoElement.innerHTML = `
                    <img src="${producto.imagen_url}" alt="${producto.nombre}">
                    <h3>${producto.nombre}</h3>
                    <p>${producto.descripcion}</p>
                    <p>Precio: $${producto.precio.toFixed(2)}</p>
                `;
                gridProductos.appendChild(productoElement);
            });
        })
        .catch(error => console.error('Error:', error));
}
