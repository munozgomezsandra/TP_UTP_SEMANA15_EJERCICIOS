package Modelo;

public class RegistroMision {

    private Mision[] misiones;
    private int contador;

    public RegistroMision(int capacidad) {
        misiones = new Mision[capacidad];
        contador = 0;
    }

    public Mision[] obtenerTodas() {
        Mision[] resultado = new Mision[contador];

        for (int i = 0; i < contador; i++) {
            resultado[i] = misiones[i];
        }

        return resultado;
    }

    public boolean agregar(Mision m) {
        if (contador < misiones.length) {
            misiones[contador] = m;
            contador++;
            return true;
        }

        return false;
    }

    public static String generarReporte(Mision[] lista) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%-10s | %-15s | %-5s | %-20s | %-15s%n",
                "CÓDIGO", "DESTINO", "AÑO", "COMANDANTE", "NAVE"));

        sb.append("-".repeat(77)).append("\n");

        for (Mision m : lista) {
            sb.append(String.format("%-10s | %-15s | %-5d | %-20s | %-15s%n",
                    m.getCodigo(),
                    m.getDestino(),
                    m.getAnioLanzamiento(),
                    m.getAstronauta().getNombre(),
                    m.getNave().getNombreNave()));
        }

        sb.append("-".repeat(77)).append("\n");
        sb.append("Total de misiones: ").append(lista.length).append("\n");

        return sb.toString();
    }
}