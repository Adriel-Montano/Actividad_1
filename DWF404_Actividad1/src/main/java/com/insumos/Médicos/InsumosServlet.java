package com.insumos.Médicos;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import org.json.JSONObject;
import org.json.JSONArray;
@WebServlet("/api/insumos")
public class InsumosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Access-Control-Allow-Origin", "*"); // Permitir acceso desde cualquier origen
        JSONObject jsonResponse = new JSONObject();
        JSONArray insumosArray = new JSONArray();

        insumosArray.put(crearInsumo(1, "Mascarilla N95", "Mascarilla de alta filtración", 2.50, "https://sv.epaenlinea.com/media/catalog/product/cache/e28d833c75ef32af78ed2f15967ef6e0/1/b/1becd051-7b3f-43b2-943c-4f9fa207381d.jpg"));
        insumosArray.put(crearInsumo(2, "Guantes de látex", "Caja de 100 guantes desechables", 15.00, "https://www.juvisaferretero.com/wp-content/uploads/2022/04/792.png"));
        insumosArray.put(crearInsumo(3, "Termómetro digital", "Termómetro de respuesta rápida", 10.99, "https://www.steren.com.sv/media/catalog/product/cache/1e90c885204fbc854e8a8fc4f690e06b/t/e/ter-100_x1.jpg"));
        insumosArray.put(crearInsumo(4, "Desinfectante de manos", "Botella de 500ml de desinfectante", 5.00, "https://www.tucompraenoferta.com/cdn/product/5ed64048e2b54.png"));
        insumosArray.put(crearInsumo(5, "Venda elástica", "Venda elástica para soporte de articulaciones", 7.50, "https://siman.vtexassets.com/arquivos/ids/4801542-800-800?v=638328085401600000&width=800&height=800&aspect=true"));
        insumosArray.put(crearInsumo(6, "Alcohol en gel", "Botella de 1L de alcohol en gel", 8.99, "https://walmartsv.vtexassets.com/arquivos/ids/293283/Alcohol-Equate-Gel-Antibac-Aloe-300-Ml-1-17837.jpg?v=638097180691000000"));
        insumosArray.put(crearInsumo(7, "Saturómetro", "Monitor de oxígeno en sangre", 20.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSyeVODra8CYMlwkRjr8sVrwej4FJCtc1y0BQ&s"));
        insumosArray.put(crearInsumo(8, "Esfigmomanómetro", "Instrumento para medir la presión arterial", 25.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQc9EFmrJyLYSXJTpYeh6kcYan6yQnVftvrYQ&s"));
        insumosArray.put(crearInsumo(9, "Cinta métrica médica", "Cinta métrica para mediciones corporales", 3.50, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSY70b1CZYrrV01X0Qd7i1hXl3OdiNJoi06Lw&s"));
        insumosArray.put(crearInsumo(10, "Guantes de nitrilo", "Caja de 100 guantes sin látex", 18.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYFHTyvmk08IAlhGVDkeSExVTgweH-gFV5rg&s"));
        jsonResponse.put("insumos", insumosArray);

        try (PrintWriter out = response.getWriter()) {
            out.print(jsonResponse.toString());
            out.flush();
        }
    }

    private JSONObject crearInsumo(int id, String nombre, String descripcion, double precio, String imagenUrl) {
        JSONObject insumo = new JSONObject();
        insumo.put("id", id);
        insumo.put("nombre", nombre);
        insumo.put("descripcion", descripcion);
        insumo.put("precio", precio);
        insumo.put("imagen_url", imagenUrl);
        return insumo;
    }
}

